package cn.iocoder.yudao.module.system.service.data;

import java.util.*;

import cn.iocoder.yudao.module.system.controller.admin.data.vo.SystemDataTypePageReqVO;
import cn.iocoder.yudao.module.system.controller.admin.data.vo.SystemDataTypeSaveReqVO;
import cn.iocoder.yudao.module.system.dal.dataobject.data.SystemDataTypeDO;
import jakarta.validation.*;
import cn.iocoder.yudao.framework.common.pojo.PageResult;

/**
 * 字段属性 Service 接口
 *
 * @author 索迈管理员
 */
public interface SystemDataTypeService {

    /**
     * 创建字段属性
     *
     * @param createReqVO 创建信息
     * @return 编号
     */
    Long createDataType(@Valid SystemDataTypeSaveReqVO createReqVO);

    /**
     * 更新字段属性
     *
     * @param updateReqVO 更新信息
     */
    void updateDataType(@Valid SystemDataTypeSaveReqVO updateReqVO);

    /**
     * 删除字段属性
     *
     * @param id 编号
     */
    void deleteDataType(Long id);

    /**
     * 获得字段属性
     *
     * @param id 编号
     * @return 字段属性
     */
    SystemDataTypeDO getDataType(Long id);

    /**
     * 获得字段属性分页
     *
     * @param pageReqVO 分页查询
     * @return 字段属性分页
     */
    PageResult<SystemDataTypeDO> getDataTypePage(SystemDataTypePageReqVO pageReqVO);

}