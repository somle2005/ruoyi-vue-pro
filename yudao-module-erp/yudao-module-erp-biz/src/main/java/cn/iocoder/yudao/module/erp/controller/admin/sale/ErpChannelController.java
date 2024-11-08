package cn.iocoder.yudao.module.erp.controller.admin.sale;

import cn.iocoder.yudao.module.erp.controller.admin.sale.vo.channel.*;
import cn.iocoder.yudao.module.erp.dal.dataobject.sale.ErpChannelDO;
import cn.iocoder.yudao.module.erp.service.sale.ErpChannelService;
import org.springframework.web.bind.annotation.*;
import jakarta.annotation.Resource;
import org.springframework.validation.annotation.Validated;
import org.springframework.security.access.prepost.PreAuthorize;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Operation;
import jakarta.validation.*;
import java.util.*;
import cn.iocoder.yudao.framework.common.pojo.CommonResult;
import cn.iocoder.yudao.framework.common.util.object.BeanUtils;
import static cn.iocoder.yudao.framework.common.pojo.CommonResult.success;


/**
 * @author Administrator
 */
@Tag(name = "管理后台 - ERP 渠道")
@RestController
@RequestMapping("/erp/channel")
@Validated
public class ErpChannelController {

    @Resource
    private ErpChannelService channelService;

    @PostMapping("/create")
    @Operation(summary = "创建ERP 渠道")
    @PreAuthorize("@ss.hasPermission('erp:channel:create')")
    public CommonResult<Long> createChannel(@Valid @RequestBody ErpChannelSaveReqVO createReqVO) {
        return success(channelService.createChannel(createReqVO));
    }

    @PutMapping("/update")
    @Operation(summary = "更新ERP 渠道")
    @PreAuthorize("@ss.hasPermission('erp:channel:update')")
    public CommonResult<Boolean> updateChannel(@Valid @RequestBody ErpChannelSaveReqVO updateReqVO) {
        channelService.updateChannel(updateReqVO);
        return success(true);
    }

    @DeleteMapping("/delete")
    @Operation(summary = "删除ERP 渠道")
    @Parameter(name = "id", description = "编号", required = true)
    @PreAuthorize("@ss.hasPermission('erp:channel:delete')")
    public CommonResult<Boolean> deleteChannel(@RequestParam("id") Long id) {
        channelService.deleteChannel(id);
        return success(true);
    }

    @GetMapping("/get")
    @Operation(summary = "获得ERP 渠道")
    @Parameter(name = "id", description = "编号", required = true, example = "1024")
    @PreAuthorize("@ss.hasPermission('erp:channel:query')")
    public CommonResult<ErpChannelRespVO> getChannel(@RequestParam("id") Long id) {
        ErpChannelDO channel = channelService.getChannel(id);
        return success(BeanUtils.toBean(channel, ErpChannelRespVO.class));
    }

    @GetMapping("/list")
    @Operation(summary = "获得ERP 渠道列表")
    @PreAuthorize("@ss.hasPermission('erp:channel:query')")
    public CommonResult<List<ErpChannelRespVO>> getChannelPage(@Valid ErpChannelListReqVO listReqVO) {
        List<ErpChannelDO> list = channelService.getChannelList(listReqVO);
        return success(BeanUtils.toBean(list, ErpChannelRespVO.class));
    }

    @GetMapping(value = {"/list-all-simple", "/simple-list"})
    @Operation(summary = "获取渠道精简信息列表", description = "只包含被开启的渠道，主要用于前端的下拉选项")
    public CommonResult<List<ErpChannelSimpleRespVO>> getSimpleDeptList() {
        List<ErpChannelDO> list = channelService.getChannelList(
                new ErpChannelListReqVO().setStatus(true));
        return success(BeanUtils.toBean(list, ErpChannelSimpleRespVO.class));
    }

}