package cn.iocoder.yudao.module.srm.api.purchase;

import cn.iocoder.yudao.module.srm.api.purchase.dto.SrmPurchaseOrderDTO;
import jakarta.validation.constraints.NotEmpty;
import org.springframework.validation.annotation.Validated;

import java.util.List;
import java.util.Set;

/**
 * 采购订单 API 接口
 */
@Validated
public interface SrmPurchaseOrderApi {

    /**
     * 验证采购订单ID是否存在
     *
     * @param ids 采购订单编号集合
     * @return 存在的采购订单列表
     */
    List<SrmPurchaseOrderDTO> validatePurchaseOrderIds(@NotEmpty(message = "采购订单编号不能为空") Set<Long> ids);

    /**
     * 获取所有采购订单ID
     *
     * @return 采购订单ID列表
     */
    List<Long> listPurchaseOrderIds();

    /**
     * 根据采购订单code集合获取订单ID
     *
     * @param codes 采购订单code集合
     * @return 采购订单ID列表
     */
    List<Long> listPurchaseOrderIdsByCodes(@NotEmpty(message = "采购订单code不能为空") List<String> codes);

    /**
     * 根据采购订单code拿到采购订单
     *
     * @param code 采购订单code
     * @return 采购订单DTO
     */
    SrmPurchaseOrderDTO getPurchaseOrderByCode(@NotEmpty(message = "采购订单code不能为空") String code);

} 