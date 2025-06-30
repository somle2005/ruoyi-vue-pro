package cn.iocoder.yudao.module.wms.service.quantity;

import cn.iocoder.yudao.framework.common.util.object.BeanUtils;
import cn.iocoder.yudao.framework.mybatis.core.util.JdbcUtils;
import cn.iocoder.yudao.module.wms.controller.admin.inbound.item.vo.WmsInboundItemSaveReqVO;
import cn.iocoder.yudao.module.wms.controller.admin.outbound.item.vo.WmsOutboundItemRespVO;
import cn.iocoder.yudao.module.wms.controller.admin.outbound.vo.WmsOutboundRespVO;
import cn.iocoder.yudao.module.wms.dal.dataobject.inbound.item.WmsInboundItemDO;
import cn.iocoder.yudao.module.wms.dal.dataobject.stock.bin.WmsStockBinDO;
import cn.iocoder.yudao.module.wms.dal.dataobject.stock.logic.WmsStockLogicDO;
import cn.iocoder.yudao.module.wms.dal.dataobject.stock.warehouse.WmsStockWarehouseDO;
import cn.iocoder.yudao.module.wms.enums.outbound.WmsOutboundStatus;
import cn.iocoder.yudao.module.wms.enums.stock.WmsStockFlowDirection;
import cn.iocoder.yudao.module.wms.enums.stock.WmsStockReason;
import cn.iocoder.yudao.module.wms.service.inbound.WmsInboundService;
import cn.iocoder.yudao.module.wms.service.inbound.item.WmsInboundItemService;
import cn.iocoder.yudao.module.wms.service.outbound.WmsOutboundService;
import cn.iocoder.yudao.module.wms.service.quantity.context.OutboundContext;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Lazy;
import org.springframework.transaction.annotation.Transactional;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import static cn.iocoder.yudao.framework.common.exception.util.ServiceExceptionUtil.exception;
import static cn.iocoder.yudao.module.wms.enums.WmsErrorCodeConstants.*;
import static com.fhs.common.constant.Constant.ZERO;

/**
 * @author: LeeFJ
 * @date: 2025/3/25 13:16
 * @description: 出库执行器
 */
@Slf4j
public abstract class OutboundExecutor extends QuantityExecutor<OutboundContext> {

    @Resource
    protected WmsOutboundService outboundService;

    @Resource
    @Lazy
    private WmsInboundService inboundService;

    @Resource
    protected WmsInboundItemService inboundItemService;

    public OutboundExecutor(WmsStockReason reason) {
        super(reason);
    }

    /**
     * 根据不同的业务动作获得执行量
     **/
    protected abstract Integer getExecuteQty(WmsOutboundItemRespVO item, WmsInboundItemDO batch);
    /**
     * 更新仓库库存量
     **/
    protected abstract WmsStockFlowDirection updateStockWarehouseQty(WmsStockWarehouseDO stockWarehouseDO, WmsOutboundItemRespVO item, Integer quantity, WmsInboundItemDO batch);
    /**
     * 更新库存货位库存量
     **/
    protected abstract WmsStockFlowDirection updateInboundItemQty(WmsOutboundRespVO outboundRespVO, WmsOutboundItemRespVO item, Long companyId, Long deptId, Long warehouseId, Long binId, Long productId, Integer quantity, Long outboundId, Long outboundItemId, WmsInboundItemDO batch);
    /**
     * 更新库存货位库存量
     **/
    protected abstract WmsStockFlowDirection updateStockLogicQty(WmsOutboundRespVO outboundRespVO, WmsStockLogicDO stockLogicDO, WmsOutboundItemRespVO item, Integer quantity, WmsInboundItemDO batch);
    /**
     * 更新库存货位库存量
     **/
    protected abstract WmsStockFlowDirection updateSingleStockBinQty(WmsStockBinDO stockBinDO, WmsOutboundItemRespVO item, Integer quantity, WmsInboundItemDO batch);

    /**
     * 更新出库单
     **/
    protected abstract void updateOutbound(WmsOutboundRespVO outboundRespVO);

