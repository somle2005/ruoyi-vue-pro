package cn.iocoder.yudao.module.oms.service.impl;

import cn.hutool.core.collection.CollUtil;
import cn.iocoder.yudao.module.oms.api.enums.TaskHandleStatusEnum;
import cn.iocoder.yudao.module.oms.controller.admin.taskreissuance.vo.TaskHandleRecordPageReqVO;
import cn.iocoder.yudao.module.oms.controller.admin.taskreissuance.vo.TaskHandleRecordSaveReqVO;
import cn.iocoder.yudao.module.oms.dal.dataobject.TaskHandleRecordDO;
import cn.iocoder.yudao.module.oms.dal.mysql.TaskHandleRecordMapper;
import cn.iocoder.yudao.module.oms.service.TaskHandleRecordService;
import org.springframework.stereotype.Service;
import jakarta.annotation.Resource;
import org.springframework.validation.annotation.Validated;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.*;

import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.common.util.object.BeanUtils;

import static cn.iocoder.yudao.framework.common.exception.util.ServiceExceptionUtil.exception;


/**
 * 任务信息 Service 实现类
 *
 * @author 谷毛毛
 */
@Service
@Validated
public class TaskHandleRecordServiceImpl implements TaskHandleRecordService {

    @Resource
    private TaskHandleRecordMapper handleRecordMapper;


    public Long createHandleRecord(TaskHandleRecordSaveReqVO createReqVO) {
        // 插入
        TaskHandleRecordDO handleRecord = BeanUtils.toBean(createReqVO, TaskHandleRecordDO.class);
        handleRecordMapper.insert(handleRecord);
        // 返回
        return handleRecord.getId();
    }


    public void updateHandleRecord(TaskHandleRecordSaveReqVO updateReqVO) {
        // 校验存在
        validateHandleRecordExists(updateReqVO.getId());
        // 更新
        TaskHandleRecordDO updateObj = BeanUtils.toBean(updateReqVO, TaskHandleRecordDO.class);
        handleRecordMapper.updateById(updateObj);
    }


    public void deleteHandleRecord(Long id) {
        // 校验存在
        validateHandleRecordExists(id);
        // 删除
        handleRecordMapper.deleteById(id);
    }

    private void validateHandleRecordExists(Long id) {
        if (handleRecordMapper.selectById(id) == null) {
//            throw exception(HANDLE_RECORD_NOT_EXISTS);
            throw new RuntimeException("任务不存在");
        }
    }


    public TaskHandleRecordDO getHandleRecord(Long id) {
        return handleRecordMapper.selectById(id);
    }


    public PageResult<TaskHandleRecordDO> getHandleRecordPage(TaskHandleRecordPageReqVO pageReqVO) {
        return handleRecordMapper.selectPage(pageReqVO);
    }

    @Transactional
    @Override
    public void createTask(String taskTag, List<String> handleParams) {
        List<TaskHandleRecordDO> taskHandleRecordDOS = handleRecordMapper.selectList(TaskHandleRecordDO::getTaskTag, taskTag);
        //如果是在一天之内建立任务，则跳过不建立
        if (CollUtil.isNotEmpty(taskHandleRecordDOS)) {
            TaskHandleRecordDO taskHandleRecordDO = taskHandleRecordDOS.get(0);
            if (taskHandleRecordDO.getCreateTime().isAfter(LocalDateTime.now().minusDays(1))) {
                return;
            }
        }
        //把之前所有的任务都删除，再重新建立新任务
        handleRecordMapper.deleteByIds(taskHandleRecordDOS.stream().map(TaskHandleRecordDO::getId).toList());
        List<TaskHandleRecordDO> taskHandleRecordDOList = handleParams.stream().map(handleParam -> TaskHandleRecordDO.builder()
            .taskTag(taskTag)
            .handleParam(handleParam)
            .handleStatus(TaskHandleStatusEnum.PENDING.getType())
            .handleResult(TaskHandleStatusEnum.PENDING.getName())
            .handleTimes(0)
            .build()).toList();
        handleRecordMapper.insertBatch(taskHandleRecordDOList);
    }


    public List<TaskHandleRecordDO> getHandleRecordByTaskTag(String taskTag) {
        TaskHandleRecordPageReqVO vo = TaskHandleRecordPageReqVO.builder().taskTag(taskTag).handleStatus(TaskHandleStatusEnum.PENDING.getType()).build();
        vo.setPageSize(100);
        return handleRecordMapper.selectPage(vo).getList();
    }

    @Override
    public void updateHandleRecord(TaskHandleRecordDO updateReqVO) {
        handleRecordMapper.updateById(updateReqVO);
    }
}