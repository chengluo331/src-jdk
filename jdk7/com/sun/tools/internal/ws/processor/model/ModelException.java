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

package com.sun.tools.internal.ws.processor.model;

import com.sun.tools.internal.ws.processor.ProcessorException;
import com.sun.xml.internal.ws.util.localization.Localizable;

/**
 * ModelException represents an exception that occurred while
 * visiting service model.
 *
 * @see ProcessorException
 *
 * @author WS Development Team
 */
public class ModelException extends ProcessorException {

    public ModelException(String key, Object... args) {
        super(key, args);
    }

    public ModelException(Throwable throwable) {
        super(throwable);
    }

    public ModelException(Localizable arg) {
        super("model.nestedModelError", arg);
    }

    public String getDefaultResourceBundleName() {
        return "com.sun.tools.internal.ws.resources.model";
    }
}
