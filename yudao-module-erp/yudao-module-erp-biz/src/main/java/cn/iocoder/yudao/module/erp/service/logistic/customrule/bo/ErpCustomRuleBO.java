package cn.iocoder.yudao.module.erp.service.logistic.customrule.bo;

import cn.iocoder.yudao.module.erp.dal.dataobject.logistic.customrule.ErpCustomRuleDO;
import lombok.Data;

import java.math.BigDecimal;

/**
 * 海关规则 BO
 */
@Data
public class ErpCustomRuleBO extends ErpCustomRuleDO {
    /**
     * 申报品名（英文）
     */
    private String declaredTypeEn;
    /**
     * hs编码
     */
    private String hscode;
    /**
     * 材质-字典
     */
    private Integer material;
    /**
     * 申报品名
     */
    private String declaredType;
    /**
     * 税率
     */
    private BigDecimal taxRate;
}
