package com.somle.kingdee.service;


import cn.hutool.core.util.StrUtil;
import cn.iocoder.yudao.module.srm.api.purchase.SrmPurchaseInApi;
import cn.iocoder.yudao.module.srm.api.purchase.SrmPurchaseOrderApi;
import cn.iocoder.yudao.module.srm.api.purchase.dto.SrmPurchaseInDTO;
import cn.iocoder.yudao.module.srm.api.purchase.dto.SrmPurchaseOrderDTO;
import cn.iocoder.yudao.module.srm.api.supplier.SrmSupplierApi;
import cn.iocoder.yudao.module.srm.api.supplier.dto.SrmSupplierDTO;
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
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import java.util.stream.Collectors;

// https://open.jdy.com/#/files/api/detail?index=2&categrayId=3cc8ee9a663e11eda5c84b5d383a2b93&id=adfe4a24712711eda0b307c6992ee459
@Slf4j
@Service
@Data
@ConfigurationProperties(prefix = "kingdee")
public class KingdeeService {

    private List<String> outerInstanceIds;
    private List<KingdeeClient> clients;
    private Boolean strictSupplierMatch = true; // 是否严格匹配供应商名称，默认为true,非严格模式数据同步给所有公司

    @Autowired
    private StringRedisTemplate stringRedisTemplate;
    @Autowired
    private KingdeeTokenRepository tokenRepository;
    @Autowired
    private RedissonClient redissonClient;
    @Autowired
    private SrmSupplierApi srmSupplierApi;
    @Autowired
    private SrmPurchaseOrderApi srmPurchaseOrderApi;
    @Autowired
    private SrmPurchaseInApi srmPurchaseInApi;

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

    /**
     * 添加部门
     *
     * @param department 部门信息
     */
    public List<KingdeeResponse> addDepartment(KingdeeAuxInfoDetail department) {
        return clients.parallelStream()
            .map(client -> {
                log.debug("执行添加部门操作，client={}，identifier={}", client.getToken().getAccountName(), department.getName());
                return client.addDepartment(department);
            })
            .collect(Collectors.toList());
    }

    /**
     * 添加产品
     *
     * @param product 产品信息
     */
    public List<KingdeeResponse> addProduct(KingdeeProductSaveReqVO product) {
        return clients.parallelStream()
            .map(client -> {
                log.debug("执行添加产品操作，client={}，identifier={}", client.getToken().getAccountName(), product.getNumber());
                return client.addProduct(product);
            })
            .collect(Collectors.toList());
    }

    /**
     * 添加供应商
     *
     * @param kingdeeSupplierSaveVO 供应商信息
     */
    public List<KingdeeResponse> addSupplier(KingdeeSupplierSaveVO kingdeeSupplierSaveVO) {
        return clients.parallelStream()
            .map(client -> {
                log.debug("执行添加供应商操作，client={}，identifier={}", client.getToken().getAccountName(), kingdeeSupplierSaveVO.getName());
                return client.saveSupplier(kingdeeSupplierSaveVO);
            })
            .collect(Collectors.toList());
    }

    /**
     * 比较供应商名称是否匹配当前客户端名称
     * <p>
     * 当 strictSupplierMatch=true 时严格匹配，否则返回 true
     * @param supplierName 供应商名称
     * @param client       金蝶客户端
     * @return 是否匹配
     */
    private boolean isSupplierNameMatch(String supplierName, KingdeeClient client) {
        if (!strictSupplierMatch) {
            return true;
        }
        return Objects.equals(StrUtil.trim(supplierName), StrUtil.trim(client.getToken().getAccountName()));
    }

    /**
     * 保存采购订单
     *
     * @param purchaseOrder 采购订单
     */
    public List<KingdeeResponse> savePurchaseOrder(KingdeePurOrderSaveReqVO purchaseOrder) {
        return clients.parallelStream()
            .filter(client -> isSupplierNameMatch(purchaseOrder.getSupplierNumber(), client))
            .map(client -> client.savePurOrder(purchaseOrder))
            .collect(Collectors.toList());
    }

    /**
     * 保存+审核采购订单
     *
     * @param purchaseOrder 采购订单
     */
    public List<KingdeeResponse> saveAndAuditPurchaseOrder(KingdeePurOrderSaveReqVO purchaseOrder) {
        return clients.parallelStream()
            .filter(client -> isSupplierNameMatch(purchaseOrder.getSupplierNumber(), client))
            .map(client -> client.saveAndAuditPurOrder(purchaseOrder))
            .collect(Collectors.toList());
    }

    /**
     * 反审核+删除采购订单
     *
     * @param purCode 采购订单编号
     */
    public List<KingdeeResponse> unAuditPurchaseOrder(String purCode) {
        return clients.parallelStream()
            .filter(client -> {
                SrmPurchaseOrderDTO purchaseOrderDTO = srmPurchaseOrderApi.getPurchaseOrderByCode(purCode);
                return isSupplierNameMatch(purchaseOrderDTO.getSupplierName(), client);
            })
            .map(client -> client.unAuditPurOrder(purCode))
            .collect(Collectors.toList());
    }

    /**
     * 保存+审核采购到货单
     *
     * @param purInbound 采购到货单
     */
    public List<KingdeeResponse> saveAuditPurInbound(KingdeePurInboundSaveReqVO purInbound) {
        return clients.parallelStream()
            .filter(client -> {
                SrmPurchaseInDTO purchaseInByCode = srmPurchaseInApi.getPurchaseInByCode(purInbound.getBillNo());
                Long supplierId = purchaseInByCode.getSupplierId();
                SrmSupplierDTO supplierDTO = srmSupplierApi.getSupplier(supplierId);
                return isSupplierNameMatch(supplierDTO.getName(), client);
            })
            .map(client -> client.saveAuditPurInbound(purInbound))
            .flatMap(List::stream)
            .collect(Collectors.toList());
    }

    /**
     * 保存采购出库单
     *
     * @param purOutbound 采购出库单
     */
    public List<KingdeeResponse> savePurOutbound(KingdeePurReturnSaveReqVO purOutbound) {
        return clients.parallelStream()
            .filter(client -> {
                Long supplierId = Long.valueOf(purOutbound.getSupplierId());
                SrmSupplierDTO supplierDTO = srmSupplierApi.getSupplier(supplierId);
                return isSupplierNameMatch(supplierDTO.getName(), client);
            })
            .map(client -> client.savePurReturn(purOutbound))
            .collect(Collectors.toList());
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
