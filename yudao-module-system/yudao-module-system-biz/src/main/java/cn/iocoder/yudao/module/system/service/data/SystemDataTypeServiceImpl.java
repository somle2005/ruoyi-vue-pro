package cn.iocoder.yudao.module.system.service.data;

import cn.iocoder.yudao.module.system.controller.admin.data.vo.SystemDataTypePageReqVO;
import cn.iocoder.yudao.module.system.controller.admin.data.vo.SystemDataTypeSaveReqVO;
import cn.iocoder.yudao.module.system.dal.dataobject.data.SystemDataTypeDO;
import cn.iocoder.yudao.module.system.dal.mysql.data.SystemDataTypeMapper;
import org.springframework.stereotype.Service;
import jakarta.annotation.Resource;
import org.springframework.validation.annotation.Validated;
import java.util.*;
import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.common.util.object.BeanUtils;
import static cn.iocoder.yudao.framework.common.exception.util.ServiceExceptionUtil.exception;
import static cn.iocoder.yudao.module.system.enums.ErrorCodeConstants.DATA_TYPE_NOT_EXISTS;

/**
 * 字段属性 Service 实现类
 *
 * @author 索迈管理员
 */
@Service
@Validated
public class SystemDataTypeServiceImpl implements SystemDataTypeService {

    @Resource
    private SystemDataTypeMapper dataTypeMapper;

    @Override
    public Long createDataType(SystemDataTypeSaveReqVO createReqVO) {
        // 插入
        SystemDataTypeDO dataType = BeanUtils.toBean(createReqVO, SystemDataTypeDO.class);
        dataTypeMapper.insert(dataType);
        // 返回
        return dataType.getId();
    }

    @Override
    public void updateDataType(SystemDataTypeSaveReqVO updateReqVO) {
        // 校验存在
        validateDataTypeExists(updateReqVO.getId());
        // 更新
        SystemDataTypeDO updateObj = BeanUtils.toBean(updateReqVO, SystemDataTypeDO.class);
        dataTypeMapper.updateById(updateObj);
    }

    @Override
    public void deleteDataType(Long id) {
        // 校验存在
        validateDataTypeExists(id);
        // 删除
        dataTypeMapper.deleteById(id);
    }

    private void validateDataTypeExists(Long id) {
        if (dataTypeMapper.selectById(id) == null) {
            throw exception(DATA_TYPE_NOT_EXISTS);
        }
    }

    @Override
    public SystemDataTypeDO getDataType(Long id) {
        return dataTypeMapper.selectById(id);
    }

    @Override
    public PageResult<SystemDataTypeDO> getDataTypePage(SystemDataTypePageReqVO pageReqVO) {
        return dataTypeMapper.selectPage(pageReqVO);
    }

}