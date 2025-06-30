package cn.iocoder.yudao.module.wms.service.quantity;

import cn.iocoder.yudao.module.wms.controller.admin.outbound.item.vo.WmsOutboundItemRespVO;
import cn.iocoder.yudao.module.wms.controller.admin.outbound.vo.WmsOutboundRespVO;
import cn.iocoder.yudao.module.wms.dal.dataobject.inbound.item.WmsInboundItemDO;
import cn.iocoder.yudao.module.wms.dal.dataobject.stock.bin.WmsStockBinDO;
import cn.iocoder.yudao.module.wms.dal.dataobject.stock.logic.WmsStockLogicDO;
import cn.iocoder.yudao.module.wms.dal.dataobject.stock.warehouse.WmsStockWarehouseDO;
import cn.iocoder.yudao.module.wms.enums.outbound.WmsOutboundStatus;
import cn.iocoder.yudao.module.wms.enums.stock.WmsStockFlowDirection;
import cn.iocoder.yudao.module.wms.enums.stock.WmsStockReason;
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
public class OutboundRejectExecutor extends OutboundExecutor {

    public OutboundRejectExecutor() {
        super(WmsStockReason.OUTBOUND_REJECT);
    }

    @Override
    protected Integer getExecuteQty(WmsOutboundItemRespVO item, WmsInboundItemDO batch) {
        Integer quantity = Math.min(item.getPlanQty(), batch.getOutboundAvailableQty());
        item.setPlanQty(item.getPlanQty() - quantity);
        return quantity;
    }

    /**
     * 更新仓库库存
     **/
    @Override
    protected WmsStockFlowDirection updateStockWarehouseQty(WmsStockWarehouseDO stockWarehouseDO, WmsOutboundItemRespVO item, Integer quantity, WmsInboundItemDO batch) {
        // 可售量
        stockWarehouseDO.setSellableQty(stockWarehouseDO.getSellableQty() + quantity);
        // 待出库量
        stockWarehouseDO.setOutboundPendingQty(stockWarehouseDO.getOutboundPendingQty() - quantity);
        if (stockWarehouseDO.getOutboundPendingQty() < 0) {
            throw exception(STOCK_WAREHOUSE_NOT_ENOUGH);
        }

        return WmsStockFlowDirection.IN;
    }

    /**
     * 更新入库单明细
     **/
    @Override
    protected WmsStockFlowDirection updateInboundItemQty(WmsOutboundRespVO outboundRespVO, WmsOutboundItemRespVO item, Long companyId, Long deptId, Long warehouseId, Long binId, Long productId, Integer quantity, Long outboundId, Long outboundItemId, WmsInboundItemDO batch) {

//        //出库可用量
//        batch.setOutboundAvailableQty(batch.getOutboundAvailableQty() + quantity);
//        if( batch.getOutboundAvailableQty() < 0) {
//            throw exception(INBOUND_ITEM_OUTBOUND_AVAILABLE_QTY_NOT_ENOUGH);
//        }

        return WmsStockFlowDirection.IN;

    }

    /**
     * 更新逻辑库存
     **/
    @Override
    protected WmsStockFlowDirection updateStockLogicQty(WmsOutboundRespVO outboundRespVO, WmsStockLogicDO stockLogicDO, WmsOutboundItemRespVO item, Integer quantity, WmsInboundItemDO batch) {
        // 待出库量
        stockLogicDO.setOutboundPendingQty(stockLogicDO.getOutboundPendingQty() - quantity);
        if (stockLogicDO.getOutboundPendingQty() < 0) {
            throw exception(STOCK_LOGIC_NOT_ENOUGH);
        }
        return WmsStockFlowDirection.IN;
    }

    /**
     * 更新库存货位
     **/
    @Override
    protected WmsStockFlowDirection updateSingleStockBinQty(WmsStockBinDO stockBinDO, WmsOutboundItemRespVO item, Integer quantity, WmsInboundItemDO batch) {
        // 可售库存
        stockBinDO.setSellableQty(stockBinDO.getSellableQty() + quantity);
        // 待出库量
        stockBinDO.setOutboundPendingQty(stockBinDO.getOutboundPendingQty() - quantity);
        if (stockBinDO.getOutboundPendingQty() < 0) {
            throw exception(STOCK_BIN_NOT_ENOUGH);
        }

        return WmsStockFlowDirection.IN;
    }

    /**
     * 更新出库单
     **/
    @Override
    protected void updateOutbound(WmsOutboundRespVO outboundRespVO) {
        List<WmsOutboundItemRespVO> itemRespVOList=outboundRespVO.getItemList();
        for (WmsOutboundItemRespVO itemRespVO : itemRespVOList) {
            itemRespVO.setOutboundStatus(WmsOutboundStatus.NONE.getValue());
        }
        outboundRespVO.setOutboundStatus(WmsOutboundStatus.NONE.getValue());
        outboundRespVO.setOutboundTime(LocalDateTime.now());
    }

    @Override
    protected void validateData(WmsOutboundItemRespVO item, Map<String, WmsInboundItemDO> deptIdCompanyIdMap) {

    }

}
