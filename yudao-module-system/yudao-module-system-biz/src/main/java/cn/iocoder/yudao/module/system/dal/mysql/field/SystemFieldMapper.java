package cn.iocoder.yudao.module.system.dal.mysql.field;

import java.util.*;

import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.mybatis.core.query.LambdaQueryWrapperX;
import cn.iocoder.yudao.framework.mybatis.core.mapper.BaseMapperX;
import cn.iocoder.yudao.module.system.controller.admin.field.vo.SystemFieldPageReqVO;
import cn.iocoder.yudao.module.system.dal.dataobject.field.SystemFieldDO;
import org.apache.ibatis.annotations.Mapper;

/**
 * 字段属性 Mapper
 *
 * @author 索迈管理员
 */
@Mapper
public interface SystemFieldMapper extends BaseMapperX<SystemFieldDO> {

    default PageResult<SystemFieldDO> selectPage(SystemFieldPageReqVO reqVO) {
        return selectPage(reqVO, new LambdaQueryWrapperX<SystemFieldDO>()
                .eqIfPresent(SystemFieldDO::getAttribute, reqVO.getAttribute())
                .eqIfPresent(SystemFieldDO::getKey, reqVO.getKey())
                .eqIfPresent(SystemFieldDO::getSort, reqVO.getSort())
                .eqIfPresent(SystemFieldDO::getRequire, reqVO.getRequire())
                .eqIfPresent(SystemFieldDO::getType, reqVO.getType())
                .betweenIfPresent(SystemFieldDO::getCreateTime, reqVO.getCreateTime())
                .orderByDesc(SystemFieldDO::getId));
    }

    /**
    * @Author Wqh
    * @Description 查询键或属性的集合
    * @Date 9:31 2024/10/18
    * @Param [key, attribute]
    * @return java.util.List<cn.iocoder.yudao.module.system.dal.dataobject.data.SystemDataTypeDO>
    **/
    default List<SystemFieldDO> selectKeyAndAttribute(String key, String attribute){
        return selectList(new LambdaQueryWrapperX<SystemFieldDO>()
                .eqIfPresent(SystemFieldDO::getKey, key)
                .or()
                .eqIfPresent(SystemFieldDO::getAttribute, attribute));
    }
}