package com.somle.kingdee.enums;

import cn.iocoder.yudao.framework.common.exception.ErrorCode;

public interface KingDeeErrorCodeConstants {
    // ========== 供应商 2-000-001-000 ==========
    ErrorCode SUPPLIER_LIST_BREAK = new ErrorCode(2_000_001_001, "获取供应商列表被中断,原因:{}");
    ErrorCode SUPPLIER_LIST_FAIL = new ErrorCode(2_000_001_002, "获取供应商列表数据失败,原因:{}");
    ErrorCode SUPPLIER_LIST_LOADING = new ErrorCode(2_000_001_003, "供应商锁获取超时，请重试");
    ErrorCode SUPPLIER_LIST_SYNC_FAIL = new ErrorCode(2_000_001_004, "({})供应商同步失败，供应商:({})");
    ErrorCode SUPPLIER_NOT_EXIST = new ErrorCode(2_000_001_005, "金蝶供应商:{} 缓存中不存在,同步失败");
}
