package cn.iocoder.yudao.module.oms.api;

import cn.iocoder.yudao.framework.common.util.object.BeanUtils;
import cn.iocoder.yudao.module.oms.api.dto.TaskHandleRecordDTO;
import cn.iocoder.yudao.module.oms.dal.dataobject.TaskHandleRecordDO;
import cn.iocoder.yudao.module.oms.service.TaskHandleRecordService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskHandlerRecordApiImpl implements TaskHandlerRecordApi{
    @Resource
    private TaskHandleRecordService  taskHandleRecordService;

    public void createTask(String taskTag, List<String> handleParams){
        taskHandleRecordService.createTask(taskTag, handleParams);
    }

    @Override
    public List<TaskHandleRecordDTO> getHandleRecordByTaskTag(String taskTag) {
        List<TaskHandleRecordDO> handleRecordByTaskTag = taskHandleRecordService.getHandleRecordByTaskTag(taskTag);
        return BeanUtils.toBean(handleRecordByTaskTag, TaskHandleRecordDTO.class);
    }

    @Override
    public void updateHandleRecord(TaskHandleRecordDTO updateReqVO) {
        taskHandleRecordService.updateHandleRecord(BeanUtils.toBean(updateReqVO, TaskHandleRecordDO.class));
    }
}
