package cn.iocoder.yudao.module.erp.dal.supporting;

import cn.iocoder.yudao.module.erp.dal.mysql.product.tvstand.ErpProductTvStandMapper;
import cn.iocoder.yudao.module.erp.dal.mysql.product.xxxx.ErpProductXxxxMapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

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
    private static final Map<Long, Class<? extends BaseMapper<?>>> TABLE_MAP;
    static {
        TABLE_MAP = new HashMap<>(16);
        TABLE_MAP.put(87L, ErpProductXxxxMapper.class);
        TABLE_MAP.put(88L, ErpProductTvStandMapper.class);
    }

    public static Map<Long, Class<? extends BaseMapper<?>>> getTableMap() {
        return TABLE_MAP;
    }

}
