package cn.iocoder.yudao.module.system.service.user;

import cn.iocoder.yudao.module.system.controller.admin.user.vo.user.SystemUserConfigPageReqVO;
import cn.iocoder.yudao.module.system.controller.admin.user.vo.user.SystemUserConfigSaveReqVO;
import cn.iocoder.yudao.module.system.dal.dataobject.user.SystemUserConfigDO;
import cn.iocoder.yudao.module.system.dal.mysql.user.SystemUserConfigMapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import org.springframework.stereotype.Service;
import jakarta.annotation.Resource;
import org.springframework.validation.annotation.Validated;

import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.common.util.object.BeanUtils;

import java.util.Objects;


/**
 * 用户配置 Service 实现类
 *
 * @author 高巍
 */
@Service
@Validated
public class SystemUserConfigServiceImpl implements SystemUserConfigService {

    @Resource
    private SystemUserConfigMapper userConfigMapper;

    @Override
    public Long saveOrUpdate(SystemUserConfigSaveReqVO createReqVO) {
        SystemUserConfigDO oldUserConfigDO = getUserConfig(createReqVO.getUserId(), createReqVO.getConfigKey(), createReqVO.getScope());
        if (Objects.nonNull(oldUserConfigDO)) {
            oldUserConfigDO.setConfigValue(createReqVO.getConfigValue());
            userConfigMapper.updateById(oldUserConfigDO);
            return oldUserConfigDO.getId();
        }
        // 插入
        SystemUserConfigDO userConfig = BeanUtils.toBean(createReqVO, SystemUserConfigDO.class);
        userConfigMapper.insert(userConfig);
        return userConfig.getId();
    }


    @Override
    public void deleteUserConfig(Long id) {
        // 删除
        userConfigMapper.deleteById(id);
    }

    @Override
    public SystemUserConfigDO getUserConfig(Long userId, String configKey, Integer scope) {
        return userConfigMapper.selectOne(Wrappers.lambdaQuery(SystemUserConfigDO.class)
            .eq(SystemUserConfigDO::getUserId, userId)
            .eq(SystemUserConfigDO::getConfigKey, configKey)
            .eq(SystemUserConfigDO::getScope, scope)
        );
    }

    @Override
    public PageResult<SystemUserConfigDO> getUserConfigPage(SystemUserConfigPageReqVO pageReqVO) {
        return userConfigMapper.selectPage(pageReqVO);
    }

}