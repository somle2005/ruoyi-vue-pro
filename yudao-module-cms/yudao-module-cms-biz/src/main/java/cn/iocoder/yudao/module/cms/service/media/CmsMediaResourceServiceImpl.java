package cn.iocoder.yudao.module.cms.service.media;

import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.common.util.object.BeanUtils;
import cn.iocoder.yudao.module.cms.controller.admin.media.vo.CmsMediaResourcePageReqVO;
import cn.iocoder.yudao.module.cms.controller.admin.media.vo.CmsMediaResourceSaveReqVO;
import cn.iocoder.yudao.module.cms.dal.dataobject.media.CmsMediaResourceDO;
import cn.iocoder.yudao.module.cms.dal.mysql.media.CmsMediaResourceMapper;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import static cn.iocoder.yudao.framework.common.exception.util.ServiceExceptionUtil.exception;
import static cn.iocoder.yudao.module.cms.enums.ErrorCodeConstants.MEDIA_RESOURCE_NOT_EXISTS;

/**
 * 文件 Service 实现类
 *
 * @author 谷毛毛
 */
@Service
@Validated
public class CmsMediaResourceServiceImpl implements CmsMediaResourceService {

    @Resource
    private CmsMediaResourceMapper mediaResourceMapper;

    @Override
    public Long createMediaResource(CmsMediaResourceSaveReqVO createReqVO) {
        // 插入
        CmsMediaResourceDO mediaResource = BeanUtils.toBean(createReqVO, CmsMediaResourceDO.class);
        mediaResourceMapper.insert(mediaResource);
        // 返回
        return mediaResource.getId();
    }

    @Override
    public void updateMediaResource(CmsMediaResourceSaveReqVO updateReqVO) {
        // 校验存在
        validateMediaResourceExists(updateReqVO.getId());
        // 更新
        CmsMediaResourceDO updateObj = BeanUtils.toBean(updateReqVO, CmsMediaResourceDO.class);
        mediaResourceMapper.updateById(updateObj);
    }

    @Override
    public void deleteMediaResource(Long id) {
        // 校验存在
        validateMediaResourceExists(id);
        // 删除
        mediaResourceMapper.deleteById(id);
    }

    private void validateMediaResourceExists(Long id) {
        if (mediaResourceMapper.selectById(id) == null) {
            throw exception(MEDIA_RESOURCE_NOT_EXISTS);
        }
    }

    @Override
    public CmsMediaResourceDO getMediaResource(Long id) {
        return mediaResourceMapper.selectById(id);
    }

    @Override
    public PageResult<CmsMediaResourceDO> getMediaResourcePage(CmsMediaResourcePageReqVO pageReqVO) {
        return mediaResourceMapper.selectPage(pageReqVO);
    }

}