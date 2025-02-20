package com.somle.esb.converter.shop;

import cn.iocoder.yudao.framework.common.enums.enums.DictTypeConstants;
import cn.iocoder.yudao.module.system.api.dict.DictDataApi;
import cn.iocoder.yudao.module.system.api.dict.dto.DictDataRespDTO;
import com.somle.esb.enums.SalesPlatform;
import com.somle.esb.enums.ShopProfileType;
import com.somle.esb.model.ShopProfileDTO;
import com.somle.framework.common.util.collection.StreamX;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.Resource;

import java.util.HashMap;
import java.util.List;
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

    @Resource
    DictDataApi dictDataApi;

    private static Map<String, DictDataRespDTO> countryLabelDict=null;

    @PostConstruct
    public void init() {
        if(countryLabelDict!=null) {
            return;
        }
        List<DictDataRespDTO> list= dictDataApi.getDictDataList(DictTypeConstants.COUNTRY_CODE);
        countryLabelDict = StreamX.from(list).toMap(DictDataRespDTO::getLabel);
    }

    protected String getCountryDictValue(String label) {
//        DictDataRespDTO dto = countryLabelDict.get(label);
//        if(dto==null) {
//            return label;
//        }
//        return dto.getValue();
        // 目前先原封返回，后续再优化
        return label;
    }

    /**
    * @Author LFJ
    * @Description TODO
    * @Date 9:28 2025/2/8
    * @Param [shopInfoDTO]
    * @return VO
    **/

    public static <VO> List<VO> convert(ShopProfileDTO shopInfoDTO) {
        String key = makeKey(shopInfoDTO.getSalesPlatform(),shopInfoDTO.getShopProfileType());
        AbstractErpShopProfileConverter<?,?> converter= CONVERTERS.get(key);
        if (converter==null) {
            throw new IllegalArgumentException("未找到对应的转换器:"+shopInfoDTO.getSalesPlatform().name()+"."+shopInfoDTO.getShopProfileType().name());
        }
        return converter.toModel(shopInfoDTO);
    }


    protected AbstractErpShopProfileConverter(SalesPlatform salesPlatform, ShopProfileType shopInfoType) {
        CONVERTERS.put(makeKey(salesPlatform, shopInfoType),this);
    }

    private static String makeKey(SalesPlatform salesPlatform, ShopProfileType shopInfoType) {
        return salesPlatform.name()+"_"+shopInfoType.name();
    }

    protected List<OUT> toModel(ShopProfileDTO<IN> shopInfoDTO) {
        if (shopInfoDTO == null) {
            return null;
        }
        return toModelInternal(shopInfoDTO);
    }

    protected abstract List<OUT> toModelInternal(ShopProfileDTO<IN> shopInfoDTO);

}







