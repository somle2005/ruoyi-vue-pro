package com.somle.eccang;

import cn.iocoder.yudao.framework.test.core.ut.SomleBaseDbUnitTest;
import com.somle.eccang.api.erp.EccangErpApi;
import com.somle.eccang.api.erp.inventory.EccangErpInventoryApi;
import com.somle.eccang.api.erp.order.EccangErpOrderApi;
import com.somle.eccang.api.erp.product.EccangErpProductApi;
import com.somle.eccang.model.req.erp.inventory.EccangErpProductInventoryReqVO;
import com.somle.eccang.model.req.erp.inventory.EccangErpProductInventoryTeamReqVO;
import com.somle.eccang.model.req.erp.order.EccangErpOrderListReqVO;
import com.somle.eccang.model.req.erp.order.EccangErpOrdersReqVO;
import com.somle.eccang.model.req.erp.product.EccangErpProductListReqVO;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.Import;

import java.util.List;

@Disabled
@Slf4j
@Import({
    EccangErpApi.class,
    EccangErpInventoryApi.class,
    EccangErpProductApi.class,
    EccangErpOrderApi.class
})
public class EccangErpApiTest extends SomleBaseDbUnitTest {
    @Resource
    private EccangErpInventoryApi eccangErpInventoryApi;
    @Resource
    private EccangErpProductApi eccangErpProductApi;
    @Resource
    private EccangErpOrderApi eccangErpOrderApi;

    @Test
    public void test() {
        var vo = EccangErpProductInventoryTeamReqVO.builder().build();
        eccangErpInventoryApi.getProductInventoryTeam(vo);
    }


    @Test
    public void test2() {
        var vo = EccangErpProductListReqVO.builder().page(93).build();
        eccangErpProductApi.getWmsProductList(vo);
    }
    @Test
    public void test3() {
        var vo = EccangErpOrderListReqVO.builder().page(6213).pageSize(100).build();
        eccangErpOrderApi.getOrderList(vo);
    }
    @Test
    public void test4() {
        var vo = EccangErpOrdersReqVO.builder().platformArr(List.of(
            "amazon"
        )).countryCodeIn(List.of("US")).page(1).pageSize(100).build();
        eccangErpOrderApi.getOrders(vo);
    }

    @Test
    public void test5() {
        var vo = EccangErpProductInventoryReqVO.builder().page(199).build();
        eccangErpInventoryApi.getProductInventory(vo);
    }
}
