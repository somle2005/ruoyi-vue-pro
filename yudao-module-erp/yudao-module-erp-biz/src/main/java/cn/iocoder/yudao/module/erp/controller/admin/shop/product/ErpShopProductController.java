package cn.iocoder.yudao.module.erp.controller.admin.shop.product;

import cn.iocoder.yudao.module.erp.controller.admin.shop.product.item.vo.ErpShopProductItemRespVO;
import cn.iocoder.yudao.module.erp.controller.admin.shop.vo.ErpShopRespVO;
import cn.iocoder.yudao.module.erp.dal.dataobject.shop.ErpShopDO;
import cn.iocoder.yudao.module.erp.dal.dataobject.shop.product.item.ErpShopProductItemDO;
import cn.iocoder.yudao.module.erp.enums.ErpShopType;
import cn.iocoder.yudao.module.erp.service.shop.ErpShopService;
import cn.iocoder.yudao.module.erp.service.shop.product.item.ErpShopProductItemService;
import com.somle.framework.common.util.collection.StreamX;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import jakarta.annotation.Resource;
import org.springframework.validation.annotation.Validated;
import org.springframework.security.access.prepost.PreAuthorize;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Operation;

import jakarta.validation.constraints.*;
import jakarta.validation.*;
import jakarta.servlet.http.*;
import java.util.*;
import java.io.IOException;

import cn.iocoder.yudao.framework.common.pojo.PageParam;
import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.common.pojo.CommonResult;
import cn.iocoder.yudao.framework.common.util.object.BeanUtils;

import static cn.iocoder.yudao.framework.common.pojo.CommonResult.error;
import static cn.iocoder.yudao.framework.common.pojo.CommonResult.success;

import cn.iocoder.yudao.framework.excel.core.util.ExcelUtils;

import cn.iocoder.yudao.framework.apilog.core.annotation.ApiAccessLog;
import static cn.iocoder.yudao.framework.apilog.core.enums.OperateTypeEnum.*;
import static cn.iocoder.yudao.module.erp.enums.ErrorCodeConstants.*;

import cn.iocoder.yudao.module.erp.controller.admin.shop.product.vo.*;
import cn.iocoder.yudao.module.erp.dal.dataobject.shop.product.ErpShopProductDO;
import cn.iocoder.yudao.module.erp.service.shop.product.ErpShopProductService;

@Tag(name = "管理后台 - ERP 店铺产品")
@RestController
@RequestMapping("/erp/shop-product")
@Validated
public class ErpShopProductController {

    @Resource
    private ErpShopProductService shopProductService;

    @Resource
    private ErpShopService shopService;
    @Autowired
    private ErpShopService erpShopService;


    @PostMapping("/create")
    @Operation(summary = "创建ERP 店铺产品")
    @PreAuthorize("@ss.hasPermission('erp:shop-product:create')")
    public CommonResult<Long> createShopProduct(@Valid @RequestBody ErpShopProductSaveReqVO createReqVO) {
        return success(shopProductService.createShopProduct(createReqVO));
    }

    @PutMapping("/update")
    @Operation(summary = "更新ERP 店铺产品")
    @PreAuthorize("@ss.hasPermission('erp:shop-product:update')")
    public CommonResult<Boolean> updateShopProduct(@Valid @RequestBody ErpShopProductSaveReqVO updateReqVO) {
        shopProductService.updateShopProductWithItems(updateReqVO);
        return success(true);
    }

    @DeleteMapping("/delete")
    @Operation(summary = "删除ERP 店铺产品")
    @Parameter(name = "id", description = "编号", required = true)
    @PreAuthorize("@ss.hasPermission('erp:shop-product:delete')")
    public CommonResult<Boolean> deleteShopProduct(@RequestParam("id") Long id) {
        ErpShopProductDO productDO = shopProductService.getShopProduct(id);
        if(productDO==null) {
            return error(SHOP_PRODUCT_NOT_EXISTS);
        }
        ErpShopDO shop= shopService.getShop(productDO.getShopId());
        if(shop==null) {
            return error(SHOP_NOT_EXISTS);
        }
        ErpShopType shopType = ErpShopType.fromCode(shop.getType());
        if(shopType==ErpShopType.ONLINE) {
            return error(SHOP_PRODUCT_NOT_ALLOW_DELETE);
        }
        shopProductService.deleteShopProduct(id);
        return success(true);
    }

    @GetMapping("/get")
    @Operation(summary = "获得ERP 店铺产品")
    @Parameter(name = "id", description = "编号", required = true, example = "1024")
    @PreAuthorize("@ss.hasPermission('erp:shop-product:query')")
    public CommonResult<ErpShopProductRespVO> getShopProduct(@RequestParam("id") Long id) {
        ErpShopProductRespVO respVO=shopProductService.getShopProductWithItems(id);
        ErpShopDO shopDO = erpShopService.getShop(respVO.getShopId());
        respVO.setShop(BeanUtils.toBean(shopDO, ErpShopRespVO.class));
        return success(respVO);
    }

    @GetMapping("/page")
    @Operation(summary = "获得ERP 店铺产品分页")
    @PreAuthorize("@ss.hasPermission('erp:shop-product:query')")
    public CommonResult<PageResult<ErpShopProductRespVO>> getShopProductPage(@Valid ErpShopProductPageReqVO pageReqVO) {

        PageResult<ErpShopProductDO> pageResult = shopProductService.getShopProductPage(pageReqVO);
        PageResult<ErpShopProductRespVO> pageResultVO=BeanUtils.toBean(pageResult, ErpShopProductRespVO.class);
        Set<Long> shopIds= StreamX.from(pageResultVO.getList()).toSet(ErpShopProductRespVO::getShopId);
        Map<Long,ErpShopRespVO> shopVoMap = erpShopService.getShopMapByIds(shopIds);
        // 装配对象
        StreamX.from(pageResultVO.getList()).assemble(shopVoMap,ErpShopProductRespVO::getShopId, ErpShopProductRespVO::setShop);
        //
        return success(pageResultVO);
    }

    @GetMapping("/export-excel")
    @Operation(summary = "导出ERP 店铺产品 Excel")
    @PreAuthorize("@ss.hasPermission('erp:shop-product:export')")
    @ApiAccessLog(operateType = EXPORT)
    public void exportShopProductExcel(@Valid ErpShopProductPageReqVO pageReqVO,
              HttpServletResponse response) throws IOException {
        pageReqVO.setPageSize(PageParam.PAGE_SIZE_NONE);
        List<ErpShopProductDO> list = shopProductService.getShopProductPage(pageReqVO).getList();
        // 导出 Excel
        ExcelUtils.write(response, "ERP 店铺产品.xls", "数据", ErpShopProductRespVO.class,
                        BeanUtils.toBean(list, ErpShopProductRespVO.class));
    }

}