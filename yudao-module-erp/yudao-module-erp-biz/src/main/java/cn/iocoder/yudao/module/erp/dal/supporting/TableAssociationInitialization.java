package cn.iocoder.yudao.module.erp.dal.supporting;

import java.util.HashMap;
import java.util.Map;

/**
 * @className: TableAssociationInitialization
 * @author: Wqh
 * @date: 2024/11/15 10:07
 * @Version: 1.0
 */
public class TableAssociationInitialization {
    private TableAssociationInitialization(){}

    // 静态代码块初始化数据
    private static final Map<Long, String> TABLE_MAP;
    static {
        TABLE_MAP = new HashMap<>(16);
        TABLE_MAP.put(87L, "erp_product_yyyy");
        TABLE_MAP.put(88L, "erp_product_yyyy");
    }

    public static Map<Long, String> getTableMap() {
        return TABLE_MAP;
    }

}
