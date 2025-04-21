package cn.iocoder.yudao.module.tms.config.first.mile.request.impl.action.item;

import cn.iocoder.yudao.framework.cola.statemachine.Action;
import cn.iocoder.yudao.module.tms.dal.dataobject.first.mile.request.item.TmsFirstMileRequesItemtDO;
import cn.iocoder.yudao.module.tms.enums.TmsEventEnum;
import cn.iocoder.yudao.module.tms.enums.status.TmsAuditStatus;
import cn.iocoder.yudao.module.tms.service.first.mile.request.TmsFirstMileRequestItemService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Component
public class RequestItemOrderActionImpl implements Action<TmsAuditStatus, TmsEventEnum, TmsFirstMileRequesItemtDO> {
    @Autowired
    private TmsFirstMileRequestItemService tmsFirstMileRequestItemService;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void execute(TmsAuditStatus from, TmsAuditStatus to, TmsEventEnum event, TmsFirstMileRequesItemtDO context) {

    }
}
