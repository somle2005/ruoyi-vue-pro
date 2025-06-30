package cn.iocoder.yudao.module.wms.service.quantity;

import cn.iocoder.yudao.framework.mybatis.core.util.JdbcUtils;
import cn.iocoder.yudao.module.wms.controller.admin.outbound.item.vo.WmsOutboundItemRespVO;
import cn.iocoder.yudao.module.wms.controller.admin.outbound.vo.WmsOutboundRespVO;
import cn.iocoder.yudao.module.wms.controller.admin.stock.flow.vo.WmsStockFlowRespVO;
import cn.iocoder.yudao.module.wms.dal.dataobject.inbound.item.WmsInboundItemDO;
import cn.iocoder.yudao.module.wms.dal.dataobject.stock.bin.WmsStockBinDO;
import cn.iocoder.yudao.module.wms.dal.dataobject.stock.logic.WmsStockLogicDO;
import cn.iocoder.yudao.module.wms.dal.dataobject.stock.warehouse.WmsStockWarehouseDO;
import cn.iocoder.yudao.module.wms.enums.outbound.WmsOutboundStatus;
import cn.iocoder.yudao.module.wms.enums.stock.WmsStockFlowDirection;
import cn.iocoder.yudao.module.wms.enums.stock.WmsStockReason;
import cn.iocoder.yudao.module.wms.enums.stock.WmsStockType;
import cn.iocoder.yudao.module.wms.service.stock.flow.WmsStockFlowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

import static cn.iocoder.yudao.framework.common.exception.util.ServiceExceptionUtil.exception;
import static cn.iocoder.yudao.module.wms.enums.WmsErrorCodeConstants.*;

/**
 * @author: LeeFJ
 * @date: 2025/3/25 13:15
 * @description:
 */

@Component
public class OutboundFinishExecutor extends OutboundExecutor {

    @Autowired
    private WmsStockFlowService wmsStockFlowService;

    public OutboundFinishExecutor() {
        super(WmsStockReason.OUTBOUND_FINISH);
    }

    @Override
    protected Integer getExecuteQty(WmsOutboundItemRespVO itemClone, WmsInboundItemDO batch) {
        // 取消原先的计划入库量，加上本次的实际入库量
        Integer quantity = itemClone.getActualQty() - itemClone.getPlanQty();
        Integer deltaQty = Math.min(batch.getOutboundAvailableQty(), itemClone.getActualQty());
        //扣减本批次的出库变化数量
        itemClone.setPlanQty(itemClone.getPlanQty() - deltaQty);
        itemClone.setActualQty(itemClone.getActualQty() - deltaQty);
        return quantity;
    }

    /**
     * 更新仓库库存
     */
    @Override
    protected WmsStockFlowDirection updateStockWarehouseQty(WmsStockWarehouseDO stockWarehouseDO, WmsOutboundItemRespVO item, Integer quantity, WmsInboundItemDO batch) {

        // 校验本方法在事务中
        JdbcUtils.requireTransaction();

        WmsStockFlowRespVO flow = wmsStockFlowService.selectByInboundIdAndStockType(batch.getInboundId(), WmsStockType.WAREHOUSE.getValue(), WmsStockReason.OUTBOUND_SUBMIT.getValue(), item.getOutboundId());
        Integer actualQty = flow.getDeltaQty();

        // 可用量
        stockWarehouseDO.setAvailableQty(stockWarehouseDO.getAvailableQty() - actualQty);
        if(stockWarehouseDO.getAvailableQty()<0) {
            throw exception(STOCK_WAREHOUSE_NOT_ENOUGH);
        }
        // 可售量
        stockWarehouseDO.setSellableQty(stockWarehouseDO.getSellableQty() - quantity);
        if(stockWarehouseDO.getSellableQty()<0) {
            throw exception(STOCK_WAREHOUSE_NOT_ENOUGH);
        }
        // 待出库量
        stockWarehouseDO.setOutboundPendingQty(stockWarehouseDO.getOutboundPendingQty() - actualQty);
        if(stockWarehouseDO.getOutboundPendingQty()<0) {
            throw exception(STOCK_WAREHOUSE_NOT_ENOUGH);
        }

        return WmsStockFlowDirection.OUT;
    }

