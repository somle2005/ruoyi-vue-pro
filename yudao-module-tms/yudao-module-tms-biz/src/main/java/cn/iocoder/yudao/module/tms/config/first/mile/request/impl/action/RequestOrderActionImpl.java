package cn.iocoder.yudao.module.tms.config.first.mile.request.impl.action;

import cn.iocoder.yudao.framework.cola.statemachine.Action;
import cn.iocoder.yudao.module.tms.dal.dataobject.first.mile.request.TmsFirstMileRequestDO;
import cn.iocoder.yudao.module.tms.enums.TmsEventEnum;
import cn.iocoder.yudao.module.tms.enums.status.TmsOrderStatus;
import cn.iocoder.yudao.module.tms.service.first.mile.request.TmsFirstMileRequestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Component
public class RequestOrderActionImpl implements Action<TmsOrderStatus, TmsEventEnum, TmsFirstMileRequestDO> {
    @Autowired
    private TmsFirstMileRequestService tmsFirstMileRequestService;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void execute(TmsOrderStatus from, TmsOrderStatus to, TmsEventEnum event, TmsFirstMileRequestDO context) {
        TmsFirstMileRequestDO mileRequestDO = tmsFirstMileRequestService.validateFirstMileRequestExists(context.getId());

        mileRequestDO.setOrderStatus(to.getCode());

        tmsFirstMileRequestService.updateFirstMileRequestItemStatus(mileRequestDO.getId(), null, to.getCode());
    }


}
