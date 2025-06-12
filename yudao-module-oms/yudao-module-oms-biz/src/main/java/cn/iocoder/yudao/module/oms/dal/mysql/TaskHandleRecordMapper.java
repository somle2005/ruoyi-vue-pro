package cn.iocoder.yudao.module.oms.dal.mysql;

import java.util.*;

import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.mybatis.core.query.LambdaQueryWrapperX;
import cn.iocoder.yudao.framework.mybatis.core.mapper.BaseMapperX;
import cn.iocoder.yudao.module.oms.controller.admin.taskreissuance.vo.TaskHandleRecordPageReqVO;
import cn.iocoder.yudao.module.oms.dal.dataobject.TaskHandleRecordDO;
import org.apache.ibatis.annotations.Mapper;

/**
 * 任务信息 Mapper
 *
 * @author 谷毛毛
 */
@Mapper
public interface TaskHandleRecordMapper extends BaseMapperX<TaskHandleRecordDO> {

    default PageResult<TaskHandleRecordDO> selectPage(TaskHandleRecordPageReqVO reqVO) {
        return selectPage(reqVO, new LambdaQueryWrapperX<TaskHandleRecordDO>()
                .eqIfPresent(TaskHandleRecordDO::getTaskTag, reqVO.getTaskTag())
                .eqIfPresent(TaskHandleRecordDO::getHandleParam, reqVO.getHandleParam())
                .eqIfPresent(TaskHandleRecordDO::getHandleStatus, reqVO.getHandleStatus())
                .eqIfPresent(TaskHandleRecordDO::getHandleResult, reqVO.getHandleResult())
                .eqIfPresent(TaskHandleRecordDO::getHandleTimes, reqVO.getHandleTimes())
                .betweenIfPresent(TaskHandleRecordDO::getRequireHandleTime, reqVO.getRequireHandleTime())
                .betweenIfPresent(TaskHandleRecordDO::getCompleteHandleTime, reqVO.getCompleteHandleTime())
                .betweenIfPresent(TaskHandleRecordDO::getCreateTime, reqVO.getCreateTime())
                .orderByDesc(TaskHandleRecordDO::getRequireHandleTime));
    }

}