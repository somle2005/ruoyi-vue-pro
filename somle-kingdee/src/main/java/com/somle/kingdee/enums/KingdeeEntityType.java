package com.somle.kingdee.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 金蝶基础资料及业务单据类型枚举
 *
 * @author wdy
 */
@Getter
@AllArgsConstructor
@SuppressWarnings("all")
public enum KingdeeEntityType {

    // ==================== 基础资料类型 ====================

    // 商品相关
    MATERIAL("bd_material", "商品"),
    MATERIAL_GROUP("bd_materialgroup", "类别"),
    BRAND_GROUP("bd_brandgroup", "品牌分类"),
    BRAND("bd_brand", "品牌"),
    LABEL("bd_label", "商品标签"),
    LABEL_GROUP("bd_labelgroup", "品标签分类"),

    // 库存相关
    INVENTORY_ENTITY("inv_inventory_entity", "库存"),
    STORE("bd_store", "仓库"),
    STORE_GROUP("bd_storegroup", "仓库分类"),
    SPACE("bd_space", "仓位"),

    // 辅助资料相关
    AUX_DETAIL("bd_auxdetail", "辅助属性"),
    AUX_INFO("bd_auxinfo", "辅助资料"),
    AUX_INFO_TYPE("bd_auxinfotype", "辅助资料分类"),

    // 组织架构相关
    DEPARTMENT("bd_department", "部门"),
    EMPLOYEE("bd_employee", "职员"),

    // 财务相关
    CURRENCY("bd_currency", "币别"),
    ACCOUNT("bd_account", "科目"),
    BANK("bd_bank", "账户"),
    SETTLEMENT_TYPE("bd_settlementtype", "结算方式"),
    PACCT_TYPE("bd_paccttype", "收入类别"),
    MEASURE_UNITS("bd_measureunits_new", "计量单位"),

    // 客户相关
    CUSTOMER("bd_customer", "客户"),
    CUSTOMER_GROUP("bd_customergroup", "客户分类"),

    // 供应商相关
    SUPPLIER("bd_supplier", "供应商"),
    SUPPLIER_GROUP("bd_suppliergroup", "供应商分类"),

    // 物流相关
    LOGISTICS_COMPANY("bd_logisticscompany", "物流公司"),

    // 外部基础资料
    VIRTUAL_BASE("iac_virtualbase", "外部基础资料"),

    // 零售相关
    LSBD_STORE("lsbd_store", "零售门店"),
    LSBD_MB_LEVEL("lsbd_mblevel", "会员级别"),
    LSBD_MB("lsbd_mb", "会员信息"),
    LSBD_ONOFFSHELF("lsbd_onoffshelf", "门店商品上下架"),
    LSST_RETAIL_PRICE("lsst_retail_price", "门店零售价"),
    STORE_BILL("store_bill", "零售单据"),

    // ==================== 业务单据类型 ====================

    // 采购相关
    PUR_BILL_INBOUND("pur_bill_inbound", "采购入库"),
    PUR_BILL_ORDER("pur_bill_order", "采购订单"),
    PUR_BILL_OUTBOUND("pur_bill_outbound", "采购退货"),
    PUR_BILL_REQUEST("pur_bill_request", "采购申请"),

    // 销售相关
    SAL_BILL_ORDER("sal_bill_order", "销售订单"),
    SAL_BILL_OUTBOUND("sal_bill_outbound", "销售出库"),
    SAL_BILL_INBOUND("sal_bill_inbound", "销售退货"),
    SAL_INBOUND_REQUEST("sal_inbound_request", "销售退货申请"),

    // 库存相关
    INV_OTHER_BILL_INBOUND("inv_other_bill_inbound", "其他入库单"),
    INV_OTHER_BILL_OUTBOUND("inv_other_bill_outbound", "其他出库单"),
    INV_TFMOVE_BILL_ORDER("inv_tfmove_bill_order", "移仓单"),
    INV_TFIN_BILL_INBOUND("inv_tfin_bill_inbound", "调拨入库"),
    INV_TFOUT_BILL_OUTBOUND("inv_tfout_bill_outbound", "调拨出库"),
    INV_TFDIFF_BILL_ORDER("inv_tfdiff_bill_order", "调拨差异"),
    INV_CHECK_BILL("inv_check_bill", "盘点单"),
    INV_CHECK_GAIN_BILL("inv_check_gain_bill", "盘盈单"),
    INV_CHECK_LOSS_BILL("inv_check_loss_bill", "盘亏单"),
    INV_ASSEMBLE_BILL("inv_assemble_bill", "组装单"),
    INV_DISASSEMBLE_BILL("inv_disassemble_bill", "拆卸单"),
    INV_OUT_BILL_THIRD("inv_out_bill_third", "零售结存单"),
    INV_PRODUCT_BILL("inv_product_bill", "产品入库单"),
    INV_PRODUCT_RTN_BILL("inv_product_rtn_bill", "产品退库单"),
    INV_PICK_BILL("inv_pick_bill", "生产领料单"),
    INV_PICK_RTN_BILL("inv_pick_rtn_bill", "生产退料单"),

