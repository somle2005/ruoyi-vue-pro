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
import com.somle.eccang.model.req.wms.order.EccangWMSCancelOrderReqVO;
import com.somle.eccang.model.req.wms.order.EccangWMSCheckAddressReqVO;
import com.somle.eccang.model.req.wms.order.EccangWMSCreateOrderReqVO;
import com.somle.eccang.model.req.wms.order.EccangWMSOrderListReqVo;

import java.util.ArrayList;
import java.util.List;

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
        getResponse(JsonUtilsX.toJSONObject(eccangWMSCreateOrderReqVO), endpoint);
    }


    //取消订单
    public void cancelOrder(EccangWMSCancelOrderReqVO eccangWMSCancelOrderReqVO) {
        String endpoint = "cancelOrder";
        getResponse(JsonUtilsX.toJSONObject(eccangWMSCancelOrderReqVO), endpoint);
    }
}