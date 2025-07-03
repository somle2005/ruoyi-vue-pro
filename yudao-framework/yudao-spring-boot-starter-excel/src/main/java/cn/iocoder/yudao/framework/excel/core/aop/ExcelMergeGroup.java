package cn.iocoder.yudao.framework.excel.core.aop;

import java.lang.annotation.*;

/**
 * Excel 单元格合并注解，用于标记哪些字段参与合并
 *
 * @author :wdy
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ExcelMergeGroup {

    /**
     * 是否作为合并分组的唯一标识列（true 表示此字段用于分组判断，必须值一致才合并）
     */
    boolean unique() default false;
}
