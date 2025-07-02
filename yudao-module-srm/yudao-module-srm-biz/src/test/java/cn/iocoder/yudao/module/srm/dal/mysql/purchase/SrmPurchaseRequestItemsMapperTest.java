package cn.iocoder.yudao.module.srm.dal.mysql.purchase;

import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.test.core.ut.BaseDbUnitTest;
import cn.iocoder.yudao.module.srm.controller.admin.purchase.vo.request.req.SrmPurchaseRequestPageReqVO;
import cn.iocoder.yudao.module.srm.service.purchase.bo.request.SrmPurchaseRequestItemsBO;
import cn.iocoder.yudao.module.srm.service.purchase.bo.request.SrmPurchaseRequestSummaryBO;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * @author: wdy
 */

@Disabled
@Slf4j
class SrmPurchaseRequestItemsMapperTest extends BaseDbUnitTest {

    @Resource
    SrmPurchaseRequestItemsMapper srmPurchaseRequestItemsMapper;

    @Test
    void selectPageBO() {
        PageResult<SrmPurchaseRequestItemsBO> pageBO = srmPurchaseRequestItemsMapper.selectPageBO(new SrmPurchaseRequestPageReqVO());
        pageBO.getList().forEach(item -> log.info("{}", item));
    }

    @Test
    void selectSrmPurchaseRequestSummaryBO() {
        SrmPurchaseRequestSummaryBO srmPurchaseRequestSummaryBO = srmPurchaseRequestItemsMapper.selectSrmPurchaseRequestSummaryBO(new SrmPurchaseRequestPageReqVO());
        log.info("{}", srmPurchaseRequestSummaryBO);
    }
}