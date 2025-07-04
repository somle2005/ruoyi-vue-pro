package cn.iocoder.yudao.module.wms.enums.warehouse;

import cn.iocoder.yudao.framework.common.core.ArrayValuable;
import cn.iocoder.yudao.framework.common.enums.DictEnum;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.Arrays;

/**
 * 仓库经营方式
 *
 * @author jisencai
 */
@RequiredArgsConstructor
@Getter
public enum WmsWarehouseOutboundMode implements ArrayValuable<Integer>, DictEnum {

    FIFO(1, "先进先出"),
    BIN_FIRST(2, "库位优先"),
    ;

    public static final Integer[] VALUES = Arrays.stream(values()).map(WmsWarehouseOutboundMode::getValue).toArray(Integer[]::new);


    private final Integer value;
    private final String label;

    /**
     * 按 value 匹配枚举，name 优先
     **/
    public static WmsWarehouseOutboundMode parse(Integer value) {
        for (WmsWarehouseOutboundMode e : WmsWarehouseOutboundMode.values()) {
            if (e.getValue().equals(value)) {
                return e;
            }
        }
        return null;
    }

    /**
     * 按 name 或 label 匹配枚举，name 优先
     **/
    public static WmsWarehouseOutboundMode parse(String nameOrLabel) {
        for (WmsWarehouseOutboundMode e : WmsWarehouseOutboundMode.values()) {
            if (e.name().equalsIgnoreCase(nameOrLabel)) {
                return e;
            }
        }
        for (WmsWarehouseOutboundMode e : WmsWarehouseOutboundMode.values()) {
            if (e.getLabel().equalsIgnoreCase(nameOrLabel)) {
                return e;
            }
        }
        return null;
    }

    @Override
    public Integer[] array() {
        return VALUES;
    }
}
