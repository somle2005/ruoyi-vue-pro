package com.somle.esb.converter.oms;

import cn.hutool.core.collection.CollectionUtil;
import cn.hutool.core.map.MapUtil;
import cn.hutool.core.util.ObjectUtil;
import cn.iocoder.yudao.framework.common.util.collection.MapUtils;
import cn.iocoder.yudao.framework.common.util.json.JsonUtilsX;
import cn.iocoder.yudao.module.oms.api.OmsOrderApi;
import cn.iocoder.yudao.module.oms.api.OmsShopApi;
import cn.iocoder.yudao.module.oms.api.OmsShopProductApi;
import cn.iocoder.yudao.module.oms.api.dto.*;
import cn.iocoder.yudao.module.oms.api.enums.shop.ShopTypeEnum;
import com.somle.esb.enums.PlatformEnum;
import com.somle.xiaohongshu.model.XiaoHongShuAccount;
import com.xiaohongshu.fls.opensdk.entity.order.Response.GetOrderDetailResponse;
import com.xiaohongshu.fls.opensdk.entity.order.Response.OrderReceiverInfo;
import com.xiaohongshu.fls.opensdk.entity.product.response.v3.GetDetailSkuListResponse;
import com.xiaohongshu.fls.opensdk.entity.product.response.v3.SkuDetail;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import static cn.iocoder.yudao.framework.common.exception.util.ServiceExceptionUtil.exception;
import static cn.iocoder.yudao.module.oms.api.enums.OmsErrorCodeConstants.OMS_SYNC_SHOP_INFO_FIRST;

@Component
@Slf4j
public class XiaoHongShuToOmsConverter {

    @Resource
    OmsShopApi omsShopApi;

    @Resource
    OmsShopProductApi omsShopProductApi;

    @Resource
    OmsOrderApi omsOrderApi;

    private PlatformEnum platform = PlatformEnum.XIAOHONGSHU;

    public OmsShopSaveReqDTO toShops(XiaoHongShuAccount xiaoHongShuAccount) {

        List<OmsShopDTO> existShops = omsShopApi.getByPlatformCode(this.platform.toString());
        // 使用Map存储已存在的店铺，key = platformShopCode, value = OmsShopDO
        Map<String, OmsShopDTO> existShopMap = Optional.ofNullable(existShops)
            .orElse(Collections.emptyList())
            .stream()
            .collect(Collectors.toMap(omsShopDO -> omsShopDO.getExternalId(), omsShopDO -> omsShopDO));

        OmsShopSaveReqDTO shopDTO = new OmsShopSaveReqDTO();
        MapUtils.findAndThen(existShopMap, xiaoHongShuAccount.getAppKey(), omsShopDTO -> shopDTO.setId(omsShopDTO.getId()));
        shopDTO.setName(null);
        shopDTO.setExternalName(xiaoHongShuAccount.getAppKey());
        shopDTO.setCode(null);
        shopDTO.setExternalId(xiaoHongShuAccount.getAppKey());
        shopDTO.setPlatformCode(this.platform.toString());
        shopDTO.setType(ShopTypeEnum.ONLINE.getType());
        return shopDTO;
    }


    public List<OmsShopProductSaveReqDTO> toProducts(List<GetDetailSkuListResponse.Product> products, XiaoHongShuAccount xiaoHongShuAccount) {

        Map<String, OmsShopDTO> omsShopDTOMap = omsShopApi.getByPlatformCode(this.platform.toString()).stream()
            .collect(Collectors.toMap(OmsShopDTO::getExternalId, Function.identity()));

        OmsShopDTO omsShopDTO = omsShopDTOMap.get(xiaoHongShuAccount.getAppKey());

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
        for (GetDetailSkuListResponse.Product product : products) {
            SkuDetail skuDetail = product.getSku();
            OmsShopProductSaveReqDTO shopProductDTO = new OmsShopProductSaveReqDTO();
            MapUtils.findAndThen(existShopProductMap, skuDetail.getId(),
                omsShopProductDO -> shopProductDTO.setId(omsShopProductDO.getId()));
            shopProductDTO.setShopId(omsShopDTO.getId());
            shopProductDTO.setCode(skuDetail.getScSkucode());
            shopProductDTO.setName(skuDetail.getName());
            shopProductDTO.setExternalId(skuDetail.getId());
            shopProductDTO.setPrice(new BigDecimal(skuDetail.getPrice()));
            shopProductDTO.setSellableQty(skuDetail.getStock());
            omsShopProductDOs.add(shopProductDTO);
        }
        return omsShopProductDOs;
    }


