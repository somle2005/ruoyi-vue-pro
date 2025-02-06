package com.somle.esb.job;

import cn.iocoder.yudao.framework.tenant.core.context.TenantContextHolder;
import cn.iocoder.yudao.module.erp.api.logistic.customrule.ErpCustomRuleApi;
import cn.iocoder.yudao.module.erp.api.logistic.customrule.dto.ErpCustomRuleDTO;
import cn.iocoder.yudao.module.erp.api.product.ErpProductApi;
import cn.iocoder.yudao.module.erp.api.product.dto.ErpProductDTO;
import com.somle.esb.enums.TenantId;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicReference;

/**
 * 同步erp海关规则对应的产品到kingdee和eccang
 */
@Slf4j
@Component
public class SyncErpProductJob extends DataJob {

    @Autowired
    ErpCustomRuleApi erpCustomRuleApi;
    @Autowired
    ErpProductApi erpProductApi;
    @Autowired
    MessageChannel erpCustomRuleChannel;
    @Autowired
    MessageChannel erpProductChannel;

    @Override
    public String execute(String param) throws Exception {
        AtomicReference<List<String>> barCodes = new AtomicReference<>(new ArrayList<>());
        AtomicReference<Long> tenantId = new AtomicReference<>(TenantId.DEFAULT.getId());
        try {
            // 设置租户 ID
            if (Optional.ofNullable(param).isPresent()) {
                Optional.of(param).ifPresent(s -> tenantId.set(Long.parseLong(s))); // 手动
            } else {
                TenantContextHolder.setTenantId(tenantId.get());// 自动
            }
            Optional.ofNullable(erpCustomRuleApi.listCustomRules(null)).ifPresent(detailDTOS -> {
                barCodes.set(detailDTOS.stream().map(dto -> dto.getProductDTO().getBarCode()).toList());
                log.info("预计同步产品skus大小={{}},barCodes = {{}}", barCodes.get().size(), barCodes.get());
                // 发送海关规则数据
                detailDTOS.forEach(detailDTO -> {
                    log.debug("发送消息, BarCode = {}", detailDTO.getProductDTO().getBarCode());
                    erpCustomRuleChannel.send(MessageBuilder.withPayload(detailDTO).build());
                });
                //根据detailDTOS获得产品id集合
                List<Long> productIds = detailDTOS.stream().map(ErpCustomRuleDTO::getProductId).toList();
                List<ErpProductDTO> productDTOs = erpProductApi.listProductDTOs(null);
                // 过滤掉已经在 `customRuleDTOS` 中的产品
                productDTOs.stream()
                    .filter(dto -> !productIds.contains(dto.getId()))
                    // 发送产品数据(单个发送，批量待优化)
                    .toList().forEach(dto -> erpProductChannel.send(MessageBuilder.withPayload(List.of(dto)).build()));
            });
        } finally {
            TenantContextHolder.clear(); // 清理租户上下文，避免线程复用导致问题
        }
        return "sync start";
    }
}
