package cn.iocoder.yudao.module.wms.service.quantity;

import cn.iocoder.yudao.framework.common.util.collection.StreamX;
import cn.iocoder.yudao.framework.common.util.object.BeanUtils;
import cn.iocoder.yudao.framework.mybatis.core.util.JdbcUtils;
import cn.iocoder.yudao.module.system.api.dept.DeptApi;
import cn.iocoder.yudao.module.system.api.dept.dto.DeptRespDTO;
import cn.iocoder.yudao.module.wms.controller.admin.inbound.item.vo.WmsInboundItemRespVO;
import cn.iocoder.yudao.module.wms.controller.admin.inbound.item.vo.WmsInboundItemSaveReqVO;
import cn.iocoder.yudao.module.wms.controller.admin.inbound.vo.WmsInboundRespVO;
import cn.iocoder.yudao.module.wms.controller.admin.inbound.vo.WmsInboundSaveReqVO;
import cn.iocoder.yudao.module.wms.controller.admin.outbound.item.vo.WmsOutboundItemRespVO;
import cn.iocoder.yudao.module.wms.controller.admin.outbound.item.vo.WmsOutboundItemSaveReqVO;
import cn.iocoder.yudao.module.wms.controller.admin.outbound.vo.WmsOutboundSaveReqVO;
import cn.iocoder.yudao.module.wms.controller.admin.pickup.item.vo.WmsPickupItemSaveReqVO;
import cn.iocoder.yudao.module.wms.controller.admin.pickup.vo.WmsPickupSaveReqVO;
import cn.iocoder.yudao.module.wms.controller.admin.product.WmsProductRespSimpleVO;
import cn.iocoder.yudao.module.wms.controller.admin.stock.bin.vo.WmsStockBinRespVO;
import cn.iocoder.yudao.module.wms.controller.admin.stock.warehouse.vo.WmsWarehouseProductVO;
import cn.iocoder.yudao.module.wms.dal.dataobject.inbound.WmsInboundDO;
import cn.iocoder.yudao.module.wms.dal.dataobject.inbound.item.WmsInboundItemOwnershipDO;
import cn.iocoder.yudao.module.wms.dal.dataobject.inventory.WmsInventoryDO;
import cn.iocoder.yudao.module.wms.dal.dataobject.inventory.bin.WmsInventoryBinDO;
import cn.iocoder.yudao.module.system.enums.somle.BillType;
import cn.iocoder.yudao.module.wms.enums.inbound.WmsInboundType;
import cn.iocoder.yudao.module.wms.enums.stock.WmsStockReason;
import cn.iocoder.yudao.module.wms.service.inbound.WmsInboundService;
import cn.iocoder.yudao.module.wms.service.outbound.WmsOutboundService;
import cn.iocoder.yudao.module.wms.service.outbound.item.WmsOutboundItemService;
import cn.iocoder.yudao.module.wms.service.pickup.WmsPickupService;
import cn.iocoder.yudao.module.wms.service.quantity.context.InventoryContext;
import cn.iocoder.yudao.module.wms.service.stock.bin.WmsStockBinService;
import cn.iocoder.yudao.module.wms.service.stock.bin.move.WmsStockBinMoveService;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static cn.iocoder.yudao.framework.common.exception.util.ServiceExceptionUtil.exception;
import static cn.iocoder.yudao.module.wms.enums.ErrorCodeConstants.STOCK_BIN_AVAILABLE_QTY_NOT_ENOUGH;
import static cn.iocoder.yudao.module.wms.enums.ErrorCodeConstants.STOCK_BIN_NOT_EXISTS;
import static cn.iocoder.yudao.module.wms.enums.ErrorCodeConstants.STOCK_BIN_SELLABLE_QTY_NOT_ENOUGH;

/**
 * @author: LeeFJ
 * @date: 2025/3/25 9:34
 * @description: 盘点数量执行器
 */
@Slf4j
@Component
public class InventoryExecutor extends QuantityExecutor<InventoryContext> {



    @Resource
    @Lazy
    private WmsStockBinService stockBinService;

    @Resource
    @Lazy
    private WmsStockBinMoveService stockBinMoveService;

