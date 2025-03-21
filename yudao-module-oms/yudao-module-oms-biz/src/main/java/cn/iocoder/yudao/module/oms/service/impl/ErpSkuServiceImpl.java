package cn.iocoder.yudao.module.oms.service.impl;

import cn.iocoder.yudao.module.oms.domain.entity.ErpShop;
import cn.iocoder.yudao.module.oms.domain.entity.ErpSku;
import cn.iocoder.yudao.module.oms.mapper.ErpSkuMapper;
import cn.iocoder.yudao.module.oms.service.ErpSkuService;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class ErpSkuServiceImpl implements ErpSkuService {

    @Resource
    private ErpSkuMapper erpSkuMapper;

    /**
     * 批量插入或更新ErpSku
     *
     * @param erpShop
     * @param doDBErpSkus 更新后的全部处理数据集合
     * @return
     */
    public List<ErpSku> insertOrUpdateErpSku(ErpShop erpShop, List<ErpSku> doDBErpSkus) {
        List<String> allSkus = doDBErpSkus.stream().map(ErpSku::getSku).distinct().collect(Collectors.toList());
        LambdaQueryWrapper<ErpSku> existEq = new LambdaQueryWrapper<ErpSku>()
            .in(ErpSku::getSku, allSkus)
            .eq(ErpSku::getStoreName, erpShop.getName())
            .eq(ErpSku::getDeleted, 0);
        List<ErpSku> existSkus = erpSkuMapper.selectList(existEq);
        Map<String, ErpSku> existSkuIdMaps = existSkus.stream().collect(Collectors.toMap(ErpSku::getSku, e -> e));

        List<ErpSku> saveErpSkus = new ArrayList<>();
        List<ErpSku> updateErpSkus = new ArrayList<>();
        for (ErpSku dbErpSkus : doDBErpSkus) {
            String sku = dbErpSkus.getSku();
            ErpSku erpSku = existSkuIdMaps.get(sku);
            if (erpSku != null) {
                dbErpSkus.setId(erpSku.getId());
                if (!erpSku.getOriginalJson().equals(dbErpSkus.getOriginalJson())) {
                    updateErpSkus.add(dbErpSkus);
                }
            } else {
                saveErpSkus.add(dbErpSkus);
            }
        }
        if (!CollectionUtils.isEmpty(saveErpSkus)) {
            erpSkuMapper.insert(saveErpSkus);
        }
        if (!CollectionUtils.isEmpty(updateErpSkus)) {
            erpSkuMapper.updateById(updateErpSkus);
        }
        List<ErpSku> allErpSkus = new ArrayList<>();
        allErpSkus.addAll(saveErpSkus);
        allErpSkus.addAll(updateErpSkus);
        return allErpSkus;
    }

}
