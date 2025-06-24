package com.doudian.open.core;

import com.doudian.open.annotation.OpField;
import com.doudian.open.exception.DoudianOpException;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ParameterChecker {
    public static void check(Object obj) {
        if (obj == null){
            return;
        }
       List<Field> fields = getAllField(obj.getClass());
       if(fields == null || fields.size() == 0){
           return;
       }
       for(Field field : fields) {
           OpField opAnnotation = field.getAnnotation(OpField.class);
           if(opAnnotation == null) {
               continue;
           }
           if(!opAnnotation.required()) {
               continue;
           }
           //必填参数校验
           field.setAccessible(true);
           Object value = null;
           try {
               value = field.get(obj);
           }catch (Exception e){
               //异常了就不校验了
               continue;
           }
           if(value == null) {
               throw new DoudianOpException(DoudianOpException.Code.PARAMETER_REQUIRED_CHECK_ERROR, "field name -> " + field.getName());
           }
           //递归检测
           check(value);
       }
    }

    private static List<Field> getAllField(Class<?> clazz) {
        if(clazz == null){
            return null;
        }
        List<Field> ret = new ArrayList<>();
        if(clazz.getSuperclass() != null){
            List<Field> superFields = getAllField(clazz.getSuperclass());
            if (superFields != null && superFields.size() > 0) {
                ret.addAll(superFields);
            }
        }
        Field[] fields = clazz.getDeclaredFields();
        if (fields.length == 0){
            return null;
        }

        ret.addAll(Arrays.asList(fields));
        return ret;
    }
}