    @Resource
    @Lazy
    private WmsInboundService inboundService;

    @Resource
    @Lazy
    private WmsPickupService pickupService;

    @Resource
    @Lazy
    private WmsOutboundService outboundService;

    @Resource
    @Lazy
    private WmsOutboundItemService outboundItemService;

    @Resource
    @Lazy
    private DeptApi deptApi;

    public InventoryExecutor() {
        super(WmsStockReason.STOCK_BIN_MOVE);
    }



    @Override
    public void execute(InventoryContext context) {

        // 确认在事务内
        JdbcUtils.requireTransaction();

        WmsInventoryDO inventoryDO = context.getInventoryDO();
        List<WmsInventoryBinDO> wmsInventoryBinDOList = context.getWmsInventoryBinDOList();

        // 入库单产品明细(按库位汇总)
        Map<Long, WmsInboundItemSaveReqVO> inboundItemSaveReqVOMap = new HashMap<>();
        // 拣货单产品明细
        List<WmsPickupItemSaveReqVO> pickupItemSaveReqVOList = new ArrayList<>();
        // 出库单产品明细
        List<WmsOutboundItemSaveReqVO> outboundItemSaveReqVOList = new ArrayList<>();

        // 循环盘点明细
        for (WmsInventoryBinDO inventoryBinDO : wmsInventoryBinDOList) {
            int deltaQty = inventoryBinDO.getActualQty() - inventoryBinDO.getExpectedQty();

            // 如果盘赢，形成入库单+拣货单
            if (deltaQty > 0) {

                // 入库单明细
                WmsInboundItemSaveReqVO inboundItemSaveReqVO = inboundItemSaveReqVOMap.computeIfAbsent(inventoryBinDO.getProductId(), productId -> {
                    WmsInboundItemSaveReqVO inboundItem = new WmsInboundItemSaveReqVO();
                    inboundItem.setActualQty(0);
                    inboundItem.setPlanQty(0);
                    inboundItem.setProductId(productId);
                    return inboundItem;
                });
                inboundItemSaveReqVO.setPlanQty(inboundItemSaveReqVO.getPlanQty() + deltaQty);
                inboundItemSaveReqVO.setActualQty(inboundItemSaveReqVO.getActualQty() + deltaQty);

                // 拣货单明细
                WmsPickupItemSaveReqVO pickupItemSaveReqVO = new WmsPickupItemSaveReqVO();
                pickupItemSaveReqVO.setProductId(inventoryBinDO.getProductId());
                pickupItemSaveReqVO.setQty(deltaQty);
                pickupItemSaveReqVO.setBinId(inventoryBinDO.getBinId());
                pickupItemSaveReqVOList.add(pickupItemSaveReqVO);
            }

            // 如果盘亏，形成出库单
            if (deltaQty < 0) {
                // 拣货单明细
                WmsOutboundItemSaveReqVO outboundItemSaveReqVO = new WmsOutboundItemSaveReqVO();
                outboundItemSaveReqVO.setProductId(inventoryBinDO.getProductId());
                outboundItemSaveReqVO.setPlanQty(Math.abs(deltaQty));
                outboundItemSaveReqVO.setActualQty(Math.abs(deltaQty));
                outboundItemSaveReqVO.setBinId(inventoryBinDO.getBinId());
                outboundItemSaveReqVOList.add(outboundItemSaveReqVO);

            }

        }

        // 如果有盘盈的货,执行入库和拣货
        if (!inboundItemSaveReqVOMap.isEmpty()) {
            executeInboundAndPickup(inventoryDO,new ArrayList<>(inboundItemSaveReqVOMap.values()),pickupItemSaveReqVOList);
        }

        // 如果有盘亏的货，执行出库
        if (!outboundItemSaveReqVOList.isEmpty()) {
            executeOutbound(inventoryDO,outboundItemSaveReqVOList);
        }


    }

