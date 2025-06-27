package cn.iocoder.yudao.module.srm.tool;

import cn.iocoder.yudao.framework.common.util.date.LocalDateTimeUtils;

import java.lang.reflect.Field;
import java.time.LocalDateTime;
import java.util.List;

/**
 * @author: wdy
 */
public class TmsLocalDateTimeZoneConvertUtils {

    /**
     * 对单个对象中所有 LocalDateTime 字段，进行时区转换
     */
    public static <T> void convertLocalDateTimeFields(T target) {
        if (target == null) return;
        Field[] fields = target.getClass().getDeclaredFields();

        for (Field field : fields) {
            if (!field.getType().equals(LocalDateTime.class)) continue;

            field.setAccessible(true);
            try {
                LocalDateTime originalValue = (LocalDateTime) field.get(target);
                if (originalValue != null) {
                    LocalDateTime converted = LocalDateTimeUtils.transferByUserTimeZone(originalValue);
                    field.set(target, converted);
                }
            } catch (IllegalAccessException e) {
                throw new RuntimeException("Failed to convert LocalDateTime field: " + field.getName(), e);
            }
        }
    }

    /**
     * 对集合中所有对象的 LocalDateTime 字段进行时区转换
     */
    public static <T> void convertLocalDateTimeFields(List<T> targetList) {
        if (targetList == null || targetList.isEmpty()) return;
        for (T item : targetList) {
            convertLocalDateTimeFields(item);
        }
    }

}
