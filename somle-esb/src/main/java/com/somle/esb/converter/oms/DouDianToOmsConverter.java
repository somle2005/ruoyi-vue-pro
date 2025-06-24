package com.somle.esb.converter.oms;

import cn.iocoder.yudao.framework.common.util.collection.MapUtils;
import cn.iocoder.yudao.module.oms.api.OmsOrderApi;
import cn.iocoder.yudao.module.oms.api.OmsShopApi;
import cn.iocoder.yudao.module.oms.api.OmsShopProductApi;
import cn.iocoder.yudao.module.oms.api.dto.OmsShopDTO;
import cn.iocoder.yudao.module.oms.api.dto.OmsShopProductDTO;
import cn.iocoder.yudao.module.oms.api.dto.OmsShopProductSaveReqDTO;
import cn.iocoder.yudao.module.oms.api.dto.OmsShopSaveReqDTO;
import cn.iocoder.yudao.module.oms.api.enums.shop.ShopTypeEnum;
import com.doudian.open.api.product_listV2.data.DataItem;
import com.somle.doudian.model.DouDianAccount;
import com.somle.esb.enums.PlatformEnum;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import static cn.iocoder.yudao.framework.common.exception.util.ServiceExceptionUtil.exception;
import static cn.iocoder.yudao.module.oms.api.enums.OmsErrorCodeConstants.OMS_SYNC_SHOP_INFO_FIRST;

@Component
@Slf4j
public class DouDianToOmsConverter {

    @Resource
    OmsShopApi omsShopApi;

    @Resource
    OmsShopProductApi omsShopProductApi;

    @Resource
    OmsOrderApi omsOrderApi;

    private PlatformEnum platform = PlatformEnum.DOUDIAN;

    public OmsShopSaveReqDTO toShops(DouDianAccount douDianAccount) {

        List<OmsShopDTO> existShops = omsShopApi.getByPlatformCode(this.platform.toString());
        // 使用Map存储已存在的店铺，key = platformShopCode, value = OmsShopDO
        Map<String, OmsShopDTO> existShopMap = Optional.ofNullable(existShops)
            .orElse(Collections.emptyList())
            .stream()
            .collect(Collectors.toMap(omsShopDO -> omsShopDO.getExternalId(), omsShopDO -> omsShopDO));
        OmsShopSaveReqDTO shopDTO = new OmsShopSaveReqDTO();
        MapUtils.findAndThen(existShopMap, douDianAccount.getShopId().toString(), omsShopDTO -> shopDTO.setId(omsShopDTO.getId()));
        shopDTO.setName(null);
        shopDTO.setExternalName(douDianAccount.getShopName());
        shopDTO.setCode(null);
        shopDTO.setExternalId(douDianAccount.getShopId().toString());
        shopDTO.setPlatformCode(this.platform.toString());
        shopDTO.setType(ShopTypeEnum.ONLINE.getType());
        return shopDTO;
    }

