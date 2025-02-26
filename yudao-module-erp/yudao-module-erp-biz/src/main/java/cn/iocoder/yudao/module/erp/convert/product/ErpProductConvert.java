package cn.iocoder.yudao.module.erp.convert.product;

import cn.iocoder.yudao.module.erp.api.product.dto.ErpProductDTO;
import cn.iocoder.yudao.module.erp.api.product.dto.ErpProductRespDTO;
import cn.iocoder.yudao.module.erp.controller.admin.product.vo.product.ErpProductRespVO;
import cn.iocoder.yudao.module.erp.dal.dataobject.product.ErpProductDO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Mapper
public interface ErpProductConvert {

    ErpProductConvert INSTANCE = Mappers.getMapper(ErpProductConvert.class);


    ErpProductDTO convert(ErpProductDO erpProductDO);
    ErpProductRespDTO convert(ErpProductRespVO erpProductRespVO);

    default List<ErpProductDTO> convert(List<ErpProductDO> erpProductDOs) {
        if (erpProductDOs != null) {
            return erpProductDOs.stream().map(this::convert).toList();
        }
        return null;
    }

    // Map 转换
    default Map<Long, ErpProductDTO> convert(Map<Long, ErpProductDO> productMap) {
        if (productMap == null) {
            return null;
        }
        Map<Long, ErpProductDTO> result = new java.util.HashMap<>();
        for (Map.Entry<Long, ErpProductDO> entry : productMap.entrySet()) {
            result.put(entry.getKey(), convert(entry.getValue()));
        }
        return result;
    }
    default List<ErpProductRespDTO> toErpProductRespVO(List<ErpProductRespVO> erpProductRespVOS) {
        if (erpProductRespVOS == null) {
            return null;
        }
        return erpProductRespVOS.stream()
                .map(this::convert)
                .collect(Collectors.toList());
    }
}

