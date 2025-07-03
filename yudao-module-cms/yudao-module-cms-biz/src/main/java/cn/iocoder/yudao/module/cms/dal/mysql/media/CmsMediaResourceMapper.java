package cn.iocoder.yudao.module.cms.dal.mysql.media;

import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.mybatis.core.mapper.BaseMapperX;
import cn.iocoder.yudao.framework.mybatis.core.query.LambdaQueryWrapperX;
import cn.iocoder.yudao.module.cms.controller.admin.media.vo.CmsMediaResourcePageReqVO;
import cn.iocoder.yudao.module.cms.dal.dataobject.media.CmsMediaResourceDO;
import org.apache.ibatis.annotations.Mapper;

/**
 * 文件 Mapper
 *
 * @author 谷毛毛
 */
@Mapper
public interface CmsMediaResourceMapper extends BaseMapperX<CmsMediaResourceDO> {

    default PageResult<CmsMediaResourceDO> selectPage(CmsMediaResourcePageReqVO reqVO) {
        return selectPage(reqVO, new LambdaQueryWrapperX<CmsMediaResourceDO>()
                .eqIfPresent(CmsMediaResourceDO::getAppCode, reqVO.getAppCode())
                .eqIfPresent(CmsMediaResourceDO::getModuleCode, reqVO.getModuleCode())
                .eqIfPresent(CmsMediaResourceDO::getTitle, reqVO.getTitle())
                .eqIfPresent(CmsMediaResourceDO::getDescription, reqVO.getDescription())
                .eqIfPresent(CmsMediaResourceDO::getMediaType, reqVO.getMediaType())
                .betweenIfPresent(CmsMediaResourceDO::getCreateTime, reqVO.getCreateTime())
                .orderByDesc(CmsMediaResourceDO::getId));
    }

}