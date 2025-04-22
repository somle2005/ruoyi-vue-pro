package cn.iocoder.yudao.module.tms.config;

import cn.iocoder.yudao.framework.cola.statemachine.builder.FailCallback;
import cn.iocoder.yudao.module.srm.config.StateMachineDescriptorRegistrar;
import cn.iocoder.yudao.module.tms.dal.dataobject.first.mile.request.TmsFirstMileRequestDO;
import cn.iocoder.yudao.module.tms.dal.dataobject.first.mile.request.item.TmsFirstMileRequesItemtDO;
import cn.iocoder.yudao.module.tms.enums.status.TmsAuditStatus;
import cn.iocoder.yudao.module.tms.enums.status.TmsOffStatus;
import cn.iocoder.yudao.module.tms.enums.status.TmsOrderStatus;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnBean(FailCallback.class)
@RequiredArgsConstructor
public class TmsStateMachineDescAutoConfig implements StateMachineDescriptorRegistrar {

    @Override
    public void register(StateMachineDescriptorRegistry registry) {
        registry.add(TmsFirstMileRequestDO.class, TmsOffStatus.class, "头程申请单(开关)");
        registry.add(TmsFirstMileRequestDO.class, TmsOrderStatus.class, "头程申请单(订购)");
        registry.add(TmsFirstMileRequestDO.class, TmsAuditStatus.class, "头程申请单(审核)");

        //头程申请项
        registry.add(TmsFirstMileRequesItemtDO.class, TmsOffStatus.class, "头程申请明细(开关)");
        registry.add(TmsFirstMileRequesItemtDO.class, TmsOrderStatus.class, "头程申请明细(订购)");
    }
}
