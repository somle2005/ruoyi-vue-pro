package com.somle.kingdee.service;


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
        executeBatchOperation(
            "刷新供应商列表",
            "all",
            KingdeeClient::refreshSupplierCache
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
        executeBatchOperation(
            "添加部门",
            department.getName(),
            client -> client.addDepartment(department)
        );
    }

    public void addProduct(KingdeeProductSaveReqVO product) {
        executeBatchOperation(
            "添加产品",
            product.getNumber(),
            client -> client.addProduct(product)
        );
    }

    public void addSupplier(KingdeeSupplierSaveVO kingdeeSupplierSaveVO) {
        executeBatchOperation(
            "添加供应商",
            kingdeeSupplierSaveVO.getName(),
            client -> client.saveSupplier(kingdeeSupplierSaveVO)
        );
    }

    /**
     * 保存采购订单
     *
     * @param purchaseOrder 采购订单
     */
    public void savePurchaseOrder(KingdeePurOrderSaveReqVO purchaseOrder) {
        executeBatchOperation(
            "保存采购订单",
            purchaseOrder.getBillNo(),
            client -> client.savePurOrder(purchaseOrder)
        );
    }

    /**
     * 保存+审核采购订单
     */
    public void saveAndAuditPurchaseOrder(KingdeePurOrderSaveReqVO purchaseOrder) {
        executeBatchOperation(
            "保存并审核采购订单",
            purchaseOrder.getBillNo(),
            client -> client.saveAndAuditPurOrder(purchaseOrder)
        );
    }

    /**
     * 反审核+删除采购订单
     */
    public void unAuditPurchaseOrder(String purCode) {
        executeBatchOperation(
            "取消审核采购订单",
            purCode,
            client -> client.unAuditPurOrder(purCode)
        );
    }

    /**
     * 保存采购入库单
     *
     * @param purInbound 采购入库单
     */
    public void savePurInbound(KingdeePurInboundSaveReqVO purInbound) {
        executeBatchOperation(
            "保存采购入库单",
            purInbound.getBillNo(),
            client -> client.savePurInbound(purInbound)
        );
    }

    /**
     * 保存采购出库单
     *
     * @param purOutbound 采购出库单
     */
    public void savePurOutbound(KingdeePurReturnSaveReqVO purOutbound) {
        executeBatchOperation(
            "保存采购出库单",
            purOutbound.getBillNo(),
            client -> client.savePurReturn(purOutbound)
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

    private void executeBatchOperation(String operation, String identifier,
                                       Consumer<KingdeeClient> operationConsumer) {
        clients.parallelStream().forEach(client -> {
            log.debug("执行{}操作，client={}，identifier={}", operation, client.getToken().getAccountName(), identifier);
            operationConsumer.accept(client);
        });
    }

}
