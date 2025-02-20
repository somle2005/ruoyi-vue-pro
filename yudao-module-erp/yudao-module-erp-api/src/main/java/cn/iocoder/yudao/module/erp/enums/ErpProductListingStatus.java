package cn.iocoder.yudao.module.erp.enums;

import cn.iocoder.yudao.framework.common.core.IntArrayValuable;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@RequiredArgsConstructor
@Getter
public enum ErpProductListingStatus implements IntArrayValuable {

    ONLINE(1, "上架"),
    OFFLINE(2, "下架");

    private static final Map<Integer, ErpProductListingStatus> STATUS_MAP = new HashMap<>();

    static {
        // 将枚举的状态码作为键，枚举值作为值放入Map中
        for (ErpProductListingStatus status : values()) {
            STATUS_MAP.put(status.code, status);
        }
    }

    public static final int[] ARRAYS = Arrays.stream(values()).mapToInt(ErpProductListingStatus::getCode).toArray();

    // 存储状态码和描述的字段
    private final int code;
    private final String description;

    // 获取状态码
    public int getCode() {
        return code;
    }

    // 获取状态描述
    public String getDescription() {
        return description;
    }

    // 根据状态码获取状态枚举
    public static ErpProductListingStatus fromCode(int code) {
        ErpProductListingStatus status = STATUS_MAP.get(code);
        if (status == null) {
            throw new IllegalArgumentException("无效的关闭状态码: " + code);
        }
        return status;
    }

    // 根据状态码获取对应的描述
    public static String getDescriptionByCode(Integer code) {
        ErpProductListingStatus status = STATUS_MAP.get(code);
        return status != null ? status.getDescription() : null;
    }

    @Override
    public int[] array() {
        return ARRAYS;
    }
}