    /**
     * 执行盘点入库并拣货上架
     **/
    private void executeInboundAndPickup(WmsInventoryDO inventoryDO, List<WmsInboundItemSaveReqVO> inboundItemSaveReqVOList, List<WmsPickupItemSaveReqVO> pickupItemSaveReqVOList) {

        // 确定归属公司与部门
        Map<Long,Long> deptIdMap=new HashMap<>();
        Map<Long, WmsInboundItemOwnershipDO> inboundItemOwnershipDOMap = new HashMap<>();
        //
        for (WmsInboundItemSaveReqVO inboundItemSaveReqVO : inboundItemSaveReqVOList) {

            WmsInboundItemOwnershipDO inboundItemOwnershipDO = inboundItemOwnershipDOMap.get(inboundItemSaveReqVO.getProductId());
            if(inboundItemOwnershipDO==null) {
                // 求最晚的入库批次
                inboundItemOwnershipDO = inboundService.getInboundItemOwnership(inventoryDO.getWarehouseId(), inboundItemSaveReqVO.getProductId(), false);
                inboundItemOwnershipDOMap.put(inboundItemSaveReqVO.getProductId(),inboundItemOwnershipDO);
            }
            // 求顶级部门
            Long deptId=deptIdMap.get(inboundItemOwnershipDO.getInboundDeptId());
            if(deptId==null) {

                DeptRespDTO dept = deptApi.getDept(inboundItemOwnershipDO.getInboundDeptId());
                int deptLevel = deptApi.getDeptLevel(dept.getId());
                while (deptLevel > 2) {
                    dept = deptApi.getDept(dept.getParentId());
                    deptLevel = deptApi.getDeptLevel(dept.getId());
                }
                deptId = dept.getId();
                deptIdMap.put(inboundItemOwnershipDO.getInboundDeptId(),deptId);
            }

            // 确定公司ID和部门ID
            inboundItemSaveReqVO.setCompanyId(inboundItemOwnershipDO.getInboundCompanyId());
            inboundItemSaveReqVO.setDeptId(deptId);

        }

        // 创建入库单
        WmsInboundSaveReqVO inboundSaveReqVO = new WmsInboundSaveReqVO();
        inboundSaveReqVO.setWarehouseId(inventoryDO.getWarehouseId());
        inboundSaveReqVO.setItemList(inboundItemSaveReqVOList);
        inboundSaveReqVO.setUpstreamBillId(inventoryDO.getId());
        inboundSaveReqVO.setUpstreamBillCode(inventoryDO.getCode());
        inboundSaveReqVO.setUpstreamBillType(BillType.WMS_INVENTORY.getValue());
        inboundSaveReqVO.setType(WmsInboundType.INVENTORY.getValue());

        // 执行入库
        WmsInboundDO inboundDO = inboundService.createForInventory(inboundSaveReqVO);

        // 建立入库单与拣货单的对应关系
        WmsInboundRespVO inbound = inboundService.getInboundWithItemList(inboundDO.getId());
        Map<Long, WmsInboundItemRespVO> wmsInboundItemMap= StreamX.from(inbound.getItemList()).toMap(WmsInboundItemRespVO::getProductId);
        StreamX.from(pickupItemSaveReqVOList).assemble(wmsInboundItemMap,WmsPickupItemSaveReqVO::getProductId,(saveReqVO,item)->{
            saveReqVO.setInboundId(inboundDO.getId());
            saveReqVO.setInboundItemId(item.getId());
        });
        // 创建拣货单
        WmsPickupSaveReqVO pickupSaveReqVO = new WmsPickupSaveReqVO();
        pickupSaveReqVO.setWarehouseId(inventoryDO.getWarehouseId());
        pickupSaveReqVO.setItemList(pickupItemSaveReqVOList);
        pickupSaveReqVO.setUpstreamBillId(inventoryDO.getId());
        pickupSaveReqVO.setUpstreamBillCode(inventoryDO.getCode());
        pickupSaveReqVO.setUpstreamBillType(BillType.WMS_INVENTORY.getValue());
        // 执行拣货
        pickupService.createForInventory(pickupSaveReqVO);

    }

