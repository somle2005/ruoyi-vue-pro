package cn.iocoder.yudao.module.oms.service.impl;

import cn.iocoder.yudao.module.oms.dal.OmsSkuMapper;
import cn.iocoder.yudao.module.oms.model.entity.OmsShop;
import cn.iocoder.yudao.module.oms.model.entity.OmsSku;
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
    private OmsSkuMapper omsSkuMapper;

    /**
     * 批量插入或更新OmsSku
     *
     * @param omsShop
     * @param doDBOmsSkus 更新后的全部处理数据集合
     * @return
     */
    public List<OmsSku> insertOrUpdateOmsSku(OmsShop omsShop, List<OmsSku> doDBOmsSkus) {
        List<String> allSkus = doDBOmsSkus.stream().map(OmsSku::getSku).distinct().collect(Collectors.toList());
        LambdaQueryWrapper<OmsSku> existEq = new LambdaQueryWrapper<OmsSku>()
            .in(OmsSku::getSku, allSkus)
            .eq(OmsSku::getStoreName, omsShop.getName())
            .eq(OmsSku::getDeleted, 0);
        List<OmsSku> existSkus = omsSkuMapper.selectList(existEq);
        Map<String, OmsSku> existSkuIdMaps = existSkus.stream().collect(Collectors.toMap(OmsSku::getSku, e -> e));

        List<OmsSku> saveOmsSkus = new ArrayList<>();
        List<OmsSku> updateOmsSkus = new ArrayList<>();
        for (OmsSku dbOmsSkus : doDBOmsSkus) {
            String sku = dbOmsSkus.getSku();
            OmsSku omsSku = existSkuIdMaps.get(sku);
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
            omsSkuMapper.insert(saveOmsSkus);
        }
        if (!CollectionUtils.isEmpty(updateOmsSkus)) {
            omsSkuMapper.updateById(updateOmsSkus);
        }
        List<OmsSku> allOmsSkus = new ArrayList<>();
        allOmsSkus.addAll(saveOmsSkus);
        allOmsSkus.addAll(updateOmsSkus);
        return allOmsSkus;
    }

}
