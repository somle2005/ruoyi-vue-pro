package com.somle.eccang.api.wms.product;

import cn.hutool.json.JSONUtil;
import cn.iocoder.yudao.framework.common.util.collection.StreamX;
import cn.iocoder.yudao.framework.common.util.json.JsonUtilsX;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.somle.eccang.api.wms.EccangWMSApi;
import com.somle.eccang.model.EccangResponse;
import com.somle.eccang.model.EccangWMSResponse;
import com.somle.eccang.model.reps.wms.EccangWMSProductListRespVO;
import com.somle.eccang.model.req.wms.product.EccangWMSProductListReqVo;
import com.somle.eccang.model.req.wms.product.EccangWMSProductReqVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


@Slf4j
@Component
public class EccangWMSProductApi extends EccangWMSApi {

    //获取产品列表
    public List<EccangWMSProductListRespVO> getProductList(EccangWMSProductListReqVo eccangWMSProductListReqVo) {
        String endpoint = "getProductList";
        List<EccangResponse.EccangPage> eccangPages = StreamX.iterate(
            getPage(JsonUtilsX.toJSONObject(eccangWMSProductListReqVo), endpoint),
            page -> page.hasNext(),
            page -> {
                eccangWMSProductListReqVo.setPage(page.getPage() + 1);
                return getPage(JsonUtilsX.toJSONObject(eccangWMSProductListReqVo), endpoint);
            }
        ).toList();

        List<EccangWMSProductListRespVO> eccangWMSProductListRespVOs = new ArrayList<>();
        for (EccangResponse.EccangPage eccangPage : eccangPages) {
            ArrayNode data = (ArrayNode) eccangPage.getData();
            for (JsonNode node : data) {
                EccangWMSProductListRespVO eccangWMSProductListRespVO = JSONUtil.toBean(node.toString(), EccangWMSProductListRespVO.class);
                eccangWMSProductListRespVOs.add(eccangWMSProductListRespVO);
            }
        }
        return eccangWMSProductListRespVOs;
    }

    //创建产品
    public void createProduct(EccangWMSProductReqVo eccangWMSProductReqVo) {
        String endpoint = "createProduct";
        EccangWMSResponse wmsResponse = getResponse(JsonUtilsX.toJSONObject(eccangWMSProductReqVo), endpoint);
        if (wmsResponse.getAsk().equals("Success")) {
            log.info("创建产品成功{}", eccangWMSProductReqVo);
        } else {
            log.error("创建产品失败{}",eccangWMSProductReqVo);
        }
    }

    //修改产品
    public void modifyProduct(EccangWMSProductReqVo eccangWMSProductReqVo) {
        String endpoint = "modifyProduct";
        EccangWMSResponse wmsResponse = getResponse(JsonUtilsX.toJSONObject(eccangWMSProductReqVo), endpoint);
        if (wmsResponse.getAsk().equals("Success")) {
            log.info("修改产品成功{}", eccangWMSProductReqVo);
        } else {
            log.error("修改产品失败{}",eccangWMSProductReqVo);
        }
    }


}
