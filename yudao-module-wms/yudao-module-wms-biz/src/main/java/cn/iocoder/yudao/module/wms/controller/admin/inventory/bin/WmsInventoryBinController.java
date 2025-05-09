package cn.iocoder.yudao.module.wms.controller.admin.inventory.bin;

import cn.iocoder.yudao.framework.apilog.core.annotation.ApiAccessLog;
import cn.iocoder.yudao.framework.common.pojo.CommonResult;
import cn.iocoder.yudao.framework.common.pojo.PageParam;
import cn.iocoder.yudao.framework.common.util.collection.StreamX;
import cn.iocoder.yudao.framework.common.util.object.BeanUtils;
import cn.iocoder.yudao.framework.common.validation.ValidationGroup;
import cn.iocoder.yudao.framework.excel.core.util.ExcelUtils;
import cn.iocoder.yudao.module.erp.api.product.ErpProductApi;
import cn.iocoder.yudao.module.erp.api.product.dto.ErpProductDTO;
import cn.iocoder.yudao.module.wms.controller.admin.inventory.bin.vo.WmsInventoryBinExcelVO;
import cn.iocoder.yudao.module.wms.controller.admin.inventory.bin.vo.WmsInventoryBinImportVO;
import cn.iocoder.yudao.module.wms.controller.admin.inventory.bin.vo.WmsInventoryBinPageReqVO;
import cn.iocoder.yudao.module.wms.controller.admin.inventory.bin.vo.WmsInventoryBinRespVO;
import cn.iocoder.yudao.module.wms.controller.admin.inventory.bin.vo.WmsInventoryBinSaveReqVO;
import cn.iocoder.yudao.module.wms.controller.admin.inventory.bin.vo.WmsInventoryProductExcelVO;
import cn.iocoder.yudao.module.wms.controller.admin.inventory.bin.vo.WmsInventoryProductParseVO;
import cn.iocoder.yudao.module.wms.controller.admin.stock.bin.vo.WmsStockBinRespVO;
import cn.iocoder.yudao.module.wms.dal.dataobject.inventory.WmsInventoryDO;
import cn.iocoder.yudao.module.wms.dal.dataobject.inventory.bin.WmsInventoryBinDO;
import cn.iocoder.yudao.module.wms.dal.dataobject.warehouse.WmsWarehouseDO;
import cn.iocoder.yudao.module.wms.dal.dataobject.warehouse.bin.WmsWarehouseBinDO;
import cn.iocoder.yudao.module.wms.enums.inventory.WmsInventoryAuditStatus;
import cn.iocoder.yudao.module.wms.service.inventory.WmsInventoryService;
import cn.iocoder.yudao.module.wms.service.inventory.bin.WmsInventoryBinService;
import cn.iocoder.yudao.module.wms.service.warehouse.WmsWarehouseService;
import cn.iocoder.yudao.module.wms.service.warehouse.bin.WmsWarehouseBinService;
import de.danielbechler.util.Collections;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.annotation.Resource;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.validation.Valid;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

import static cn.iocoder.yudao.framework.apilog.core.enums.OperateTypeEnum.EXPORT;
import static cn.iocoder.yudao.framework.common.exception.util.ServiceExceptionUtil.exception;
import static cn.iocoder.yudao.framework.common.pojo.CommonResult.success;
import static cn.iocoder.yudao.module.wms.enums.ErrorCodeConstants.INVENTORY_BIN_BIN_NOT_EXISTS;
import static cn.iocoder.yudao.module.wms.enums.ErrorCodeConstants.INVENTORY_BIN_CAN_NOT_IMPORT;
import static cn.iocoder.yudao.module.wms.enums.ErrorCodeConstants.INVENTORY_BIN_NOT_EXISTS;
import static cn.iocoder.yudao.module.wms.enums.ErrorCodeConstants.INVENTORY_BIN_PRODUCT_NOT_EXISTS;
import static cn.iocoder.yudao.module.wms.enums.ErrorCodeConstants.INVENTORY_BIN_WAREHOUSE_BIN_ERROR;
import static cn.iocoder.yudao.module.wms.enums.ErrorCodeConstants.INVENTORY_BIN_WAREHOUSE_BIN_NOT_MATCH;

