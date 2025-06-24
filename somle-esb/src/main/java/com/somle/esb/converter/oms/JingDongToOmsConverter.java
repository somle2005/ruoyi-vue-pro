package com.somle.esb.converter.oms;


import cn.hutool.core.map.MapUtil;
import cn.hutool.core.util.ObjectUtil;
import cn.iocoder.yudao.framework.common.util.collection.MapUtils;
import cn.iocoder.yudao.module.oms.api.OmsOrderApi;
import cn.iocoder.yudao.module.oms.api.OmsShopApi;
import cn.iocoder.yudao.module.oms.api.OmsShopProductApi;
import cn.iocoder.yudao.module.oms.api.dto.OmsShopDTO;
import cn.iocoder.yudao.module.oms.api.dto.OmsShopProductDTO;
import cn.iocoder.yudao.module.oms.api.dto.OmsShopProductSaveReqDTO;
import cn.iocoder.yudao.module.oms.api.dto.OmsShopSaveReqDTO;
import cn.iocoder.yudao.module.oms.api.enums.shop.ShopTypeEnum;
import com.somle.esb.enums.PlatformEnum;
import com.somle.jingdong.model.resp.JingDongSellerVenderInfoGetResp;
import com.somle.jingdong.model.resp.JingDongShopProductResp;
import com.somle.jingdong.service.JingDongClient;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import static cn.iocoder.yudao.framework.common.exception.util.ServiceExceptionUtil.exception;
import static cn.iocoder.yudao.module.oms.api.enums.OmsErrorCodeConstants.OMS_SYNC_SHOP_INFO_FIRST;

@Component
@Slf4j
public class JingDongToOmsConverter {
    @Resource
    OmsShopApi omsShopApi;

    @Resource
    OmsShopProductApi omsShopProductApi;

    @Resource
    OmsOrderApi omsOrderApi;

    private PlatformEnum platform = PlatformEnum.JINGDONG;

    private JingDongSellerVenderInfoGetResp shopResp;

    public OmsShopSaveReqDTO toShops(JingDongSellerVenderInfoGetResp shopResp) {
        this.shopResp = shopResp;
        JingDongSellerVenderInfoGetResp.VenderInfoResult venderInfoResult = shopResp.getVenderInfoResult();
        List<OmsShopDTO> existShops = omsShopApi.getByPlatformCode(this.platform.toString());
        // 使用Map存储已存在的店铺，key = platformShopCode, value = OmsShopDO
        Map<String, OmsShopDTO> existShopMap = Optional.ofNullable(existShops)
            .orElse(Collections.emptyList())
            .stream()
            .collect(Collectors.toMap(omsShopDO -> omsShopDO.getExternalId(), omsShopDO -> omsShopDO));
        OmsShopSaveReqDTO shopDTO = new OmsShopSaveReqDTO();
        MapUtils.findAndThen(existShopMap, venderInfoResult.getShopId().toString(), omsShopDTO -> shopDTO.setId(omsShopDTO.getId()));
        shopDTO.setName(null);
        shopDTO.setExternalName(venderInfoResult.getShopName());
        shopDTO.setCode(null);
        shopDTO.setExternalId(venderInfoResult.getShopId().toString());
        shopDTO.setPlatformCode(this.platform.toString());
        shopDTO.setType(ShopTypeEnum.ONLINE.getType());
        return shopDTO;
    }


    public List<OmsShopProductSaveReqDTO> toProducts(List<JingDongShopProductResp.SkuItem> products, JingDongClient jingDongClient) {

        Map<String, OmsShopDTO> omsShopDTOMap = omsShopApi.getByPlatformCode(this.platform.toString()).stream()
            .collect(Collectors.toMap(OmsShopDTO::getExternalId, Function.identity()));
        JingDongSellerVenderInfoGetResp.VenderInfoResult venderInfoResult = jingDongClient.getShopInfo().getVenderInfoResult();
        OmsShopDTO omsShopDTO = omsShopDTOMap.get(venderInfoResult.getShopId().toString());

        if (MapUtil.isEmpty(omsShopDTOMap) || ObjectUtil.isEmpty(omsShopDTO)) {
            throw exception(OMS_SYNC_SHOP_INFO_FIRST, this.platform.toString());
        }
        List<Long> existShopIds = omsShopDTOMap.values().stream().map(OmsShopDTO::getId).toList();
        List<OmsShopProductDTO> existShopProducts = omsShopProductApi.getByShopIds(existShopIds);
        // 使用Map存储已存在的店铺产品信息，key=externalId, value=OmsShopProductDO
        Map<String, OmsShopProductDTO> existShopProductMap = Optional.ofNullable(existShopProducts)
            .orElse(Collections.emptyList())
            .stream()
            .collect(Collectors.toMap(omsShopProductDO -> omsShopProductDO.getExternalId(), omsShopProductDO -> omsShopProductDO));

        List<OmsShopProductSaveReqDTO> omsShopProductDOs = new ArrayList<>();
        for (JingDongShopProductResp.SkuItem product : products) {
            OmsShopProductSaveReqDTO shopProductDTO = new OmsShopProductSaveReqDTO();
            MapUtils.findAndThen(existShopProductMap, omsShopDTO.getId() + "#" + product.getSkuId(),
                omsShopProductDO -> shopProductDTO.setId(omsShopProductDO.getId()));
            shopProductDTO.setShopId(omsShopDTO.getId());
            shopProductDTO.setCode(product.getSkuId().toString());
            shopProductDTO.setName(product.getSkuName());
            shopProductDTO.setExternalId(omsShopDTO.getId() + "#" + product.getSkuId());
            shopProductDTO.setPrice(new BigDecimal(product.getJdPrice()));
            shopProductDTO.setSellableQty(product.getStockNum());
            omsShopProductDOs.add(shopProductDTO);
        }
        return omsShopProductDOs;
    }
}
