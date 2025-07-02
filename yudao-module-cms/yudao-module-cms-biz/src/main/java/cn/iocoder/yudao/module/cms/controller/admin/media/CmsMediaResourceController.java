package cn.iocoder.yudao.module.cms.controller.admin.media;

import cn.iocoder.yudao.framework.apilog.core.annotation.ApiAccessLog;
import cn.iocoder.yudao.framework.common.pojo.CommonResult;
import cn.iocoder.yudao.framework.common.pojo.PageParam;
import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.common.util.object.BeanUtils;
import cn.iocoder.yudao.framework.excel.core.util.ExcelUtils;
import cn.iocoder.yudao.module.cms.controller.admin.media.vo.CmsMediaResourcePageReqVO;
import cn.iocoder.yudao.module.cms.controller.admin.media.vo.CmsMediaResourceRespVO;
import cn.iocoder.yudao.module.cms.controller.admin.media.vo.CmsMediaResourceSaveReqVO;
import cn.iocoder.yudao.module.cms.dal.dataobject.media.CmsMediaResourceDO;
import cn.iocoder.yudao.module.cms.service.media.CmsMediaResourceService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.annotation.Resource;
import jakarta.annotation.security.PermitAll;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.validation.Valid;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

import static cn.iocoder.yudao.framework.apilog.core.enums.OperateTypeEnum.EXPORT;
import static cn.iocoder.yudao.framework.common.pojo.CommonResult.success;


@Tag(name = "CMS系统 - 媒体资源")
@RestController
@RequestMapping("/cms/media-resource")
@Validated
public class CmsMediaResourceController {

    @Resource
    private CmsMediaResourceService mediaResourceService;

    @PostMapping("/create")
    @Operation(summary = "创建媒体资源")
    @PreAuthorize("@ss.hasPermission('cms:media-resource:create')")
    public CommonResult<Long> createMediaResource(@Valid @RequestBody CmsMediaResourceSaveReqVO createReqVO) {
        return success(mediaResourceService.createMediaResource(createReqVO));
    }

    @PutMapping("/update")
    @Operation(summary = "更新媒体资源")
    @PreAuthorize("@ss.hasPermission('cms:media-resource:update')")
    public CommonResult<Boolean> updateMediaResource(@Valid @RequestBody CmsMediaResourceSaveReqVO updateReqVO) {
        mediaResourceService.updateMediaResource(updateReqVO);
        return success(true);
    }

    @DeleteMapping("/delete")
    @Operation(summary = "删除媒体资源")
    @Parameter(name = "id", description = "编号", required = true)
    @PreAuthorize("@ss.hasPermission('cms:media-resource:delete')")
    public CommonResult<Boolean> deleteMediaResource(@RequestParam("id") Long id) {
        mediaResourceService.deleteMediaResource(id);
        return success(true);
    }

    @GetMapping("/get")
    @Operation(summary = "查询媒体资源")
    @Parameter(name = "id", description = "编号", required = true, example = "1024")
    @PreAuthorize("@ss.hasPermission('cms:media-resource:query')")
    public CommonResult<CmsMediaResourceRespVO> getMediaResource(@RequestParam("id") Long id) {
        CmsMediaResourceDO mediaResource = mediaResourceService.getMediaResource(id);
        return success(BeanUtils.toBean(mediaResource, CmsMediaResourceRespVO.class));
    }

    @PostMapping("/page")
    @Operation(summary = "获得文件分页 公共查询接口")
    @PermitAll
    public CommonResult<PageResult<CmsMediaResourceRespVO>> getMediaResourcePage(@Valid CmsMediaResourcePageReqVO pageReqVO) {
        PageResult<CmsMediaResourceDO> pageResult = mediaResourceService.getMediaResourcePage(pageReqVO);
        return success(BeanUtils.toBean(pageResult, CmsMediaResourceRespVO.class));
    }

    @GetMapping("/export-excel")
    @Operation(summary = "导出文件 Excel")
    @PreAuthorize("@ss.hasPermission('cms:media-resource:export')")
    @ApiAccessLog(operateType = EXPORT)
    public void exportMediaResourceExcel(@Valid CmsMediaResourcePageReqVO pageReqVO,
              HttpServletResponse response) throws IOException {
        pageReqVO.setPageSize(PageParam.PAGE_SIZE_NONE);
        List<CmsMediaResourceDO> list = mediaResourceService.getMediaResourcePage(pageReqVO).getList();
        // 导出 Excel
        ExcelUtils.write(response, "文件.xls", "数据", CmsMediaResourceRespVO.class,
                        BeanUtils.toBean(list, CmsMediaResourceRespVO.class));
    }

}