package cn.iocoder.yudao.module.erp.api;

import cn.iocoder.yudao.module.erp.api.logistic.customrule.ErpCustomRuleApi;
import cn.iocoder.yudao.module.erp.api.logistic.customrule.dto.ErpCustomRuleDTO;
import cn.iocoder.yudao.module.erp.service.logistic.customrule.ErpCustomRuleService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ErpCustomRuleApiImpl implements ErpCustomRuleApi {
    @Resource
    private ErpCustomRuleService customRuleService;

    /**
     * 获取海关规则
     *
     * @return 海关规则集合
     */
    @Override
    public List<ErpCustomRuleDTO> listCustomRules() {
        return customRuleService.listErpCustomRuleDTOs(null);
    }

}
