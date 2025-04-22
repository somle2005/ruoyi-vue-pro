package cn.iocoder.yudao.module.wms.service.inbound.item;

import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.module.wms.controller.admin.inbound.item.vo.WmsInboundItemImportExcelVO;
import cn.iocoder.yudao.module.wms.controller.admin.inbound.item.vo.WmsInboundItemPageReqVO;
import cn.iocoder.yudao.module.wms.controller.admin.inbound.item.vo.WmsInboundItemRespVO;
import cn.iocoder.yudao.module.wms.controller.admin.inbound.item.vo.WmsInboundItemSaveReqVO;
import cn.iocoder.yudao.module.wms.controller.admin.inbound.item.vo.WmsPickupPendingPageReqVO;
import cn.iocoder.yudao.module.wms.dal.dataobject.inbound.item.WmsInboundItemDO;
import cn.iocoder.yudao.module.wms.dal.dataobject.inbound.item.WmsInboundItemQueryDO;
import cn.iocoder.yudao.module.wms.dal.dataobject.inbound.item.flow.WmsInboundItemFlowDO;
import jakarta.validation.Valid;
import java.util.List;

/**
 * 入库单详情 Service 接口
 *
 * @author 李方捷
 */
public interface WmsInboundItemService {

    /**
     * 创建入库单详情
     *
     * @param createReqVO 创建信息
     * @return 编号
     */
    WmsInboundItemDO createInboundItem(@Valid WmsInboundItemSaveReqVO createReqVO);

    /**
     * 更新入库单详情
     *
     * @param updateReqVO 更新信息
     */
    WmsInboundItemDO updateInboundItem(@Valid WmsInboundItemSaveReqVO updateReqVO);

    /**
     * 删除入库单详情
     *
     * @param id 编号
     */
    void deleteInboundItem(Long id);

    /**
     * 获得入库单详情
     *
     * @param id 编号
     * @return 入库单详情
     */
    WmsInboundItemDO getInboundItem(Long id);

    /**
     * 获得入库单详情分页
     *
     * @param pageReqVO 分页查询
     * @return 入库单详情分页
     */
    PageResult<WmsInboundItemQueryDO> getInboundItemPage(WmsInboundItemPageReqVO pageReqVO);

    /**
     * 按 inboundId 查询 WmsInboundItemDO
     */
    List<WmsInboundItemDO> selectByInboundId(Long inboundId, int limit);

    /**
     * 按 inboundId 查询 WmsInboundItemDO
     */
    default List<WmsInboundItemDO> selectByInboundId(Long inboundId) {
        return selectByInboundId(inboundId, Integer.MAX_VALUE);
    }

    /**
     * 更新实际入库量
     *
     * @param updateReqVOList 更新信息
     */
    void updateActualQuantity(List<WmsInboundItemSaveReqVO> updateReqVOList);

    /**
     * 按 id 查询 WmsInboundItemDO
     */
    List<WmsInboundItemDO> selectByIds(List<Long> ids);

    /**
     * 更新 WmsInboundItemDO
     */
    void updateById(WmsInboundItemDO inboundItemDO);

    /**
     * 获取待上架清单
     */
    PageResult<WmsInboundItemQueryDO> getPickupPending(WmsPickupPendingPageReqVO pageReqVO);

    /**
     * 装配产品
     */
    void assembleProducts(List<WmsInboundItemRespVO> itemList);

    /**
     * 装配入库单
     */
    void assembleInbound(List<WmsInboundItemRespVO> itemList);

    /**
     * 按仓库id和商品id查询
     */
    List<WmsInboundItemDO> selectItemListHasAvailableQty(Long warehouseId, Long productId);

    /**
     * 保存入库单详情
     */
    void saveItems(List<WmsInboundItemDO> itemsToUpdate, List<WmsInboundItemFlowDO> inboundItemFlowList);

    /**
     * 装配仓库
     */
    void assembleWarehouse(List<WmsInboundItemRespVO> list);

    /**
     * 装配仓库货位
     */
    void assembleWarehouseBin(List<WmsInboundItemRespVO> list);

    /**
     * 装配部门
     */
    void assembleDept(List<WmsInboundItemRespVO> list);

    /**
     * 装配公司
     */
    void assembleCompany(List<WmsInboundItemRespVO> list);

    /**
     * 装配商品id
     */
    void assembleProductIds(List<WmsInboundItemImportExcelVO> impVOList);
}
