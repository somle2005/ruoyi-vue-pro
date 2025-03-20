package cn.iocoder.yudao.module.oms.mapper;

import cn.iocoder.yudao.module.oms.domain.entity.ErpSkuVariantBridge;
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