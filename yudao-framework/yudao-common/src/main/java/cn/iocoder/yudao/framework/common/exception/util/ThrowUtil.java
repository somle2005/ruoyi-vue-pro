package cn.iocoder.yudao.framework.common.exception.util;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.text.CharSequenceUtil;
import cn.hutool.core.util.ObjectUtil;
import cn.iocoder.yudao.framework.common.exception.ErrorCode;

import java.util.Collection;
import java.util.Objects;

import static cn.iocoder.yudao.framework.common.exception.util.ServiceExceptionUtil.exception;

/**
 * @className: ThrowUtil
 * @author: Wqh
 * @date: 2024/10/10 10:43
 * @Version: 1.0
 * @description: 条件异常工具类
 */
public  final class ThrowUtil {
    private ThrowUtil() {}



    public static void ifThrow(boolean condition, ErrorCode message) {
        if (condition) {
            throw exception(message);
        }
    }
    public static void ifThrow(boolean condition, ErrorCode message,Object... params) {
        if (condition) {
            throw exception(message,params);
        }
    }
    public static void ifNotEqualsThrow(Object firstValue, Object secondValue, ErrorCode message) {
        if (Objects.isNull(firstValue) || Objects.isNull(secondValue) ||
                !Objects.equals(firstValue, secondValue)) {
            throw exception(message);
        }
    }

    public static void ifEmptyThrow(Object data, ErrorCode message) {
        if (ObjectUtil.isEmpty(data)){
            throw exception(message);
        }
    }

    public static void ifNotEmptyThrow(Object data, ErrorCode message) {
        if (ObjectUtil.isNotEmpty(data)){
            throw exception(message);
        }
    }

    public static void ifBlankThrow(String s, ErrorCode message) {
        if (CharSequenceUtil.isBlank(s)){
            throw exception(message);
        }
    }

    public static void ifGreater(Long no, long l, ErrorCode message) {
        if (no > l) {
            throw exception(message);
        }
    }
    //sql操作行数
    public static void ifSqlThrow(int count, ErrorCode message) {
        if (count <= 0) {
            throw exception(message);
        }
    }
    //集合为空或为null的操作
    public static void ifCollectionEmptyThrow(Collection<?> data, ErrorCode message) {
        if (CollUtil.isEmpty(data)){
            throw exception(message);
        }
    }

    public static void ifCollectionNotEmptyThrow(Collection<?> data, ErrorCode message) {
        if (CollUtil.isNotEmpty(data)){
            throw exception(message);
        }
    }
    public static void ifCollectionNotEmptyThrow(Collection<?> data, ErrorCode message,Object... params) {
        if (CollUtil.isNotEmpty(data)){
            throw exception(message,params);
        }
    }
}