@Tag(name = "库位盘点")
@RestController
@RequestMapping("/wms/inventory-bin")
@Validated
public class WmsInventoryBinController {

    @Resource
    private WmsInventoryBinService inventoryBinService;

    @Resource
    private WmsInventoryService inventoryService;

    @Resource
    private WmsWarehouseBinService warehouseBinService;

    @Resource
    private WmsWarehouseService warehouseService;

    @Resource
    private ErpProductApi productApi;

    // /**
    // * @sign : ACAABD7462DAD982
    // */
    // @PostMapping("/create")
    // @Operation(summary = "创建库位盘点")
    // @PreAuthorize("@ss.hasPermission('wms:inventory-bin:create')")
    // public CommonResult<Long> createInventoryBin(@Valid @RequestBody WmsInventoryBinSaveReqVO createReqVO) {
    // return success(inventoryBinService.createInventoryBin(createReqVO).getId());
    // }
    @PostMapping("/append")
    @Operation(summary = "追加盘点库位")
    @PreAuthorize("@ss.hasPermission('wms:inventory-bin:append')")
    public CommonResult<Boolean> appendInventoryBin(@Valid @RequestBody List<WmsInventoryBinSaveReqVO> createReqVOList) {
        if (Collections.isEmpty(createReqVOList)) {
            throw exception(INVENTORY_BIN_NOT_EXISTS);
        }
        return success(inventoryBinService.appendInventoryBin(createReqVOList));
    }

    // 
    // /**
    // * @sign : 75B7A098990ADFC4
    // */
    // @PutMapping("/update")
    // @Operation(summary = "更新库位盘点")
    // @PreAuthorize("@ss.hasPermission('wms:inventory-bin:update')")
    // public CommonResult<Boolean> updateInventoryBin(@Valid @RequestBody WmsInventoryBinSaveReqVO updateReqVO) {
    // inventoryBinService.updateInventoryBin(updateReqVO);
    // return success(true);
    // }
    @PutMapping("/update-actual-quantity")
    @Operation(summary = "设置实际库存量")
    @PreAuthorize("@ss.hasPermission('wms:inventory-bin:update')")
    public CommonResult<Boolean> updateActualQuantity(@Validated(ValidationGroup.update.class) @RequestBody List<WmsInventoryBinSaveReqVO> updateReqVOList) {
        inventoryBinService.updateActualQuantity(updateReqVOList);
        return success(true);
    }

