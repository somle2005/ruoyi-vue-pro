package cn.iocoder.yudao.module.oms.api.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public enum TaskHandleStatusEnum {

    PENDING(0, "待处理"),
    SUCCESS(1, "处理成功"),
    FAIL(2, "处理失败"),
    PROCESSING(3, "处理中");

    private Integer type;
    private String name;
}
