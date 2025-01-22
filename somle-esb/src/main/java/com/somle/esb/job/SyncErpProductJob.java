package com.somle.esb.job;

import cn.iocoder.yudao.framework.tenant.core.context.TenantContextHolder;
import cn.iocoder.yudao.module.erp.api.product.ErpCustomRuleApi;
import cn.iocoder.yudao.module.erp.api.product.dto.ErpCustomRuleDTO;
import com.somle.esb.enums.TenantId;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Component;
import org.springframework.transaction.support.TransactionTemplate;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicReference;

/**
 * 同步erp产品到kingdee和eccang
 */
@Slf4j
@Component
public class SyncErpProductJob extends DataJob {

    @Autowired
    ErpCustomRuleApi erpCustomRuleApi;
    @Autowired
    ApplicationContext applicationContext;
    @Autowired
    MessageChannel erpCustomRuleChannel;

    @Override
    public String execute(String param) throws Exception {
        AtomicReference<List<String>> barCodes = new AtomicReference<>();
        AtomicReference<Long> tenantId = new AtomicReference<>(TenantId.DEFAULT.getId());
        AtomicReference<List<ErpCustomRuleDTO>> customRuleDTOS = new AtomicReference<>();

        try {
            // 设置租户 ID
            if (Optional.ofNullable(param).isPresent()) {
                Optional.of(param).ifPresent(s -> tenantId.set(Long.parseLong(s))); // 手动
            } else {
                TenantContextHolder.setTenantId(tenantId.get());// 自动
            }

            // 显式声明事务，获取业务数据
            TransactionTemplate transactionTemplate = applicationContext.getBean(TransactionTemplate.class);
            transactionTemplate.execute(status -> {
                customRuleDTOS.set(erpCustomRuleApi.listCustomRule());
                return null;
            });

            // 发送消息
            Optional.ofNullable(customRuleDTOS.get()).stream().findFirst().ifPresent(customRuleDTOList -> {
                barCodes.set(customRuleDTOList.stream().map(ErpCustomRuleDTO::getBarCode).toList());
                log.debug("发送消息, BarCode = {}", barCodes);
                erpCustomRuleChannel.send(MessageBuilder.withPayload(customRuleDTOList).build());
            });
        } finally {
            TenantContextHolder.clear(); // 清理租户上下文，避免线程复用导致问题
        }

        // 返回数据总量和 barCodes
        int total = Optional.ofNullable(customRuleDTOS.get())
            .map(List::size)
            .orElse(0);

        return String.format("success, total=%d, barCodes=%s", total, barCodes.get());
    }

}
