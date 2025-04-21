package cn.iocoder.yudao.module.tms.service.first.mile.request.item;

import cn.iocoder.yudao.module.tms.controller.admin.first.mile.request.item.vo.TmsFirstMileRequestItemSaveReqVO;
import cn.iocoder.yudao.module.tms.dal.dataobject.first.mile.request.item.TmsFirstMileRequestItemDO;
import jakarta.validation.Valid;

/**
 * 头程申请表明细 Service 接口
 *
 * @author wdy
 */
public interface TmsFirstMileRequestItemService {

    /**
     * 创建头程申请表明细
     *
     * @param createReqVO 创建信息
     * @return 编号
     */
    Long createFirstMileRequestItem(@Valid TmsFirstMileRequestItemSaveReqVO createReqVO);

    /**
     * 更新头程申请表明细
     *
     * @param updateReqVO 更新信息
     */
    void updateFirstMileRequestItem(@Valid TmsFirstMileRequestItemSaveReqVO updateReqVO);

    /**
     * 删除头程申请表明细
     *
     * @param id 编号
     */
    void deleteFirstMileRequestItem(Long id);

    /**
     * 获得头程申请表明细
     *
     * @param id 编号
     * @return 头程申请表明细
     */
    TmsFirstMileRequestItemDO getFirstMileRequestItem(Long id);

}