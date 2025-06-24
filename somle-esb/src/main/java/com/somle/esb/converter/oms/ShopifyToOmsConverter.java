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
import com.somle.esb.enums.PlatformEnum;
import com.somle.shopify.model.graphql.ShopifyGraphqlOrder;
import com.somle.shopify.model.graphql.ShopifyGraphqlProduct;
import com.somle.shopify.model.graphql.ShopifyGraphqlShopInfo;
import com.somle.shopify.service.ShopifyClient;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collectors;

import static cn.iocoder.yudao.framework.common.exception.util.ServiceExceptionUtil.exception;
import static cn.iocoder.yudao.module.oms.api.enums.OmsErrorCodeConstants.OMS_SYNC_SHOP_INFO_FIRST;
import static cn.iocoder.yudao.module.oms.api.enums.OmsErrorCodeConstants.OMS_SYNC_SHOP_INFO_LACK;


@Component
@Slf4j
public class ShopifyToOmsConverter {

    @Resource
    OmsShopApi omsShopApi;
    @Resource
    OmsShopProductApi omsShopProductApi;
    @Resource
    OmsOrderApi omsOrderApi;

    private ShopifyGraphqlShopInfo shopifyGraphqlShopInfo;

    private PlatformEnum platform = PlatformEnum.SHOPIFY;

    public OmsShopSaveReqDTO toShops(ShopifyGraphqlShopInfo shopifyGraphqlShopInfo) {

        List<OmsShopDTO> existShops = omsShopApi.getByPlatformCode(this.platform.toString());
        // 使用Map存储已存在的店铺，key = platformShopCode, value = OmsShopDO
        Map<String, OmsShopDTO> existShopMap = Optional.ofNullable(existShops)
            .orElse(Collections.emptyList())
            .stream()
            .collect(Collectors.toMap(omsShopDO -> omsShopDO.getExternalId(), omsShopDO -> omsShopDO));

        OmsShopSaveReqDTO shopDTO = new OmsShopSaveReqDTO();
        MapUtils.findAndThen(existShopMap, shopifyGraphqlShopInfo.getId().toString(), omsShopDTO -> shopDTO.setId(omsShopDTO.getId()));
        shopDTO.setName(null);
        shopDTO.setExternalName(shopifyGraphqlShopInfo.getName());
        shopDTO.setCode(null);
        shopDTO.setExternalId(shopifyGraphqlShopInfo.getId());
        shopDTO.setPlatformCode(this.platform.toString());
        shopDTO.setType(ShopTypeEnum.ONLINE.getType());
        return shopDTO;
    }

    public List<OmsShopProductSaveReqDTO> toProducts(List<ShopifyGraphqlProduct> product, ShopifyClient shopifyClient) {
        if (shopifyClient.getShopInfo() == null) {
            throw exception(OMS_SYNC_SHOP_INFO_LACK);
        }

        //根据client再次请求获取店铺信息,shopify一个店铺对应一个client
        if (shopifyGraphqlShopInfo == null) {
            shopifyGraphqlShopInfo = shopifyClient.getShopInfo();
        }

        OmsShopDTO omsShopDO = omsShopApi.getShopByPlatformShopCode(shopifyGraphqlShopInfo.getId());

        if (omsShopDO == null) {
            throw exception(OMS_SYNC_SHOP_INFO_FIRST, this.platform.toString());
        }
        List<OmsShopProductDTO> existShopProducts = omsShopProductApi.getByShopIds(List.of(omsShopDO.getId()));
        // 使用Map存储已存在的店铺产品信息，key=sourceId, value=OmsShopProductDO
        Map<String, OmsShopProductDTO> existShopProductMap = Optional.ofNullable(existShopProducts)
            .orElse(Collections.emptyList())
            .stream()
            .collect(Collectors.toMap(omsShopProductDO -> omsShopProductDO.getExternalId(), omsShopProductDO -> omsShopProductDO));

        List<OmsShopProductSaveReqDTO> omsShopProductDOs = product.stream()
            .flatMap(shopifyProductRepsDTO ->
                shopifyProductRepsDTO.getVariants().getEdges().stream()
                    .map(variantEdge -> {
                        ShopifyGraphqlProduct.Variant variant = variantEdge.getNode();
                        OmsShopProductSaveReqDTO shopProductDTO = new OmsShopProductSaveReqDTO();
                        MapUtils.findAndThen(existShopProductMap, variant.getId(), omsShopProductDO -> shopProductDTO.setId(omsShopProductDO.getId()));
                        shopProductDTO.setShopId(omsShopDO.getId());
                        shopProductDTO.setCode(variant.getSku());
                        shopProductDTO.setExternalId(variant.getId());
                        shopProductDTO.setName(shopifyProductRepsDTO.getTitle() + " " + variant.getTitle());
                        if (variant.getPrice() != null) {
                            shopProductDTO.setPrice(new BigDecimal(variant.getPrice()));
                        }
                        shopProductDTO.setSellableQty(variant.getInventoryQuantity());
                        return shopProductDTO;
                    })
            ).toList();
        return omsShopProductDOs;
    }

