package cn.iocoder.yudao.module.cms.enums;

import cn.iocoder.yudao.framework.common.exception.ErrorCode;

/**
 * CMS 错误码枚举类
 * <p>
 * CMS 系统，使用 1-002-000-000 段
 */
public interface ErrorCodeConstants {
    ErrorCode MEDIA_RESOURCE_NOT_EXISTS = new ErrorCode(1_002_000_000, "媒体资源不存在");
}
