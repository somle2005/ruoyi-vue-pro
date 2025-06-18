package com.somle.kingdee.service;


import cn.iocoder.yudao.framework.common.exception.ErrorCode;
import cn.iocoder.yudao.framework.common.exception.util.ServiceExceptionUtil;
import cn.iocoder.yudao.framework.common.util.concurrent.AsyncTask;
import com.somle.kingdee.enums.KingDeeErrorCodeConstants;
import com.somle.kingdee.model.*;
import com.somle.kingdee.model.supplier.KingdeeSupplierSaveVO;
import com.somle.kingdee.model.vo.KingdeeSupplierQueryReqVO;
import com.somle.kingdee.repository.KingdeeTokenRepository;
import jakarta.annotation.PostConstruct;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.redisson.api.RedissonClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.dao.DataAccessException;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;

// https://open.jdy.com/#/files/api/detail?index=2&categrayId=3cc8ee9a663e11eda5c84b5d383a2b93&id=adfe4a24712711eda0b307c6992ee459
@Slf4j
@Service
@Data
@ConfigurationProperties(prefix = "kingdee")
public class KingdeeService {

    @Autowired
    StringRedisTemplate stringRedisTemplate;
    @Autowired
    private KingdeeTokenRepository tokenRepository;
    @Autowired
    private RedissonClient redissonClient;

    private List<String> outerInstanceIds;
    private List<KingdeeClient> clients;

    //TODO 优化: 启动后异步初始化，懒加载
    @PostConstruct
    public void init() {
        // clientList = tokenRepository.findAll().stream().map(n->new KingdeeClient(n)).toList();
        this.clients = this.outerInstanceIds.stream()
            .map(n -> new KingdeeClient(tokenRepository.findByOuterInstanceId(n), stringRedisTemplate, redissonClient))
            .toList();
        log.debug("kingdee client size: {}", clients.size());
    }

    public KingdeeClient getClientByName(String name) {
        return new KingdeeClient(tokenRepository.findByAccountName(name), stringRedisTemplate, redissonClient);
    }


    @Scheduled(cron = "0 0 * * * *")
    public boolean refreshAuths() {
        this.init();
        return clients.parallelStream()
            .map(KingdeeClient::refreshAuth)
            .allMatch(this::saveToken);
    }

    @Scheduled(cron = "0 0 */2 * * *")
    public void refreshAllSupplierList() {
        executeBatchOperationWithExceptionHandling(
            "刷新供应商列表",
            "all",
            KingdeeClient::refreshSupplierCache,
            KingDeeErrorCodeConstants.SUPPLIER_LIST_REFRESH_FAIL
        );
    }

    public boolean saveToken(KingdeeToken token) {
        boolean success = false;
        try {
            tokenRepository.save(token);
            log.info("tokens saved successfully");
            success = true;
        } catch (DataAccessException e) {
            // Handle exception as needed
        }
        return success;
    }

    public void addDepartment(KingdeeAuxInfoDetail department) {
        executeBatchOperationWithExceptionHandling(
            "添加部门",
            department.getName(),
            client -> client.addDepartment(department),
            KingDeeErrorCodeConstants.DEPARTMENT_ADD_FAIL
        );
    }

    public void addProduct(KingdeeProductSaveReqVO product) {
        executeBatchOperationWithExceptionHandling(
            "添加产品",
            product.getNumber(),
            client -> client.addProduct(product),
            KingDeeErrorCodeConstants.PRODUCT_ADD_FAIL
        );
    }

    public void addSupplier(KingdeeSupplierSaveVO kingdeeSupplierSaveVO) {
        executeBatchOperationWithExceptionHandling(
            "添加供应商",
            kingdeeSupplierSaveVO.getName(),
            client -> client.saveSupplier(kingdeeSupplierSaveVO),
            KingDeeErrorCodeConstants.SUPPLIER_ADD_FAIL
        );
    }

