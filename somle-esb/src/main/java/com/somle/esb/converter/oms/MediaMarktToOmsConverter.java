package com.somle.esb.converter.oms;

import cn.hutool.core.collection.CollectionUtil;
import cn.iocoder.yudao.framework.common.util.collection.MapUtils;
import cn.iocoder.yudao.framework.common.util.json.JsonUtilsX;
import cn.iocoder.yudao.module.oms.api.OmsOrderApi;
import cn.iocoder.yudao.module.oms.api.OmsShopApi;
import cn.iocoder.yudao.module.oms.api.OmsShopProductApi;
import cn.iocoder.yudao.module.oms.api.dto.*;
import cn.iocoder.yudao.module.oms.api.enums.shop.ShopTypeEnum;
import com.somle.esb.enums.PlatformEnum;
import com.somle.mediamarkt.model.resp.MediaMarktOrderResp;
import com.somle.mediamarkt.model.resp.MediaMarktShopResp;
import com.somle.mediamarkt.service.MediaMarktClient;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

import static cn.iocoder.yudao.framework.common.exception.util.ServiceExceptionUtil.exception;
import static cn.iocoder.yudao.module.oms.api.enums.OmsErrorCodeConstants.OMS_SYNC_SHOP_INFO_FIRST;

@Component
@Slf4j
public class MediaMarktToOmsConverter {

    @Resource
    OmsShopApi omsShopApi;

    @Resource
    OmsShopProductApi omsShopProductApi;

    @Resource
    OmsOrderApi omsOrderApi;

    private PlatformEnum platform = PlatformEnum.MEDIAMARKT;

    private MediaMarktShopResp mediaMarktShopResp;

    public OmsShopSaveReqDTO toShops(MediaMarktShopResp mediaMarktShopResp) {
        this.mediaMarktShopResp = mediaMarktShopResp;
        List<OmsShopDTO> existShops = omsShopApi.getByPlatformCode(this.platform.toString());
        // 使用Map存储已存在的店铺，key = platformShopCode, value = OmsShopDO
        Map<String, OmsShopDTO> existShopMap = Optional.ofNullable(existShops)
            .orElse(Collections.emptyList())
            .stream()
            .collect(Collectors.toMap(omsShopDO -> omsShopDO.getExternalId(), omsShopDO -> omsShopDO));
        OmsShopSaveReqDTO shopDTO = new OmsShopSaveReqDTO();
        MapUtils.findAndThen(existShopMap, mediaMarktShopResp.getShopId().toString(), omsShopDTO -> shopDTO.setId(omsShopDTO.getId()));
        shopDTO.setName(null);
        shopDTO.setExternalName(mediaMarktShopResp.getShopName());
        shopDTO.setCode(null);
        shopDTO.setExternalId(mediaMarktShopResp.getShopId().toString());
        shopDTO.setPlatformCode(this.platform.toString());
        shopDTO.setType(ShopTypeEnum.ONLINE.getType());
        return shopDTO;
    }


