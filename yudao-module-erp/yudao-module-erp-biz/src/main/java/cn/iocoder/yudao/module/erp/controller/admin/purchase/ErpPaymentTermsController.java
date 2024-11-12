package cn.iocoder.yudao.module.erp.controller.admin.purchase;

import cn.iocoder.yudao.framework.common.enums.CommonStatusEnum;
import cn.iocoder.yudao.module.erp.controller.admin.product.vo.product.ErpProductRespVO;
import cn.iocoder.yudao.module.erp.controller.admin.purchase.vo.paymentterms.ErpPaymentTermsPageReqVO;
import cn.iocoder.yudao.module.erp.controller.admin.purchase.vo.paymentterms.ErpPaymentTermsRespVO;
import cn.iocoder.yudao.module.erp.controller.admin.purchase.vo.paymentterms.ErpPaymentTermsSaveReqVO;
import cn.iocoder.yudao.module.erp.dal.dataobject.purchase.ErpPaymentTermsDO;
import cn.iocoder.yudao.module.erp.service.purchase.ErpPaymentTermsService;
import org.springframework.web.bind.annotation.*;
import jakarta.annotation.Resource;
import org.springframework.validation.annotation.Validated;
import org.springframework.security.access.prepost.PreAuthorize;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Operation;
import jakarta.validation.*;
import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.common.pojo.CommonResult;
import cn.iocoder.yudao.framework.common.util.object.BeanUtils;

import java.util.List;

import static cn.iocoder.yudao.framework.common.pojo.CommonResult.success;
import static cn.iocoder.yudao.framework.common.util.collection.CollectionUtils.convertList;


/**
 * @author Administrator
 */
@Tag(name = "管理后台 - 付款条款管理")
@RestController
@RequestMapping("/erp/payment-terms")
@Validated
public class ErpPaymentTermsController {

    @Resource
    private ErpPaymentTermsService paymentTermsService;

    @PostMapping("/create")
    @Operation(summary = "创建付款条款管理")
    @PreAuthorize("@ss.hasPermission('erp:payment-terms:create')")
    public CommonResult<Long> createPaymentTerms(@Valid @RequestBody ErpPaymentTermsSaveReqVO createReqVO) {
        return success(paymentTermsService.createPaymentTerms(createReqVO));
    }

    @PutMapping("/update")
    @Operation(summary = "更新付款条款管理")
    @PreAuthorize("@ss.hasPermission('erp:payment-terms:update')")
    public CommonResult<Boolean> updatePaymentTerms(@Valid @RequestBody ErpPaymentTermsSaveReqVO updateReqVO) {
        paymentTermsService.updatePaymentTerms(updateReqVO);
        return success(true);
    }

    @DeleteMapping("/delete")
    @Operation(summary = "删除付款条款管理")
    @Parameter(name = "id", description = "编号", required = true)
    @PreAuthorize("@ss.hasPermission('erp:payment-terms:delete')")
    public CommonResult<Boolean> deletePaymentTerms(@RequestParam("id") Long id) {
        paymentTermsService.deletePaymentTerms(id);
        return success(true);
    }

    @GetMapping("/get")
    @Operation(summary = "获得付款条款管理")
    @Parameter(name = "id", description = "编号", required = true, example = "1024")
    @PreAuthorize("@ss.hasPermission('erp:payment-terms:query')")
    public CommonResult<ErpPaymentTermsRespVO> getPaymentTerms(@RequestParam("id") Long id) {
        ErpPaymentTermsDO paymentTerms = paymentTermsService.getPaymentTerms(id);
        return success(BeanUtils.toBean(paymentTerms, ErpPaymentTermsRespVO.class));
    }

    @GetMapping("/page")
    @Operation(summary = "获得付款条款管理分页")
    @PreAuthorize("@ss.hasPermission('erp:payment-terms:query')")
    public CommonResult<PageResult<ErpPaymentTermsRespVO>> getPaymentTermsPage(@Valid ErpPaymentTermsPageReqVO pageReqVO) {
        PageResult<ErpPaymentTermsDO> pageResult = paymentTermsService.getPaymentTermsPage(pageReqVO);
        return success(BeanUtils.toBean(pageResult, ErpPaymentTermsRespVO.class));
    }

    @GetMapping("/simple-list")
    @Operation(summary = "获得产品精简列表", description = "只包含被开启的产品，主要用于前端的下拉选项")
    public CommonResult<List<ErpPaymentTermsRespVO>> getPaymentTermsSimpleList() {
        List<ErpPaymentTermsRespVO> list = paymentTermsService.getPaymentTermsVOListByStatus();
        return success(list);
    }

}