package cn.iocoder.yudao.module.tms.api.first.mile;

import cn.iocoder.yudao.module.tms.api.first.FistMileDTO;

/**
 * 头程单 API 接口
 */
public interface FistMileApi {

    /**
     * 获得头程单
     */
    FistMileDTO getFirstMile(Long id);

    /**
     * 更新头程单状态
     */
    void updateFirstMileStatus(FistMileDTO fistMileDTO);
}
