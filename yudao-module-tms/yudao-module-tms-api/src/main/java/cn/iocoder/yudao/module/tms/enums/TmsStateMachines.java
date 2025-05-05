package cn.iocoder.yudao.module.tms.enums;

public interface TmsStateMachines {
    // ========== 头程申请  ==========
    String FIRST_MILE_REQUEST_AUDIT_STATE_MACHINE = "firstMileRequestAudit";
    //开关
    String FIRST_MILE_REQUEST_OFF_STATE_MACHINE = "firstMileRequestOff";
    //订购
    String FIRST_MILE_REQUEST_PURCHASE_ORDER_STATE_MACHINE = "firstMileRequestPurchase";

    //头程申请明细
    //开关
    String FIRST_MILE_REQUEST_ITEM_OFF_STATE_MACHINE = "firstMileRequestItemOff";
    //订购
    String FIRST_MILE_REQUEST_ITEM_ORDER_STATE_MACHINE = "firstMileRequestItemOrder";

    // ========== 头程单  ==========
    //审核
    String FIRST_MILE_AUDIT_STATE_MACHINE = "firstMileAudit";
}

