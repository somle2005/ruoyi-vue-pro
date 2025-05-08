package cn.iocoder.yudao.module.wms.service.inventory;

import cn.iocoder.yudao.framework.cola.statemachine.StateMachine;
import cn.iocoder.yudao.framework.cola.statemachine.builder.TransitionContext;
import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.common.util.collection.CollectionUtils;
import cn.iocoder.yudao.framework.common.util.collection.StreamX;
import cn.iocoder.yudao.framework.common.util.object.BeanUtils;
import cn.iocoder.yudao.module.erp.api.product.ErpProductApi;
import cn.iocoder.yudao.module.erp.api.product.dto.ErpProductDTO;
import cn.iocoder.yudao.module.system.enums.somle.BillType;
import cn.iocoder.yudao.module.wms.config.InventoryStateMachineConfigure;
import cn.iocoder.yudao.module.wms.controller.admin.approval.history.vo.WmsApprovalHistoryRespVO;
import cn.iocoder.yudao.module.wms.controller.admin.approval.history.vo.WmsApprovalReqVO;
import cn.iocoder.yudao.module.wms.controller.admin.inventory.bin.vo.WmsInventoryProductExcelVO;
import cn.iocoder.yudao.module.wms.controller.admin.inventory.vo.WmsInventoryPageReqVO;
import cn.iocoder.yudao.module.wms.controller.admin.inventory.vo.WmsInventoryRespVO;
import cn.iocoder.yudao.module.wms.controller.admin.inventory.vo.WmsInventorySaveReqVO;
import cn.iocoder.yudao.module.wms.controller.admin.stock.bin.vo.WmsStockBinRespVO;
import cn.iocoder.yudao.module.wms.controller.admin.stock.warehouse.vo.WmsWarehouseProductVO;
import cn.iocoder.yudao.module.wms.controller.admin.warehouse.vo.WmsWarehouseSimpleRespVO;
import cn.iocoder.yudao.module.wms.dal.dataobject.inventory.WmsInventoryDO;
import cn.iocoder.yudao.module.wms.dal.dataobject.inventory.bin.WmsInventoryBinDO;
import cn.iocoder.yudao.module.wms.dal.dataobject.warehouse.WmsWarehouseDO;
import cn.iocoder.yudao.module.wms.dal.mysql.inventory.WmsInventoryMapper;
import cn.iocoder.yudao.module.wms.dal.mysql.inventory.bin.WmsInventoryBinMapper;
import cn.iocoder.yudao.module.wms.dal.redis.no.WmsNoRedisDAO;
import cn.iocoder.yudao.module.wms.enums.WmsConstants;
import cn.iocoder.yudao.module.wms.enums.inventory.WmsInventoryAuditStatus;
import cn.iocoder.yudao.module.wms.enums.outbound.WmsOutboundAuditStatus;
import cn.iocoder.yudao.module.wms.service.approval.history.WmsApprovalHistoryService;
import cn.iocoder.yudao.module.wms.service.stock.bin.WmsStockBinService;
import cn.iocoder.yudao.module.wms.service.stock.warehouse.WmsStockWarehouseService;
import cn.iocoder.yudao.module.wms.service.warehouse.WmsWarehouseService;
import jakarta.annotation.Resource;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

import static cn.iocoder.yudao.framework.common.exception.util.ServiceExceptionUtil.exception;
import static cn.iocoder.yudao.module.wms.enums.ErrorCodeConstants.INVENTORY_BIN_DUPLICATE;
import static cn.iocoder.yudao.module.wms.enums.ErrorCodeConstants.INVENTORY_CAN_NOT_DELETE;
import static cn.iocoder.yudao.module.wms.enums.ErrorCodeConstants.INVENTORY_CAN_NOT_EDIT;
import static cn.iocoder.yudao.module.wms.enums.ErrorCodeConstants.INVENTORY_NOT_EXISTS;
import static cn.iocoder.yudao.module.wms.enums.ErrorCodeConstants.INVENTORY_NO_DUPLICATE;

/**
 * 盘点 Service 实现类
 *
 * @author 李方捷
 */
@Service
@Validated
public class WmsInventoryServiceImpl implements WmsInventoryService {

    @Resource
    @Lazy
    private WmsInventoryBinMapper inventoryBinMapper;


    @Resource
    private WmsNoRedisDAO noRedisDAO;

    @Resource
    private WmsInventoryMapper inventoryMapper;

    @Resource
    private WmsStockWarehouseService stockWarehouseService;

    @Resource
    private WmsStockBinService stockBinService;

    @Resource
    @Lazy
    private WmsWarehouseService warehouseService;

    @Resource
    private WmsApprovalHistoryService approvalHistoryService;

