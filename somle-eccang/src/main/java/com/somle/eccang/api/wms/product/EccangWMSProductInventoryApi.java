package com.somle.eccang.api.wms.product;

import cn.hutool.json.JSONUtil;
import cn.iocoder.yudao.framework.common.util.collection.StreamX;
import cn.iocoder.yudao.framework.common.util.json.JsonUtilsX;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.somle.eccang.api.wms.EccangWMSApi;
import com.somle.eccang.model.EccangResponse;
import com.somle.eccang.model.reps.wms.EccangWMSProductInventoryRespVO;
import com.somle.eccang.model.req.EccangProductInventoryReqVo;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class EccangWMSProductInventoryApi extends EccangWMSApi {

    //获取产品库存
    public List<EccangWMSProductInventoryRespVO> getProductInventory(EccangProductInventoryReqVo eccangProductInventoryReqVo) {
        String endpoint = "getProductInventory";
        List<EccangResponse.EccangPage> eccangPages = StreamX.iterate(
            getPage(JsonUtilsX.toJSONObject(eccangProductInventoryReqVo), endpoint),
            page -> page.hasNext(),
            page -> {
                eccangProductInventoryReqVo.setPage(page.getPage() + 1);
                return getPage(JsonUtilsX.toJSONObject(eccangProductInventoryReqVo), endpoint);
            }
        ).toList();

        List<EccangWMSProductInventoryRespVO> eccangWMSProductInventoryRespVOS = new ArrayList<>();
        for (EccangResponse.EccangPage eccangPage : eccangPages) {
            ArrayNode data = (ArrayNode) eccangPage.getData();
            for (JsonNode node : data) {
                EccangWMSProductInventoryRespVO eccangWMSProductInventoryRespVO = JSONUtil.toBean(node.toString(), EccangWMSProductInventoryRespVO.class);
                eccangWMSProductInventoryRespVOS.add(eccangWMSProductInventoryRespVO);
            }
        }
        return eccangWMSProductInventoryRespVOS;
    }



}
