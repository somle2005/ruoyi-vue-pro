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
public enum WmsWarehouseShelfMode implements ArrayValuable<Integer>, DictEnum {

    STANDARD(1, "标准模式"),
    AUTO_SHELF(2, "自动上架"),
    ;

    public static final Integer[] VALUES = Arrays.stream(values()).map(WmsWarehouseShelfMode::getValue).toArray(Integer[]::new);


    private final Integer value;
    private final String label;

    /**
     * 按 value 匹配枚举，name 优先
     **/
    public static WmsWarehouseShelfMode parse(Integer value) {
        for (WmsWarehouseShelfMode e : WmsWarehouseShelfMode.values()) {
            if (e.getValue().equals(value)) {
                return e;
            }
        }
        return null;
    }

    /**
     * 按 name 或 label 匹配枚举，name 优先
     **/
    public static WmsWarehouseShelfMode parse(String nameOrLabel) {
        for (WmsWarehouseShelfMode e : WmsWarehouseShelfMode.values()) {
            if (e.name().equalsIgnoreCase(nameOrLabel)) {
                return e;
            }
        }
        for (WmsWarehouseShelfMode e : WmsWarehouseShelfMode.values()) {
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
