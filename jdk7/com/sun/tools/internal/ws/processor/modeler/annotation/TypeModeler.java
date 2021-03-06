/*
 * Copyright (c) 1997, 2010, Oracle and/or its affiliates. All rights reserved.
 * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */

package com.sun.tools.internal.ws.processor.modeler.annotation;

import com.sun.mirror.apt.AnnotationProcessorEnvironment;
import com.sun.mirror.declaration.*;
import com.sun.mirror.type.*;
import com.sun.xml.internal.ws.util.StringUtils;

import java.util.*;


/**
 *
 * @author WS Development Team
 */
public class TypeModeler implements WebServiceConstants {

    public static TypeDeclaration getDeclaration(TypeMirror typeMirror) {
        if (typeMirror instanceof DeclaredType)
            return ((DeclaredType)typeMirror).getDeclaration();
        return null;
    }

    public static TypeDeclaration getDeclaringClassMethod(
        TypeMirror theClass,
        String methodName,
        TypeMirror[] args) {

        return getDeclaringClassMethod(getDeclaration(theClass), methodName, args);
    }

    public static TypeDeclaration getDeclaringClassMethod(
        TypeDeclaration theClass,
        String methodName,
        TypeMirror[] args) {

        TypeDeclaration retClass = null;
        if (theClass instanceof ClassDeclaration) {
            ClassType superClass = ((ClassDeclaration)theClass).getSuperclass();
            if (superClass != null)
                retClass = getDeclaringClassMethod(superClass, methodName, args);
        }
        if (retClass == null) {
            for (InterfaceType interfaceType : theClass.getSuperinterfaces())
                retClass =
                    getDeclaringClassMethod(interfaceType, methodName, args);
        }
        if (retClass == null) {
            Collection<? extends MethodDeclaration> methods;
            methods = theClass.getMethods();
            for (MethodDeclaration method : methods) {
                if (method.getSimpleName().equals(methodName) &&
                    method.getDeclaringType().equals(theClass)) {
                    retClass = theClass;
                    break;
                }
            }
        }
        return retClass;
    }

    public static Collection<InterfaceType> collectInterfaces(TypeDeclaration type) {
        Collection<InterfaceType> superInterfaces = type.getSuperinterfaces();
        Collection<InterfaceType> interfaces = type.getSuperinterfaces();
        for (InterfaceType interfaceType : superInterfaces) {
            interfaces.addAll(collectInterfaces(getDeclaration(interfaceType)));
        }
        return interfaces;
    }

    public static boolean isSubclass(String subTypeName, String superTypeName,
        AnnotationProcessorEnvironment env) {
        return isSubclass(env.getTypeDeclaration(subTypeName),
                          env.getTypeDeclaration(superTypeName));
    }

    public static boolean isSubclass(
        TypeDeclaration subType,
        TypeDeclaration superType) {

        if (subType.equals(superType))
            return false;
        return isSubtype(subType, superType);
    }

    public static TypeMirror getHolderValueType(
        TypeMirror type,
        TypeDeclaration defHolder
    ) {

        TypeDeclaration typeDecl = getDeclaration(type);
        if (typeDecl == null)
            return null;

        if (isSubtype(typeDecl, defHolder)) {
            if  (type instanceof DeclaredType) {
                Collection<TypeMirror> argTypes = ((DeclaredType)type).getActualTypeArguments();
                if (argTypes.size() == 1) {
                    TypeMirror mirror = argTypes.iterator().next();
//                        System.out.println("argsTypes.iterator().next(): "+mirror);
                    return mirror;
                }
                else if (argTypes.size() == 0) {
                    FieldDeclaration member = getValueMember(typeDecl);
                    if (member != null) {
//                            System.out.println("member: "+member+" getType(): "+member.getType());
                        return member.getType();
                    }
                }
            }
        }
        return null;
    }

    public static FieldDeclaration getValueMember(TypeMirror classType) {
        return getValueMember(getDeclaration(classType));
    }

    public static FieldDeclaration getValueMember(TypeDeclaration type) {
        FieldDeclaration member = null;
        for (FieldDeclaration field : type.getFields()){
            if (field.getSimpleName().equals("value")) {
                member = field;
                break;
            }
        }
        if (member == null) {
            if (type instanceof ClassDeclaration)
                member = getValueMember(((ClassDeclaration)type).getSuperclass());
        }
        return member;
    }


    /* is d1 a subtype of d2 */
    public static boolean isSubtype(TypeDeclaration d1, TypeDeclaration d2) {
        if (d1.equals(d2))
            return true;
        ClassDeclaration superClassDecl = null;
        if (d1 instanceof ClassDeclaration) {
            ClassType superClass = ((ClassDeclaration)d1).getSuperclass();
            if (superClass != null) {
                superClassDecl = superClass.getDeclaration();
                if (superClassDecl.equals(d2))
                    return true;
            }
        }
        for (InterfaceType superIntf : d1.getSuperinterfaces()) {
            if (superIntf.getDeclaration().equals(d2)) {
                return true;
            }
            if (isSubtype(superIntf.getDeclaration(), d2)) {
                return true;
            } else if (superClassDecl != null && isSubtype(superClassDecl, d2)) {
                return true;
            }
        }
        return false;
    }

}
