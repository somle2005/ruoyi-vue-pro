package cn.iocoder.yudao.module.tms.service.transfer.item;

import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.module.tms.controller.admin.transfer.item.vo.TmsTransferItemPageReqVO;
import cn.iocoder.yudao.module.tms.controller.admin.transfer.item.vo.TmsTransferItemSaveReqVO;
import cn.iocoder.yudao.module.tms.dal.dataobject.transfer.item.TmsTransferItemDO;
import jakarta.validation.Valid;

/**
 * 调拨单明细 Service 接口
 *
 * @author wdy
 */
public interface TmsTransferItemService {

    /**
     * 创建调拨单明细
     *
     * @param createReqVO 创建信息
     * @return 编号
     */
    Long createTransferItem(@Valid TmsTransferItemSaveReqVO createReqVO);

    /**
     * 更新调拨单明细
     *
     * @param updateReqVO 更新信息
     */
    void updateTransferItem(@Valid TmsTransferItemSaveReqVO updateReqVO);

    /**
     * 删除调拨单明细
     *
     * @param id 编号
     */
    void deleteTransferItem(Long id);

    /**
     * 获得调拨单明细
     *
     * @param id 编号
     * @return 调拨单明细
     */
    TmsTransferItemDO getTransferItem(Long id);

    /**
     * 获得调拨单明细分页
     *
     * @param pageReqVO 分页查询
     * @return 调拨单明细分页
     */
    PageResult<TmsTransferItemDO> getTransferItemPage(TmsTransferItemPageReqVO pageReqVO);

}