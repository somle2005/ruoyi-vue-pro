package com.somle.esb.util;

import java.time.LocalDateTime;
import java.time.ZoneId;

/**
 * @author: wdy
 */
public class EsbTimeUtils {

    /**
     * 获取东八区当前时间
     * 由于系统运行在0区（UTC），需要转换为东八区时间
     *
     * @return 东八区当前时间
     */
    public static LocalDateTime getUtc8Now() {
        return LocalDateTime.now(ZoneId.of("Asia/Shanghai"));
    }

    /**
     * 将0区时间转换为东八区时间
     * 由于系统运行在0区（UTC），需要将传入的0区时间转换为东八区时间
     *
     * @param utcTime 0区时间
     * @return 东八区时间
     */
    public static LocalDateTime convertToUtc8(LocalDateTime utcTime) {
        if (utcTime == null) {
            return null;
        }
        return utcTime.atZone(ZoneId.of("UTC"))
            .withZoneSameInstant(ZoneId.of("Asia/Shanghai"))
            .toLocalDateTime();
    }
}
