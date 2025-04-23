package cn.iocoder.yudao.module.tms.dal.mysql.first.mile.request.item;

import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.test.core.ut.BaseDbUnitTest;
import cn.iocoder.yudao.module.tms.controller.admin.first.mile.request.vo.TmsFirstMileRequestPageReqVO;
import cn.iocoder.yudao.module.tms.service.bo.TmsFirstMileRequestItemBO;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
class TmsFirstMileRequestItemMapperTest extends BaseDbUnitTest {

    @Resource
    private TmsFirstMileRequestItemMapper tmsFirstMileRequestItemMapper;

    @Test
    void selectPageBO() {
        PageResult<TmsFirstMileRequestItemBO> result = tmsFirstMileRequestItemMapper.selectPageBO(new TmsFirstMileRequestPageReqVO());
        for (TmsFirstMileRequestItemBO tmsFirstMileRequestItemBO : result.getList()) {
            log.info("{}", tmsFirstMileRequestItemBO);
            log.info("{}", tmsFirstMileRequestItemBO);
        }
    }
}