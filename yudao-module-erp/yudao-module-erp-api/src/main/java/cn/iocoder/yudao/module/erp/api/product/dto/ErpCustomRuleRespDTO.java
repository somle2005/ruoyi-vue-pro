package cn.iocoder.yudao.module.erp.api.product.dto;



import com.fhs.core.trans.vo.VO;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * @author Administrator
 */
@Data
@Builder
public class ErpCustomRuleRespDTO {

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
     * 申报品名
     */
    private String declaredType;

    /**
     * 申报金额
     */
    private Double declaredValue;

    /**
     * 申报金额币种
     */
    private Integer declaredValueCurrencyCode;

    /**
     * 税率
     */
    private BigDecimal taxRate;

    /**
     * hs编码
     */
    private String hscode;

    /**
     * 物流属性
     */
    private Integer logisticAttribute;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 条形码
     */
    private String fbaBarCode;
}