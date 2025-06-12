package cn.iocoder.yudao.module.oms.api;

import cn.iocoder.yudao.module.oms.api.dto.TaskHandleRecordDTO;

import java.util.List;

public interface TaskHandlerRecordApi {

    void createTask(String taskTag, List<String> handleParams);

    List<TaskHandleRecordDTO> getHandleRecordByTaskTag(String taskTag);

    void  updateHandleRecord(TaskHandleRecordDTO updateReqVO);

}
