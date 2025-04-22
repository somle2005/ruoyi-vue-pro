package cn.iocoder.yudao.module.tms.enums;

import cn.iocoder.yudao.framework.common.exception.ErrorCode;

/**
 * ERP 错误码枚举类
 * <p>
 * tms 系统，使用 1-030-000-000 段
 *
 * @author Administrator
 */
public interface ErrorCodeConstants {
    // ========== ERP 海关规则 1-030-604-000 ==========
    ErrorCode CUSTOM_RULE_NOT_EXISTS = new ErrorCode(1_030_604_000, "ERP 海关规则不存在");
    ErrorCode CUSTOM_RULE_PART_NULL = new ErrorCode(1_030_604_001, "集合中存在部分集合产品名称或供应商产品编码为空");
    ErrorCode NO_REPEAT_OF_COUNTRY_CODE_AND_SUPPLIER_PRODUCT_CODE = new ErrorCode(1_030_604_002, "海关规则中，国家代码+供应商产品编码不能重复");
    ErrorCode NO_REPEAT_OF_COUNTRY_CODE_AND_PRODUCT_CODE = new ErrorCode(1_030_604_003, "海关规则中，产品编码+国家代码({})不能重复");
    // ========== 海关分类 1-030-605-000 ==========
    ErrorCode CUSTOM_RULE_CATEGORY_NOT_EXISTS = new ErrorCode(1_030_605_001, "海关分类不存在");
    // ========== 海关分类子表 1-030-606-000 ==========
    ErrorCode CUSTOM_RULE_CATEGORY_ITEM_NOT_EXISTS = new ErrorCode(1_030_606_001, "海关分类子表不存在");
    ErrorCode CUSTOM_RULE_CATEGORY_ITEM_NOT_EXISTS_BY_PRODUCT_ID = new ErrorCode(1_030_606_002, "所选产品中不存在海关分类数据");
    // ========== 头程申请单 1-030-670-000  ==========
    ErrorCode FIRST_MILE_REQUEST_NOT_EXISTS = new ErrorCode(1_030_670_001, "头程申请单(编号:{})不存在");
    ErrorCode FIRST_MILE_REQUEST_ITEM_NOT_EXISTS = new ErrorCode(1_030_670_002, "头程申请单(编号:{})明细不存在");
    ErrorCode FIRST_MILE_REQUEST_OFF_STATUS_NOT_ALLOWED = new ErrorCode(1_030_670_003, "头程申请单({})状态为({})，不允许关闭");
    ErrorCode FIRST_MILE_REQUEST_CODE_DUPLICATE = new ErrorCode(1_030_670_004, "头程申请单编号({})已存在");
    ErrorCode FIRST_MILE_REQUEST_CODE_GENERATE_FAIL = new ErrorCode(1_030_670_005, "头程申请单编号生成失败,大于999999");
    //头程申请创建生成失败
    ErrorCode FIRST_MILE_REQUEST_CREATE_FAIL = new ErrorCode(1_030_670_006, "头程申请单创建失败,大于999999");

    //状态机错误,无法在({})状态下触发({})事件，上下文：{}
    // ========== 状态机异常 1-030-900-000 ==========
    ErrorCode FIRST_MILE_REQUEST_STATUS_MACHINE_ERROR = new ErrorCode(1_030_900_001, "({})状态下不能触发({})事件");


}
