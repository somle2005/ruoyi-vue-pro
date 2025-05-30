package cn.iocoder.yudao.module.tms.api.first.mile;

import cn.iocoder.yudao.module.tms.api.first.TmsFistMileDTO;

/**
 * 头程单 API 接口
 */
public interface TmsFistMileApi {

    /**
     * 获得头程单
     */
    TmsFistMileDTO getFirstMile(Long id);

    /**
     * 更新头程单状态
     */
    void updateFirstMileStatus(TmsFistMileDTO tmsFistMileDTO);
}
