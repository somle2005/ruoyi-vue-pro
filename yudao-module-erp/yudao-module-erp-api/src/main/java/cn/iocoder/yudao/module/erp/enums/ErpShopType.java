package cn.iocoder.yudao.module.erp.enums;

import cn.iocoder.yudao.framework.common.core.IntArrayValuable;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@RequiredArgsConstructor
@Getter
public enum ErpShopType  implements IntArrayValuable  {

    ONLINE(0, "线上"),
    PHYSICAL(1, "线下");

    public static final int[] ARRAYS = Arrays.stream(values()).mapToInt(ErpShopType::getCode).toArray();

    /**
     * 存储状态码和描述的字段
     **/
    private final int code;
    private final String description;

    /**
     * 获取状态码
     **/
    public int getCode() {
        return code;
    }

    /**
     * 获取状态描述
     **/
    public String getDescription() {
        return description;
    }

    /**
     * 根据状态码获取状态枚举
     **/
    public static ErpShopType fromCode(Integer code) {
        if(code==null) {
            return null;
        }
        for (ErpShopType shopType : ErpShopType.values()) {
            if(Objects.equals(shopType.code,code)) {
                return shopType;
            }
        }
        return null;
    }

    @Override
    public int[] array() {
        return ARRAYS;
    }


}
