package com.somle.esb.job.oms.product.walmart.dsv;

import cn.iocoder.yudao.framework.quartz.core.handler.JobHandler;
import cn.iocoder.yudao.framework.tenant.core.context.TenantContextHolder;
import cn.iocoder.yudao.module.oms.api.TaskHandlerRecordApi;
import com.somle.esb.enums.TenantId;
import com.somle.walmart.model.reps.WalmartAllProductsRepsVO;
import com.somle.walmart.model.req.WalmartAllProductsReqVO;
import com.somle.walmart.service.WalmartClient;
import com.somle.walmart.service.WalmartService;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Slf4j
@Component
public class WalmartDSVTaskProductionJob implements JobHandler {
    @Resource
    TaskHandlerRecordApi taskHandlerRecordApi;

    @Resource
    private WalmartService walmartService;
    @Override
    public String execute(String param) throws Exception {
        // 设置租户为默认租户
        TenantContextHolder.setTenantId(TenantId.DEFAULT.getId());

        Optional<WalmartClient> walmartClient = walmartService.walmartClients.stream()
            .filter(client -> client.token.getSvcName()
                .equals("DSV"))
            .findFirst();

        var vo = WalmartAllProductsReqVO.builder()
            .offset(0)
            .limit(200)
            .build();
        List<WalmartAllProductsRepsVO.ItemResponseDTO> products = walmartClient.map(client -> client.getAllProducts(vo))
                .orElseGet(() -> List.of());
        List<String> skus = products.stream().map(WalmartAllProductsRepsVO.ItemResponseDTO::getSku).distinct().toList();
        taskHandlerRecordApi.createTask("DSV_SHOP_PRODUCT", skus);
        return "create task success!";
    }
}
