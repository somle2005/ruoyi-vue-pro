package com.somle.eccang;

import cn.iocoder.yudao.framework.test.core.ut.SomleBaseDbUnitTest;
import com.somle.eccang.api.wms.EccangWMSApi;
import com.somle.eccang.api.wms.order.EccangWMSOrderApi;
import com.somle.eccang.api.wms.product.EccangWMSProductApi;
import com.somle.eccang.api.wms.product.EccangWMSProductInventoryApi;
import com.somle.eccang.model.req.EccangProductInventoryReqVo;
import com.somle.eccang.model.req.wms.order.EccangWMSCheckAddressReqVO;
import com.somle.eccang.model.req.wms.order.EccangWMSOrderListReqVo;
import com.somle.eccang.model.req.wms.product.EccangWMSProductListReqVo;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.Import;


@Disabled
@Slf4j
@Import({
    EccangWMSApi.class,
    EccangWMSProductInventoryApi.class,
    EccangWMSProductApi.class,
    EccangWMSOrderApi.class
})

public class EccangWMSApiTest extends SomleBaseDbUnitTest {
    @Resource
    private EccangWMSProductInventoryApi eccangProductInventoryApi;
    @Resource
    private EccangWMSProductApi eccangProductListApi;
    @Resource
    private EccangWMSOrderApi eccangWMSOrderApi;

    @Test
    public void test() {
        var vo = EccangProductInventoryReqVo.builder()
            .page(1)
            .pageSize(100)
            .build();
        eccangProductInventoryApi.getProductInventory(vo).forEach(page -> {
            log.info("page: {}", page);
        });
    }

    @Test
    public void test2() {
        var vo = EccangWMSProductListReqVo.builder()
            .page(1)
            .pageSize(100)
            .build();
        eccangProductListApi.getProductList(vo);
    }

    @Test
    public void test3() {
        var vo = EccangWMSOrderListReqVo.builder()
            .page(1)
            .pageSize(100)
            .build();
        eccangWMSOrderApi.getOrderList(vo);
    }
    @Test
    public void test4() {
        var vo = EccangWMSCheckAddressReqVO.builder()
            .countryCode("OTHER")
            .shippingMethod("F4")
            .build();
        eccangWMSOrderApi.checkAddress(vo);
    }
}
