package cn.iocoder.yudao.module.tms.config.first.mile.request.impl.action;

import cn.iocoder.yudao.framework.cola.statemachine.Action;
import cn.iocoder.yudao.module.tms.controller.admin.first.mile.request.vo.TmsFirstMileRequestAuditReqVO;
import cn.iocoder.yudao.module.tms.dal.dataobject.first.mile.request.TmsFirstMileRequestDO;
import cn.iocoder.yudao.module.tms.enums.TmsEventEnum;
import cn.iocoder.yudao.module.tms.enums.status.TmsAuditStatus;
import cn.iocoder.yudao.module.tms.service.first.mile.request.TmsFirstMileRequestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Component
public class RequestAuditActionImpl implements Action<TmsAuditStatus, TmsEventEnum, TmsFirstMileRequestAuditReqVO> {

    @Autowired
    TmsFirstMileRequestService firstMileRequestService;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void execute(TmsAuditStatus from, TmsAuditStatus to, TmsEventEnum event, TmsFirstMileRequestAuditReqVO context) {

        TmsFirstMileRequestDO requestDO = firstMileRequestService.validateFirstMileRequestExists(context.getRequestId());

        requestDO.setAuditStatus(to.getCode());
        firstMileRequestService.updateFirstMileRequestStatus(requestDO.getId(), null, null, to.getCode());
    }
}
