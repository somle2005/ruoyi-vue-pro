package com.somle.eccang.api.wms.order;

import cn.hutool.json.JSONUtil;
import cn.iocoder.yudao.framework.common.util.collection.StreamX;
import cn.iocoder.yudao.framework.common.util.json.JsonUtilsX;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.somle.eccang.api.wms.EccangWMSApi;
import com.somle.eccang.model.EccangResponse;
import com.somle.eccang.model.EccangWMSResponse;
import com.somle.eccang.model.reps.wms.EccangWMSOrderListRespVO;
import com.somle.eccang.model.req.wms.order.*;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Slf4j
public class EccangWMSOrderApi extends EccangWMSApi {


    //地址校验
    public void checkAddress(EccangWMSCheckAddressReqVO eccangWMSCheckAddressReqVO) {
        String endpoint = "checkAddress";
        EccangWMSResponse wmsResponse = getResponse(JsonUtilsX.toJSONObject(eccangWMSCheckAddressReqVO), endpoint);
    }


    //获取订单列表
    public List<EccangWMSOrderListRespVO> getOrderList(EccangWMSOrderListReqVo eccangWMSOrderListReqVo) {
        String endpoint = "getOrderList";
        List<EccangResponse.EccangPage> eccangPages = StreamX.iterate(
            getPage(JsonUtilsX.toJSONObject(eccangWMSOrderListReqVo), endpoint),
            page -> page.hasNext(),
            page -> {
                eccangWMSOrderListReqVo.setPage(page.getPage() + 1);
                return getPage(JsonUtilsX.toJSONObject(eccangWMSOrderListReqVo), endpoint);
            }
        ).toList();

        List<EccangWMSOrderListRespVO> eccangWMSOrderListRespVOs = new ArrayList<>();
        for (EccangResponse.EccangPage eccangPage : eccangPages) {
            ArrayNode data = (ArrayNode) eccangPage.getData();
            if (data == null) {
                continue;
            }
            for (JsonNode node : data) {
                EccangWMSOrderListRespVO eccangWMSOrderListRespVO = JSONUtil.toBean(node.toString(), EccangWMSOrderListRespVO.class);
                eccangWMSOrderListRespVOs.add(eccangWMSOrderListRespVO);
            }
        }
        return eccangWMSOrderListRespVOs;
    }

    //创建订单
    public void createOrder(EccangWMSCreateOrderReqVO eccangWMSCreateOrderReqVO) {
        String endpoint = "createOrder";
        EccangWMSResponse wmsResponse = getResponse(JsonUtilsX.toJSONObject(eccangWMSCreateOrderReqVO), endpoint);
        if (wmsResponse.getAsk().equals("Success")) {
            log.info("创建订单成功{}", eccangWMSCreateOrderReqVO);
        } else {
            log.error("创建订单失败{}",eccangWMSCreateOrderReqVO);
        }
    }

    //修改订单
    public void modifyOrder(EccangWMSModifyOrderReqVO eccangWMSModifyOrderReqVO) {
        String endpoint = "modifyOrder";
        EccangWMSResponse wmsResponse = getResponse(JsonUtilsX.toJSONObject(eccangWMSModifyOrderReqVO), endpoint);
        if (wmsResponse.getAsk().equals("Success")) {
            log.info("修改订单成功{}", eccangWMSModifyOrderReqVO);
        } else {
            log.error("修改订单失败{}",eccangWMSModifyOrderReqVO);
        }
    }


    //取消订单
    public void cancelOrder(EccangWMSCancelOrderReqVO eccangWMSCancelOrderReqVO) {
        String endpoint = "cancelOrder";
        EccangWMSResponse wmsResponse = getResponse(JsonUtilsX.toJSONObject(eccangWMSCancelOrderReqVO), endpoint);
        if (wmsResponse.getAsk().equals("Success")) {
            log.info("取消订单成功{}", eccangWMSCancelOrderReqVO);
        } else {
            log.error("取消订单失败{}",eccangWMSCancelOrderReqVO);
        }
    }
}