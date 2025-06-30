package com.somle.eccang.api.erp.inventory;

import cn.hutool.json.JSONUtil;
import cn.iocoder.yudao.framework.common.util.json.JsonUtilsX;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.somle.eccang.api.erp.EccangErpApi;
import com.somle.eccang.model.EccangResponse;
import com.somle.eccang.model.reps.erp.inventory.EccangEroProductInventoryRespVO;
import com.somle.eccang.model.req.erp.inventory.EccangErpProductInventoryReqVO;
import com.somle.eccang.model.req.erp.inventory.EccangErpProductInventoryTeamReqVO;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

@Component
public class EccangErpInventoryApi extends EccangErpApi {

    /**
     * @Description: 库存-获取团队库存信息
     */
    public void getProductInventoryTeam(EccangErpProductInventoryTeamReqVO eccangErpProductInventoryTeamReqVO) {
        String endpoint = "getProductInventoryTeam";
        Stream<EccangResponse.EccangPage> allPage = getAllPage(JsonUtilsX.toJSONObject(eccangErpProductInventoryTeamReqVO), endpoint);
        allPage.forEach(System.out::println);
    }

    /**
     * @Description: 库存-获取库存信息
     */
    public List<EccangEroProductInventoryRespVO> getProductInventory(EccangErpProductInventoryReqVO eccangErpProductInventoryReqVO) {
        String endpoint = "getProductInventory";
        List<EccangResponse.EccangPage> eccangPageList = getAllPage(JsonUtilsX.toJSONObject(eccangErpProductInventoryReqVO), endpoint).toList();
        List<EccangEroProductInventoryRespVO> eccangEroProductInventoryRespVOs = new ArrayList<>();
        for (EccangResponse.EccangPage eccangPage : eccangPageList) {
            ArrayNode data = (ArrayNode) eccangPage.getData();
            if (data == null) {
                continue;
            }
            for (JsonNode node : data) {
                EccangEroProductInventoryRespVO eccangEroProductInventoryRespVO = JSONUtil.toBean(node.toString(), EccangEroProductInventoryRespVO.class);
                eccangEroProductInventoryRespVOs.add(eccangEroProductInventoryRespVO);
            }
        }
        return eccangEroProductInventoryRespVOs;
    }
}