    public List<OmsOrderSaveReqDTO> toOrders(List<ShopifyGraphqlOrder> orders, ShopifyClient shopifyClient) {

        if (CollectionUtil.isEmpty(orders)) {
            return CollectionUtil.empty(List.class);
        }

        //根据client再次请求获取店铺信息,shopify一个店铺对应一个client
        if (shopifyGraphqlShopInfo == null) {
            shopifyGraphqlShopInfo = shopifyClient.getShopInfo();
        }

        OmsShopDTO omsShopDO = omsShopApi.getShopByPlatformShopCode(shopifyGraphqlShopInfo.getId());
        if (omsShopDO == null) {
            throw exception(OMS_SYNC_SHOP_INFO_FIRST, this.platform.toString());
        }

        List<OmsOrderDTO> existOrders = omsOrderApi.getByPlatformCode(this.platform.toString());

        // 使用Map存储已存在的订单，key = sourceNo, value = OmsOrderDO
        Map<String, OmsOrderDTO> existOrderMap = Optional.ofNullable(existOrders)
            .orElse(Collections.emptyList())
            .stream()
            .collect(Collectors.toMap(omsOrderDTO -> omsOrderDTO.getExternalId(), omsOrderDTO -> omsOrderDTO));

        List<OmsShopProductDTO> existShopProducts = omsShopProductApi.getByShopIds(List.of(omsShopDO.getId()));
        // 使用Map存储已存在的店铺产品信息，key=shopId, value=Map<String, OmsShopProductDTO>,其中key=code即平台sku
        Map<Long, Map<String, OmsShopProductDTO>> existShopProductMap = existShopProducts.stream()
            .collect(Collectors.groupingBy(
                OmsShopProductDTO::getShopId,  // 外层Map的key: shopId
                Collectors.toMap(
                    OmsShopProductDTO::getCode,  // 内层Map的key: code
                    product -> product,          // 内层Map的value: 产品对象本身
                    (existing, replacement) -> existing  // 如果code重复，保留已存在的
                )
            ));

        List<OmsOrderSaveReqDTO> omsOrderSaveReqDTOs = new ArrayList<>();

        for (ShopifyGraphqlOrder order : orders) {
            OmsOrderSaveReqDTO omsOrderSaveReqDTO = new OmsOrderSaveReqDTO();
            MapUtils.findAndThen(existOrderMap, order.getId() + order.getName(), omsOrderDTO -> {
                omsOrderSaveReqDTO.setId(omsOrderDTO.getId());
                omsOrderSaveReqDTO.setCode(omsOrderDTO.getCode());
            });
            omsOrderSaveReqDTO.setPlatformCode(this.platform.toString());
            omsOrderSaveReqDTO.setExternalId(order.getId() + order.getName());
            omsOrderSaveReqDTO.setShopId(omsShopDO.getId());
            omsOrderSaveReqDTO.setTotalPrice(order.getCurrentTotalPriceSet().getShopMoney().getAmount());
            omsOrderSaveReqDTO.setBuyerName(order.getShippingAddress().getName());
            omsOrderSaveReqDTO.setPhone(order.getShippingAddress().getPhone());
            omsOrderSaveReqDTO.setEmail("");
            omsOrderSaveReqDTO.setOrderCreateTime(parseTime(order.getCreatedAt()));
            omsOrderSaveReqDTO.setPayTime(parseTime(order.getCreatedAt()));
            omsOrderSaveReqDTO.setCompanyName(order.getShippingAddress().getCompany());
            omsOrderSaveReqDTO.setBuyerCountryCode(order.getShippingAddress().getCountryCodeV2());
            omsOrderSaveReqDTO.setRecipientName(order.getShippingAddress().getName());
            ShopifyGraphqlOrder.ShippingAddress shippingAddress = order.getShippingAddress();
            if (ObjectUtil.isNotEmpty(shippingAddress)) {
                omsOrderSaveReqDTO.setRecipientCountryCode(shippingAddress.getCountryCodeV2());
                omsOrderSaveReqDTO.setState(shippingAddress.getProvinceCode());
                omsOrderSaveReqDTO.setCity(shippingAddress.getCity());
                omsOrderSaveReqDTO.setExternalAddress(JsonUtilsX.toJsonString(order.getShippingAddress()));
                HashSet<String> addressUnique = new HashSet<>();
                addressUnique.add(shippingAddress.getAddress1());
                omsOrderSaveReqDTO.setAddress1(shippingAddress.getAddress1());
                if (!addressUnique.contains(shippingAddress.getAddress2())) {
                    omsOrderSaveReqDTO.setAddress2(shippingAddress.getAddress2());
                }
                omsOrderSaveReqDTO.setPostalCode(shippingAddress.getZip());
            }

            List<ShopifyGraphqlOrder.LineItemEdge> edges = order.getLineItems().getEdges();
            List<OmsOrderItemSaveReqDTO> omsOrderItemSaveReqDTOs = new ArrayList<>();
            for (ShopifyGraphqlOrder.LineItemEdge lineItem : edges) {
                OmsOrderItemSaveReqDTO omsOrderItemSaveReqDTO = new OmsOrderItemSaveReqDTO();
                ShopifyGraphqlOrder.LineItemNode itemNode = lineItem.getNode();
                if (ObjectUtil.isNotEmpty(existShopProductMap.get(omsOrderSaveReqDTO.getShopId()))
                    && ObjectUtil.isNotEmpty(existShopProductMap.get(omsOrderSaveReqDTO.getShopId()).get(itemNode.getSku()))
                ) {
                    omsOrderItemSaveReqDTO.setShopProductId(existShopProductMap.get(omsOrderSaveReqDTO.getShopId()).get(itemNode.getSku()).getId());
                }
                omsOrderItemSaveReqDTO.setExternalId(itemNode.getId());
                omsOrderItemSaveReqDTO.setQty(itemNode.getQuantity().intValue());
                omsOrderItemSaveReqDTO.setPrice(itemNode.getOriginalUnitPriceSet().getShopMoney().getAmount());
                omsOrderItemSaveReqDTOs.add(omsOrderItemSaveReqDTO);
            }
            omsOrderSaveReqDTO.setOmsOrderItemSaveReqDTOList(omsOrderItemSaveReqDTOs);
            omsOrderSaveReqDTOs.add(omsOrderSaveReqDTO);
        }
        return omsOrderSaveReqDTOs;
    }

    public LocalDateTime parseTime(String time) {

        // 解析字符串为 OffsetDateTime
        OffsetDateTime offsetDateTime = OffsetDateTime.parse(time);

        // 转换为目标时区（例如：+08:00 对应东八区）
        ZonedDateTime zonedDateTime = offsetDateTime.atZoneSameInstant(ZoneId.of("Asia/Shanghai"));

        // 提取 LocalDateTime
        LocalDateTime localDateTime = zonedDateTime.toLocalDateTime();

        // 定义输出格式并格式化
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = localDateTime.format(formatter);
        return LocalDateTime.parse(formattedDateTime, formatter);
    }
}
