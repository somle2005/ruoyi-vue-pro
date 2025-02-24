package cn.iocoder.yudao.framework.common.util.lang;

/**
 * @author: LeeFJ
 * @date: 2025/2/24 11:45
 * @description:
 */
public class DataParser {

    public static Long parseLong(Object value) {
        if (value == null) {
            return null;
        }
        if (value instanceof Long) {
            return (Long) value;
        }
        try {
            return Long.parseLong(value.toString());
        } catch (NumberFormatException e) {
            return null;
        }
    }

}
