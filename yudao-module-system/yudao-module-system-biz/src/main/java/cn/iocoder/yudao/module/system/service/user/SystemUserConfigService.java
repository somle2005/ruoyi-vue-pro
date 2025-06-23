package cn.iocoder.yudao.module.system.service.user;

import cn.iocoder.yudao.module.system.controller.admin.user.vo.user.SystemUserConfigPageReqVO;
import cn.iocoder.yudao.module.system.controller.admin.user.vo.user.SystemUserConfigSaveReqVO;
import cn.iocoder.yudao.module.system.dal.dataobject.user.SystemUserConfigDO;
import jakarta.validation.*;
import cn.iocoder.yudao.framework.common.pojo.PageResult;

/**
 * 用户配置 Service 接口
 *
 * @author 高巍
 */
public interface SystemUserConfigService {

    /**
     * 创建用户配置
     *
     * @param createReqVO 创建信息
     * @return 编号
     */
    Long saveOrUpdate(@Valid SystemUserConfigSaveReqVO createReqVO);


    /**
     * 删除用户配置
     *
     * @param id 编号
     */
    void deleteUserConfig(Long id);

    /**
     * 获得用户配置
     *
     * @param userId        编号
     * @param configKey     配置键
     * @param scope     作用域
     * @return 用户配置
     */
    SystemUserConfigDO getUserConfig(Long userId, String configKey, Integer scope);

    /**
     * 获得用户配置分页
     *
     * @param pageReqVO 分页查询
     * @return 用户配置分页
     */
    PageResult<SystemUserConfigDO> getUserConfigPage(SystemUserConfigPageReqVO pageReqVO);

}