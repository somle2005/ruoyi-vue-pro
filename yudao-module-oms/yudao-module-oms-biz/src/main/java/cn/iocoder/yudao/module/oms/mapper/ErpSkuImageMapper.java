package cn.iocoder.yudao.module.oms.mapper;

import cn.iocoder.yudao.module.oms.domain.entity.ErpSkuImage;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ErpSkuImageMapper extends BaseMapper<ErpSkuImage> {

   Integer deleteBySkuIdAndPlatSrcId(@Param("list") List<ErpSkuImage> list, @Param("storeName") String storeName);


}