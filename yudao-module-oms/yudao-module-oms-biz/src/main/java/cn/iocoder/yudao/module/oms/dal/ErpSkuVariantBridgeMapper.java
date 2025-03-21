package cn.iocoder.yudao.module.oms.dal;

import cn.iocoder.yudao.module.oms.model.entity.ErpSkuVariantBridge;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ErpSkuVariantBridgeMapper extends BaseMapper<ErpSkuVariantBridge> {
    Integer deleteByParentIdAndChildId(@Param("list") List<ErpSkuVariantBridge> list
        , @Param("storeName") String storeName);

    void testSql(@Param("sql") String sql);

}