package cn.iocoder.yudao.module.erp.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
* @Author Wqh
* @Description 数据类型枚举
* @Date 9:50 2024/10/22
**/
@RequiredArgsConstructor
@Getter
public enum DateType {
    DATE_TIME(5),
    DECIMAL(4),
    TEXT(3),
    INT(1);

    private final Integer type;

    public static DateType of(Integer type) {
        return DateType.values()[type];
    }
}
