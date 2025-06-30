package com.somle.eccang.api.erp.product;

import cn.hutool.json.JSONUtil;
import cn.iocoder.yudao.framework.common.util.json.JsonUtilsX;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.somle.eccang.api.erp.EccangErpApi;
import com.somle.eccang.model.EccangResponse;
import com.somle.eccang.model.reps.erp.product.EccangErpProductListRespVO;
import com.somle.eccang.model.req.erp.product.EccangErpProductListReqVO;
import com.somle.eccang.model.req.erp.product.EccangErpSyncBatchProductReqVO;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class EccangErpProductApi extends EccangErpApi {

    /**
     * @Description: 产品管理-获取产品列表
     */
    public List<EccangErpProductListRespVO> getWmsProductList(EccangErpProductListReqVO eccangErpProductListReqVO) {
        String endpoint = "getWmsProductList";
        List<EccangResponse.EccangPage> eccangPageList = getAllPage(JsonUtilsX.toJSONObject(eccangErpProductListReqVO), endpoint).toList();
        List<EccangErpProductListRespVO> erpProductListRespVOList = new ArrayList<>();
        for (EccangResponse.EccangPage eccangPage : eccangPageList) {
            ArrayNode data = (ArrayNode) eccangPage.getData();
            if (data == null) {
                continue;
            }
            for (JsonNode node : data) {
               EccangErpProductListRespVO eccangErpProductListRespVO = JSONUtil.toBean(node.toString(), EccangErpProductListRespVO.class);
               erpProductListRespVOList.add(eccangErpProductListRespVO);
            }
        }
        return erpProductListRespVOList;
    }

    //批量创建或修改产品
    public void syncBatchProduct(List<EccangErpSyncBatchProductReqVO> eccangErpSyncBatchProductReqVOs) {
        String endpoint = "syncBatchProduct";
        getResponse(JsonUtilsX.toJSONObject(eccangErpSyncBatchProductReqVOs), endpoint);
    }
}