    public List<OmsShopProductSaveReqDTO> toProducts(List<DataItem> products, DouDianAccount douDianAccount) {
        OmsShopDTO omsShopDTO = omsShopApi.getShopByPlatformShopCode(douDianAccount.getShopId().toString());
        if (omsShopDTO == null) {
            throw exception(OMS_SYNC_SHOP_INFO_FIRST, this.platform.toString());
        }

        List<OmsShopProductDTO> existShopProducts = omsShopProductApi.getByShopIds(List.of(omsShopDTO.getId()));
        // 使用Map存储已存在的店铺产品信息，key=sourceId, value=OmsShopProductDO
        Map<String, OmsShopProductDTO> existShopProductMap = Optional.ofNullable(existShopProducts)
            .orElse(Collections.emptyList())
            .stream()
            .collect(Collectors.toMap(omsShopProductDO -> omsShopProductDO.getExternalId(), omsShopProductDO -> omsShopProductDO));


        List<OmsShopProductSaveReqDTO> omsShopProductDOs = products.stream()
            .map(productRepsDTO -> {
                    OmsShopProductSaveReqDTO shopProductDTO = new OmsShopProductSaveReqDTO();
                    MapUtils.findAndThen(existShopProductMap, productRepsDTO.getProductId().toString(), omsShopProductDO -> shopProductDTO.setId(omsShopProductDO.getId()));
                    shopProductDTO.setShopId(omsShopDTO.getId());
                    shopProductDTO.setCode(productRepsDTO.getProductId().toString());
                    shopProductDTO.setExternalId(productRepsDTO.getProductId().toString());
                    shopProductDTO.setName(productRepsDTO.getName());
                    shopProductDTO.setPrice(new BigDecimal(productRepsDTO.getMarketPrice()));
                    shopProductDTO.setUrl(productRepsDTO.getImg());
                    return shopProductDTO;
                }
            ).toList();
        return omsShopProductDOs;
    }

//    public List<OmsOrderSaveReqDTO> toOrders(List<ShopOrderListItem> orders, DouDianAccount douDianAccount) {
//
//        if (CollectionUtil.isEmpty(orders)) {
//            return CollectionUtil.empty(List.class);
//        }
//
//
//        List<OmsOrderDTO> existOrders = omsOrderApi.getByPlatformCode(this.platform.toString());
//
//        // 使用Map存储已存在的订单，key = sourceNo, value = OmsOrderDO
//        Map<String, OmsOrderDTO> existOrderMap = Optional.ofNullable(existOrders)
//            .orElse(Collections.emptyList())
//            .stream()
//            .collect(Collectors.toMap(omsOrderDTO -> omsOrderDTO.getExternalId(), omsOrderDTO -> omsOrderDTO));
//
//        // key是platformShopCode
//        Map<String, OmsShopDTO> omsShopMap = omsShopApi.getByPlatformCode(this.platform.toString())
//            .stream().collect(Collectors.toMap(OmsShopDTO::getExternalId, Function.identity()));
//
//
//        List<OmsOrderSaveReqDTO> omsOrderSaveReqDTOs = new ArrayList<>();
//        for (ShopOrderListItem order : orders) {
//            OmsOrderSaveReqDTO omsOrderSaveReqDTO = new OmsOrderSaveReqDTO();
//            MapUtils.findAndThen(existOrderMap, order.getOrderId(), omsOrderDTO -> {
//                omsOrderSaveReqDTO.setId(omsOrderDTO.getId());
//                omsOrderSaveReqDTO.setCode(omsOrderDTO.getCode());
//            });
//            MapUtils.findAndThen(omsShopMap, douDianAccount.getShopId().toString(), omsShopDTO -> omsOrderSaveReqDTO.setShopId(omsShopDTO.getId()));
//            omsOrderSaveReqDTO.setPlatformCode(this.platform.toString());
//            omsOrderSaveReqDTO.setExternalId(order.getOrderId());
//            omsOrderSaveReqDTO.setOrderCreateTime(paseTime(order.getCreateTime()));
//            omsOrderSaveReqDTO.setPayTime(paseTime(order.getPayTime()));
//            omsOrderSaveReqDTO.setTotalPrice(new BigDecimal(order.getOrderAmount() / 100));
//            omsOrderSaveReqDTO.setReceiveLatestTime(paseTime(order.getLatestReceiptTime()));
//
//            omsOrderSaveReqDTO.setBuyerCountryCode("CN");
//
//
//            List<CdiscountOrderRespVO.OrderLine> orderLineList = order.getLines();
//            List<OmsOrderItemSaveReqDTO> omsOrderItemSaveReqDTOs = new ArrayList<>();
//            //总运费
//            BigDecimal shippingFee = new BigDecimal(0);
//            for (CdiscountOrderRespVO.OrderLine orderLine : orderLineList) {
//                OmsOrderItemSaveReqDTO omsOrderItemSaveReqDTO = new OmsOrderItemSaveReqDTO();
//                String productId = orderLine.getOffer().getProductId();
//                omsOrderItemSaveReqDTO.setShopProductExternalId(productId);
//                omsOrderItemSaveReqDTO.setShopProductExternalCode(orderLine.getOffer().getProductId());
//                shippingFee = shippingFee.add(Optional.ofNullable(orderLine.getSellingPrice()).get().getShippingCost());
//                omsOrderItemSaveReqDTO.setPrice(orderLine.getTotalPrice().getSellingPrice());
//                omsOrderItemSaveReqDTO.setQty(orderLine.getQuantity());
//                omsOrderItemSaveReqDTO.setExternalId(orderLine.getOrderLineId());
//                omsOrderItemSaveReqDTOs.add(omsOrderItemSaveReqDTO);
//
//
//                CdiscountOrderRespVO.ShippingAddress shippingAddress = orderLine.getShippingAddress();
//                if (shippingAddress != null) {
//                    omsOrderSaveReqDTO.setExternalAddress(JsonUtilsX.toJsonString(shippingAddress));
//                    omsOrderSaveReqDTO.setAddress1(shippingAddress.getAddressLine1());
//                    omsOrderSaveReqDTO.setAddress3(shippingAddress.getAddressLine3());
//                    omsOrderSaveReqDTO.setCity(shippingAddress.getCity());
//                    omsOrderSaveReqDTO.setPostalCode(shippingAddress.getPostalCode());
//                    omsOrderSaveReqDTO.setRecipientName(shippingAddress.getFirstName().toUpperCase() + " " + shippingAddress.getLastName().toUpperCase());
//                    omsOrderSaveReqDTO.setRecipientCountryCode(shippingAddress.getCountryCode());
//                    omsOrderSaveReqDTO.setPhone(shippingAddress.getPhone());
//                    omsOrderSaveReqDTO.setEmail(shippingAddress.getEmail());
//                }
//            }
//            omsOrderSaveReqDTO.setShippingFee(shippingFee);
//            omsOrderSaveReqDTO.setOmsOrderItemSaveReqDTOList(omsOrderItemSaveReqDTOs);
//            omsOrderSaveReqDTOs.add(omsOrderSaveReqDTO);
//        }
//        return omsOrderSaveReqDTOs;
//    }
//
//    public LocalDateTime paseTime(Long time) {
//        Instant instant = Instant.ofEpochMilli(time);
//        LocalDateTime localDateTime = LocalDateTime.ofInstant(instant, ZoneId.systemDefault());
//        return localDateTime;
//    }
}
