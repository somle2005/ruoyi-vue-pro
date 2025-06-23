package cn.iocoder.yudao.module.system.enums.user;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 短信的发送状态枚举
 *
 * @author zzf
 * @date 2021/2/1 13:39
 */
@Getter
@AllArgsConstructor
public enum UserConfigScopeEnum {

    FRONTEND(1), // 前端
    BACKEND(2),  // 后端
    ;

    private final int scope;

}
