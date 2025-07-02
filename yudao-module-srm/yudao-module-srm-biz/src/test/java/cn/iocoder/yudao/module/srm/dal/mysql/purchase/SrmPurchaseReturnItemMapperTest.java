package cn.iocoder.yudao.module.srm.dal.mysql.purchase;

import cn.iocoder.yudao.framework.test.core.ut.BaseDbUnitTest;
import cn.iocoder.yudao.module.srm.controller.admin.purchase.vo.returns.SrmPurchaseReturnPageReqVO;
import cn.iocoder.yudao.module.srm.service.purchase.bo.ret.SrmPurchaseReturnSummaryBO;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * @author: wdy
 */
@Disabled
@Slf4j
class SrmPurchaseReturnItemMapperTest extends BaseDbUnitTest {

    @Resource
    private SrmPurchaseReturnItemMapper srmPurchaseReturnItemMapper;

    @Test
    void selectSrmPurchaseReturnSummaryBO() {
        SrmPurchaseReturnSummaryBO summaryBO = srmPurchaseReturnItemMapper.selectSrmPurchaseReturnSummaryBO(new SrmPurchaseReturnPageReqVO());
        log.info("summaryBO: {}", summaryBO);
    }
}