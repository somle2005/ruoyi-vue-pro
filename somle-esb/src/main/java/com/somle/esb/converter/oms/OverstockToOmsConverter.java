package com.somle.esb.converter.oms;

import cn.hutool.core.collection.CollectionUtil;
import cn.hutool.core.util.ObjectUtil;
import cn.iocoder.yudao.framework.common.util.collection.MapUtils;
import cn.iocoder.yudao.framework.common.util.json.JsonUtilsX;
import cn.iocoder.yudao.module.oms.api.OmsOrderApi;
import cn.iocoder.yudao.module.oms.api.OmsShopApi;
import cn.iocoder.yudao.module.oms.api.OmsShopProductApi;
import cn.iocoder.yudao.module.oms.api.dto.*;
import cn.iocoder.yudao.module.oms.api.enums.shop.ShopTypeEnum;
import com.somle.amazon.controller.vo.AmazonSpMarketplaceParticipationVO;
import com.somle.amazon.controller.vo.AmazonSpMarketplaceVO;
import com.somle.amazon.controller.vo.AmazonSpOrderItemRespVO;
import com.somle.amazon.controller.vo.AmazonSpOrderRespVO;
import com.somle.amazon.model.AmazonSpAuthDO;
import com.somle.esb.enums.PlatformEnum;
import com.somle.overstock.model.OverstockAccount;
import com.somle.overstock.model.OverstockOrderResVO;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

@Component
@Slf4j
public class OverstockToOmsConverter {

    @Resource
    OmsShopApi omsShopApi;

    @Resource
    OmsShopProductApi omsShopProductApi;

    @Resource
    OmsOrderApi omsOrderApi;

    private PlatformEnum platform = PlatformEnum.OVERSTOCK;

    public OmsShopSaveReqDTO toShops(OverstockAccount overstockAccount) {
        List<OmsShopDTO> existShops = omsShopApi.getByPlatformCode(this.platform.toString());
        // 使用Map存储已存在的店铺，key = platformShopCode, value = OmsShopDO
        Map<String, OmsShopDTO> existShopMap = Optional.ofNullable(existShops)
            .orElse(Collections.emptyList())
            .stream()
            .collect(Collectors.toMap(omsShopDO -> omsShopDO.getExternalId(), omsShopDO -> omsShopDO));
        OmsShopSaveReqDTO shopDTO = new OmsShopSaveReqDTO();
        MapUtils.findAndThen(existShopMap, overstockAccount.getUserName(), omsShopDTO -> shopDTO.setId(omsShopDTO.getId()));
        shopDTO.setName(null);
        shopDTO.setExternalName(overstockAccount.getUserName());
        shopDTO.setCode(null);
        shopDTO.setExternalId(overstockAccount.getUserName());
        shopDTO.setPlatformCode(this.platform.toString());
        shopDTO.setType(ShopTypeEnum.ONLINE.getType());
        return shopDTO;
    }


    public List<OmsOrderSaveReqDTO> toOrders(List<OverstockOrderResVO.OrderInfoDTO> orders, OverstockAccount overstockAccount) {
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
        for (OverstockOrderResVO.OrderInfoDTO order : orders) {
            OmsOrderSaveReqDTO omsOrderSaveReqDTO = new OmsOrderSaveReqDTO();
            MapUtils.findAndThen(existOrderMap, order.getOrderId(), omsOrderDTO -> {
                omsOrderSaveReqDTO.setId(omsOrderDTO.getId());
                omsOrderSaveReqDTO.setCode(omsOrderDTO.getCode());
            });
            omsOrderSaveReqDTO.setPlatformCode(this.platform.toString());
            omsOrderSaveReqDTO.setExternalId(order.getOrderId());
            MapUtils.findAndThen(omsShopMap, overstockAccount.getUserName(), omsShopDTO -> omsOrderSaveReqDTO.setShopId(omsShopDTO.getId()));
            omsOrderSaveReqDTO.setOrderCreateTime(order.getOrderDate());


            OverstockOrderResVO.OrderInfoDTO.Address shipToAddress = order.getShipToAddress().get(0);
            omsOrderSaveReqDTO.setExternalAddress(JsonUtilsX.toJsonString(shipToAddress));
            if (shipToAddress != null) {
                omsOrderSaveReqDTO.setAddress1(shipToAddress.getAddress1());
                omsOrderSaveReqDTO.setAddress2(shipToAddress.getAddress2());
                omsOrderSaveReqDTO.setState(shipToAddress.getStateOrProvince());
                omsOrderSaveReqDTO.setCity(shipToAddress.getCity());
                omsOrderSaveReqDTO.setPostalCode(shipToAddress.getPostalCode());
                omsOrderSaveReqDTO.setRecipientName(shipToAddress.getContactName());
                omsOrderSaveReqDTO.setRecipientCountryCode(shipToAddress.getCountryCode());
                omsOrderSaveReqDTO.setPhone(shipToAddress.getPhone());
            }

            List<OverstockOrderResVO.OrderInfoDTO.ProcessedSalesOrderLinetInfo> processedSalesOrderLine = order.getProcessedSalesOrderLine();
            List<OmsOrderItemSaveReqDTO> omsOrderItemSaveReqDTOs = new ArrayList<>();
            BigDecimal totalPrice = new BigDecimal(0);
            for (OverstockOrderResVO.OrderInfoDTO.ProcessedSalesOrderLinetInfo orderItem : processedSalesOrderLine) {
                OmsOrderItemSaveReqDTO omsOrderItemSaveReqDTO = new OmsOrderItemSaveReqDTO();
                omsOrderItemSaveReqDTO.setExternalId(orderItem.getLineId());
                omsOrderItemSaveReqDTO.setShopProductExternalCode(orderItem.getPartnerSKU());
                omsOrderItemSaveReqDTO.setQty(Integer.valueOf(orderItem.getQuantity()));
                if (orderItem.getItemPrice() != null) {
                    omsOrderItemSaveReqDTO.setPrice(new BigDecimal(orderItem.getItemPrice()));
                    totalPrice = totalPrice.add(new BigDecimal(orderItem.getItemPrice()));
                }
                omsOrderItemSaveReqDTOs.add(omsOrderItemSaveReqDTO);
            }
            omsOrderSaveReqDTO.setTotalPrice(totalPrice);
            omsOrderSaveReqDTO.setOmsOrderItemSaveReqDTOList(omsOrderItemSaveReqDTOs);
            omsOrderSaveReqDTOs.add(omsOrderSaveReqDTO);
        }
        return omsOrderSaveReqDTOs;
    }


}
