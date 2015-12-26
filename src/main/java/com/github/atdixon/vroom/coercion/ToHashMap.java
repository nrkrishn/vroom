package com.github.atdixon.vroom.coercion;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

@SuppressWarnings("unchecked")
public final class ToHashMap implements Coercion<HashMap> {

    @Override
    public HashMap coerce(Type type, Object value) throws CannotCoerceException {
        if (value instanceof HashMap) {
            return (HashMap) value;
        }
        if (value instanceof Map) {
            return new HashMap((Map) value);
        }
        throw new CannotCoerceException(type, value);
    }

}
