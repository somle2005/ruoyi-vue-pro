package cn.iocoder.yudao.module.erp.api.logistic.customrule;

import cn.iocoder.yudao.module.erp.api.product.dto.ErpProductDetailDTO;

import java.util.List;

//@FeignClient(name = "erp-custom", path = "/erp/custom")
public interface ErpCustomRuleApi {

    /**
     * 获取所有海关规则
     * @return 海关规则集合
     */
     List<ErpProductDetailDTO> listCustomRules();
}
