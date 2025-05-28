package cn.iocoder.yudao.module.srm.api.purchase;

import cn.iocoder.yudao.framework.common.util.object.BeanUtils;
import cn.iocoder.yudao.module.srm.api.purchase.dto.SrmPurchaseInDTO;
import cn.iocoder.yudao.module.srm.api.purchase.dto.SrmPurchaseInItemDTO;
import cn.iocoder.yudao.module.srm.api.purchase.dto.WmsInboundDTO;
import cn.iocoder.yudao.module.srm.dal.dataobject.purchase.SrmPurchaseInDO;
import cn.iocoder.yudao.module.srm.dal.dataobject.purchase.SrmPurchaseInItemDO;
import cn.iocoder.yudao.module.srm.service.purchase.SrmPurchaseInService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 采购入库单 API 实现类
 */
@Service
@Validated
public class SrmPurchaseInApiImpl implements SrmPurchaseInApi {

    @Resource
    private SrmPurchaseInService purchaseInService;

    @Override
    public List<SrmPurchaseInDTO> getPurchaseInList(List<Long> ids) {
        // 1. 获取采购入库单列表
        List<SrmPurchaseInDO> inOrders = purchaseInService.getPurchaseInList(ids);
        if (inOrders.isEmpty()) {
            return List.of();
        }

        // 2. 获取入库明细列表
        Map<Long, List<SrmPurchaseInItemDO>> inItemMap = purchaseInService.getPurchaseInItemListByInIds(
                        inOrders.stream().map(SrmPurchaseInDO::getId).collect(Collectors.toList()))
                .stream().collect(Collectors.groupingBy(SrmPurchaseInItemDO::getInId));

        // 3. 转换为 DTO 对象
        return inOrders.stream().map(inOrder -> {
            SrmPurchaseInDTO dto = BeanUtils.toBean(inOrder, SrmPurchaseInDTO.class);
            // 设置入库明细
            List<SrmPurchaseInItemDO> inItems = inItemMap.getOrDefault(inOrder.getId(), List.of());
            dto.setItems(inItems.stream().map(this::convertInItem).collect(Collectors.toList()));
            return dto;
        }).collect(Collectors.toList());
    }

    @Override
    public void updatePurchaseInItemQty(WmsInboundDTO inboundDO) {
        //todo 岽宇完成
    }

    /**
     * 转换入库明细
     *
     * @param item 入库明细 DO
     * @return 入库明细 DTO
     */
    private SrmPurchaseInItemDTO convertInItem(SrmPurchaseInItemDO item) {
        if (item == null) {
            return null;
        }
        SrmPurchaseInItemDTO dto = BeanUtils.toBean(item, SrmPurchaseInItemDTO.class);
        // 特殊字段映射
        dto.setMaterialId(item.getProductId());
//        dto.setMaterialCode(item.getProductCode());
        dto.setMaterialName(item.getProductName());
        dto.setUnit(item.getProductUnitName());
        dto.setQuantity(item.getQty());
        dto.setPrice(item.getProductPrice());
        dto.setAmount(item.getTotalPrice());
        dto.setTaxPercent(item.getTaxPercent());
        dto.setTaxAmount(item.getTaxPrice());
        dto.setActTaxPrice(item.getActTaxPrice());
        dto.setAllAmount(item.getTotalProductPrice());
        return dto;
    }
} 