package com.somle.esb.job.oms.product.walmart.dsv;

import cn.hutool.core.collection.CollUtil;
import cn.iocoder.yudao.module.oms.api.TaskHandlerRecordApi;
import cn.iocoder.yudao.module.oms.api.dto.OmsShopProductSaveReqDTO;
import cn.iocoder.yudao.module.oms.api.dto.TaskHandleRecordDTO;
import cn.iocoder.yudao.module.oms.api.enums.TaskHandleStatusEnum;
import com.somle.esb.converter.oms.WalmartDSVToOmsConverter;
import com.somle.esb.job.oms.product.BaseShopProductsSyncJob;
import com.somle.walmart.model.reps.WalmartItemDetailResp;
import com.somle.walmart.service.WalmartClient;
import com.somle.walmart.service.WalmartService;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Slf4j
@Component
public class WalmartDSVTaskConsumeJob extends BaseShopProductsSyncJob {

    @Resource
    private WalmartService walmartService;

    @Resource
    TaskHandlerRecordApi taskHandlerRecordApi;

    @Resource
    private WalmartDSVToOmsConverter walmartDSVToOmsConverter;

    private final String  TASK_TAG = "DSV_SHOP_PRODUCT";
    @Override
    public List<OmsShopProductSaveReqDTO> listProducts() {

        Optional<WalmartClient> walmartClient = walmartService.walmartClients.stream()
            .filter(client -> client.token.getSvcName()
                .equals("DSV"))
            .findFirst();


        List<OmsShopProductSaveReqDTO> successedProducts = new ArrayList<>();
        List<TaskHandleRecordDTO> successedTasks = new ArrayList<>();
        //取出100条，每五分钟处理
        List<TaskHandleRecordDTO> dsvShopProductTask = taskHandlerRecordApi.getHandleRecordByTaskTag(TASK_TAG);
        if (CollUtil.isNotEmpty(dsvShopProductTask)) {
            for (TaskHandleRecordDTO taskHandleRecordDTO : dsvShopProductTask) {
                List<OmsShopProductSaveReqDTO> list = null;
                try {
                    //获取WIN
                    WalmartItemDetailResp walmartItemDetailResp = walmartClient.get().retrieveSingleItemFullDetail(taskHandleRecordDTO.getHandleParam());
                    //获取库存数量
                    WalmartItemDetailResp.ItemResponse itemResponse = walmartItemDetailResp.getItemResponse();
                    itemResponse.setSellableQty(walmartClient.get().getInventory(taskHandleRecordDTO.getHandleParam()).getQuantity().getAmount());
                    walmartItemDetailResp.setItemResponse(itemResponse);

                    list = walmartDSVToOmsConverter.toProducts(List.of(walmartItemDetailResp),walmartClient.get().token);
                    //更新任务状态
                    taskHandleRecordDTO.setHandleStatus(TaskHandleStatusEnum.SUCCESS.getType());
                    taskHandleRecordDTO.setHandleResult(TaskHandleStatusEnum.SUCCESS.getName());
                    taskHandleRecordDTO.setCompleteHandleTime(LocalDateTime.now());
                    taskHandleRecordDTO.setHandleTimes(taskHandleRecordDTO.getHandleTimes() + 1);
                    successedTasks.add(taskHandleRecordDTO);
                    successedProducts.addAll(list);
                } catch (Exception e) {
                    log.error("任务处理失败", e);
                    taskHandleRecordDTO.setHandleTimes(taskHandleRecordDTO.getHandleTimes() + 1);
                    taskHandleRecordDTO.setHandleResult(TaskHandleStatusEnum.FAIL.getName());
                    taskHandleRecordDTO.setHandleStatus(TaskHandleStatusEnum.FAIL.getType());
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
