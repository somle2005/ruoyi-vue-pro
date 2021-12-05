/**
 * 多租户，支持如下层面：
 * 1. DB：基于 MyBatis Plus 多租户的功能实现。
 * 2. Web：请求 HTTP API 时，Header 带上 tenant-id 租户编号。
 * 3. Job：在 JobHandler 执行任务时，会按照每个租户，都独立并行执行一次。
 * 4. MQ：TODO
 * 5. Async：异步需要保证 ThreadLocal 的传递性，通过使用阿里开源的 TransmittableThreadLocal 实现。相关的改造点，可见：
 *      1）Spring Async：
 *          {@link cn.iocoder.yudao.framework.quartz.config.YudaoAsyncAutoConfiguration#threadPoolTaskExecutorBeanPostProcessor()}
 *      2）Spring Security：
 *          TransmittableThreadLocalSecurityContextHolderStrategy
 *          和 YudaoSecurityAutoConfiguration#securityContextHolderMethodInvokingFactoryBean() 方法
 */
package cn.iocoder.yudao.framework.tenant;
