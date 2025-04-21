package cn.iocoder.yudao.module.tms.enums;

public interface TmsStateMachines {
    //采购申请主表开关状态机
    //    String PURCHASE_REQUEST_OFF_STATE_MACHINE_NAME = "purchaseRequestOff";

    //头程申请审核
    String FIRST_MILE_REQUEST_AUDIT_STATE_MACHINE = "firstMileRequestAudit";
    //开关
    String FIRST_MILE_REQUEST_OFF_STATE_MACHINE = "firstMileRequestOff";
    //采购
    String FIRST_MILE_REQUEST_PURCHASE_STATE_MACHINE = "firstMileRequestPurchase";
}

