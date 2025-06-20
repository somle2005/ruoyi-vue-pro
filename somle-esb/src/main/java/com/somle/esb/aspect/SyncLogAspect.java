package com.somle.esb.aspect;

import cn.hutool.json.JSONUtil;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.Map;

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

            int count = 0;
            if (result instanceof Collection) {
                count = ((Collection<?>) result).size();
            } else if (result instanceof Map) {
                count = ((Map<?, ?>) result).size();
            } else if (result instanceof Integer) {
                count = (Integer) result;
            }

            double durationSeconds = (System.currentTimeMillis() - start) / 1000.0;
            log.info("[{}] 同步完成，数量: {}，耗时：{} s",
                    desc.isEmpty() ? methodName : desc,
                    count,
                    String.format("%.3f", durationSeconds));
            return result;
        } catch (Exception e) {
            log.error("[{}] 同步异常：{}, 入参是:{}", desc.isEmpty() ? methodName : desc, e.getMessage(), JSONUtil.parse(args), e);
            throw e;
        }
    }

}