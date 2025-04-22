package cn.iocoder.yudao.module.tms.config.first.mile.request.impl.action.item;

import cn.iocoder.yudao.framework.cola.statemachine.Action;
import cn.iocoder.yudao.framework.cola.statemachine.StateMachine;
import cn.iocoder.yudao.module.tms.dal.dataobject.first.mile.request.TmsFirstMileRequestDO;
import cn.iocoder.yudao.module.tms.dal.dataobject.first.mile.request.item.TmsFirstMileRequesItemtDO;
import cn.iocoder.yudao.module.tms.enums.TmsEventEnum;
import cn.iocoder.yudao.module.tms.enums.status.TmsOffStatus;
import cn.iocoder.yudao.module.tms.service.first.mile.request.TmsFirstMileRequestItemService;
import cn.iocoder.yudao.module.tms.service.first.mile.request.TmsFirstMileRequestService;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

import static cn.iocoder.yudao.module.tms.enums.TmsStateMachines.FIRST_MILE_REQUEST_OFF_STATE_MACHINE;

@Slf4j
@Component
public class RequestItemOffActionImpl implements Action<TmsOffStatus, TmsEventEnum, TmsFirstMileRequesItemtDO> {
    @Autowired
    @Lazy
    private TmsFirstMileRequestItemService tmsFirstMileRequestItemService;
    @Autowired
    @Lazy
    private TmsFirstMileRequestService tmsFirstMileRequestService;

    @Resource(name = FIRST_MILE_REQUEST_OFF_STATE_MACHINE)
    private StateMachine<TmsOffStatus, TmsEventEnum, TmsFirstMileRequestDO> tmsFirstMileRequestOffStatusMachine;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void execute(TmsOffStatus from, TmsOffStatus to, TmsEventEnum event, TmsFirstMileRequesItemtDO context) {
        TmsFirstMileRequesItemtDO firstMileRequestItemDO = tmsFirstMileRequestItemService.validateFirstMileRequestItemExists(context.getId());

        firstMileRequestItemDO.setOffStatus(to.getCode());

        tmsFirstMileRequestItemService.updateFirstMileRequestItemStatus(firstMileRequestItemDO.getId(), to.getCode(), null);

        //传递给主表状态机
        if (event != TmsEventEnum.OFF_INIT) {
            TmsFirstMileRequestDO mileRequest = tmsFirstMileRequestService.getFirstMileRequest(firstMileRequestItemDO.getRequestId());
            Optional.ofNullable(mileRequest).ifPresent(aDo -> tmsFirstMileRequestOffStatusMachine.fireEvent(TmsOffStatus.fromCode(aDo.getOffStatus()), event, aDo));
        }
    }


}
