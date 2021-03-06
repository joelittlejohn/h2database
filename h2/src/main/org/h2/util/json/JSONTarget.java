/*
 * Copyright 2004-2019 H2 Group. Multiple-Licensed under the MPL 2.0,
 * and the EPL 1.0 (http://h2database.com/html/license.html).
 * Initial Developer: H2 Group
 */
package org.h2.util.json;

import java.math.BigDecimal;

/**
 * Abstract JSON output target.
 */
public abstract class JSONTarget {

    /**
     * Start of an object.
     */
    public abstract void startObject();

    /**
     * End of the current object.
     */
    public abstract void endObject();

    /**
     * Start of an array.
     */
    public abstract void startArray();

    /**
     * End of the current array.
     */
    public abstract void endArray();

    /**
     * Name of a member.
     *
     * @param name
     *            the name
     */
    public abstract void member(String name);

    /**
     * {@code null} value.
     */
    public abstract void valueNull();

    /**
     * {@code false} value.
     */
    public abstract void valueFalse();

    /**
     * {@code true} value.
     */
    public abstract void valueTrue();

    /**
     * A number value.
     *
     * @param number
     *            the number
     */
    public abstract void valueNumber(BigDecimal number);

    /**
     * A string value.
     *
     * @param string
     *            the string
     */
    public abstract void valueString(String string);

    /**
     * A separator between values.
     */
    public abstract void valueSeparator();

}