    @Resource
    private ErpProductApi productApi;

    @Resource(name = InventoryStateMachineConfigure.STATE_MACHINE_NAME)
    private StateMachine<Integer, WmsInventoryAuditStatus.Event, TransitionContext<WmsInventoryDO>> inventoryStateMachine;

    /**
     * @sign : A9D51C9E0E654C80
     */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public WmsInventoryDO createInventory(WmsInventorySaveReqVO createReqVO) {
        // 设置单据号等初始值
        String no = noRedisDAO.generate(WmsNoRedisDAO.INVENTORY_NO_PREFIX, 3);
        createReqVO.setCode(no);
        createReqVO.setAuditStatus(WmsInventoryAuditStatus.DRAFT.getValue());
        // 
        if (inventoryMapper.getByNo(createReqVO.getCode()) != null) {
            throw exception(INVENTORY_NO_DUPLICATE);
        }
        // 插入
        WmsInventoryDO inventory = BeanUtils.toBean(createReqVO, WmsInventoryDO.class);
        inventoryMapper.insert(inventory);
        // 保存库存盘点产品详情
        List<WmsInventoryBinDO> toInsetList = new ArrayList<>();
        Set<String> keys = new HashSet<>();
        if (createReqVO.getBinItemList() != null) {
            StreamX.from(createReqVO.getBinItemList()).filter(Objects::nonNull).forEach(item -> {
                keys.add(item.getProductId()+"-"+item.getBinId());
                WmsInventoryBinDO inventoryBinDO = BeanUtils.toBean(item, WmsInventoryBinDO.class);
                inventoryBinDO.setId(null);
                // 设置归属
                inventoryBinDO.setInventoryId(inventory.getId());
                inventoryBinDO.setActualQty(0);
                toInsetList.add(inventoryBinDO);
            });
            // 校验
            if (keys.size()!= toInsetList.size()) {
                throw exception(INVENTORY_BIN_DUPLICATE);
            }
            inventoryBinMapper.insertBatch(toInsetList);
        }
        // 返回
        return inventory;
    }


    /**
     * @sign : 2710B20EC7D9E031
     */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public WmsInventoryDO updateInventory(WmsInventorySaveReqVO updateReqVO) {
        // 校验存在
        WmsInventoryDO exists = validateInventoryExists(updateReqVO.getId());
        // 校验可否编辑
        WmsInventoryAuditStatus inventoryAuditStatus = WmsInventoryAuditStatus.parse(exists.getAuditStatus());
        if (inventoryAuditStatus.matchAny(WmsInventoryAuditStatus.AUDITING, WmsInventoryAuditStatus.PASS)) {
            throw exception(INVENTORY_CAN_NOT_EDIT);
        }
        // 单据号不允许被修改
        updateReqVO.setCode(exists.getCode());

        // 全部删除
        List<WmsInventoryBinDO> inventoryBinDOList = inventoryBinMapper.selectByInventoryId(updateReqVO.getId());
        for (WmsInventoryBinDO inventoryBinDO : inventoryBinDOList) {
            inventoryBinMapper.deleteAbsoluteById(inventoryBinDO.getId());
        }

        // 保存库存盘点产品详情
        List<WmsInventoryBinDO> toInsetList = new ArrayList<>();
        Set<String> keys = new HashSet<>();
        if (updateReqVO.getBinItemList() != null) {
            StreamX.from(updateReqVO.getBinItemList()).filter(Objects::nonNull).forEach(item -> {
                keys.add(item.getProductId()+"-"+item.getBinId());
                WmsInventoryBinDO inventoryBinDO = BeanUtils.toBean(item, WmsInventoryBinDO.class);
                inventoryBinDO.setId(null);
                // 设置归属
                inventoryBinDO.setInventoryId(exists.getId());
                inventoryBinDO.setActualQty(0);
                toInsetList.add(inventoryBinDO);
            });
            // 校验
            if (keys.size()!= toInsetList.size()) {
                throw exception(INVENTORY_BIN_DUPLICATE);
            }
            inventoryBinMapper.insertBatch(toInsetList);
        }
        // 更新
        WmsInventoryDO inventory = BeanUtils.toBean(updateReqVO, WmsInventoryDO.class);
        inventoryMapper.updateById(inventory);
        // 返回
        return inventory;
    }

    /**
     * @sign : 159065E285D50040
     */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public void deleteInventory(Long id) {
        // 校验存在
        WmsInventoryDO inventory = validateInventoryExists(id);
        // 校验可否编辑
        WmsInventoryAuditStatus inventoryAuditStatus = WmsInventoryAuditStatus.parse(inventory.getAuditStatus());
        if (inventoryAuditStatus.matchAny(WmsInventoryAuditStatus.AUDITING, WmsInventoryAuditStatus.PASS)) {
            throw exception(INVENTORY_CAN_NOT_DELETE);
        }
        // 唯一索引去重
        inventory.setCode(inventoryMapper.flagUKeyAsLogicDelete(inventory.getCode()));
        inventoryMapper.updateById(inventory);
        // 删除
        inventoryMapper.deleteById(id);
    }