    /**
     * 保存采购订单
     *
     * @param purchaseOrder 采购订单
     */
    public void savePurchaseOrder(KingdeePurOrderSaveReqVO purchaseOrder) {
        executeBatchOperationWithExceptionHandling(
            "保存采购订单",
            purchaseOrder.getBillNo(),
            client -> client.savePurOrder(purchaseOrder),
            KingDeeErrorCodeConstants.PURCHASE_ORDER_SAVE_FAIL
        );
    }

    /**
     * 保存+审核采购订单
     */
    public void saveAndAuditPurchaseOrder(KingdeePurOrderSaveReqVO purchaseOrder) {
        executeBatchOperationWithExceptionHandling(
            "保存并审核采购订单",
            purchaseOrder.getBillNo(),
            client -> client.saveAndAuditPurOrder(purchaseOrder),
            KingDeeErrorCodeConstants.PURCHASE_ORDER_SAVE_AND_AUDIT_FAIL
        );
    }

    /**
     * 反审核+删除采购订单
     */
    public void unAuditPurchaseOrder(String purCode) {
        executeBatchOperationWithExceptionHandling(
            "取消审核采购订单",
            purCode,
            client -> client.unAuditPurOrder(purCode),
            KingDeeErrorCodeConstants.PURCHASE_ORDER_BATCH_UNAUDIT_FAIL
        );
    }

    /**
     * 保存采购入库单
     *
     * @param purInbound 采购入库单
     */
    public void savePurInbound(KingdeePurInboundSaveReqVO purInbound) {
        executeBatchOperationWithExceptionHandling(
            "保存采购入库单",
            purInbound.getBillNo(),
            client -> client.savePurInbound(purInbound),
            KingDeeErrorCodeConstants.PUR_INBOUND_SAVE_FAIL
        );
    }

    /**
     * 保存采购出库单
     *
     * @param purOutbound 采购出库单
     */
    public void savePurOutbound(KingdeePurReturnSaveReqVO purOutbound) {
        executeBatchOperationWithExceptionHandling(
            "保存采购出库单",
            purOutbound.getBillNo(),
            client -> client.savePurReturn(purOutbound),
            KingDeeErrorCodeConstants.PUR_OUTBOUND_SAVE_FAIL
        );
    }

    /**
     * 获得数据库所有令牌
     *
     * @return List<KingdeeToken>
     */
    public List<KingdeeToken> listKingdeeTokens() {
        return tokenRepository.findAll();
    }

    /**
     * 获取所有公司的供应商集合
     * key:公司name
     */
    public Map<String, KingdeeSupplierSaveVO> getAllSupplierList(KingdeeSupplierQueryReqVO queryReqVO) {
        AtomicReference<Map<String, KingdeeSupplierSaveVO>> map = new AtomicReference<>();
        clients.stream().parallel().forEach(peek -> map.set(peek.getAllSupplierList(queryReqVO)));
        return map.get();
    }

    /**
     * 删除供应商缓存
     *
     * @return 删除的缓存总数
     */
    public Integer deleteSupplierCache() {
        return clients.parallelStream()
            .mapToInt(KingdeeClient::deleteSupplierCache)
            .sum();
    }

    private void executeBatchOperationWithExceptionHandling(String operation, String identifier,
                                                            Consumer<KingdeeClient> operationConsumer,
                                                            ErrorCode errorCode) {

        List<CompletableFuture<String>> futures = clients.stream()
            .map(client -> CompletableFuture.supplyAsync(() -> {
                try {
                    operationConsumer.accept(client);
                    return null; // 表示成功
                } catch (Exception e) {
                    log.error("{}失败，={}，identifier={}，原因：{}", operation, client.getToken().getAccountName(), identifier, e.getMessage(), e);
                    return client.getToken().getAccountName();
                }
            }, AsyncTask.DEFAULT.getExecutor().getThreadPoolExecutor()))
            .toList();

        // 等待所有任务完成
        List<String> failedClients = futures.stream()
            .map(CompletableFuture::join)
            .filter(Objects::nonNull)
            .toList();


        if (!failedClients.isEmpty()) {
            throw ServiceExceptionUtil.exception(errorCode, "失败客户端：" + String.join(",", failedClients));
        }
    }

}
