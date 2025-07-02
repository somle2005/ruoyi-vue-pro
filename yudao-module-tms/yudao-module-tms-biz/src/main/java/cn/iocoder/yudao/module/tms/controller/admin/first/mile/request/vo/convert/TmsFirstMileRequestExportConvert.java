package cn.iocoder.yudao.module.tms.controller.admin.first.mile.request.vo.convert;

import cn.iocoder.yudao.framework.common.util.object.BeanUtils;
import cn.iocoder.yudao.module.tms.controller.admin.first.mile.request.item.vo.TmsFirstMileRequestItemRespVO;
import cn.iocoder.yudao.module.tms.controller.admin.first.mile.request.vo.TmsFirstMileRequestExcelRespVO;
import cn.iocoder.yudao.module.tms.controller.admin.first.mile.request.vo.TmsFirstMileRequestRespVO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TmsFirstMileRequestExportConvert {
    public static List<TmsFirstMileRequestExcelRespVO> buildExcelList(List<TmsFirstMileRequestRespVO> list) {
        if (list == null || list.isEmpty()) {
            return Collections.emptyList();
        }
        List<TmsFirstMileRequestExcelRespVO> result = new ArrayList<>();
        for (TmsFirstMileRequestRespVO main : list) {
            if (main.getItems() == null || main.getItems().isEmpty()) {
                // 没有子表数据，只导出主表信息
                TmsFirstMileRequestExcelRespVO vo = BeanUtils.toBean(main, TmsFirstMileRequestExcelRespVO.class);
                result.add(vo);
            } else {
                // 有子表数据，每个子表项都包含完整的主表信息
                for (TmsFirstMileRequestItemRespVO item : main.getItems()) {
                    // 先复制主表字段
                    TmsFirstMileRequestExcelRespVO vo = BeanUtils.toBean(main, TmsFirstMileRequestExcelRespVO.class);
                    // 手动设置子表特有字段，避免覆盖主表字段
                    vo.setItemId(item.getId());
                    vo.setProductName(item.getProduct() != null ? item.getProduct().getName() : null);
                    vo.setProductCode(item.getProduct() != null ? item.getProduct().getCode() : null);
                    vo.setFbaBarCode(item.getFbaBarCode());
                    vo.setQty(item.getQty());
                    vo.setDomesticWarehouseStock(item.getDomesticWarehouseStock());
                    vo.setPurchaseTransitQty(item.getPurchaseTransitQty());
                    vo.setPackageLength(item.getPackageLength());
                    vo.setPackageWidth(item.getPackageWidth());
                    vo.setPackageHeight(item.getPackageHeight());
                    vo.setPackageWeight(item.getPackageWeight());
                    vo.setWeight(item.getWeight());
                    vo.setVolume(item.getVolume());
                    vo.setTotalPackageLength(item.getTotalPackageLength());
                    vo.setTotalPackageWidth(item.getTotalPackageWidth());
                    vo.setTotalPackageHeight(item.getTotalPackageHeight());
                    vo.setTotalItemPackageWeight(item.getTotalPackageWeight());
                    vo.setTotalItemWeight(item.getTotalWeight());
                    vo.setTotalItemVolume(item.getTotalVolume());
                    vo.setItemOrderStatus(item.getOrderStatus());
                    vo.setItemOffStatus(item.getOffStatus());
                    vo.setOrderClosedQty(item.getOrderClosedQty());
                    vo.setSalesCompanyName(item.getSalesCompanyName());
                    vo.setItemRemark(item.getRemark());
                    result.add(vo);
                }
            }
        }
        return result;
    }
} 