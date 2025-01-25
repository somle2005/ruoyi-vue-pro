package cn.iocoder.yudao.module.erp.api.logistic.customrule.dto;

import lombok.Builder;
import lombok.Data;

/**
 * 产品数据(含xx海关规则)
 * <p>
 * 产品数据:海关规则-> 1:n
 */
@Data
@Builder
public class ErpCustomRuleDTO {
    /**
     * 海关规则id  =====>>>> 映射到pd_declaration_statement
     */
    private String id;

    /**
     * 国家编码
     */
    private Integer countryCode;

    /**
     * 产品物流属性
     */
    private Integer logisticAttribute;

    /**
     * 海关编码
     */
    private String hscode;

    /**
     * 申报价值
     */
    private Float declaredValue;

    /**
     * 申报品名CN
     */
    private String declaredType;

    /**
     * 申报品名EN
     */
    private String declaredTypeEn;

    /**
     * 清关税率
     */
    private Float taxRate;

    /**
     * 条形码
     */
    private String fbaBarCode;
    /**
     * 采购货币币种
     */
    private Integer declaredValueCurrencyCode;
}
