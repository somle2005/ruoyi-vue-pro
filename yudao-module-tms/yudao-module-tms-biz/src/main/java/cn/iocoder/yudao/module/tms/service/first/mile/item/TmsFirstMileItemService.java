package cn.iocoder.yudao.module.tms.service.first.mile.item;

import cn.iocoder.yudao.module.tms.controller.admin.first.mile.item.vo.TmsFirstMileItemSaveReqVO;
import cn.iocoder.yudao.module.tms.dal.dataobject.first.mile.item.TmsFirstMileItemDO;
import jakarta.validation.Valid;

/**
 * 头程单明细 Service 接口
 *
 * @author wdy
 */
public interface TmsFirstMileItemService {

    /**
     * 创建头程单明细
     *
     * @param createReqVO 创建信息
     * @return 编号
     */
    Long createFirstMileItem(@Valid TmsFirstMileItemSaveReqVO createReqVO);

    /**
     * 更新头程单明细
     *
     * @param updateReqVO 更新信息
     */
    void updateFirstMileItem(@Valid TmsFirstMileItemSaveReqVO updateReqVO);

    /**
     * 删除头程单明细
     *
     * @param id 编号
     */
    void deleteFirstMileItem(Long id);

    /**
     * 获得头程单明细
     *
     * @param id 编号
     * @return 头程单明细
     */
    TmsFirstMileItemDO getFirstMileItem(Long id);

//    /**
//     * 获得头程单明细分页
//     *
//     * @param pageReqVO 分页查询
//     * @return 头程单明细分页
//     */
//    PageResult<TmsFirstMileItemDO> getFirstMileItemPage(TmsFirstMileItemPageReqVO pageReqVO);

}