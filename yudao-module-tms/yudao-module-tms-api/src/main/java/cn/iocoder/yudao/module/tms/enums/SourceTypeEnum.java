package cn.iocoder.yudao.module.tms.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 原单类型枚举
 */
@Getter
@AllArgsConstructor
public enum SourceTypeEnum {

    FIRST_MILE("FIRST_MILE", "头程单"),
    TRANSFER("TRANSFER", "调拨单");

    /**
     * 类型
     */
    private final String type;
    /**
     * 名称
     */
    private final String name;

}