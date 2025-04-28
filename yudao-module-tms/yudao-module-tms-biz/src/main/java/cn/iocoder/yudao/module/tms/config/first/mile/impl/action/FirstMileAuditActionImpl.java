package cn.iocoder.yudao.module.tms.config.first.mile.impl.action;

import cn.iocoder.yudao.framework.cola.statemachine.Action;
import cn.iocoder.yudao.module.tms.controller.admin.first.mile.vo.TmsFirstMileAuditReqVO;
import cn.iocoder.yudao.module.tms.enums.TmsEventEnum;
import cn.iocoder.yudao.module.tms.enums.status.TmsAuditStatus;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class FirstMileAuditActionImpl implements Action<TmsAuditStatus, TmsEventEnum, TmsFirstMileAuditReqVO> {

    @Override
    public void execute(TmsAuditStatus from, TmsAuditStatus to, TmsEventEnum event, TmsFirstMileAuditReqVO context) {

    }
}