    protected abstract void validateData(WmsOutboundItemRespVO item, Map<String, WmsInboundItemDO> deptIdCompanyIdMap);

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void execute(OutboundContext context) {

        WmsOutboundRespVO outboundRespVO = outboundService.getOutboundWithItemList(context.getOutboundId());
        Long warehouseId = outboundRespVO.getWarehouseId();

        List<WmsOutboundItemRespVO> itemList = outboundRespVO.getItemList();
        for (WmsOutboundItemRespVO item : itemList) {
            Long productId = item.getProductId();
            Long companyId = item.getCompanyId() != null ? item.getCompanyId() : outboundRespVO.getCompanyId();
            Long deptId = item.getDeptId() != null ? item.getDeptId() : outboundRespVO.getDeptId();

            Map<String, WmsInboundItemDO> deptIdCompanyIdMap = retrieveDeptIdCompanyIdMap(
                warehouseId, productId, companyId, deptId, item.getBinId()
            );

            if (deptIdCompanyIdMap.isEmpty()) {
                throw exception(INBOUND_ITEM_OUTBOUND_AVAILABLE_QTY_NOT_ENOUGH);
            }

            // 校验数据有效性（如库存是否足够）
            this.validateData(item, deptIdCompanyIdMap);
            //用于临时操纵数据
            WmsOutboundItemRespVO itemClone = BeanUtils.toBean(item, WmsOutboundItemRespVO.class);

            // 批次处理
            for (Map.Entry<String, WmsInboundItemDO> entry : deptIdCompanyIdMap.entrySet()) {
                if (itemClone.getPlanQty() <= 0) {
                    break;
                }

                WmsInboundItemDO batch = entry.getValue();
                Integer quantity = getExecuteQty(itemClone, batch);

                this.outboundSingleItem(outboundRespVO, itemClone, batch.getCompanyId(), batch.getDeptId(),
                    warehouseId, itemClone.getBinId(), productId, quantity, outboundRespVO.getId(), itemClone.getId(), batch
                );
            }

            updateOutbound(outboundRespVO);
        }

        // 完成最终出库
        outboundService.finishOutbound(outboundRespVO);

    }

    /**
     * 处理单个详情
     **/
    private void outboundSingleItem(WmsOutboundRespVO outboundRespVO, WmsOutboundItemRespVO item, Long companyId, Long deptId, Long warehouseId, Long binId, Long productId, Integer quantity, Long outboundId, Long outboundItemId, WmsInboundItemDO batch) {
        // 校验本方法在事务中
        JdbcUtils.requireTransaction();
        try {
            this.processItem(outboundRespVO, item, companyId, deptId, warehouseId, binId, productId, quantity, outboundId, outboundItemId, batch);
        } catch (Exception e) {
            log.error("outboundSingleItemTransactional Error", e);
            throw e;
        }
    }


    /**
     * 按不同的分类处理库存
     **/
    private void processItem(WmsOutboundRespVO outboundRespVO, WmsOutboundItemRespVO item, Long companyId, Long deptId, Long warehouseId, Long binId, Long productId, Integer quantity, Long outboundId, Long outboundItemId, WmsInboundItemDO batch) {

        //todo 创建库存流水日志列表
        this.processStockWarehouseItem(item, warehouseId, productId, quantity, outboundId, outboundItemId, batch);
        this.processInboundItem(outboundRespVO, item, companyId, deptId, warehouseId, binId, productId, quantity, outboundId, outboundItemId, batch);
        this.processStockLogicItem(outboundRespVO, item, companyId, deptId, warehouseId, productId, quantity, outboundId, outboundItemId, batch);
        this.processStockBinItem(item, binId, productId, quantity, outboundId, outboundItemId, batch);
        // 当前逻辑,默认全部出库
        outboundRespVO.setOutboundStatus(WmsOutboundStatus.ALL.getValue());
        //todo 批量插入日志
    }


    /**
     * 处理仓库库存
     **/
    private void processStockWarehouseItem(WmsOutboundItemRespVO item, Long warehouseId, Long productId, Integer quantity, Long outboundId, Long outboundItemId, WmsInboundItemDO batch) {
        // 校验本方法在事务中
        JdbcUtils.requireTransaction();
        // 获得仓库库存记录
        WmsStockWarehouseDO stockWarehouseDO = stockWarehouseService.getStockWarehouse(warehouseId, productId, false);

        WmsStockFlowDirection wmsStockFlowDirection;
        // 如果没有就创建
        if (stockWarehouseDO == null) {
            throw exception(STOCK_WAREHOUSE_NOT_EXISTS);
        } else {
            wmsStockFlowDirection = this.updateStockWarehouseQty(stockWarehouseDO, item, quantity, batch);
        }

        // 更新库存
        stockWarehouseService.insertOrUpdate(stockWarehouseDO);
        // 记录流水 todo 改为批量执行
        int beforeQty = stockWarehouseDO.getAvailableQty() == null ? ZERO : stockWarehouseDO.getAvailableQty();
        Integer afterQty = beforeQty + quantity * wmsStockFlowDirection.getValue();
        stockFlowService.createForStockWarehouse(this.getReason(), wmsStockFlowDirection, productId, stockWarehouseDO, quantity, outboundId, outboundItemId,
            beforeQty, afterQty, batch.getInboundId());
    }

