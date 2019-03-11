package edu.umss.dip.ssiservice.common;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public class Utils {
    public static <TData> Class<TData> getGenericClass(Class clase) {
        try {
            String className = ((ParameterizedType) clase.getGenericSuperclass()).getActualTypeArguments()[0].getTypeName();
            Class<?> clazz = Class.forName(className);
            return (Class<TData>) clazz;
        } catch (Exception e) {
            throw new IllegalStateException("Class is not parametrized with generic type!!! Please use extends <> ");
        }
    }

    public static String getGenericClassName(Class clase) {
        return getGenericClass(clase).getSimpleName();
    }
}
