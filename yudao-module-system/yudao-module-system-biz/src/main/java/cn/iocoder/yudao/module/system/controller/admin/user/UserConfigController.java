package cn.iocoder.yudao.module.system.controller.admin.user;

import cn.iocoder.yudao.framework.web.core.util.WebFrameworkUtils;
import cn.iocoder.yudao.module.system.controller.admin.user.vo.user.SystemUserConfigPageReqVO;
import cn.iocoder.yudao.module.system.controller.admin.user.vo.user.SystemUserConfigRespVO;
import cn.iocoder.yudao.module.system.controller.admin.user.vo.user.SystemUserConfigSaveReqVO;
import cn.iocoder.yudao.module.system.dal.dataobject.user.SystemUserConfigDO;
import cn.iocoder.yudao.module.system.enums.user.UserConfigScopeEnum;
import cn.iocoder.yudao.module.system.service.user.SystemUserConfigService;
import org.springframework.web.bind.annotation.*;
import jakarta.annotation.Resource;
import org.springframework.validation.annotation.Validated;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Operation;

import jakarta.validation.*;
import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.common.pojo.CommonResult;
import cn.iocoder.yudao.framework.common.util.object.BeanUtils;

import static cn.iocoder.yudao.framework.common.pojo.CommonResult.success;


@Tag(name = "管理后台 - 用户配置")
@RestController
@RequestMapping("/system/user-config")
@Validated
public class UserConfigController {

    @Resource
    private SystemUserConfigService userConfigService;

    @PostMapping("/saveOrUpdate")
    @Operation(summary = "创建用户配置")
    public CommonResult<Long> saveOrUpdate(@Valid @RequestBody SystemUserConfigSaveReqVO createReqVO) {
        Long loginUserId = WebFrameworkUtils.getLoginUserId();
        createReqVO.setUserId(loginUserId);
        createReqVO.setScope(UserConfigScopeEnum.FRONTEND.getScope());
        return success(userConfigService.saveOrUpdate(createReqVO));
    }


    @DeleteMapping("/delete")
    @Operation(summary = "删除用户配置")
    @Parameter(name = "id", description = "编号", required = true)
    public CommonResult<Boolean> deleteUserConfig(@RequestParam("id") Long id) {
        userConfigService.deleteUserConfig(id);
        return success(true);
    }

    @GetMapping("/get")
    @Operation(summary = "获得用户配置")
    @Parameter(name = "id", description = "编号", required = true, example = "1024")
    public CommonResult<SystemUserConfigRespVO> getUserConfig(@RequestParam("id") String configKey) {
        Long loginUserId = WebFrameworkUtils.getLoginUserId();
        SystemUserConfigDO userConfig = userConfigService.getUserConfig(loginUserId, configKey, UserConfigScopeEnum.FRONTEND.getScope());
        if (userConfig == null) {
            return success(null);
        }
        return success(BeanUtils.toBean(userConfig, SystemUserConfigRespVO.class));
    }

    @GetMapping("/page")
    @Operation(summary = "获得用户配置分页")
    public CommonResult<PageResult<SystemUserConfigRespVO>> getUserConfigPage(@Valid SystemUserConfigPageReqVO pageReqVO) {
        Long loginUserId = WebFrameworkUtils.getLoginUserId();
        pageReqVO.setUserId(loginUserId);
        pageReqVO.setScope(UserConfigScopeEnum.FRONTEND.getScope());
        PageResult<SystemUserConfigDO> pageResult = userConfigService.getUserConfigPage(pageReqVO);
        return success(BeanUtils.toBean(pageResult, SystemUserConfigRespVO.class));
    }

}