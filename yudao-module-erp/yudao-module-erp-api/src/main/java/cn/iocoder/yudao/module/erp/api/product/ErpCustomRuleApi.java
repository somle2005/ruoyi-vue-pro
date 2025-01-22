package cn.iocoder.yudao.module.erp.api.product;

import cn.iocoder.yudao.module.erp.api.product.dto.ErpCustomRuleDTO;

import java.util.List;

//@FeignClient(name = "erp-custom", path = "/erp/custom")
public interface ErpCustomRuleApi {

    /**
     * 获取海关规则
     * @return 海关规则集合
     */
    public List<ErpCustomRuleDTO> listCustomRule();
}