    /**
     * 更新入库单库存
     */
    @Override
    protected WmsStockFlowDirection updateInboundItemQty(WmsOutboundRespVO outboundRespVO, WmsOutboundItemRespVO item, Long companyId, Long deptId, Long warehouseId, Long binId, Long productId, Integer quantity, Long outboundId, Long outboundItemId, WmsInboundItemDO batch) {
        WmsStockFlowRespVO flow = wmsStockFlowService.selectByInboundIdAndStockType(batch.getInboundId(), WmsStockType.BIN.getValue(), WmsStockReason.OUTBOUND_SUBMIT.getValue(), outboundRespVO.getId());
        Integer actualQty = flow.getDeltaQty();
        //出库可用量
        batch.setOutboundAvailableQty(batch.getOutboundAvailableQty() - actualQty);
        if (batch.getOutboundAvailableQty() < 0) {
            throw exception(INBOUND_ITEM_OUTBOUND_AVAILABLE_QTY_NOT_ENOUGH);
        }

        return WmsStockFlowDirection.OUT;

    }

    /**
     * 更新逻辑库存
     **/
    @Override
    protected WmsStockFlowDirection updateStockLogicQty(WmsOutboundRespVO outboundRespVO, WmsStockLogicDO stockLogicDO, WmsOutboundItemRespVO item, Integer quantity, WmsInboundItemDO batch) {
        WmsStockFlowRespVO flow = wmsStockFlowService.selectByInboundIdAndStockType(batch.getInboundId(), WmsStockType.LOGIC.getValue(), WmsStockReason.OUTBOUND_SUBMIT.getValue(), outboundRespVO.getId());
        Integer actualQty = flow.getDeltaQty();

        // 可用量
        stockLogicDO.setAvailableQty(stockLogicDO.getAvailableQty() - actualQty);
        if (stockLogicDO.getAvailableQty() < 0) {
            throw exception(STOCK_LOGIC_NOT_ENOUGH);
        }
        // 待出库量
        stockLogicDO.setOutboundPendingQty(stockLogicDO.getOutboundPendingQty() - actualQty);
        if (stockLogicDO.getOutboundPendingQty() < 0) {
            throw exception(STOCK_LOGIC_NOT_ENOUGH);
        }
        return WmsStockFlowDirection.OUT;
    }

    /**
     * 更新库存货位
     **/
    @Override
    protected WmsStockFlowDirection updateSingleStockBinQty(WmsStockBinDO stockBinDO, WmsOutboundItemRespVO item, Integer quantity, WmsInboundItemDO batch) {
        WmsStockFlowRespVO flow = wmsStockFlowService.selectByInboundIdAndStockType(batch.getInboundId(), WmsStockType.BIN.getValue(), WmsStockReason.OUTBOUND_SUBMIT.getValue(), item.getOutboundId());
        Integer actualQty = flow.getDeltaQty();
        // 可用库存
        stockBinDO.setAvailableQty(stockBinDO.getAvailableQty() - actualQty);
        if(stockBinDO.getAvailableQty()<0) {
            throw exception(STOCK_BIN_NOT_ENOUGH);
        }
        // 可售库存
        stockBinDO.setSellableQty(stockBinDO.getSellableQty() - quantity);
        if(stockBinDO.getSellableQty()<0) {
            throw exception(STOCK_BIN_NOT_ENOUGH);
        }
        // 待出库量
        stockBinDO.setOutboundPendingQty(stockBinDO.getOutboundPendingQty() - actualQty);
        if(stockBinDO.getOutboundPendingQty()<0) {
            throw exception(STOCK_BIN_NOT_ENOUGH);
        }
        return WmsStockFlowDirection.OUT;
    }

    /**
     * 更新出库单
     **/
    @Override
    protected void updateOutbound(WmsOutboundRespVO outboundRespVO) {
        List<WmsOutboundItemRespVO> itemRespVOList=outboundRespVO.getItemList();
        for (WmsOutboundItemRespVO itemRespVO : itemRespVOList) {
            itemRespVO.setOutboundStatus(WmsOutboundStatus.ALL.getValue());
        }
        outboundRespVO.setOutboundStatus(WmsOutboundStatus.ALL.getValue());
        outboundRespVO.setOutboundTime(LocalDateTime.now());
    }

    @Override
    protected void validateData(WmsOutboundItemRespVO item, Map<String, WmsInboundItemDO> deptIdCompanyIdMap) {
    }


}
