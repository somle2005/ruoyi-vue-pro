package cn.iocoder.yudao.module.cms.service.media;

import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.module.cms.controller.admin.media.vo.CmsMediaResourcePageReqVO;
import cn.iocoder.yudao.module.cms.controller.admin.media.vo.CmsMediaResourceSaveReqVO;
import cn.iocoder.yudao.module.cms.dal.dataobject.media.CmsMediaResourceDO;
import jakarta.validation.Valid;

/**
 * 文件 Service 接口
 *
 * @author 谷毛毛
 */
public interface CmsMediaResourceService {

    /**
     * 创建文件
     *
     * @param createReqVO 创建信息
     * @return 编号
     */
    Long createMediaResource(@Valid CmsMediaResourceSaveReqVO createReqVO);

    /**
     * 更新文件
     *
     * @param updateReqVO 更新信息
     */
    void updateMediaResource(@Valid CmsMediaResourceSaveReqVO updateReqVO);

    /**
     * 删除文件
     *
     * @param id 编号
     */
    void deleteMediaResource(Long id);

    /**
     * 获得文件
     *
     * @param id 编号
     * @return 文件
     */
    CmsMediaResourceDO getMediaResource(Long id);

    /**
     * 获得文件分页
     *
     * @param pageReqVO 分页查询
     * @return 文件分页
     */
    PageResult<CmsMediaResourceDO> getMediaResourcePage(CmsMediaResourcePageReqVO pageReqVO);

}