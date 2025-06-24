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
import com.somle.amazon.controller.vo.AmazonSpOrderItemRespVO;
import com.somle.amazon.controller.vo.AmazonSpOrderRespVO;
import com.somle.amazon.model.AmazonSpAuthDO;
import com.somle.esb.enums.PlatformEnum;
import com.somle.lazada.model.reps.LazadaProductResp;
import com.somle.lazada.service.LazadaClient;
import com.somle.walmart.model.WalmartToken;
import com.somle.wangdian.model.resp.WangdianProductResp;
import com.somle.wangdian.model.resp.WangdianShopResp;
import com.somle.wangdian.model.resp.WangdianTradeRespVO;
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
public class WangdianToOmsConverter {

    @Resource
    OmsShopApi omsShopApi;

    @Resource
    OmsShopProductApi omsShopProductApi;
    @Resource
    OmsOrderApi omsOrderApi;

    private PlatformEnum platform = PlatformEnum.WANGDIAN;

    public List<OmsShopSaveReqDTO> toShops(List<WangdianShopResp.Shop> shops) {

        List<OmsShopDTO> existShops = omsShopApi.getByPlatformCode(this.platform.toString());
        // 使用Map存储已存在的店铺，key = platformShopCode, value = OmsShopDO
        Map<String, OmsShopDTO> existShopMap = Optional.ofNullable(existShops)
            .orElse(Collections.emptyList())
            .stream()
            .collect(Collectors.toMap(omsShopDO -> omsShopDO.getExternalId(), omsShopDO -> omsShopDO));

        List<OmsShopSaveReqDTO> saveReqDTOs = shops.stream()
            .map(shop -> {
                OmsShopSaveReqDTO shopDTO = new OmsShopSaveReqDTO();
                MapUtils.findAndThen(existShopMap, shop.getShopNo(), omsShopDTO -> shopDTO.setId(omsShopDTO.getId()));
                shopDTO.setName(null);
                shopDTO.setExternalName(shop.getShopName());
                shopDTO.setCode(null);
                shopDTO.setExternalId(shop.getShopNo());
                shopDTO.setPlatformCode(this.platform.toString());
                shopDTO.setType(ShopTypeEnum.ONLINE.getType());
                return shopDTO;
            })
            .collect(Collectors.toList());
        return saveReqDTOs;
    }


    public List<OmsShopProductSaveReqDTO> toProducts(List<WangdianProductResp.Goods> products) {

        Map<String, OmsShopDTO> omsShopDTOMap = omsShopApi.getByPlatformCode(this.platform.toString()).stream()
            .collect(Collectors.toMap(OmsShopDTO::getExternalId, Function.identity()));

        if (MapUtil.isEmpty(omsShopDTOMap)) {
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
        for (WangdianProductResp.Goods product : products) {
            OmsShopProductSaveReqDTO shopProductDTO = new OmsShopProductSaveReqDTO();
            MapUtils.findAndThen(existShopProductMap, product.getRecId(),
                omsShopProductDO -> shopProductDTO.setId(omsShopProductDO.getId()));
            MapUtils.findAndThen(omsShopDTOMap, product.getShopNo(), omsShopDTO -> shopProductDTO.setShopId(omsShopDTO.getId()));
            shopProductDTO.setCode(product.getApiGoodsId());
            shopProductDTO.setName(product.getApiGoodsName());
            shopProductDTO.setExternalId(product.getRecId());
            shopProductDTO.setUrl(product.getPicUrl());
            shopProductDTO.setPrice(product.getPrice());
            shopProductDTO.setSellableQty(product.getStockNum().intValue());
            omsShopProductDOs.add(shopProductDTO);

        }
        return omsShopProductDOs;
    }


    public List<OmsOrderSaveReqDTO> toOrders(List<WangdianTradeRespVO.TradeVO> orders) {
        if (CollectionUtil.isEmpty(orders)) {
            return CollectionUtil.empty(List.class);
        }

        // key是platformShopCode
        Map<String, OmsShopDTO> omsShopMap = omsShopApi.getByPlatformCode(this.platform.toString())
            .stream().collect(Collectors.toMap(OmsShopDTO::getExternalId, Function.identity()));

        List<OmsOrderDTO> existOrders = omsOrderApi.getByPlatformCode(this.platform.toString());

        // 使用Map存储已存在的订单，key = sourceNo, value = OmsOrderDO
        Map<String, OmsOrderDTO> existOrderMap = Optional.ofNullable(existOrders)
            .orElse(Collections.emptyList())
            .stream()
            .collect(Collectors.toMap(omsOrderDTO -> omsOrderDTO.getExternalId(), omsOrderDTO -> omsOrderDTO));


        List<OmsOrderSaveReqDTO> omsOrderSaveReqDTOs = new ArrayList<>();
        for (WangdianTradeRespVO.TradeVO order : orders) {
            OmsOrderSaveReqDTO omsOrderSaveReqDTO = new OmsOrderSaveReqDTO();
            MapUtils.findAndThen(existOrderMap, order.getTradeNo(), omsOrderDTO -> {
                omsOrderSaveReqDTO.setId(omsOrderDTO.getId());
                omsOrderSaveReqDTO.setCode(omsOrderDTO.getCode());
            });
            omsOrderSaveReqDTO.setPlatformCode(this.platform.toString());
            omsOrderSaveReqDTO.setExternalId(order.getTradeNo());
            MapUtils.findAndThen(omsShopMap, order.getShopNo(), omsShopDTO -> omsOrderSaveReqDTO.setShopId(omsShopDTO.getId()));
            omsOrderSaveReqDTO.setPayTime(order.getPayTime());
            omsOrderSaveReqDTO.setOrderCreateTime(order.getTradeTime());
            omsOrderSaveReqDTO.setTotalPrice(order.getGoodsAmount());
            omsOrderSaveReqDTO.setBuyerName(order.getCustomerName());
            omsOrderSaveReqDTO.setExternalAddress(JsonUtilsX.toJsonString(order.getReceiverAddress()));
            omsOrderSaveReqDTO.setAddress1(order.getReceiverAddress());
            omsOrderSaveReqDTO.setPhone(order.getReceiverMobile());
            omsOrderSaveReqDTO.setPostalCode(order.getReceiverZip());
            omsOrderSaveReqDTO.setRecipientName(order.getReceiverName());
            omsOrderSaveReqDTO.setRecipientCountryCode("CN");


            List<WangdianTradeRespVO.GoodsVO> goodsList = order.getGoodsList();
            List<OmsOrderItemSaveReqDTO> omsOrderItemSaveReqDTOs = new ArrayList<>();
            for (WangdianTradeRespVO.GoodsVO orderItem : goodsList) {
                OmsOrderItemSaveReqDTO omsOrderItemSaveReqDTO = new OmsOrderItemSaveReqDTO();
                omsOrderItemSaveReqDTO.setExternalId(orderItem.getSrcOid());
                omsOrderItemSaveReqDTO.setShopProductExternalCode(orderItem.getPlatformGoodsId());
                omsOrderItemSaveReqDTO.setQty(orderItem.getNum().intValue());
                omsOrderItemSaveReqDTO.setPrice(orderItem.getPrice());
                omsOrderItemSaveReqDTOs.add(omsOrderItemSaveReqDTO);
            }
            omsOrderSaveReqDTO.setOmsOrderItemSaveReqDTOList(omsOrderItemSaveReqDTOs);
            omsOrderSaveReqDTOs.add(omsOrderSaveReqDTO);
        }
        return omsOrderSaveReqDTOs;
    }
}