    /**
     * @sign : CCF673C00F6357F0
     */
    public WmsInventoryDO validateInventoryExists(Long id) {
        WmsInventoryDO inventory = inventoryMapper.selectById(id);
        if (inventory == null) {
            throw exception(INVENTORY_NOT_EXISTS);
        }
        return inventory;
    }

    @Override
    public WmsInventoryDO getInventory(Long id) {
        return inventoryMapper.selectById(id);
    }

    @Override
    public PageResult<WmsInventoryDO> getInventoryPage(WmsInventoryPageReqVO pageReqVO) {
        return inventoryMapper.selectPage(pageReqVO);
    }

    /**
     * 按 ID 集合查询 WmsInventoryDO
     */
    public List<WmsInventoryDO> selectByIds(List<Long> idList) {
        if (CollectionUtils.isEmpty(idList)) {
            return List.of();
        }
        return inventoryMapper.selectByIds(idList);
    }

    @Override
    public void assembleWarehouse(List<WmsInventoryRespVO> list) {
        Map<Long, WmsWarehouseDO> warehouseDOMap = warehouseService.getWarehouseMap(StreamX.from(list).toSet(WmsInventoryRespVO::getWarehouseId));
        Map<Long, WmsWarehouseSimpleRespVO> warehouseVOMap = StreamX.from(warehouseDOMap.values()).toMap(WmsWarehouseDO::getId, v -> BeanUtils.toBean(v, WmsWarehouseSimpleRespVO.class));
        StreamX.from(list).assemble(warehouseVOMap, WmsInventoryRespVO::getWarehouseId, WmsInventoryRespVO::setWarehouse);
    }

    @Override
    public WmsInventoryDO updateOutboundAuditStatus(Long id, Integer status) {
        WmsInventoryDO inventoryDO = validateInventoryExists(id);
        inventoryDO.setAuditStatus(status);
        inventoryMapper.updateById(inventoryDO);
        return inventoryDO;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void approve(WmsInventoryAuditStatus.Event event, WmsApprovalReqVO approvalReqVO) {
        // 设置业务默认值
        approvalReqVO.setBillType(BillType.WMS_INVENTORY.getValue());
        approvalReqVO.setStatusType(WmsOutboundAuditStatus.getType());
        // 获得业务对象
        WmsInventoryDO inventoryDO = validateInventoryExists(approvalReqVO.getBillId());
        TransitionContext<WmsInventoryDO> ctx = TransitionContext.from(inventoryDO);
        ctx.setExtra(WmsConstants.APPROVAL_REQ_VO_KEY, approvalReqVO);
        // 触发事件
        inventoryStateMachine.fireEvent(event, ctx);
    }

    /**
     * 装配审批历史信息
     *
     * @param list 入库单集合
     */
    @Override
    public void assembleApprovalHistory(List<WmsInventoryRespVO> list) {
        Map<Long, List<WmsApprovalHistoryRespVO>> groupedApprovalHistory = approvalHistoryService.selectGroupedApprovalHistory(BillType.WMS_INVENTORY, StreamX.from(list).toList(WmsInventoryRespVO::getId));
        StreamX.from(list).assemble(groupedApprovalHistory, WmsInventoryRespVO::getId, WmsInventoryRespVO::setApprovalHistoryList);
    }

    @Override
    public List<WmsStockBinRespVO> parseProductExcel(WmsWarehouseDO wmsWarehouseDO, List<WmsInventoryProductExcelVO> impVOList) {

        Map<String, ErpProductDTO> productMapByCode = productApi.getProductMapByCode(StreamX.from(impVOList).toSet(WmsInventoryProductExcelVO::getProductCode));
        StreamX.from(impVOList).assemble(productMapByCode, WmsInventoryProductExcelVO::getProductCode, (p,v)->{
            if (v != null) {
                p.setProductId(v.getId());
            }
        });

        List<WmsWarehouseProductVO> wmsWarehouseProductVOS = new ArrayList<>();
        for (WmsInventoryProductExcelVO excelVO : impVOList) {
             wmsWarehouseProductVOS.add(WmsWarehouseProductVO.builder().productId(excelVO.getProductId()).warehouseId(wmsWarehouseDO.getId()).build());
        }

        return stockBinService.selectStockBinList(wmsWarehouseProductVOS, true);

    }
}