    /**
     * 处理批次库存
     */
    private void processInboundItem(WmsOutboundRespVO outboundRespVO, WmsOutboundItemRespVO item, Long companyId, Long deptId, Long warehouseId, Long binId, Long productId, Integer quantity, Long outboundId, Long outboundItemId, WmsInboundItemDO batch) {
        // 校验本方法在事务中
        JdbcUtils.requireTransaction();
        WmsStockFlowDirection wmsStockFlowDirection;
        // 更新入库单明细
        wmsStockFlowDirection = this.updateInboundItemQty(outboundRespVO, item, companyId, deptId, warehouseId, binId, productId, quantity, outboundId, outboundItemId, batch);
        //保存
        inboundItemService.updateInboundItem(BeanUtils.toBean(batch, WmsInboundItemSaveReqVO.class));
        // 记录流水 todo 改为批量执行
        int beforeQty = batch.getOutboundAvailableQty() - quantity * wmsStockFlowDirection.getValue();
        Integer afterQty = batch.getOutboundAvailableQty();

        stockFlowService.createForInboundItem(this.getReason(), wmsStockFlowDirection, productId, batch, quantity, outboundId, outboundItemId,
            beforeQty, afterQty, batch.getInboundId(), warehouseId);

    }

    /**
     * 处理逻辑库存
     **/
    private void processStockLogicItem(WmsOutboundRespVO outboundRespVO, WmsOutboundItemRespVO item, Long companyId, Long deptId, Long warehouseId, Long productId, Integer quantity, Long outboundId, Long outboundItemId, WmsInboundItemDO batch) {

        // 校验本方法在事务中
        JdbcUtils.requireTransaction();
        // 查询库存记录
        WmsStockLogicDO stockLogicDO = stockLogicService.getByUkProductOwner(warehouseId, companyId, deptId, productId, false);
        WmsStockFlowDirection wmsStockFlowDirection;
        // 如果不存在抛出异常
        if (stockLogicDO == null) {
            throw exception(STOCK_LOGIC_NOT_EXISTS);
        } else { // 如果存在就修改
            wmsStockFlowDirection = this.updateStockLogicQty(outboundRespVO, stockLogicDO, item, quantity, batch);
        }
        // 保存
        stockLogicService.insertOrUpdate(stockLogicDO);
        // 记录流水
        int beforeQty = stockLogicDO.getAvailableQty() - stockLogicDO.getOutboundPendingQty() - quantity * wmsStockFlowDirection.getValue();
        Integer afterQty = beforeQty + quantity * wmsStockFlowDirection.getValue();
        stockFlowService.createForStockLogic(this.getReason(), wmsStockFlowDirection, productId, stockLogicDO, quantity, outboundId, outboundItemId, beforeQty, afterQty, batch.getInboundId());
    }


    /**
     * 处理仓位库存
     **/
    private void processStockBinItem(WmsOutboundItemRespVO item, Long binId, Long productId, Integer quantity, Long outboundId, Long outboundItemId, WmsInboundItemDO batch) {
        // 调整仓位库存
        JdbcUtils.requireTransaction();

        WmsStockBinDO stockBinDO = stockBinService.getStockBin(binId, productId, false);
        WmsStockFlowDirection wmsStockFlowDirection;
        // 如果不存在抛出异常
        if (stockBinDO == null) {
            throw exception(STOCK_BIN_NOT_EXISTS);
        } else {
            wmsStockFlowDirection = this.updateSingleStockBinQty(stockBinDO, item, quantity, batch);
        }
        // 保存
        stockBinService.insertOrUpdate(stockBinDO);
        // 记录流水
        Integer beforeQty = stockBinDO.getSellableQty() - quantity * wmsStockFlowDirection.getValue();
        Integer afterQty = stockBinDO.getSellableQty();
        stockFlowService.createForStockBin(this.getReason(), wmsStockFlowDirection, productId, stockBinDO, quantity, outboundId, outboundItemId, binId, beforeQty, afterQty, batch.getInboundId());
    }

    /**
     * 获取批次库存
     */
    private Map<String, WmsInboundItemDO> retrieveDeptIdCompanyIdMap(Long warehouseId, Long productId, Long companyId, Long deptId, Long binId) {
        //获取批次列表，然后根据可售数量判断取多个批次的库存
        List<WmsInboundItemDO> inboundItemLogicList = inboundService.getInboundItemLogicList(warehouseId, productId, deptId, companyId, binId, true);
        if (inboundItemLogicList == null) {
            throw exception(STOCK_LOGIC_NOT_EXISTS);
        }
        Map<String, WmsInboundItemDO> deptIdCompanyIdMap = new LinkedHashMap<>();
        for (WmsInboundItemDO inboundItemLogic : inboundItemLogicList) {
            String key = makeStockKey(inboundItemLogic);
            deptIdCompanyIdMap.put(key, inboundItemLogic);
        }
        return deptIdCompanyIdMap;
    }

    private String makeStockKey(WmsInboundItemDO inboundItemLogicDo) {
        return inboundItemLogicDo.getCompanyId() + "-" + inboundItemLogicDo.getDeptId() + "-" + inboundItemLogicDo.getInboundId();
    }

}
