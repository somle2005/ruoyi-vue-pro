package com.somle.esb.job;

import cn.iocoder.yudao.framework.tenant.core.context.TenantContextHolder;
import cn.iocoder.yudao.module.erp.api.logistic.customrule.ErpCustomRuleApi;
import cn.iocoder.yudao.module.erp.api.logistic.customrule.dto.ErpCustomRuleDTO;
import com.somle.esb.enums.TenantId;
import com.somle.esb.handler.ErpCustomRuleHandler;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.messaging.MessageChannel;
import org.springframework.stereotype.Component;
import org.springframework.transaction.support.TransactionTemplate;

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
    ApplicationContext applicationContext;
    @Autowired
    MessageChannel erpCustomRuleChannel;
    @Autowired
    ErpCustomRuleHandler erpCustomRuleHandler;

    @Override
    public String execute(String param) throws Exception {
        AtomicReference<List<String>> barCodes = new AtomicReference<>(new ArrayList<>());
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
                customRuleDTOS.set(erpCustomRuleApi.listCustomRules());
                return null;
            });
            // 发送消息
            Optional.ofNullable(customRuleDTOS.get()).ifPresent(detailDTOS -> {
                barCodes.set(detailDTOS.stream().map(dto -> dto.getProductDTO().getBarCode()).toList());
                log.info("预计同步产品skus大小={{}},barCodes = {{}}", barCodes.get().size(), barCodes.get());
                int total = detailDTOS.size();
                int processed = 0;
                //输出预计同步的barcode集合
                for (ErpCustomRuleDTO detailDTO : detailDTOS) {
                    String barCode = detailDTO.getProductDTO().getBarCode();
                    log.debug("发送消息, BarCode = {}", barCode);
                    // 单独处理每个条目
                    erpCustomRuleHandler.syncCustomRulesToEccang(List.of(detailDTO));
                    erpCustomRuleHandler.syncCustomRulesToKingdee(List.of(detailDTO));
                    processed++;
                    log.info("SyncErpProduct Processed {}/{} ({}%)", processed, total, (100 * processed / total));
                }
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
