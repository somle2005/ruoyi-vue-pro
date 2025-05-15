package cn.iocoder.yudao.module.wms.dal.mysql.stock.ownership;

import cn.iocoder.yudao.framework.test.core.ut.BaseDbUnitTest;
import cn.iocoder.yudao.module.wms.dal.dataobject.stock.ownership.WmsStockOwnershipDO;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.List;

@Disabled
class WmsStockOwnershipMapperTest extends BaseDbUnitTest {
    @Resource
    WmsStockOwnershipMapper wmsStockOwnershipMapper;

    @Test
    void selectByDeptIdAndProductIdAndCountryId() {
        List<WmsStockOwnershipDO> cn = wmsStockOwnershipMapper.selectByDeptIdAndProductIdAndCountryId(1L, List.of(2L), "CN");
    }
}