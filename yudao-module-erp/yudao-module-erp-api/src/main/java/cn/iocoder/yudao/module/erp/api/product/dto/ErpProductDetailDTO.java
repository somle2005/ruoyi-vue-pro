package cn.iocoder.yudao.module.erp.api.product.dto;

import lombok.Builder;
import lombok.Data;

/**
 * 含有海关信息的产品信息 == 包含产品信息和海关信息
 */
@Data
@Builder
public class ErpProductDetailDTO {
    ErpCustomRuleDTO erpCustomRuleDTO;
    ErpProductDTO erpProductDTO;
}
