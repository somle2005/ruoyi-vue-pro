package com.somle.kingdee.enums;

import cn.iocoder.yudao.framework.common.exception.ErrorCode;

public interface KingDeeErrorCodeConstants {
    // ========== 供应商 2-000-001-000 ==========
    ErrorCode SUPPLIER_LIST_BREAK = new ErrorCode(2_000_001_001, "获取供应商列表被中断,原因:{}");
    ErrorCode SUPPLIER_LIST_FAIL = new ErrorCode(2_000_001_002, "获取供应商列表数据失败,原因:{}");
    ErrorCode SUPPLIER_LIST_LOADING = new ErrorCode(2_000_001_003, "供应商锁获取超时，请重试");
    ErrorCode SUPPLIER_LIST_SYNC_FAIL = new ErrorCode(2_000_001_004, "({})供应商同步失败，供应商:({})");
    ErrorCode SUPPLIER_NOT_EXIST = new ErrorCode(2_000_001_005, "金蝶供应商编号:({}) 缓存中不存在,同步失败");
    ErrorCode SUPPLIER_ADD_FAIL = new ErrorCode(2_000_001_006, "添加供应商失败，供应商编号:{}");
    ErrorCode SUPPLIER_LIST_REFRESH_FAIL = new ErrorCode(2_000_001_007, "刷新供应商列表失败，标识:{}");

    // ========== 部门 2-000-003-000 ==========
    ErrorCode DEPARTMENT_ADD_FAIL = new ErrorCode(2_000_003_001, "添加部门失败，部门名称:{}");

    // ========== 产品 2-000-004-000 ==========
    ErrorCode PRODUCT_ADD_FAIL = new ErrorCode(2_000_004_001, "添加产品失败，产品编号:{}");

    // ========== 采购订单 2-000-002-000 ==========
    ErrorCode PURCHASE_ORDER_SAVE_SUCCESS_BUT_NO_ID = new ErrorCode(2_000_002_001, "保存采购订单{}成功但未返回订单ID");
    ErrorCode PURCHASE_ORDER_NOT_EXIST = new ErrorCode(2_000_002_002, "采购订单{}，在金蝶中不存在");
    ErrorCode PURCHASE_ORDER_UNAUDIT_FAIL = new ErrorCode(2_000_002_003, "采购订单{}取消审核失败，原因:{}");
    ErrorCode PURCHASE_ORDER_BATCH_UNAUDIT_FAIL = new ErrorCode(2_000_002_004, "部分客户端取消审核失败，单号:{}");
    ErrorCode PURCHASE_ORDER_SAVE_FAIL = new ErrorCode(2_000_002_005, "保存采购订单失败，订单号:{}");
    ErrorCode PURCHASE_ORDER_SAVE_AND_AUDIT_FAIL = new ErrorCode(2_000_002_006, "保存并审核采购订单失败，订单号:{}");

    // ========== 采购入库单 2-000-005-000 ==========
    ErrorCode PUR_INBOUND_SAVE_FAIL = new ErrorCode(2_000_005_001, "保存采购入库单失败，单据号:{}");
    ErrorCode PUR_INBOUND_NOT_EXIST = new ErrorCode(2_000_005_002, "采购到货单{}，上游采购订单编码不存在");

    // ========== 采购出库单 2-000-006-000 ==========
    ErrorCode PUR_OUTBOUND_SAVE_FAIL = new ErrorCode(2_000_006_001, "保存采购出库单失败，单据号:{}");
}
