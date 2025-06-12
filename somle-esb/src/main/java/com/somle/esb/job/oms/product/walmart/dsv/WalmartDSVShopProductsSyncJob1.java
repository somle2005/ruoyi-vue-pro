package com.somle.esb.job.oms.product.walmart.dsv;

import cn.hutool.core.collection.CollUtil;
import cn.iocoder.yudao.module.oms.api.TaskHandlerRecordApi;
import cn.iocoder.yudao.module.oms.api.dto.OmsShopProductSaveReqDTO;
import cn.iocoder.yudao.module.oms.api.dto.TaskHandleRecordDTO;
import com.somle.esb.converter.oms.WalmartDSVToOmsConverter;
import com.somle.esb.job.oms.product.BaseShopProductsSyncJob;
import com.somle.walmart.model.reps.WalmartItemDetailResp;
import com.somle.walmart.model.req.WalmartAllProductsReqVO;
import com.somle.walmart.service.WalmartClient;
import com.somle.walmart.service.WalmartService;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Slf4j
@Component
public class WalmartDSVShopProductsSyncJob1 extends BaseShopProductsSyncJob {

    @Resource
    private WalmartService walmartService;

    @Resource
    TaskHandlerRecordApi taskHandlerRecordApi;

    @Resource
    private WalmartDSVToOmsConverter walmartDSVToOmsConverter;

    @Override
    public List<OmsShopProductSaveReqDTO> listProducts() {

        Optional<WalmartClient> walmartClient = walmartService.walmartClients.stream()
            .filter(client -> client.token.getSvcName()
                .equals("DSV"))
            .findFirst();


        List<OmsShopProductSaveReqDTO> successedProducts = new ArrayList<>();
        List<TaskHandleRecordDTO> successedTasks = new ArrayList<>();
        List<TaskHandleRecordDTO> dsvShopProductTask = taskHandlerRecordApi.getHandleRecordByTaskTag("DSV_SHOP_PRODUCT");
        if (CollUtil.isNotEmpty(dsvShopProductTask)) {
            for (TaskHandleRecordDTO taskHandleRecordDTO : dsvShopProductTask) {
                List<OmsShopProductSaveReqDTO> list = null;
                try {
                    WalmartItemDetailResp walmartItemDetailResp = walmartClient.get().retrieveSingleItemFullDetail(taskHandleRecordDTO.getHandleParam());
                    list = walmartDSVToOmsConverter.toProducts(List.of(walmartItemDetailResp),walmartClient.get().token);
                    taskHandleRecordDTO.setHandleStatus(1);
                    taskHandleRecordDTO.setHandleResult("SUCCESS");
                    taskHandleRecordDTO.setCompleteHandleTime(LocalDateTime.now());
                    taskHandleRecordDTO.setHandleTimes(taskHandleRecordDTO.getHandleTimes() + 1);
                    //处理成功的任务
                    successedTasks.add(taskHandleRecordDTO);
                    successedProducts.addAll(list);
                } catch (Exception e) {
                    log.error("任务处理失败", e);
                    taskHandleRecordDTO.setHandleTimes(taskHandleRecordDTO.getHandleTimes() + 1);
                    taskHandlerRecordApi.updateHandleRecord(taskHandleRecordDTO);
                }
            }
        }

        if (CollUtil.isNotEmpty(successedTasks)) {
            successedTasks.forEach(taskHandlerRecordApi::updateHandleRecord);
        }
        return successedProducts;
    }
}
