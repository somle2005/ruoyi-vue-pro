package cn.iocoder.yudao.module.oms.service.impl;

import cn.iocoder.yudao.module.oms.repository.OmsSkuRepository;
import cn.iocoder.yudao.module.oms.model.OmsShopDO;
import cn.iocoder.yudao.module.oms.model.OmsSkuDO;
import cn.iocoder.yudao.module.oms.service.OmsSkuService;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class OmsSkuServiceImpl implements OmsSkuService {

    @Resource
    private OmsSkuRepository omsSkuRepository;

    /**
     * 批量插入或更新OmsSku
     *
     * @param omsShopDO
     * @param doDBOmsSkus 更新后的全部处理数据集合
     * @return
     */
    public List<OmsSkuDO> insertOrUpdateOmsSku(OmsShopDO omsShopDO, List<OmsSkuDO> doDBOmsSkus) {
        List<String> allSkus = doDBOmsSkus.stream().map(OmsSkuDO::getSku).distinct().collect(Collectors.toList());
        LambdaQueryWrapper<OmsSkuDO> existEq = new LambdaQueryWrapper<OmsSkuDO>()
            .in(OmsSkuDO::getSku, allSkus)
            .eq(OmsSkuDO::getStoreName, omsShopDO.getName())
            .eq(OmsSkuDO::getDeleted, 0);
        List<OmsSkuDO> existSkus = omsSkuRepository.selectList(existEq);
        Map<String, OmsSkuDO> existSkuIdMaps = existSkus.stream().collect(Collectors.toMap(OmsSkuDO::getSku, e -> e));

        List<OmsSkuDO> saveOmsSkus = new ArrayList<>();
        List<OmsSkuDO> updateOmsSkus = new ArrayList<>();
        for (OmsSkuDO dbOmsSkus : doDBOmsSkus) {
            String sku = dbOmsSkus.getSku();
            OmsSkuDO omsSku = existSkuIdMaps.get(sku);
            if (omsSku != null) {
                dbOmsSkus.setId(omsSku.getId());
                if (!omsSku.getOriginalJson().equals(dbOmsSkus.getOriginalJson())) {
                    updateOmsSkus.add(dbOmsSkus);
                }
            } else {
                saveOmsSkus.add(dbOmsSkus);
            }
        }
        if (!CollectionUtils.isEmpty(saveOmsSkus)) {
            omsSkuRepository.insert(saveOmsSkus);
        }
        if (!CollectionUtils.isEmpty(updateOmsSkus)) {
            omsSkuRepository.updateById(updateOmsSkus);
        }
        List<OmsSkuDO> allOmsSkus = new ArrayList<>();
        allOmsSkus.addAll(saveOmsSkus);
        allOmsSkus.addAll(updateOmsSkus);
        return allOmsSkus;
    }

}
