package cn.iocoder.yudao.module.erp.api.logistic.customrule.dto;

import cn.iocoder.yudao.module.erp.api.product.dto.ErpProductDTO;
import lombok.Data;

@Data
public class ErpCustomRuleDetailDTO extends ErpCustomRuleDTO {
    private ErpProductDTO erpProductDTO;
}

