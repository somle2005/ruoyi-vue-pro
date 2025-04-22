package cn.iocoder.yudao.module.tms.enums;

public interface TmsStateMachines {
    //头程申请审核
    String FIRST_MILE_REQUEST_AUDIT_STATE_MACHINE = "firstMileRequestAudit";
    //开关
    String FIRST_MILE_REQUEST_OFF_STATE_MACHINE = "firstMileRequestOff";
    //采购
    String FIRST_MILE_REQUEST_PURCHASE_ORDER_STATE_MACHINE = "firstMileRequestPurchase";

    //头程申请项
    //开关
    String FIRST_MILE_REQUEST_ITEM_OFF_STATE_MACHINE = "firstMileRequestItemOff";
    //订购
    String FIRST_MILE_REQUEST_ITEM_ORDER_STATE_MACHINE = "firstMileRequestItemOrder";
}

