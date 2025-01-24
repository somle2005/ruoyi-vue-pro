package com.somle.eccang.convert;

import cn.iocoder.yudao.module.erp.api.product.dto.ErpProductDetailDTO;
import com.somle.eccang.model.EccangProduct;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface EccangConvert {

    EccangConvert INSTANCE = Mappers.getMapper(EccangConvert.class);

    default EccangProduct convert(ErpProductDetailDTO detailDTO) {
        return null;
    }
}
