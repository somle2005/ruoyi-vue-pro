package com.somle.esb.convert;

import cn.iocoder.yudao.module.srm.api.purchase.dto.SrmPurchaseInDTO;
import com.somle.kingdee.model.KingdeePurInboundSaveReqVO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * 采购入库单转换器
 */
@Mapper
public interface KingdeePurInboundConvert {

    KingdeePurInboundConvert INSTANCE = Mappers.getMapper(KingdeePurInboundConvert.class);

    /**
     * 将 SRM 采购入库单转换为金蝶采购入库单
     *
     * @param inOrder SRM采购入库单
     * @return 金蝶采购入库单
     */
    KingdeePurInboundSaveReqVO convert(SrmPurchaseInDTO inOrder);

    /**
     * 将 SRM 采购入库单列表转换为金蝶采购入库单列表
     *
     * @param inOrders SRM采购入库单列表
     * @return 金蝶采购入库单列表
     */
    List<KingdeePurInboundSaveReqVO> convertList(List<SrmPurchaseInDTO> inOrders);

} 