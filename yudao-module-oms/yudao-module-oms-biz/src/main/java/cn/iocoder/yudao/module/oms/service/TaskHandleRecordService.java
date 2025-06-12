package cn.iocoder.yudao.module.oms.service;

import java.util.*;

import cn.iocoder.yudao.module.oms.api.dto.TaskHandleRecordDTO;
import cn.iocoder.yudao.module.oms.controller.admin.taskreissuance.vo.TaskHandleRecordPageReqVO;
import cn.iocoder.yudao.module.oms.controller.admin.taskreissuance.vo.TaskHandleRecordSaveReqVO;
import cn.iocoder.yudao.module.oms.dal.dataobject.TaskHandleRecordDO;
import jakarta.validation.*;
import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.common.pojo.PageParam;

/**
 * 任务信息 Service 接口
 *
 * @author 谷毛毛
 */
public interface TaskHandleRecordService {


    void createTask(String taskTag, List<String> handleParams);

    List<TaskHandleRecordDO> getHandleRecordByTaskTag(String taskTag);

    void updateHandleRecord(TaskHandleRecordDO updateReqVO);
}