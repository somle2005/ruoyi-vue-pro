package com.somle.esb.handler;

import cn.iocoder.yudao.framework.common.util.object.BeanUtils;
import cn.iocoder.yudao.module.erp.api.logistic.customrule.dto.ErpCustomRuleDTO;
import cn.iocoder.yudao.module.erp.api.product.dto.ErpProductDetailDTO;
import cn.iocoder.yudao.module.system.api.dict.DictDataApi;
import com.somle.eccang.model.EccangProduct;
import com.somle.eccang.service.EccangService;
import com.somle.esb.converter.ErpToEccangConverter;
import com.somle.esb.converter.ErpToKingdeeConverter;
import com.somle.kingdee.model.KingdeeProduct;
import com.somle.kingdee.service.KingdeeService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Profile;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;

/**
 * @Description: $
 * @Author: c-tao
 * @Date: 2025/1/13$
 */
@Slf4j
@Component
@Profile("!dev & !test")
@RequiredArgsConstructor
public class ErpCustomRuleHandler {

    private final KingdeeService kingdeeService;
    private final EccangService eccangService;
    private final ErpToEccangConverter erpToEccangConverter;
    private final ErpToKingdeeConverter erpToKingdeeConverter;
    private final DictDataApi dictDataApi;

    /**
     * @return void
     * @Author Wqh
     * @Description 上传eccang产品信息
     * @Date 11:18 2024/11/5
     * @Param [message]
     **/
    @ServiceActivator(inputChannel = "erpCustomRuleChannel")
    public void syncCustomRulesToEccang(@Payload List<ErpProductDetailDTO> erpProductDetailDTOS) {
        log.info("Start syncing custom rules to Eccang, SKUs={}", extractSkus(erpProductDetailDTOS));
        List<ErpProductDetailDTO> dtos = processRules(erpProductDetailDTOS);
        List<EccangProduct> eccangProducts = erpToEccangConverter.convertToEccangProductListFromDetails(dtos);

        eccangProducts.forEach(eccangProduct -> {
            eccangService.addBatchProduct(List.of(eccangProduct));
        });

        log.info("Finished syncing custom rules to Eccang, Total SKUs={}", extractSkus(eccangProducts));
    }


    /**
     * @return void
     * @Author Wqh
     * @Description 上传金蝶产品信息
     * @Date 11:18 2024/11/5
     * @Param [message]
     **/
    @ServiceActivator(inputChannel = "erpCustomRuleChannel")
    public void syncCustomRulesToKingdee(@Payload List<ErpProductDetailDTO> erpProductDetailDTOS) {
        log.info("Start syncing custom rules to Kingdee, SKUs={}", extractSkus(erpProductDetailDTOS));
        List<KingdeeProduct> kingdee = erpToKingdeeConverter.customRuleDTOToProduct(processRules(erpProductDetailDTOS));
        kingdee.forEach(kingdeeService::addProduct);
        log.info("Finished syncing custom rules to Kingdee, SKUs={}", extractSkus(kingdee));
    }

    /**
     * 处理自定义规则列表，复制 countryCode 为 CN 字典映射值的对象
     *
     * @param erpProductDetailDTOS 产品详情DTOs
     * @return List<ErpProductDetailDTO> 复制后的list。
     */
    private List<ErpProductDetailDTO> processRules(List<ErpProductDetailDTO> erpProductDetailDTOS) {
        CopyOnWriteArrayList<ErpProductDetailDTO> dtos = new CopyOnWriteArrayList<>(erpProductDetailDTOS);
        erpProductDetailDTOS.stream()
            .filter(erpProductDetailDTO -> erpProductDetailDTO.getErpCustomRuleDTO().getCountryCode() != null)
            .forEach(erpProductDetailDTO -> Optional.ofNullable(dictDataApi.parseDictData("country_code", "CN"))
                .flatMap(dictDataRespDTO -> Optional.ofNullable(dictDataRespDTO.getValue()))
                .ifPresent(value -> {
                    Integer countryCode = Integer.valueOf(value);
                    if (erpProductDetailDTO.getErpCustomRuleDTO().getCountryCode().equals(countryCode)) {
                        //当前存在国家是CN的数据
                        ErpCustomRuleDTO bean = BeanUtils.toBean(erpProductDetailDTO.getErpCustomRuleDTO(), ErpCustomRuleDTO.class);
                        bean.setCountryCode(null);
                        dtos.add(BeanUtils.toBean(ErpProductDetailDTO.builder()
                                .erpCustomRuleDTO(bean)
                                .erpProductDTO(erpProductDetailDTO.getErpProductDTO())
                                .build()
                            , ErpProductDetailDTO.class));
                    }
                })
            );
        return dtos;
    }

    /**
     * 提取SKU列表
     *
     * @param dtos 产品列表（支持不同类型）
     * @return SKU列表
     */
    private <T> List<String> extractSkus(List<T> dtos) {
        if (dtos == null || dtos.isEmpty()) {
            return Collections.emptyList();
        }
        if (dtos.get(0) instanceof ErpProductDetailDTO) {
            return dtos.stream()
                .map(dto -> ((ErpProductDetailDTO) dto).getErpProductDTO().getBarCode())
                .filter(Objects::nonNull)
                .collect(Collectors.toList());
        } else if (dtos.get(0) instanceof EccangProduct) {
            return dtos.stream()
                .map(dto -> ((EccangProduct) dto).getProductSku())
                .filter(Objects::nonNull)
                .collect(Collectors.toList());
        } else if (dtos.get(0) instanceof KingdeeProduct) {
            return dtos.stream()
                .map(dto -> ((KingdeeProduct) dto).getNumber())
                .filter(Objects::nonNull)
                .collect(Collectors.toList());
        }
        return Collections.emptyList();
    }
}
