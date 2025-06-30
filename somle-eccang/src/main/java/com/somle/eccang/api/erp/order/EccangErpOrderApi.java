package com.somle.eccang.api.erp.order;

import cn.hutool.json.JSONUtil;
import cn.iocoder.yudao.framework.common.util.json.JsonUtilsX;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.somle.eccang.api.erp.EccangErpApi;
import com.somle.eccang.model.EccangResponse;
import com.somle.eccang.model.reps.erp.order.EccangErpOrderListRespVO;
import com.somle.eccang.model.req.erp.order.*;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class EccangErpOrderApi extends EccangErpApi {

    //查询仓配订单信息
    public List<EccangErpOrderListRespVO> getOrders(EccangErpOrdersReqVO eccangErpOrdersReqVO) {
        String endpoint = "getOrders";
        List<EccangResponse.EccangPage> eccangPageList = getAllPage(JsonUtilsX.toJSONObject(eccangErpOrdersReqVO), endpoint).toList();
        List<EccangErpOrderListRespVO> eccangErpOrderListRespVOs = new ArrayList<>();
        for (EccangResponse.EccangPage eccangPage : eccangPageList) {
            ArrayNode data = (ArrayNode) eccangPage.getData();
            if (data == null) {
                continue;
            }
            for (JsonNode node : data) {
                EccangErpOrderListRespVO eccangErpOrderListRespVO = JSONUtil.toBean(node.toString(), EccangErpOrderListRespVO.class);
                eccangErpOrderListRespVOs.add(eccangErpOrderListRespVO);
            }
        }
        return eccangErpOrderListRespVOs;
    }



    //获取订单列表
    public List<EccangErpOrderListRespVO> getOrderList(EccangErpOrderListReqVO eccangErpOrderListReqVO) {
        String endpoint = "getOrderList";
        List<EccangResponse.EccangPage> eccangPageList = getAllPage(JsonUtilsX.toJSONObject(eccangErpOrderListReqVO), endpoint).toList();
        List<EccangErpOrderListRespVO> eccangErpOrderListRespVOs = new ArrayList<>();
        for (EccangResponse.EccangPage eccangPage : eccangPageList) {
            ArrayNode data = (ArrayNode) eccangPage.getData();
            if (data == null) {
                continue;
            }
            for (JsonNode node : data) {
                EccangErpOrderListRespVO eccangErpOrderListRespVO = JSONUtil.toBean(node.toString(), EccangErpOrderListRespVO.class);
                eccangErpOrderListRespVOs.add(eccangErpOrderListRespVO);
            }
        }
        return eccangErpOrderListRespVOs;
    }

    //建立订单/更新订单
    public void syncOrder(EccangErpSyncOrderReqVO eccangErpSyncOrderReqVO) {
        String endpoint = "syncOrder";
        getResponse(JsonUtilsX.toJSONObject(eccangErpSyncOrderReqVO), endpoint);
    }


    //审核订单
    public void orderVerify(EccangErpOrderVerifyReqVO eccangErpOrderVerifyReqVO) {
        String endpoint = "orderVerify";
        getResponse(JsonUtilsX.toJSONObject(eccangErpOrderVerifyReqVO), endpoint);
    }

    //取消订单
    public void cancelOrder(EccangErpCancelOrderReqVO eccangErpCancelOrderReqVO) {
        String endpoint = "cancelOrder";
        getResponse(JsonUtilsX.toJSONObject(eccangErpCancelOrderReqVO), endpoint);
    }


}
