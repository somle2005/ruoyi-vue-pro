package cn.iocoder.yudao.module.oms.enums;

import cn.iocoder.yudao.framework.common.exception.ErrorCode;

/**
 * OMS 错误码枚举类
 * <p>
 * erp 系统，使用 1-020-000-000 段
 *
 * @author Administrator
 */
public interface ErrorCodeConstants {

    // ========== OMS同步异常（1-020-001-000） ==========
    ErrorCode OMS_SYNC_SHOP_INFO_LACK = new ErrorCode(1 - 020 - 001 - 000, "OMS同步缺少店铺信息");
    ErrorCode OMS_SYNC_SHOP_PRODUCT_LACK = new ErrorCode(1 - 020 - 001 - 001, "OMS同步缺少店铺产品信息");

    ErrorCode OMS_SYNC_SHOPIFY_SHOP_INFO_LACK = new ErrorCode(1 - 020 - 001 - 002, "OMS同步无法获取有效的Shopify店铺信息");

    ErrorCode OMS_SYNC_SHOPIFY_SHOP_INFO_FIRST = new ErrorCode(1 - 020 - 001 - 003, "请先同步Shopify店铺信息");

    ErrorCode OMS_SYNC_CONVERTER_NOT_FOUND = new ErrorCode(1_020_001_004, "未找到对应的转换器:{}");

    ErrorCode OMS_SYNC_CONVERTER_METHOD_NOT_FOUND = new ErrorCode(1_020_001_005, "未找到对应的转换方法:{}");


}
