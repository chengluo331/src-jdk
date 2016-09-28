/*
 * Copyright (c) 1997, 2011, Oracle and/or its affiliates. All rights reserved.
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

package com.sun.tools.internal.xjc.generator.annotation.spec;

import javax.xml.bind.annotation.XmlElementDecl;
import com.sun.codemodel.internal.JAnnotationWriter;
import com.sun.codemodel.internal.JType;

public interface XmlElementDeclWriter
    extends JAnnotationWriter<XmlElementDecl>
{


    XmlElementDeclWriter name(String value);

    XmlElementDeclWriter scope(Class value);

    XmlElementDeclWriter scope(JType value);

    XmlElementDeclWriter namespace(String value);

    XmlElementDeclWriter defaultValue(String value);

    XmlElementDeclWriter substitutionHeadNamespace(String value);

    XmlElementDeclWriter substitutionHeadName(String value);

}