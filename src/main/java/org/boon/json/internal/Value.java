package org.boon.json.internal;

public interface Value {
    public static final Value TRUE = new ValueBase (Type.TRUE);
    public static final Value FALSE = new ValueBase (Type.FALSE);
    public static final Value NULL = new ValueBase (Type.NULL);

    String toKey();

    Object toValue();
}