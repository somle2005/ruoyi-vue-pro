package cn.iocoder.yudao.module.erp.convert.product;

import cn.iocoder.yudao.module.erp.api.product.dto.ErpProductDTO;
import cn.iocoder.yudao.module.erp.dal.dataobject.product.ErpProductDO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ErpProductConvert {

    ErpProductConvert INSTANCE = Mappers.getMapper(ErpProductConvert.class);


    ErpProductDTO convert(ErpProductDO erpProductDO);

    //ErpProductDTO集合

}
