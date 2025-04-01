package com.somle.esb.job.oms.shop;

import cn.iocoder.yudao.framework.common.util.collection.CollectionUtils;
import cn.iocoder.yudao.framework.tenant.core.context.TenantContextHolder;
import cn.iocoder.yudao.module.oms.dal.dataobject.OmsShopDO;
import cn.iocoder.yudao.module.oms.enums.SalesPlatformEnum;
import cn.iocoder.yudao.module.oms.enums.SyncOmsTypeEnum;
import com.somle.esb.client.oms.SyncOmsClient;
import com.somle.esb.converter.oms.SalesPlatformToOmsConverter;
import com.somle.esb.enums.TenantId;
import com.somle.esb.job.oms.SyncOmsDataJob;
import com.somle.esb.model.OmsProfileDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

import static cn.iocoder.yudao.framework.common.exception.util.ServiceExceptionUtil.exception;
import static com.somle.esb.enums.ErrorCodeConstants.OMS_SYNC_SHOP_INFO_LACK;

@Slf4j
@Component
public class SyncShopsJob extends SyncOmsDataJob {


    /**
     * @param salesPlatform        指定销售平台
     * @param shopProfileClientMap
     * @Author: gumaomao
     * @Date: 2025/03/28
     * @Description: 同步指定平台的店铺资料
     * @return:
     */
    public void syncShopProfile(SalesPlatformEnum salesPlatform, Map<SalesPlatformEnum, SyncOmsClient> shopProfileClientMap) {
        // 设置租户为默认租户
        TenantContextHolder.setTenantId(TenantId.DEFAULT.getId());
        // 按平台获取店铺资料对接的客户端类型
        SyncOmsClient<?, ?> shopProfileClient = shopProfileClientMap.get(salesPlatform);
        if (shopProfileClient == null) {
            log.error(salesPlatform.name() + " Oms同步客户端未实现，请参考 SyncOmsClient 实现");
            return;
        }

        // 获取店铺信息
        List<?> shops = shopProfileClient.getShops();

        if (CollectionUtils.isEmpty(shops)) {
            throw exception(OMS_SYNC_SHOP_INFO_LACK);
        }

        // 转换VO
        OmsProfileDTO<List<?>> omsProfileDTO = new OmsProfileDTO<>(salesPlatform, SyncOmsTypeEnum.SHOP, shops);
        List<OmsShopDO> shopVOs = SalesPlatformToOmsConverter.convert(omsProfileDTO, shopProfileClient);

        // 同步店铺资料
        omsShopService.syncShops(salesPlatform, shopVOs);
    }

}
