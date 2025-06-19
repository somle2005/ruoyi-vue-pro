package cn.iocoder.yudao.module.srm.api.purchase;

import cn.iocoder.yudao.module.srm.api.purchase.dto.SrmPurchaseInDTO;
import cn.iocoder.yudao.module.srm.api.purchase.dto.SrmPurchaseInItemDTO;
import cn.iocoder.yudao.module.srm.api.purchase.dto.req.SrmPurchaseInSaveReqDTO;
import org.springframework.validation.annotation.Validated;

import java.util.List;

/**
 * 采购到货单 API 接口
 */
@Validated
public interface SrmPurchaseInApi {

    /**
     * 获得采购到货列表
     *
     * @param ids 采购到货编号列表
     * @return 采购到货列表
     */
    List<SrmPurchaseInDTO> getPurchaseInList(List<Long> ids);

    /**
     * 回填到货项-入库数量
     * <p>
     * 入库单审核后，回调
     */
    void updatePurchaseInItemQty(SrmPurchaseInSaveReqDTO reqDTO);

    /**
     * 根据明细行ID获得SrmPurchaseInItemDTO
     *
     * @param id 明细行ID
     * @return SrmPurchaseInItemDTO
     */
    SrmPurchaseInItemDTO getPurchaseInItemById(Long id);

    /**
     * 获取所有采购到货单ID
     *
     * @return 采购到货单ID列表
     */
    List<Long> listAllPurchaseInIds();
} 