package com.somle.esb.aspect;

import cn.hutool.json.JSONUtil;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * @author: wdy
 */
@Aspect
@Component
@Slf4j
public class SyncLogAspect {

    @Around("@annotation(syncLog)")
    public Object around(ProceedingJoinPoint pjp, SyncLog syncLog) throws Throwable {
        String desc = syncLog.value();
        String methodName = pjp.getSignature().getName();
        long start = System.currentTimeMillis();
        Object[] args = pjp.getArgs();
        try {
            log.info("[{}] 开始同步，参数：{}", desc.isEmpty() ? methodName : desc, JSONUtil.parse(args));
            Object result = pjp.proceed();
            log.info("[{}] 同步完成，耗时：{} ms", desc.isEmpty() ? methodName : desc, System.currentTimeMillis() - start);
            return result;
        } catch (Exception e) {
            log.error("[{}] 同步异常：{}, 入参是:{}", desc.isEmpty() ? methodName : desc, e.getMessage(), JSONUtil.parse(args), e);
            throw e;
        }
    }
}