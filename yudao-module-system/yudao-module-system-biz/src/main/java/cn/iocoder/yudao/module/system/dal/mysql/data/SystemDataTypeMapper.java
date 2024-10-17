package cn.iocoder.yudao.module.system.dal.mysql.data;

import java.util.*;

import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.mybatis.core.query.LambdaQueryWrapperX;
import cn.iocoder.yudao.framework.mybatis.core.mapper.BaseMapperX;
import cn.iocoder.yudao.module.system.controller.admin.data.vo.SystemDataTypePageReqVO;
import cn.iocoder.yudao.module.system.dal.dataobject.data.SystemDataTypeDO;
import org.apache.ibatis.annotations.Mapper;

/**
 * 字段属性 Mapper
 *
 * @author 索迈管理员
 */
@Mapper
public interface SystemDataTypeMapper extends BaseMapperX<SystemDataTypeDO> {

    default PageResult<SystemDataTypeDO> selectPage(SystemDataTypePageReqVO reqVO) {
        return selectPage(reqVO, new LambdaQueryWrapperX<SystemDataTypeDO>()
                .eqIfPresent(SystemDataTypeDO::getAttribute, reqVO.getAttribute())
                .eqIfPresent(SystemDataTypeDO::getKey, reqVO.getKey())
                .eqIfPresent(SystemDataTypeDO::getSort, reqVO.getSort())
                .eqIfPresent(SystemDataTypeDO::getRequire, reqVO.getRequire())
                .eqIfPresent(SystemDataTypeDO::getType, reqVO.getType())
                .betweenIfPresent(SystemDataTypeDO::getCreateTime, reqVO.getCreateTime())
                .orderByDesc(SystemDataTypeDO::getId));
    }

}