    // 
    // @DeleteMapping("/delete")
    // @Operation(summary = "删除库位盘点")
    // @Parameter(name = "id", description = "编号", required = true)
    // @PreAuthorize("@ss.hasPermission('wms:inventory-bin:delete')")
    // public CommonResult<Boolean> deleteInventoryBin(@RequestParam("id") Long id) {
    // inventoryBinService.deleteInventoryBin(id);
    // return success(true);
    // }
    // 
    // /**
    // * @sign : 48F08E170F254296
    // */
    // @GetMapping("/get")
    // @Operation(summary = "获得库位盘点")
    // @Parameter(name = "id", description = "编号", required = true, example = "1024")
    // @PreAuthorize("@ss.hasPermission('wms:inventory-bin:query')")
    // public CommonResult<WmsInventoryBinRespVO> getInventoryBin(@RequestParam("id") Long id) {
    // // 查询数据
    // WmsInventoryBinDO inventoryBin = inventoryBinService.getInventoryBin(id);
    // if (inventoryBin == null) {
    // throw exception(INVENTORY_BIN_NOT_EXISTS);
    // }
    // // 转换
    // WmsInventoryBinRespVO inventoryBinVO = BeanUtils.toBean(inventoryBin, WmsInventoryBinRespVO.class);
    // // 返回
    // return success(inventoryBinVO);
    // }
    // 
    // /**
    // * @sign : E02F374AE9A85D01
    // */
    // @GetMapping("/page")
    // @Operation(summary = "获得库位盘点分页")
    // @PreAuthorize("@ss.hasPermission('wms:inventory-bin:query')")
    // public CommonResult<PageResult<WmsInventoryBinRespVO>> getInventoryBinPage(@Valid WmsInventoryBinPageReqVO pageReqVO) {
    // // 查询数据
    // PageResult<WmsInventoryBinDO> doPageResult = inventoryBinService.getInventoryBinPage(pageReqVO);
    // // 转换
    // PageResult<WmsInventoryBinRespVO> voPageResult = BeanUtils.toBean(doPageResult, WmsInventoryBinRespVO.class);
    // // 返回
    // return success(voPageResult);
    // }
    // 
    @GetMapping("/export-excel")
    @Operation(summary = "导出库位盘点 Excel")
    @PreAuthorize("@ss.hasPermission('wms:inventory-bin:export')")
    @ApiAccessLog(operateType = EXPORT)
    public void exportInventoryBinExcel(@Valid WmsInventoryBinPageReqVO pageReqVO, HttpServletResponse response) throws IOException {
        WmsInventoryDO inventory = inventoryService.validateInventoryExists(pageReqVO.getInventoryId());
        pageReqVO.setPageSize(PageParam.PAGE_SIZE_NONE);
        List<WmsInventoryBinDO> doList = inventoryBinService.getInventoryBinPage(pageReqVO).getList();
        List<WmsInventoryBinRespVO> voList = BeanUtils.toBean(doList, WmsInventoryBinRespVO.class);
        inventoryBinService.assembleBin(voList);
        inventoryBinService.assembleProduct(voList);
        Map<Long, WmsInventoryBinRespVO> voMap = StreamX.from(voList).toMap(WmsInventoryBinRespVO::getId);
        List<WmsInventoryBinExcelVO> exVOList = BeanUtils.toBean(voList, WmsInventoryBinExcelVO.class);
        for (WmsInventoryBinExcelVO excelVO : exVOList) {
            WmsInventoryBinRespVO itemRespVO = voMap.get(excelVO.getId());
            if (itemRespVO == null) {
                continue;
            }
            if (itemRespVO.getProduct() != null) {
                excelVO.setProductCode(itemRespVO.getProduct().getBarCode());
            }
            // 
            excelVO.setInventoryCode(inventory.getCode());
            if (itemRespVO.getBin() != null) {
                excelVO.setBinCode(itemRespVO.getBin().getCode());
                excelVO.setBinName(itemRespVO.getBin().getName());
            }
        }
        // 导出 Excel
        ExcelUtils.write(response, "库位盘点-" + inventory.getCode() + ".xls", "数据", WmsInventoryBinExcelVO.class, BeanUtils.toBean(exVOList, WmsInventoryBinExcelVO.class));
    }

    @PostMapping("/parse-product-bin")
    @Operation(summary = "产品库位转换")
    @PreAuthorize("@ss.hasPermission('wms:inbound-item:parse-product-bin')")
    public CommonResult<List<WmsStockBinRespVO>> importProductExcel(@Valid WmsInventoryProductParseVO importReqVO) throws Exception {
        WmsWarehouseDO wmsWarehouseDO = warehouseService.validateWarehouseExists(importReqVO.getWarehouseId());
        // 读取数据
        List<WmsInventoryProductExcelVO> impVOList = ExcelUtils.read(importReqVO.getFile(), WmsInventoryProductExcelVO.class);

        List<WmsStockBinRespVO> inventoryBinRespVOList = inventoryService.parseProductExcel(wmsWarehouseDO,impVOList);

        return success(inventoryBinRespVOList);
    }

