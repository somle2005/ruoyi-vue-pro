package com.doudian.open.utils;

import com.doudian.open.exception.DoudianOpException;

import java.lang.reflect.Method;

public class ReflectUtil {
    public static ReflectInvokeResult invoke(Object target, String methodName, Class<?>[] parameterTypes, Object...args) {
        if (target == null) {
            return ReflectInvokeResult.build(null);
        }
        Method targetMethod = null;
        try {
             targetMethod = target.getClass().getMethod(methodName, parameterTypes);
        }catch (NoSuchMethodException e){
            throw new DoudianOpException(DoudianOpException.Code.REFLECT_METHOD_NOT_EXIST, e);
        }
        try {
            return ReflectInvokeResult.build(targetMethod.invoke(target, args));
        }catch (Exception e){
            throw new DoudianOpException(e);
        }
    }

    public static class ReflectInvokeResult {
        private final Object resultObject;
        public String withString() {
            if (resultObject == null) {
                return null;
            }
            try {
                return (String) resultObject;
            }catch (Exception e) {
                throw new DoudianOpException(e);
            }
        }

        @SuppressWarnings("unchecked")
        public <T> T withClassType(Class<T> clazz) {
            try {
                return (T) resultObject;
            }catch (Exception e){
                throw new DoudianOpException(e);
            }
        }

        public ReflectInvokeResult(Object resultObject) {
            this.resultObject = resultObject;
        }

        public static ReflectInvokeResult build(Object value) {
            return new ReflectInvokeResult(value);
        }
    }

    public static boolean implement(Class<?> clazz, String interfaceName) {
        if (clazz == null){
            return false;
        }

        Class<?>[] interfaces = clazz.getInterfaces();
        if (interfaces.length > 0){
            for (Class<?> inter : interfaces) {
                if (inter.getName().equals(interfaceName)) {
                    return true;
                }
            }
        }
        if (clazz.getSuperclass() != null){
            return implement(clazz.getSuperclass(), interfaceName);
        }
        return false;
    }

    public static <T> T newObject(Class<T> clazz) {
        try {
            return clazz.newInstance();
        } catch (Exception e) {
            throw new DoudianOpException(e);
        }
    }
}
