package com.somle.kingdee.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 金蝶操作类型枚举
 *
 * @author wdy
 */
@Getter
@AllArgsConstructor
@SuppressWarnings("all")
public enum KingdeeOperateType {

    /**
     * 删除
     */
    DELETE("delete", "删除"),

    /**
     * 审核
     */
    AUDIT("audit", "审核"),

    /**
     * 反审核
     */
    UNAUDIT("unaudit", "反审核"),

    /**
     * 订单关闭
     */
    CLOSE_DONOTHING("close_donothing", "订单关闭");

    /**
     * 操作代码
     */
    private final String code;

    /**
     * 操作名称
     */
    private final String name;

    /**
     * 根据代码获取枚举
     *
     * @param code 操作代码
     * @return 枚举值
     */
    public static KingdeeOperateType getByCode(String code) {
        for (KingdeeOperateType type : values()) {
            if (type.getCode().equals(code)) {
                return type;
            }
        }
        return null;
    }

    /**
     * 根据名称获取枚举
     *
     * @param name 操作名称
     * @return 枚举值
     */
    public static KingdeeOperateType getByName(String name) {
        for (KingdeeOperateType type : values()) {
            if (type.getName().equals(name)) {
                return type;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return this.code;
    }
} 