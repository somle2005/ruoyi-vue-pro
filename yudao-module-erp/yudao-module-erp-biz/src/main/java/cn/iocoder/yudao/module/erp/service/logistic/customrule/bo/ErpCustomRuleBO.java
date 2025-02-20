package cn.iocoder.yudao.module.erp.service.logistic.customrule.bo;

import cn.iocoder.yudao.framework.tenant.core.db.TenantBaseDO;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.experimental.Accessors;

import java.math.BigDecimal;

/**
 * 海关规则 BO
 */
@Data
public class ErpCustomRuleBO extends TenantBaseDO {
    /**
     * 海关规则id
     */
    private Long id;
    /**
     * 国家编码
     */
    private Integer countryCode;

    /**
     * 产品id
     */
    private Long productId;
    /**
     * 申报品名（英文）
     */
    private String declaredTypeEn;
    /**
     * 申报金额币种
     */
    private Integer declaredValueCurrencyCode;

    /**
     * hs编码
     */
    private String hscode;
    /**
     * 物流属性
     */
    private Integer logisticAttribute;
    /**
     * 条形码
     */
    private String fbaBarCode;
    /**
     * 材质-字典
     */
    private Integer material;
    /**
     * 申报品名
     */
    private String declaredType;
    /**
     * 申报金额
     */
    private Double declaredValue;
    /**
     * HS编码
     */
    private String hsCode;
    /**
     * 税率
     */
    private BigDecimal taxRate;
}
