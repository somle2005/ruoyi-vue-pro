package cn.iocoder.yudao.module.srm.aspect;

import cn.iocoder.yudao.framework.common.util.concurrent.AsyncTask;
import cn.iocoder.yudao.module.srm.controller.admin.purchase.vo.order.req.SrmPurchaseOrderAuditReqVO;
import cn.iocoder.yudao.module.srm.dal.dataobject.purchase.SrmPurchaseOrderItemDO;
import cn.iocoder.yudao.module.srm.service.purchase.SrmPurchaseOrderService;
import cn.iocoder.yudao.module.srm.service.purchase.SrmSupplierProductService;
import cn.iocoder.yudao.module.srm.service.purchase.bo.order.SrmPurchaseOrderBO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.CompletableFuture;

@Slf4j
@Aspect
@Component
@RequiredArgsConstructor
public class AsyncUpdateTriggerAspect {

    private final SrmSupplierProductService srmSupplierProductService;
    private final SrmPurchaseOrderService srmPurchaseOrderService;

    @Around("@annotation(cn.iocoder.yudao.module.srm.aspect.AsyncUpdateTrigger)")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        Object result = joinPoint.proceed();
        // 启动异步任务
        CompletableFuture.runAsync(() -> handleUpdate(joinPoint), AsyncTask.DEFAULT.getExecutor().getThreadPoolExecutor());
        return result;
    }

    private void handleUpdate(ProceedingJoinPoint joinPoint) {
        for (Object arg : joinPoint.getArgs()) {
            if (!(arg instanceof SrmPurchaseOrderAuditReqVO vo)) continue;

            // 判断是否审核通过并已审核
            if (!Boolean.TRUE.equals(vo.getPass()) || !Boolean.TRUE.equals(vo.getReviewed())) {
                log.info("采购订单审核未通过或未触发审核，无需更新供应商产品");
                return;
            }

            List<Long> orderIds = vo.getOrderIds();
            if (orderIds == null || orderIds.isEmpty()) {
                log.warn("审核参数中订单ID为空，跳过更新");
                return;
            }

            log.info("开始处理采购订单审核通过后的供应商产品价格更新，订单IDs: {}", orderIds);

            for (Long orderId : orderIds) {
                try {
                    SrmPurchaseOrderBO purchaseOrderBO = srmPurchaseOrderService.getPurchaseOrderBO(orderId);
                    Long supplierId = purchaseOrderBO.getSupplierId();

                    if (supplierId == null) {
                        log.warn("采购订单 {} 的供应商ID为空，跳过更新", purchaseOrderBO.getCode());
                        continue;
                    }

                    List<SrmPurchaseOrderItemDO> orderItems = purchaseOrderBO.getSrmPurchaseOrderItemDOS();
                    if (orderItems == null || orderItems.isEmpty()) {
                        log.warn("采购订单 {} 没有明细行数据", orderId);
                        continue;
                    }

                    for (SrmPurchaseOrderItemDO orderItem : orderItems) {
                        srmSupplierProductService.updateSupplierProductPrice(supplierId, orderItem, purchaseOrderBO);
                    }

                    log.info("采购订单({})的供应商产品价格更新完成", purchaseOrderBO.getCode());
                } catch (Exception e) {
                    log.error("处理采购订单编号:{} 的供应商产品价格更新失败", orderId, e);
                }
            }

            // 只处理第一个匹配的 VO，其他参数忽略
            break;
        }
    }
}
