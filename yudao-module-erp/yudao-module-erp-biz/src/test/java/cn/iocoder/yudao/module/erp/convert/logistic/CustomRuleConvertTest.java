package cn.iocoder.yudao.module.erp.convert.logistic;

import cn.iocoder.yudao.framework.test.core.ut.BaseDbUnitTest;
import cn.iocoder.yudao.module.erp.dal.mysql.logistic.customrule.ErpCustomRuleMapper;
import cn.iocoder.yudao.module.erp.service.logistic.customrule.ErpCustomRuleService;
import cn.iocoder.yudao.module.erp.service.logistic.customrule.ErpCustomRuleServiceImpl;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.Import;

@Slf4j
@Import(ErpCustomRuleServiceImpl.class)
class CustomRuleConvertTest extends BaseDbUnitTest {
    @Resource
    private ErpCustomRuleService customRuleService;
    @Resource
    ErpCustomRuleMapper customRuleMapper;

    @Test
    void convert() {

    }
}