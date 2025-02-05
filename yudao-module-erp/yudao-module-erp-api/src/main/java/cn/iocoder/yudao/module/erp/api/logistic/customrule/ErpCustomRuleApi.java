package cn.iocoder.yudao.module.erp.api.logistic.customrule;

import cn.iocoder.yudao.module.erp.api.logistic.customrule.dto.ErpCustomRuleDTO;

import java.util.List;

//@FeignClient(name = "erp-custom", path = "/erp/custom")
public interface ErpCustomRuleApi {

    /**
     * 获取所有海关规则(含产品信息)DTO
     * @return 海关规则集合
     */
     List<ErpCustomRuleDTO> listCustomRules();
}
