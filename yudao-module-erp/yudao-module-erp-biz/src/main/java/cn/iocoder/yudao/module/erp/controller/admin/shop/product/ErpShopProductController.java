package cn.iocoder.yudao.module.erp.controller.admin.shop.product;

import cn.hutool.core.util.IdUtil;
import cn.hutool.core.util.ObjectUtil;
import cn.iocoder.yudao.framework.common.util.collection.StreamX;
import cn.iocoder.yudao.framework.common.util.lang.DataParser;
import cn.iocoder.yudao.module.erp.controller.admin.shop.product.item.vo.ErpShopProductItemRespVO;
import cn.iocoder.yudao.module.erp.controller.admin.shop.vo.ErpShopRespVO;
import cn.iocoder.yudao.module.erp.dal.dataobject.shop.ErpShopDO;
import cn.iocoder.yudao.module.erp.dal.dataobject.shop.product.item.ErpShopProductItemDO;
import cn.iocoder.yudao.module.erp.enums.ErpShopType;
import cn.iocoder.yudao.module.erp.service.shop.ErpShopService;
import cn.iocoder.yudao.module.erp.service.shop.product.item.ErpShopProductItemService;
import cn.iocoder.yudao.module.system.api.dept.DeptApi;
import cn.iocoder.yudao.module.system.api.dept.dto.DeptRespDTO;
import cn.iocoder.yudao.module.system.api.user.AdminUserApi;
import cn.iocoder.yudao.module.system.api.user.dto.AdminUserRespDTO;
import jodd.util.StringUtil;
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
    private DeptApi deptApi;

    @Resource
    AdminUserApi userApi;


    @PostMapping("/create")
    @Operation(summary = "创建ERP 店铺产品")
    @PreAuthorize("@ss.hasPermission('erp:shop-product:create')")
    public CommonResult<Long> createShopProduct(@Valid @RequestBody ErpShopProductSaveReqVO createReqVO) {

        // 校验店铺是否存在
        ErpShopDO shopDO = shopService.getShop(createReqVO.getShopId());
        if(shopDO==null) {
            return error(SHOP_NOT_EXISTS);
        }

        // 校验店铺账号是否填写
        if(StringUtil.isBlank(shopDO.getAccount())) {
            return error(REQUIRE_SHOP_ACCOUNT);
        }

        if(StringUtil.isBlank(createReqVO.getPlatformProductUid())) {
            createReqVO.setPlatformProductUid(IdUtil.nanoId());
        }

        // 校验产品编码
        ErpShopProductDO productDO =shopProductService.getShopProductByCode(createReqVO.getCode());
        if(productDO!=null) {
            return error(SHOP_PRODUCT_CODE_DUPLICATE);
        }

        // 校验部门
        if(createReqVO.getDeptId()!=null) {
            DeptRespDTO deptDTO=deptApi.getDept(createReqVO.getDeptId());
            if(deptDTO==null) {
                return error(SHOP_PRODUCT_DEPT_NOT_EXISTS);
            }
        }

        return success(shopProductService.createShopProductWithItems(createReqVO));
    }

    @PutMapping("/update")
    @Operation(summary = "更新ERP 店铺产品")
    @PreAuthorize("@ss.hasPermission('erp:shop-product:update')")
    public CommonResult<Boolean> updateShopProduct(@Valid @RequestBody ErpShopProductSaveReqVO updateReqVO) {

        if(updateReqVO.getDeptId()!=null) {
            DeptRespDTO deptDTO=deptApi.getDept(updateReqVO.getDeptId());
            if(deptDTO==null) {
                return error(SHOP_PRODUCT_DEPT_NOT_EXISTS);
            }
        }

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
        ErpShopDO shopDO = shopService.getShop(respVO.getShopId());
        respVO.setShop(BeanUtils.toBean(shopDO, ErpShopRespVO.class));

        if(respVO.getDeptId()!=null) {
            DeptRespDTO deptDTO=deptApi.getDept(respVO.getDeptId());
            if(deptDTO!=null) {
                respVO.setDeptName(deptDTO.getName());
            }
        }

        return success(respVO);
    }

    @GetMapping("/page")
    @Operation(summary = "获得ERP 店铺产品分页")
    @PreAuthorize("@ss.hasPermission('erp:shop-product:query')")
    public CommonResult<PageResult<ErpShopProductRespVO>> getShopProductPage(@Valid ErpShopProductPageReqVO pageReqVO) {

        return shopProductService.getShopProductPageVO(pageReqVO);


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