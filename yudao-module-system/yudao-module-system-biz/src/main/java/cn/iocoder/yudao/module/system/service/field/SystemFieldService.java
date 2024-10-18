package cn.iocoder.yudao.module.system.service.field;

import cn.iocoder.yudao.module.system.controller.admin.field.vo.SystemFieldPageReqVO;
import cn.iocoder.yudao.module.system.controller.admin.field.vo.SystemFieldSaveReqVO;
import cn.iocoder.yudao.module.system.dal.dataobject.field.SystemFieldDO;
import jakarta.validation.*;
import cn.iocoder.yudao.framework.common.pojo.PageResult;

import java.util.List;

/**
 * 字段属性 Service 接口
 *
 * @author 索迈管理员
 */
public interface SystemFieldService {

    /**
     * 创建字段属性
     *
     * @param createReqVO 创建信息
     * @return 编号
     */
    Long createField(@Valid SystemFieldSaveReqVO createReqVO);

    /**
     * 更新字段属性
     *
     * @param updateReqVO 更新信息
     */
    void updateField(@Valid SystemFieldSaveReqVO updateReqVO);

    /**
     * 删除字段属性
     *
     * @param id 编号
     */
    void deleteField(Long id);

    /**
     * 获得字段属性
     *
     * @param id 编号
     * @return 字段属性
     */
    SystemFieldDO getField(Long id);

    /**
     * 获得字段属性分页
     *
     * @param pageReqVO 分页查询
     * @return 字段属性分页
     */
    PageResult<SystemFieldDO> getFieldPage(SystemFieldPageReqVO pageReqVO);

    /**
     * 获获得字段精简列表
     * @return 字段属性列表
     */
    List<SystemFieldDO> getFieldList();
}