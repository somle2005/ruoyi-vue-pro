package cn.iocoder.yudao.framework.common.enums.enums;

/**
 * System 字典类型的枚举类
 *
 * @author 芋道源码
 */
public interface DictTypeConstants {
    // 货币代码
    String CURRENCY_CODE = "currency_code";
    //国家代码
    String COUNTRY_CODE = "country_code";

    //开启状态，布尔值
    String COMMON_BOOLEAN_STATUS = "common_boolean_status";

    //产品材料
    String PRODUCT_MATERIAL = "erp_product_material";

    //审核状态(SRM、TMS)
    String AUDIT_STATUS = "srm_audit_status";
    //订购状态
    String ORDER_STATUS = "srm_order_status";
    //开关状态
    String OFF_STATUS = "srm_off_status";

    //货柜类型
    String TMS_CABINET_TYPE = "cabinet_type";
    //费用类型
    String TMS_FEE_TYPE = "fee_type";
}
