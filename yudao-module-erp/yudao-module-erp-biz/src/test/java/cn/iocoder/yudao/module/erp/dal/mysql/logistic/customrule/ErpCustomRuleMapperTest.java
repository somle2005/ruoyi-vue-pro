package cn.iocoder.yudao.module.erp.dal.mysql.logistic.customrule;

import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.test.core.ut.BaseDbUnitTest;
import cn.iocoder.yudao.module.erp.controller.admin.logistic.customrule.vo.ErpCustomRulePageReqVO;
import cn.iocoder.yudao.module.erp.dal.dataobject.logistic.customrule.ErpCustomRuleDO;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.Import;

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
        PageResult<ErpCustomRuleDO> page = erpCustomRuleMapper.selectPage(new ErpCustomRulePageReqVO());
    }

    @Test
    void getCustomRuleByCountryCodeAndProductId() {
    }

    @Test
    void selectByProductId() {
    }
}