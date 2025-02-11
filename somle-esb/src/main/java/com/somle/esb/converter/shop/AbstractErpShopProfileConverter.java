package com.somle.esb.converter.shop;

import com.somle.esb.enums.SalesPlatform;
import com.somle.esb.enums.ShopProfileType;
import com.somle.esb.model.ShopProfileDTO;

import java.util.HashMap;
import java.util.Map;

/**
* @Author LeeFJ
* @Description 销售平台数据模型转换工具
* @Date 13:34 2025/2/7
* @Param
* @return
**/
public abstract class AbstractErpShopProfileConverter<IN,OUT> {

    private static final Map<String, AbstractErpShopProfileConverter<?,?>> CONVERTERS = new HashMap<>();

    /**
    * @Author LFJ
    * @Description TODO
    * @Date 9:28 2025/2/8
    * @Param [shopInfoDTO]
    * @return VO
    **/

    public static <VO> VO convert(ShopProfileDTO shopInfoDTO) {
        String key = makeKey(shopInfoDTO.getSalesPlatform(),shopInfoDTO.getShopProfileType());
        AbstractErpShopProfileConverter<?,?> converter= CONVERTERS.get(key);
        if (converter==null) {
            throw new IllegalArgumentException("未找到对应的转换器:"+shopInfoDTO.getSalesPlatform().name()+"."+shopInfoDTO.getShopProfileType().name());
        }
        return (VO)converter.toModel(shopInfoDTO);
    }


    protected AbstractErpShopProfileConverter(SalesPlatform salesPlatform, ShopProfileType shopInfoType) {
        CONVERTERS.put(makeKey(salesPlatform, shopInfoType),this);
    }

    private static String makeKey(SalesPlatform salesPlatform, ShopProfileType shopInfoType) {
        return salesPlatform.name()+"_"+shopInfoType.name();
    }

    protected OUT toModel(ShopProfileDTO<IN> shopInfoDTO) {
        if (shopInfoDTO == null) {
            return null;
        }
        return toModelInternal(shopInfoDTO);
    }

    protected abstract OUT toModelInternal(ShopProfileDTO<IN> shopInfoDTO);

}







