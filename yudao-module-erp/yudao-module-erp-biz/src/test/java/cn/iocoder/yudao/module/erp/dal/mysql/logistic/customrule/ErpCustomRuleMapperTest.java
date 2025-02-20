package cn.iocoder.yudao.module.erp.dal.mysql.logistic.customrule;

import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.test.core.ut.BaseDbUnitTest;
import cn.iocoder.yudao.module.erp.controller.admin.logistic.customrule.vo.ErpCustomRulePageReqVO;
import cn.iocoder.yudao.module.erp.dal.dataobject.logistic.customrule.ErpCustomRuleDO;
import cn.iocoder.yudao.module.erp.service.logistic.customrule.bo.ErpCustomRuleBO;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.Import;

@Slf4j
@Import(ErpCustomRuleMapper.class)
class ErpCustomRuleMapperTest extends BaseDbUnitTest {
    @Resource
    ErpCustomRuleMapper erpCustomRuleMapper;

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void selectPage() {
        PageResult<ErpCustomRuleDO> page = erpCustomRuleMapper.selectPage(new ErpCustomRulePageReqVO().setBarCode("W06S305QN"));
    }

    @Test
    void getCustomRuleByCountryCodeAndProductId() {
    }

    @Test
    void selectByProductId() {
    }

    @Test
    void selectErpCustomRuleBOPage() {
        log.info("page:{}",  erpCustomRuleMapper.selectErpCustomRuleBOPage(new ErpCustomRulePageReqVO()));
    }

    @Test
    void selectErpCustomRuleBOPage2() {
        log.info("page:{}",  erpCustomRuleMapper.selectErpCustomRuleBOPage2(new ErpCustomRulePageReqVO()));
    }
}