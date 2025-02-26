package com.somle.esb.handler;

import cn.iocoder.yudao.module.erp.api.shop.dto.SkuRelationDTO;
import com.somle.ai.service.AiService;
import com.somle.eccang.model.EccangResponse;
import com.somle.eccang.model.req.EccangModifySkuRelationReqVO;
import com.somle.eccang.service.EccangService;
import com.somle.esb.converter.EccangToErpConverter;
import jakarta.annotation.Resource;
import jodd.util.StringUtil;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Profile;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: 同步 SKU 映射关系到易仓
 * @Author: LeeFJ
 * @Date: 2025/2、26
 */
@Slf4j
@Component
@Profile("prod")
@RequiredArgsConstructor
public class EccangSkuRelationHandler {

    @Resource
    EccangService service;

    @ServiceActivator(inputChannel = "eccangSkuRelationOutputChannel")
    public void handleSale(SkuRelationDTO relationDTO) {

        if(relationDTO==null) {
            return;
        }

        if(StringUtil.isBlank(relationDTO.getPlatformSku())) {
            return;
        }

        if(StringUtil.isBlank(relationDTO.getAccount())) {
            return;
        }

        List<EccangModifySkuRelationReqVO.PCR> list = new ArrayList<>();
        for (SkuRelationDTO.Relation relation : relationDTO.getRelations()) {
            list.add(EccangModifySkuRelationReqVO.PCR.builder().productSku(relation.getProductSku()).productSkuQty(relation.getProductSkuQty()+"")
                .productSkuNameCn(relation.getProductSku()).build());
        }

        service.setSkuRelation(relationDTO.getPlatformSku(),relationDTO.getAccount() ,list);

    }
}
