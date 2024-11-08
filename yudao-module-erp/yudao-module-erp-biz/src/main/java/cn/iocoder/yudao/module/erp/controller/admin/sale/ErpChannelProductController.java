package cn.iocoder.yudao.module.erp.controller.admin.sale;

import cn.iocoder.yudao.module.erp.controller.admin.sale.vo.channel.product.ErpChannelProductPageReqVO;
import cn.iocoder.yudao.module.erp.controller.admin.sale.vo.channel.product.ErpChannelProductRespVO;
import cn.iocoder.yudao.module.erp.controller.admin.sale.vo.channel.product.ErpChannelProductSaveReqVO;
import cn.iocoder.yudao.module.erp.dal.dataobject.sale.ErpChannelProductDO;
import cn.iocoder.yudao.module.erp.service.sale.ErpChannelProductService;
import org.springframework.aop.framework.AopProxyUtils;
import org.springframework.aop.support.AopUtils;
import org.springframework.web.bind.annotation.*;
import jakarta.annotation.Resource;
import org.springframework.validation.annotation.Validated;
import org.springframework.security.access.prepost.PreAuthorize;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Operation;
import jakarta.validation.*;
import jakarta.servlet.http.*;
import java.util.*;
import java.io.IOException;
import cn.iocoder.yudao.framework.common.pojo.PageParam;
import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.common.pojo.CommonResult;
import cn.iocoder.yudao.framework.common.util.object.BeanUtils;
import static cn.iocoder.yudao.framework.common.pojo.CommonResult.success;
import cn.iocoder.yudao.framework.excel.core.util.ExcelUtils;
import cn.iocoder.yudao.framework.apilog.core.annotation.ApiAccessLog;
import static cn.iocoder.yudao.framework.apilog.core.enums.OperateTypeEnum.*;

@Tag(name = "管理后台 - ERP 渠道平台产品")
@RestController
@RequestMapping("/erp/channel-product")
@Validated
public class ErpChannelProductController {

    @Resource
    private ErpChannelProductService channelProductService;

    @PostMapping("/create")
    @Operation(summary = "创建ERP 渠道平台产品")
    @PreAuthorize("@ss.hasPermission('erp:channel-product:create')")
    public CommonResult<Long> createChannelProduct(@Valid @RequestBody ErpChannelProductSaveReqVO createReqVO) {
        return success(channelProductService.createChannelProduct(createReqVO));
    }

    @PutMapping("/update")
    @Operation(summary = "更新ERP 渠道平台产品")
    @PreAuthorize("@ss.hasPermission('erp:channel-product:update')")
    public CommonResult<Boolean> updateChannelProduct(@Valid @RequestBody ErpChannelProductSaveReqVO updateReqVO) {
        channelProductService.updateChannelProduct(updateReqVO);
        return success(true);
    }

    @DeleteMapping("/delete")
    @Operation(summary = "删除ERP 渠道平台产品")
    @Parameter(name = "id", description = "编号", required = true)
    @PreAuthorize("@ss.hasPermission('erp:channel-product:delete')")
    public CommonResult<Boolean> deleteChannelProduct(@RequestParam("id") Long id) {
        channelProductService.deleteChannelProduct(id);
        return success(true);
    }

    @GetMapping("/get")
    @Operation(summary = "获得ERP 渠道平台产品")
    @Parameter(name = "id", description = "编号", required = true, example = "1024")
    @PreAuthorize("@ss.hasPermission('erp:channel-product:query')")
    public CommonResult<ErpChannelProductRespVO> getChannelProduct(@RequestParam("id") Long id) {
        ErpChannelProductDO channelProduct = channelProductService.getChannelProduct(id);
        return success(BeanUtils.toBean(channelProduct, ErpChannelProductRespVO.class));
    }

    @GetMapping("/page")
    @Operation(summary = "获得ERP 渠道平台产品分页")
    @PreAuthorize("@ss.hasPermission('erp:channel-product:query')")
    public CommonResult<PageResult<ErpChannelProductRespVO>> getChannelProductPage(@Valid ErpChannelProductPageReqVO pageReqVO) {
        PageResult<ErpChannelProductDO> pageResult = channelProductService.getChannelProductPage(pageReqVO);
        return success(BeanUtils.toBean(pageResult, ErpChannelProductRespVO.class));
    }

    @GetMapping("/export-excel")
    @Operation(summary = "导出ERP 渠道平台产品 Excel")
    @PreAuthorize("@ss.hasPermission('erp:channel-product:export')")
    @ApiAccessLog(operateType = EXPORT)
    public void exportChannelProductExcel(@Valid ErpChannelProductPageReqVO pageReqVO,
              HttpServletResponse response) throws IOException {
        pageReqVO.setPageSize(PageParam.PAGE_SIZE_NONE);
        List<ErpChannelProductDO> list = channelProductService.getChannelProductPage(pageReqVO).getList();
        // 导出 Excel
        ExcelUtils.write(response, "ERP 渠道平台产品.xls", "数据", ErpChannelProductRespVO.class,
                        BeanUtils.toBean(list, ErpChannelProductRespVO.class));
    }

}