    @PostMapping("/import-excel")
    @Operation(summary = "导入盘点结果")
    @PreAuthorize("@ss.hasPermission('wms:inbound-item:import')")
    public CommonResult<Boolean> importExcel(@Valid WmsInventoryBinImportVO importReqVO) throws Exception {
        WmsInventoryDO inventory = inventoryService.validateInventoryExists(importReqVO.getInventoryId());
        WmsInventoryAuditStatus inventoryAuditStatus = WmsInventoryAuditStatus.parse(inventory.getAuditStatus());
        // 不允许导入
        if (inventoryAuditStatus != WmsInventoryAuditStatus.AUDITING) {
            throw exception(INVENTORY_BIN_CAN_NOT_IMPORT);
        }
        // 读取数据
        List<WmsInventoryBinExcelVO> impVOList = ExcelUtils.read(importReqVO.getFile(), WmsInventoryBinExcelVO.class);
        // 准备装配仓位ID和产品ID
        List<WmsWarehouseBinDO> binList = warehouseBinService.selectByCodes(StreamX.from(impVOList).toSet(WmsInventoryBinExcelVO::getBinCode));
        Map<String, WmsWarehouseBinDO> binMap = StreamX.from(binList).toMap(WmsWarehouseBinDO::getCode);
        Map<String, ErpProductDTO> productMap = productApi.getProductMapByCode(StreamX.from(impVOList).toSet(WmsInventoryBinExcelVO::getProductCode));
        // 装配仓位ID和产品ID
        for (WmsInventoryBinExcelVO excelVO : impVOList) {
            WmsWarehouseBinDO bin = binMap.get(excelVO.getBinCode());
            if (bin != null) {
                excelVO.setBinId(bin.getId());
            }
            ErpProductDTO product = productMap.get(excelVO.getProductCode());
            if (product != null) {
                excelVO.setProductId(product.getId());
            }
        }
        List<WmsInventoryBinRespVO> voList = BeanUtils.toBean(impVOList, WmsInventoryBinRespVO.class);
        // 装配产品ID
        inventoryBinService.assembleBin(voList);
        inventoryBinService.assembleProduct(voList);
        // 检查仓位与产品的有效性
        for (int i = 0; i < voList.size(); i++) {
            WmsInventoryBinRespVO inventoryBinRespVO = voList.get(i);
            WmsInventoryBinExcelVO excelVO = impVOList.get(i);
            if (inventoryBinRespVO.getBin() == null) {
                throw exception(INVENTORY_BIN_BIN_NOT_EXISTS,excelVO.getBinCode());
            }
            if (inventoryBinRespVO.getProduct() == null) {
                throw exception(INVENTORY_BIN_PRODUCT_NOT_EXISTS, excelVO.getProductCode());
            }
        }
        // 检查仓位数据的合规性
        List<WmsWarehouseBinDO> binDOList = warehouseBinService.selectByCodes(StreamX.from(impVOList).toSet(WmsInventoryBinExcelVO::getBinCode));
        Set<Long> warehouseIdSet = StreamX.from(binDOList).toSet(WmsWarehouseBinDO::getWarehouseId);
        if (warehouseIdSet.size() != 1) {
            throw exception(INVENTORY_BIN_WAREHOUSE_BIN_ERROR);
        }
        Long warehouseId = StreamX.from(warehouseIdSet).first();
        if (!Objects.equals(warehouseId, inventory.getWarehouseId())) {
            throw exception(INVENTORY_BIN_WAREHOUSE_BIN_NOT_MATCH);
        }

        Map<String, WmsInventoryBinExcelVO> imMap=StreamX.from(impVOList).toMap(e->e.getBinId()+"-"+e.getProductId());
        // 转 DOList 去保存
        List<WmsInventoryBinDO> dosInDB = inventoryBinService.selectByInventoryId(inventory.getId());
        for (WmsInventoryBinDO inventoryBinDO : dosInDB) {
            WmsInventoryBinExcelVO inventoryBinExcelVO = imMap.get(inventoryBinDO.getBinId()+"-"+inventoryBinDO.getProductId());
            if(inventoryBinExcelVO!=null){
                inventoryBinDO.setActualQty(inventoryBinExcelVO.getActualQty());
                inventoryBinDO.setRemark(inventoryBinExcelVO.getRemark());
            }
        }

        inventoryBinService.saveInventoryBinList(inventory, dosInDB);
        return success(true);
    }
}
