package com.somle.kingdee.constant;

/**
 * ERP系统 Redis Key 常量类
 */
public class ErpRedisKeyConstants {

    /**
     * 金蝶物料缓存
     * 格式：kingdee:material:{物料编号}
     */
    public static final String KINGDEE_MATERIAL = "esb:kingdee:material";

    /**
     * 金蝶供应商列表缓存
     * 格式：esb:kingdee:supplier:list:{查询参数hash}
     */
    public static final String KINGDEE_SUPPLIER_LIST = "esb:kingdee:supplier:list";

} 