    public List<OmsOrderSaveReqDTO> toOrders(List<GetOrderDetailResponse> orders, XiaoHongShuAccount xiaoHongShuAccount) {
        if (CollectionUtil.isEmpty(orders)) {
            return CollectionUtil.empty(List.class);
        }


        List<OmsOrderDTO> existOrders = omsOrderApi.getByPlatformCode(this.platform.toString());

        // 使用Map存储已存在的订单，key = sourceNo, value = OmsOrderDO
        Map<String, OmsOrderDTO> existOrderMap = Optional.ofNullable(existOrders)
            .orElse(Collections.emptyList())
            .stream()
            .collect(Collectors.toMap(omsOrderDTO -> omsOrderDTO.getExternalId(), omsOrderDTO -> omsOrderDTO));

        List<OmsShopDTO> existShops = omsShopApi.getByPlatformCode(this.platform.toString());
        // 使用Map存储已存在的店铺，key = platformShopCode, value = OmsShopDO
        Map<String, OmsShopDTO> existShopMap = Optional.ofNullable(existShops)
            .orElse(Collections.emptyList())
            .stream()
            .collect(Collectors.toMap(omsShopDO -> omsShopDO.getExternalId(), omsShopDO -> omsShopDO));


        List<OmsOrderSaveReqDTO> omsOrderSaveReqDTOs = new ArrayList<>();
        for (GetOrderDetailResponse order : orders) {
            OmsOrderSaveReqDTO omsOrderSaveReqDTO = new OmsOrderSaveReqDTO();

            MapUtils.findAndThen(existOrderMap, order.getOrderId(), omsOrderDTO -> {
                omsOrderSaveReqDTO.setId(omsOrderDTO.getId());
                omsOrderSaveReqDTO.setCode(omsOrderDTO.getCode());
            });

            MapUtils.findAndThen(existShopMap, xiaoHongShuAccount.getAppKey(), omsShopDTO -> omsOrderSaveReqDTO.setShopId(omsShopDTO.getId()));
            omsOrderSaveReqDTO.setPlatformCode(this.platform.toString());
            omsOrderSaveReqDTO.setExternalId(order.getOrderId());
            omsOrderSaveReqDTO.setOrderCreateTime(parseTime(order.getCreatedTime()));
            omsOrderSaveReqDTO.setPayTime(parseTime(order.getPaidTime()));
            omsOrderSaveReqDTO.setOutboundLatestTime(parseTime(order.getPromiseLastDeliveryTime()));
            omsOrderSaveReqDTO.setReceiveLatestTime(parseTime(order.getFinishTime()));

            omsOrderSaveReqDTO.setCity(order.getReceiverCityName());
            omsOrderSaveReqDTO.setState(order.getReceiverProvinceName());
            omsOrderSaveReqDTO.setRecipientName(order.getReceiverName());
            omsOrderSaveReqDTO.setRecipientCountryCode(order.getReceiverCountryId());

            OrderReceiverInfo orderReceiverInfo = order.getOrderReceiverInfo();
            if (ObjectUtil.isNotEmpty(orderReceiverInfo)) {
                omsOrderSaveReqDTO.setExternalAddress(JsonUtilsX.toJsonString(orderReceiverInfo));
                omsOrderSaveReqDTO.setPhone(orderReceiverInfo.getReceiverPhone());
            }
            omsOrderSaveReqDTO.setTotalPrice(new BigDecimal(order.getTotalPayAmount()));
            List<GetOrderDetailResponse.OrderSkuDTOV3> skuList = order.getSkuList();
            List<OmsOrderItemSaveReqDTO> omsOrderItemSaveReqDTOs = new ArrayList<>();
            for (GetOrderDetailResponse.OrderSkuDTOV3 sku : skuList) {
                OmsOrderItemSaveReqDTO omsOrderItemSaveReqDTO = new OmsOrderItemSaveReqDTO();
                List<GetOrderDetailResponse.OrderSkuDetailDTO> skuDetailList = sku.getSkuDetailList();
                omsOrderItemSaveReqDTO.setExternalId(sku.getSkuId());
                omsOrderItemSaveReqDTO.setShopProductExternalCode(skuDetailList.get(0).getScSkuCode());
                omsOrderItemSaveReqDTO.setQty(sku.getSkuQuantity());
                omsOrderItemSaveReqDTO.setPrice(new BigDecimal(skuDetailList.get(0).getPricePerSku()));
                omsOrderItemSaveReqDTOs.add(omsOrderItemSaveReqDTO);
            }
            omsOrderSaveReqDTO.setOmsOrderItemSaveReqDTOList(omsOrderItemSaveReqDTOs);
            omsOrderSaveReqDTOs.add(omsOrderSaveReqDTO);
        }
        return omsOrderSaveReqDTOs;
    }

    public LocalDateTime parseTime(long time) {
        return Instant.ofEpochMilli(time)
            .atZone(ZoneId.systemDefault())
            .toLocalDateTime();
    }
}