    // 委外相关
    SUBM_PRODUCT_IN_ORDER("subm_product_in_order", "委外产品入库单"),
    SUBM_PRODUCT_RETURN_ORDER("subm_product_return_order", "委外产品退单"),
    SUBM_RETURN_MATERIAL_ORDER("subm_return_material_order", "委外退料单"),
    SUBM_WORK_ORDER("subm_work_order", "委外加工单"),

    // 生产相关
    MO_TASK_BILL("mo_task_bill", "生产任务单"),

    // 委托代销
    SAL_BILL_ENTRUST("sal_bill_entrust", "委托代销单"),

    // 应收相关
    AR_CREDIT_BILL("ar_creditbill", "收款单"),
    AR_CREDIT_RET_BILL("ar_creditretbill", "收款退款单"),
    AR_PRE_CREDIT_BILL("ar_precreditbill", "预收款单"),
    AR_PRE_CREDIT_RET_BILL("ar_precreditretbill", "预收退款单"),
    AR_OTHER_CREDIT_BILL("ar_othercreditbill", "其他应收单"),
    AR_OTHER_CREDIT_RET_BILL("ar_othercreditretbill", "其他收入退款单"),

    // 应付相关
    AP_PAY_BILL("ap_paybill", "付款单"),
    AP_PRE_PAY_BILL("ap_prepaybill", "预付款单"),
    AP_PRE_PAY_RET_BILL("ap_prepayretbill", "预付退款单"),
    AP_OTHER_PAY_BILL("ap_otherpaybill", "其他支出单"),
    AP_PAY_RET_BILL("ap_payretbill", "付款退款单"),

    // 外部单据
    IAC_VIRTUAL_BILL("iac_virtualbill", "外部单据"),

    // 财务相关
    GL_VOUCHER("gl_voucher", "凭证"),
    CA_JOURNAL("ca_journal", "日记账"),

    // ==================== 系统类型 ====================

    // 自定义字段
    JDY_CUSTOM_FIELD_MET("jdy_custom_field_met", "自定义字段");

    /**
     * 编码
     */
    private final String code;

    /**
     * 名称
     */
    private final String name;

    /**
     * 根据编码获取枚举
     *
     * @param code 编码
     * @return 枚举值
     */
    public static KingdeeEntityType getByCode(String code) {
        for (KingdeeEntityType type : values()) {
            if (type.getCode().equals(code)) {
                return type;
            }
        }
        return null;
    }

    /**
     * 根据名称获取枚举
     *
     * @param name 名称
     * @return 枚举值
     */
    public static KingdeeEntityType getByName(String name) {
        for (KingdeeEntityType type : values()) {
            if (type.getName().equals(name)) {
                return type;
            }
        }
        return null;
    }

    /**
     * 判断是否为基础资料类型
     *
     * @return true-基础资料类型，false-业务单据类型
     */
    public boolean isBasicData() {
        return this.code.startsWith("bd_") ||
            this.code.startsWith("inv_inventory_entity") ||
            this.code.startsWith("lsbd_") ||
            this.code.startsWith("lsst_") ||
            this.code.startsWith("store_") ||
            this.code.startsWith("iac_virtualbase");
    }

    /**
     * 判断是否为业务单据类型
     *
     * @return true-业务单据类型，false-基础资料类型
     */
    public boolean isBusinessDocument() {
        return !isBasicData() && !this.code.startsWith("jdy_");
    }

    /**
     * 判断是否为系统类型
     *
     * @return true-系统类型，false-其他类型
     */
    public boolean isSystemType() {
        return this.code.startsWith("jdy_");
    }

    @Override
    public String toString() {
        return this.code;
    }
} 