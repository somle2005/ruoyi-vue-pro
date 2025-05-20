package com.somle.esb.convert;

import cn.iocoder.yudao.module.srm.api.purchase.dto.SrmPurchaseReturnDTO;
import com.somle.kingdee.model.KingdeePurReturnSaveReqVO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * 采购退货单转换器
 */
@Mapper
public interface KingdeePurReturnConvert {

    KingdeePurReturnConvert INSTANCE = Mappers.getMapper(KingdeePurReturnConvert.class);

    /**
     * 将 SRM 采购退货单转换为金蝶采购退货单
     *
     * @param returnOrder SRM采购退货单
     * @return 金蝶采购退货单
     */
    KingdeePurReturnSaveReqVO convert(SrmPurchaseReturnDTO returnOrder);

    /**
     * 将 SRM 采购退货单列表转换为金蝶采购退货单列表
     *
     * @param returnOrders SRM采购退货单列表
     * @return 金蝶采购退货单列表
     */
    List<KingdeePurReturnSaveReqVO> convertList(List<SrmPurchaseReturnDTO> returnOrders);

} 