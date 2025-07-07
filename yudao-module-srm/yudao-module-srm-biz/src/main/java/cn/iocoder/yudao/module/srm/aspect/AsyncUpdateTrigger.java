package cn.iocoder.yudao.module.srm.aspect;

import java.lang.annotation.*;

/**
 * 标记该方法在执行后会触发异步更新 srm_supplier_product 表
 *
 * @author wdy
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface AsyncUpdateTrigger {

}
