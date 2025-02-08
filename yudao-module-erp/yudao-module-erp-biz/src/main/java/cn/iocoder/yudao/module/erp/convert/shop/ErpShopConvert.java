package cn.iocoder.yudao.module.erp.convert.shop;

import cn.iocoder.yudao.module.erp.api.product.dto.ErpProductDTO;
import cn.iocoder.yudao.module.erp.controller.admin.shop.vo.ErpShopSaveReqVO;
import cn.iocoder.yudao.module.erp.dal.dataobject.product.ErpProductDO;
import cn.iocoder.yudao.module.erp.dal.dataobject.shop.ErpShopDO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface ErpShopConvert {

    ErpShopConvert INSTANCE = Mappers.getMapper(ErpShopConvert.class);

    ErpShopSaveReqVO convert(ErpShopDO erpProductDO);

}
