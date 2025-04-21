package cn.iocoder.yudao.module.tms.config.first.mile.request.impl.action;

import cn.iocoder.yudao.framework.cola.statemachine.Action;
import cn.iocoder.yudao.module.tms.dal.dataobject.first.mile.request.TmsFirstMileRequestDO;
import cn.iocoder.yudao.module.tms.enums.TmsEventEnum;
import cn.iocoder.yudao.module.tms.enums.status.TmsOffStatus;
import cn.iocoder.yudao.module.tms.service.first.mile.request.TmsFirstMileRequestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Component
public class RequestOffActionImpl implements Action<TmsOffStatus, TmsEventEnum, TmsFirstMileRequestDO> {
    @Autowired
    private TmsFirstMileRequestService tmsFirstMileRequestService;

    @Transactional(rollbackFor = Exception.class)
    @Override
    public void execute(TmsOffStatus from, TmsOffStatus to, TmsEventEnum event, TmsFirstMileRequestDO context) {

    }
}
