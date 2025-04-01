package cn.iocoder.yudao.module.oms.service;

import cn.iocoder.yudao.module.oms.dal.dataobject.OmsShopDO;
import cn.iocoder.yudao.module.oms.enums.SalesPlatformEnum;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

public interface OmsShopService extends IService<OmsShopDO> {

    /**
     * @Author: gumaomao
     * @Date: 2025/03/28  根据平台编码获取店铺信息集合
     * @return: @return {@link List }<{@link OmsShopDO }>
     */
    List<OmsShopDO> getByPlatformCode(String platformCode);


    /**
     * @param platformShopCode 平台商店代码
     * @Description: 通过平台商店代码获取
     * @return: @return {@link OmsShopDO }
     */
    OmsShopDO getByPlatformShopCode(String platformShopCode);

    /**
     * @param salesPlatform 销售平台枚举类
     * @param shops         店铺信息
     * @Description: 同步保存店铺信息到数据库
     * @return:
     */
    void syncShops(SalesPlatformEnum salesPlatform, List<OmsShopDO> shops);

}
