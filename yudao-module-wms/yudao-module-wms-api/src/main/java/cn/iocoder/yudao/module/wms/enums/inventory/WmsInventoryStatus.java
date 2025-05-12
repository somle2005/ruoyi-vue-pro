package cn.iocoder.yudao.module.wms.enums.inventory;

import cn.iocoder.yudao.framework.common.core.ArrayValuable;
import cn.iocoder.yudao.framework.common.enums.DictEnum;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.Arrays;
import java.util.Objects;

/**
 * 盘点状态
 **/
@RequiredArgsConstructor
@Getter
public enum WmsInventoryStatus implements ArrayValuable<Integer>, DictEnum {

    BALANCED(0, "盘平"),
    LOSS(1, "盘亏"),
    SURPLUS(2, "盘盈"),
   ;

    public static final Integer[] VALUES = Arrays.stream(values()).map(WmsInventoryStatus::getValue).toArray(Integer[]::new);

    public static String getType() {
        return WmsInventoryStatus.class.getSimpleName();
    }

    private final Integer value;
    private final String label;

    /**
     * 按 value 匹配枚举，name 优先
     **/
    public static WmsInventoryStatus parse(Integer value) {
        for (WmsInventoryStatus e : WmsInventoryStatus.values()) {
            if(e.getValue().equals(value)) {
                return e;
            }
        }
        return null;
    }

    /**
     * 按 name 或 label 匹配枚举，name 优先
     **/
    public static WmsInventoryStatus parse(String nameOrLabel) {
        for (WmsInventoryStatus e : WmsInventoryStatus.values()) {
            if(e.name().equalsIgnoreCase(nameOrLabel)) {
                return e;
            }
        }
        for (WmsInventoryStatus e : WmsInventoryStatus.values()) {
            if(e.getLabel().equalsIgnoreCase(nameOrLabel)) {
                return e;
            }
        }
        return null;
    }

    public boolean matchAny(WmsInventoryStatus... status) {
        for (WmsInventoryStatus s : status) {
            if(s==this) {
                return true;
            }
        }
        return false;
    }

    public boolean matchAny(Integer... values) {
        for (Integer v : values) {
            if(Objects.equals(v, this.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Integer[] array() {
        return VALUES;
    }

    public static enum Event {
        SUBMIT,AGREE, REJECT;
    }
}