    public List<OmsOrderSaveReqDTO> toOrders(List<MediaMarktOrderResp.Order> orders, MediaMarktClient MediaMarketClient) {

        if (CollectionUtil.isEmpty(orders)) {
            return CollectionUtil.empty(List.class);
        }


        if (mediaMarktShopResp == null) {
            mediaMarktShopResp = MediaMarketClient.getShopInformation();
        }

        OmsShopDTO omsShopDO = omsShopApi.getShopByPlatformShopCode(mediaMarktShopResp.getShopId().toString());
        if (omsShopDO == null) {
            throw exception(OMS_SYNC_SHOP_INFO_FIRST, this.platform.toString());
        }

        List<OmsOrderDTO> existOrders = omsOrderApi.getByPlatformCode(this.platform.toString());

        // 使用Map存储已存在的订单，key = sourceNo, value = OmsOrderDO
        Map<String, OmsOrderDTO> existOrderMap = Optional.ofNullable(existOrders)
            .orElse(Collections.emptyList())
            .stream()
            .collect(Collectors.toMap(omsOrderDTO -> omsOrderDTO.getExternalId(), omsOrderDTO -> omsOrderDTO));


        List<OmsOrderSaveReqDTO> omsOrderSaveReqDTOs = new ArrayList<>();

        for (MediaMarktOrderResp.Order order : orders) {
            OmsOrderSaveReqDTO omsOrderSaveReqDTO = new OmsOrderSaveReqDTO();
            MapUtils.findAndThen(existOrderMap, order.getCommercialId(), omsOrderDTO -> omsOrderSaveReqDTO.setId(omsOrderDTO.getId()));
            omsOrderSaveReqDTO.setPlatformCode(this.platform.toString());
            omsOrderSaveReqDTO.setExternalId(order.getCommercialId());
            omsOrderSaveReqDTO.setShopId(omsShopDO.getId());
            omsOrderSaveReqDTO.setOrderCreateTime(order.getCreatedDate().plusHours(2));
            omsOrderSaveReqDTO.setPayTime(order.getCustomerDebitedDate().plusHours(2));
            omsOrderSaveReqDTO.setTotalPrice(new BigDecimal(order.getPrice()));
            MediaMarktOrderResp.Customer customer = order.getCustomer();

            if (customer != null) {
                omsOrderSaveReqDTO.setBuyerName(customer.getFirstname() + customer.getLastname());
                MediaMarktOrderResp.ShippingAddress shippingAddress = customer.getShippingAddress();
                if (shippingAddress != null) {
                    omsOrderSaveReqDTO.setExternalAddress(JsonUtilsX.toJsonString(shippingAddress));
                    omsOrderSaveReqDTO.setRecipientName(shippingAddress.getFirstname() + " " + shippingAddress.getLastname());
                    omsOrderSaveReqDTO.setCity(shippingAddress.getCity());
                    omsOrderSaveReqDTO.setPostalCode(shippingAddress.getZipCode());
                    omsOrderSaveReqDTO.setState(shippingAddress.getState());
                    omsOrderSaveReqDTO.setAddress1(shippingAddress.getStreet1());
                    omsOrderSaveReqDTO.setAddress2(shippingAddress.getStreet2());
                    omsOrderSaveReqDTO.setBuyerCountryCode(shippingAddress.getCountryIsoCode());
                    omsOrderSaveReqDTO.setRecipientCountryCode(shippingAddress.getCountryIsoCode());
                    omsOrderSaveReqDTO.setCompanyName(shippingAddress.getCompany());
                    omsOrderSaveReqDTO.setPhone(shippingAddress.getPhone());
                    omsOrderSaveReqDTO.setEmail(customer.getCustomerNotificationEmail());
                }
            }


            List<MediaMarktOrderResp.OrderLine> orderLines = order.getOrderLines();
            List<OmsOrderItemSaveReqDTO> omsOrderItemSaveReqDTOs = new ArrayList<>();
            for (MediaMarktOrderResp.OrderLine orderLine : orderLines) {
                OmsOrderItemSaveReqDTO omsOrderItemSaveReqDTO = new OmsOrderItemSaveReqDTO();
//                omsOrderItemSaveReqDTO.setShopProductId(existShopProductMap.get(lineItem.getVariantId().toString()).getId());
                omsOrderItemSaveReqDTO.setShopProductExternalCode(orderLine.getOfferSku());
                omsOrderItemSaveReqDTO.setPrice(new BigDecimal(orderLine.getPrice()));
                omsOrderItemSaveReqDTO.setQty(orderLine.getQuantity());
                omsOrderItemSaveReqDTO.setExternalId(orderLine.getOrderLineId());
                omsOrderItemSaveReqDTOs.add(omsOrderItemSaveReqDTO);
            }
            omsOrderSaveReqDTO.setOmsOrderItemSaveReqDTOList(omsOrderItemSaveReqDTOs);
            omsOrderSaveReqDTOs.add(omsOrderSaveReqDTO);
        }
        return omsOrderSaveReqDTOs;
    }
}
