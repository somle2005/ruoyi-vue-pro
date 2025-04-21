package cn.iocoder.yudao.module.tms.config.first.mile.request.impl.action;

import cn.iocoder.yudao.framework.cola.statemachine.Action;
import cn.iocoder.yudao.module.tms.dal.dataobject.first.mile.request.TmsFirstMileRequestDO;
import cn.iocoder.yudao.module.tms.dal.dataobject.first.mile.request.item.TmsFirstMileRequestItemDO;
import cn.iocoder.yudao.module.tms.enums.TmsEventEnum;
import cn.iocoder.yudao.module.tms.enums.status.TmsAuditStatus;
import cn.iocoder.yudao.module.tms.enums.status.TmsOffStatus;
import cn.iocoder.yudao.module.tms.service.first.mile.request.TmsFirstMileRequestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Slf4j
@Component
public class RequestOffActionImpl implements Action<TmsAuditStatus, TmsEventEnum, TmsFirstMileRequestDO> {
    @Autowired
    private TmsFirstMileRequestService tmsFirstMileRequestService;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void execute(TmsAuditStatus from, TmsAuditStatus to, TmsEventEnum event, TmsFirstMileRequestDO context) {
        TmsFirstMileRequestDO requestDO = tmsFirstMileRequestService.validateFirstMileRequestExists(context.getId());

        //
        // 处理每个主表记录

        // 查询该主表下所有子表记录
        List<TmsFirstMileRequestItemDO> allItems = tmsFirstMileRequestService.getFirstMileRequestItemListByRequestId(context.getId());
        // 检查所有子表记录的状态
        boolean allClosed = true;
        boolean allOpen = true;

        for (TmsFirstMileRequestItemDO item : allItems) {
            if (TmsOffStatus.OPEN.getCode().equals(item.getOffStatus())) {
                allClosed = false;
            } else {
                allOpen = false;
            }
        }
        // 设置主表状态
        Integer newStatus;
        if (allClosed) {
            // 所有子表记录都关闭，主表设为关闭
            newStatus = TmsOffStatus.CLOSED.getCode();
        } else if (allOpen) {
            // 所有子表记录都开启，主表设为开启
            newStatus = TmsOffStatus.OPEN.getCode();
        } else {
            // 子表记录状态不一致，主表设为开启
            newStatus = TmsOffStatus.OPEN.getCode();
        }

        // 更新主表状态
        requestDO.setOffStatus(newStatus);

        tmsFirstMileRequestService.updateFirstMileRequestStatus(requestDO.getId(), requestDO.getOffStatus(), null, null);
    }
}