    /**
     * 执行盘点出库
     **/
    private void executeOutbound(WmsInventoryDO inventoryDO, List<WmsOutboundItemSaveReqVO> outboundItemSaveReqVOList) {

        List<WmsOutboundItemRespVO> outboundItemRespVOList = BeanUtils.toBean(outboundItemSaveReqVOList, WmsOutboundItemRespVO.class);
        outboundItemRespVOList = StreamX.from(outboundItemRespVOList).distinct(WmsOutboundItemRespVO::getProductId);
        outboundItemService.assembleProducts(outboundItemRespVOList);
        Map<Long, WmsProductRespSimpleVO> productMap = StreamX.from(outboundItemRespVOList).toMap(WmsOutboundItemRespVO::getProductId,WmsOutboundItemRespVO::getProduct);

        List<WmsWarehouseProductVO> wmsWarehouseProductList =  new ArrayList<>();
        for (WmsOutboundItemSaveReqVO wmsWarehouseProductVO : outboundItemSaveReqVOList) {
            wmsWarehouseProductList.add(WmsWarehouseProductVO.builder().warehouseId(inventoryDO.getWarehouseId()).productId(wmsWarehouseProductVO.getProductId()).build());
        }

        List<WmsStockBinRespVO> stockBinList = stockBinService.selectStockBinList(wmsWarehouseProductList, true);
        Map<String, WmsStockBinRespVO> stockBinMap = StreamX.from(stockBinList).toMap(e -> makeStockKey(e.getBinId(), e.getProductId()));

        // 确定归属公司与部门
        Map<Long, WmsInboundItemOwnershipDO> inboundItemOwnershipDOMap = new HashMap<>();
        for (WmsOutboundItemSaveReqVO outboundItemSaveReqVO : outboundItemSaveReqVOList) {

            WmsProductRespSimpleVO product = productMap.get(outboundItemSaveReqVO.getProductId());

            WmsStockBinRespVO stockBin = stockBinMap.get(makeStockKey(outboundItemSaveReqVO.getBinId(), outboundItemSaveReqVO.getProductId()));
            if(stockBin==null) {
                throw exception(STOCK_BIN_NOT_EXISTS);
            }

            // 检查可用库存
            if(outboundItemSaveReqVO.getPlanQty() > stockBin.getAvailableQty()) {
                throw exception(STOCK_BIN_AVAILABLE_QTY_NOT_ENOUGH,stockBin.getBin().getName(),product.getBarCode());
            }
            // 检查可用库存
            if(outboundItemSaveReqVO.getPlanQty() > stockBin.getSellableQty()) {
                throw exception(STOCK_BIN_SELLABLE_QTY_NOT_ENOUGH,stockBin.getBin().getName(),product.getBarCode());
            }




            WmsInboundItemOwnershipDO inboundItemOwnershipDO = inboundItemOwnershipDOMap.get(outboundItemSaveReqVO.getProductId());
            if(inboundItemOwnershipDO==null) {
                // 求最早的入库批次
                inboundItemOwnershipDO = inboundService.getInboundItemOwnership(inventoryDO.getWarehouseId(), outboundItemSaveReqVO.getProductId(), true);
                inboundItemOwnershipDOMap.put(outboundItemSaveReqVO.getProductId(),inboundItemOwnershipDO);
            }

            outboundItemSaveReqVO.setCompanyId(inboundItemOwnershipDO.getInboundCompanyId());
            outboundItemSaveReqVO.setDeptId(inboundItemOwnershipDO.getInboundDeptId());
        }

        // 创建出库单
        WmsOutboundSaveReqVO outboundSaveReqVO = new WmsOutboundSaveReqVO();
        outboundSaveReqVO.setWarehouseId(inventoryDO.getWarehouseId());
        outboundSaveReqVO.setItemList(outboundItemSaveReqVOList);
        outboundSaveReqVO.setUpstreamBillId(inventoryDO.getId());
        outboundSaveReqVO.setUpstreamBillCode(inventoryDO.getCode());
        outboundSaveReqVO.setUpstreamBillType(BillType.WMS_INVENTORY.getValue());



        // 执行出库
        outboundService.createForInventory(outboundSaveReqVO);

    }

    private String makeStockKey(Long binId, Long productId) {
        return binId + "_" + productId;
    }


}
