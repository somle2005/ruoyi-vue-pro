package cn.iocoder.yudao.module.srm.enums;

/**
 * SRM 消息通道枚举
 *
 * @author 芋道源码
 */
public interface SrmChannelEnum {

    // ========== 供应商相关 ==========
    /**
     * 供应商通道
     */
    String SUPPLIER = "srm_channel_supplier";

    // ========== 采购订单相关 ==========
    /**
     * 采购订单(创建+审核)通道
     */
    String PURCHASE_ORDER_AUDIT = "srm_channel_purchase_order_audit";

    /**
     * 采购订单(反审核+删除)通道
     */
    String PURCHASE_ORDER_REVERSE = "srm_channel_purchase_order_reverse";

    // ========== 采购入库相关 ==========
    /**
     * 采购入库单通道
     */
    String PURCHASE_IN = "srm_channel_purchase_in";

    // ========== 采购退货相关 ==========
    /**
     * 采购退货单通道
     */
    String PURCHASE_RETURN = "srm_channel_purchase_return";
}
