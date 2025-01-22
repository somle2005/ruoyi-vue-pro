package com.somle.esb.job;

import cn.iocoder.yudao.module.erp.api.product.ErpCustomRuleApi;
import cn.iocoder.yudao.module.erp.api.product.dto.ErpCustomRuleDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Slf4j
@Component
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class SyncErpProductJob extends DataJob {

    private final ErpCustomRuleApi erpCustomRuleApi;

    @Override
    public String execute(String param) throws Exception {
        //1.0 获取所有海关规则产品。注：erp中只有带国别的产品。cn类默认覆盖无国别产品。
        List<ErpCustomRuleDTO> customRuleDTOS = erpCustomRuleApi.listCustomRule();

        //2.0 发消息
        for (ErpCustomRuleDTO customRuleDTO : customRuleDTOS) {
            //2.1 发送消息
            log.info("发送消息：{}", customRuleDTO);
        }
        return "success";
    }
}
