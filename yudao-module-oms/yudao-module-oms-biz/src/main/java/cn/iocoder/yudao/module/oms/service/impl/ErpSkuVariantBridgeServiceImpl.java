package cn.iocoder.yudao.module.oms.service.impl;

import cn.iocoder.yudao.framework.common.util.custom.MyCollectionUtils;
import cn.iocoder.yudao.module.oms.domain.dto.ErpSkuVariantBridgeDto;
import cn.iocoder.yudao.module.oms.domain.entity.ErpSkuVariantBridge;
import cn.iocoder.yudao.module.oms.mapper.ErpSkuVariantBridgeMapper;
import cn.iocoder.yudao.module.oms.service.ErpSkuVariantBridgeService;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class ErpSkuVariantBridgeServiceImpl extends ServiceImpl<ErpSkuVariantBridgeMapper, ErpSkuVariantBridge> implements ErpSkuVariantBridgeService{

    @Resource
    private ErpSkuVariantBridgeMapper erpSkuVariantBridgeMapper;

    /**
     * 新增或者更新父子关系
     * @param shopName
     * @param erpSkuVariantBridgeDtos
     */
    public void insertOrUpdateErpSkuVariantBridge(String shopName, List<ErpSkuVariantBridgeDto> erpSkuVariantBridgeDtos) {
        if (!CollectionUtils.isEmpty(erpSkuVariantBridgeDtos)) {
            //删除没有子的记录
            List<Long> emptyChildrenParentIds = erpSkuVariantBridgeDtos.stream().filter(e -> CollectionUtils.isEmpty(e.getChildrenS())).map(e -> e.getParentId()).collect(Collectors.toList());
            if (!CollectionUtils.isEmpty(emptyChildrenParentIds)) {
                erpSkuVariantBridgeMapper.delete(new LambdaQueryWrapper<ErpSkuVariantBridge>()
                    .in(ErpSkuVariantBridge::getParentId, emptyChildrenParentIds)
                    .eq(ErpSkuVariantBridge::getDeleted, 0)
                    .eq(ErpSkuVariantBridge::getStoreName, shopName)
                );
            }
            //组装处理数组
            List<ErpSkuVariantBridge> handErpSkuVariantBridges = new ArrayList<>();
            for (ErpSkuVariantBridgeDto parent : erpSkuVariantBridgeDtos) {
                List<ErpSkuVariantBridgeDto.ErpSkuVariantBridgeChildDto> childrenS = parent.getChildrenS();
                if (!CollectionUtils.isEmpty(childrenS)) {
                    for (ErpSkuVariantBridgeDto.ErpSkuVariantBridgeChildDto child : childrenS) {
                        ErpSkuVariantBridge erpSkuVariantBridge = new ErpSkuVariantBridge();
                        erpSkuVariantBridge.setParentId(parent.getParentId());
                        erpSkuVariantBridge.setParentSku(parent.getParentSku());
                        erpSkuVariantBridge.setChildId(child.getChildId());
                        erpSkuVariantBridge.setChildSku(child.getChildSku());
                        erpSkuVariantBridge.setStoreId(parent.getStoreId());
                        erpSkuVariantBridge.setStoreName(parent.getStoreName());
                        erpSkuVariantBridge.setPlatId(parent.getPlatId());
                        erpSkuVariantBridge.setPlatName(parent.getPlatName());
                        erpSkuVariantBridge.setCreator("admin");
                        erpSkuVariantBridge.setCreateTime(LocalDateTime.now());
                        erpSkuVariantBridge.setDeleted(0);
                        handErpSkuVariantBridges.add(erpSkuVariantBridge);
                    }
                }
            }
            if (!CollectionUtils.isEmpty(handErpSkuVariantBridges)) {
                List<Long> parentIds = handErpSkuVariantBridges.stream().map(ErpSkuVariantBridge::getParentId).collect(Collectors.toList());
                List<ErpSkuVariantBridge> existErpSkuVariantBridges = erpSkuVariantBridgeMapper.selectList(new LambdaQueryWrapper<ErpSkuVariantBridge>()
                    .in(ErpSkuVariantBridge::getParentId, parentIds)
                    .eq(ErpSkuVariantBridge::getDeleted, 0)
                    .eq(ErpSkuVariantBridge::getStoreName, shopName)
                );
                Map<String, List<ErpSkuVariantBridge>> handDBResult = MyCollectionUtils.analyzeCollections(handErpSkuVariantBridges, existErpSkuVariantBridges);
                //需要新增的
                List<ErpSkuVariantBridge> aMinusIntersection = handDBResult.get("aMinusIntersection");
                if (!CollectionUtils.isEmpty(aMinusIntersection)) {
                    erpSkuVariantBridgeMapper.insert(aMinusIntersection);
                }
                //需要删除的
                List<ErpSkuVariantBridge> bMinusIntersection = handDBResult.get("bMinusIntersection");
                if (!CollectionUtils.isEmpty(bMinusIntersection)) {
                    erpSkuVariantBridgeMapper.deleteByParentIdAndChildId(bMinusIntersection, shopName);
                }
            }
        }
    }
}
