package cn.iocoder.yudao.module.oms.service.impl;


import cn.hutool.core.collection.CollectionUtil;
import cn.iocoder.yudao.framework.common.util.collection.CollectionUtils;
import cn.iocoder.yudao.module.oms.dal.dataobject.OmsShopDO;
import cn.iocoder.yudao.module.oms.dal.mysql.OmsShopMapper;
import cn.iocoder.yudao.module.oms.enums.SalesPlatformEnum;
import cn.iocoder.yudao.module.oms.service.OmsShopService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

import static cn.iocoder.yudao.framework.common.exception.util.ServiceExceptionUtil.exception;
import static cn.iocoder.yudao.module.oms.enums.ErrorCodeConstants.OMS_SYNC_SHOP_INFO_LACK;

@Service
@Slf4j
public class OmsShopServiceImpl extends ServiceImpl<OmsShopMapper, OmsShopDO> implements OmsShopService {

    @Resource
    private OmsShopMapper omsShopMapper;

    @Override
    public List<OmsShopDO> getByPlatformCode(String platformCode) {
        return omsShopMapper.getByPlatformCode(platformCode);
    }

    @Override
    public OmsShopDO getByPlatformShopCode(String platformShopCode) {
        return omsShopMapper.getByPlatformShopCode(platformShopCode);
    }

    @Override
    public void syncShops(SalesPlatformEnum salesPlatform, List<OmsShopDO> shops) {
        if (CollectionUtils.isEmpty(shops)) {
            throw exception(OMS_SYNC_SHOP_INFO_LACK);
        }

        List<OmsShopDO> createShops = new ArrayList<>();
        List<OmsShopDO> updateShops = new ArrayList<>();

        List<OmsShopDO> existShops = getByPlatformCode(salesPlatform.name());

        // 使用Map存储已存在的店铺，key=platformShopCode, value=OmsShopDO
        Map<String, OmsShopDO> existShopMap = Optional.ofNullable(existShops)
            .orElse(Collections.emptyList())
            .stream()
            .collect(Collectors.toMap(omsShopDO -> omsShopDO.getPlatformShopCode(), omsShopDO -> omsShopDO));

        shops.forEach(shop -> {
            OmsShopDO existShop = existShopMap.get(shop.getPlatformShopCode());
            if (existShop != null) {
                shop.setId(existShop.getId());
                updateShops.add(shop);
            } else {
                // 新增
                createShops.add(shop);
            }
        });

        if (CollectionUtil.isNotEmpty(createShops)) {
            saveBatch(createShops);
        }

        if (CollectionUtil.isNotEmpty(updateShops)) {
            updateBatchById(updateShops);
        }
        log.info("sync shop profile success,salesPlatform:{},shopCount:{}", salesPlatform.name(), shops.size());
    }
}
