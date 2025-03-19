package cn.iocoder.yudao.module.oms.job;

import cn.iocoder.yudao.framework.common.util.custom.MyExceptionUtil;
import cn.iocoder.yudao.framework.quartz.core.handler.JobHandler;
import cn.iocoder.yudao.module.oms.domain.entity.ErpShop;
import cn.iocoder.yudao.module.oms.domain.entity.ErpSku;
import cn.iocoder.yudao.module.oms.mapper.ErpShopMapper;
import cn.iocoder.yudao.module.oms.mapper.ErpSkuMapper;
import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.somle.walmart.domain.WalmartAllItemsResVO;
import com.somle.walmart.domain.WalmartToken;
import com.somle.walmart.mapper.WalmartTokenMapper;
import com.somle.walmart.service.WalmartMarketplaceClient;
import com.somle.walmart.service.WalmartService;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import java.time.LocalDateTime;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

//Walmart sku拉取
@Slf4j
@Component
public class WalmartListingJob implements JobHandler {

    @Resource
    private WalmartService walmartService;

    @Resource
    private WalmartTokenMapper walmartTokenMapper;

    @Resource
    private ErpShopMapper erpShopMapper;

    @Resource
    private ErpSkuMapper erpSkuMapper;

    @Override
    public synchronized String execute(String param) throws Exception {
        if (!StringUtils.hasText(param)) {
            throw new RuntimeException("请输入店铺数组");
        }
        List<String> storeNames = Arrays.asList(param.split(","));
        String errorMsg = "";
        if (!CollectionUtils.isEmpty(storeNames)) {
            LambdaQueryWrapper<ErpShop> inWrapper = new LambdaQueryWrapper<ErpShop>().eq(ErpShop::getPlatName, "Walmart").eq(ErpShop::getDeleted, 0).in(ErpShop::getName, storeNames);
            List<ErpShop> erpShops = erpShopMapper.selectList(inWrapper);
            Map<String, ErpShop> nameMap = erpShops.stream().collect(Collectors.toMap(ErpShop::getName, e -> e));
            for (String storeName : storeNames) {
                try {
                    ErpShop erpShop = nameMap.get(storeName);
                    if (erpShop == null) {
                        throw new RuntimeException("当前店铺名称不存在");
                    }
                    int offet = 0;
                    while (true) {
                        WalmartToken walmartToken = walmartTokenMapper.selectById(erpShop.getAuthId());
                        WalmartMarketplaceClient walmartClient = (WalmartMarketplaceClient) walmartService.getClient(walmartToken);
                        WalmartAllItemsResVO walmartAllItemsResVO = walmartClient.getAllItems(String.valueOf(offet));
                        if (CollectionUtils.isEmpty(walmartAllItemsResVO.getItemResponse())) {
                            break;
                        }

                        //操作db，新增或者更新
                        saveOrUpdateSku(walmartAllItemsResVO.getItemResponse(), erpShop);
                        offet += 500;
                        //防止限流
                        TimeUnit.MILLISECONDS.sleep(200L);
                    }
                } catch (Exception e) {
                    log.error("店铺名称{},出现异常", storeName, e);
                    errorMsg = errorMsg + storeName + MyExceptionUtil.getExceptionDetail(e);
                }
            }
        }
        if (StringUtils.hasText(errorMsg)) {
            throw new RuntimeException(errorMsg);
        }
        return "success";
    }


    private void saveOrUpdateSku(List<WalmartAllItemsResVO.ItemResponseDTO> itemDTOs, ErpShop erpShop) {
        ArrayList<WalmartAllItemsResVO.ItemResponseDTO> items = new ArrayList<>();
        Map<String, List<WalmartAllItemsResVO.ItemResponseDTO>> skuMap = itemDTOs.stream().filter(e -> StringUtils.hasText(e.getSku())).collect(Collectors.groupingBy(WalmartAllItemsResVO.ItemResponseDTO::getSku));
        Set<String> allSkus = skuMap.keySet();
        for (String sku : allSkus) {
            WalmartAllItemsResVO.ItemResponseDTO erpSku = skuMap.get(sku).get(0);
            items.add(erpSku);
        }
        if (CollectionUtils.isEmpty(items)) {
            return;
        }
        LambdaQueryWrapper<ErpSku> existEq = new LambdaQueryWrapper<ErpSku>().in(ErpSku::getSku, allSkus).eq(ErpSku::getStoreName, erpShop.getName()).eq(ErpSku::getDeleted, 0);
        List<ErpSku> existSkus = erpSkuMapper.selectList(existEq);
        Map<String, ErpSku> existSkuIdMaps = existSkus.stream().collect(Collectors.toMap(ErpSku::getSku, e -> e));

        List<ErpSku> saveErpSkus = new ArrayList<>();
        List<ErpSku> updateErpSkus = new ArrayList<>();
        for (WalmartAllItemsResVO.ItemResponseDTO eachItem : items) {
            ErpSku existErpSku = existSkuIdMaps.get(eachItem.getSku());
            Long existId = null;
            String existOriginalJson = null;
            if (existErpSku != null) {
                existId = existErpSku.getId();
                existOriginalJson = existErpSku.getOriginalJson();
            }
            ErpSku erpSku = new ErpSku();
            erpSku.setPlatSkuCode(eachItem.getWpid());
            erpSku.setSku(eachItem.getSku());
            erpSku.setStoreId(erpShop.getId());
            erpSku.setStoreName(erpShop.getName());
            erpSku.setPlatId(erpShop.getPlatId());
            erpSku.setPlatName(erpShop.getPlatName());
            erpSku.setPlatShopCode(erpShop.getPlatShopCode());
            erpSku.setConditionType(eachItem.getCondition());
            if ("In_stock".equals(eachItem.getAvailability())) {
                erpSku.setBuyableStatus(1);
                erpSku.setDiscoverableStatus(1);
                erpSku.setPreorderStatus(0);
            } else if ("Out_of_stock".equals(eachItem.getAvailability())) {
                erpSku.setBuyableStatus(0);
                erpSku.setDiscoverableStatus(0);
                erpSku.setPreorderStatus(0);
            } else {
                erpSku.setBuyableStatus(0);
                erpSku.setDiscoverableStatus(1);
                erpSku.setPreorderStatus(1);
            }
            erpSku.setUpc(eachItem.getUpc());
            erpSku.setGtin(eachItem.getGtin());
            erpSku.setTitle(eachItem.getProductName());
            erpSku.setProductType(eachItem.getProductType());
            erpSku.setCreator("admin");
            erpSku.setCreateTime(LocalDateTime.now());
            erpSku.setDeleted(0);
            String originalJson = JSON.toJSONString(eachItem);

            if (existId == null) {
                saveErpSkus.add(erpSku);
            } else if (!originalJson.equals(existOriginalJson)) {
                updateErpSkus.add(erpSku);
            }
        }
        if (!CollectionUtils.isEmpty(saveErpSkus)) {
            erpSkuMapper.insert(saveErpSkus);
        }
        if (!CollectionUtils.isEmpty(updateErpSkus)) {
            erpSkuMapper.updateById(updateErpSkus);
        }
    }
}
