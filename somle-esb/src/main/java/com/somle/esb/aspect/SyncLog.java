package com.somle.esb.aspect;

import java.lang.annotation.*;

/**
 * @author: wdy
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface SyncLog {
    String value() default "";
}