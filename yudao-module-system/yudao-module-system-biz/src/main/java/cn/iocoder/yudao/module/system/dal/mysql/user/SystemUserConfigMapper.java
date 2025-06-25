package cn.iocoder.yudao.module.system.dal.mysql.user;

import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.mybatis.core.query.LambdaQueryWrapperX;
import cn.iocoder.yudao.framework.mybatis.core.mapper.BaseMapperX;
import cn.iocoder.yudao.module.system.controller.admin.user.vo.user.SystemUserConfigPageReqVO;
import cn.iocoder.yudao.module.system.dal.dataobject.user.SystemUserConfigDO;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户配置 Mapper
 *
 * @author 高巍
 */
@Mapper
public interface SystemUserConfigMapper extends BaseMapperX<SystemUserConfigDO> {

    default PageResult<SystemUserConfigDO> selectPage(SystemUserConfigPageReqVO reqVO) {
        return selectPage(reqVO, new LambdaQueryWrapperX<SystemUserConfigDO>()
                .eqIfPresent(SystemUserConfigDO::getUserId, reqVO.getUserId())
                .eqIfPresent(SystemUserConfigDO::getConfigKey, reqVO.getConfigKey())
                .eqIfPresent(SystemUserConfigDO::getScope, reqVO.getScope())
                .orderByDesc(SystemUserConfigDO::getId));
    }

}