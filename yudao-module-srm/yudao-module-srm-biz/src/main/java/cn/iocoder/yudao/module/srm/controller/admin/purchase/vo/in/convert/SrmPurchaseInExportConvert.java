package cn.iocoder.yudao.module.srm.controller.admin.purchase.vo.in.convert;

import cn.iocoder.yudao.module.srm.controller.admin.purchase.vo.in.SrmPurchaseInBaseRespVO;
import cn.iocoder.yudao.module.srm.controller.admin.purchase.vo.in.SrmPurchaseInExcelRespVO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SrmPurchaseInExportConvert {
    public static List<SrmPurchaseInExcelRespVO> buildExcelList(List<SrmPurchaseInBaseRespVO> list) {
        if (list == null || list.isEmpty()) {
            return Collections.emptyList();
        }
        List<SrmPurchaseInExcelRespVO> result = new ArrayList<>();
        for (SrmPurchaseInBaseRespVO main : list) {
            if (main.getItems() == null || main.getItems().isEmpty()) {
                SrmPurchaseInExcelRespVO vo = new SrmPurchaseInExcelRespVO();
                vo.setCode(main.getCode());
                vo.setSupplierName(main.getSupplierName());
                vo.setBillTime(main.getBillTime());
                vo.setInTime(main.getInTime());
                vo.setWarehouseName(main.getWarehouseName());
                vo.setAuditor(main.getAuditor());
                vo.setAuditTime(main.getAuditTime());
                vo.setAuditAdvice(main.getAuditAdvice());
                vo.setAuditStatus(main.getAuditStatus());
                vo.setOffStatus(main.getOffStatus());
                vo.setInboundStatus(main.getInboundStatus());
                vo.setRemark(main.getRemark());
                vo.setTotalCount(main.getTotalCount());
                vo.setTotalPrice(main.getTotalPrice());
                result.add(vo);
            } else {
                for (SrmPurchaseInBaseRespVO.Item item : main.getItems()) {
                    SrmPurchaseInExcelRespVO vo = new SrmPurchaseInExcelRespVO();
                    // 主表字段
                    vo.setCode(main.getCode());
                    vo.setSupplierName(main.getSupplierName());
                    vo.setBillTime(main.getBillTime());
                    vo.setInTime(main.getInTime());
                    vo.setWarehouseName(main.getWarehouseName());
                    vo.setAuditor(main.getAuditor());
                    vo.setAuditTime(main.getAuditTime());
                    vo.setAuditAdvice(main.getAuditAdvice());
                    vo.setAuditStatus(main.getAuditStatus());
                    vo.setOffStatus(main.getOffStatus());
                    vo.setInboundStatus(main.getInboundStatus());
                    vo.setRemark(main.getRemark());
                    vo.setTotalCount(main.getTotalCount());
                    vo.setTotalPrice(main.getTotalPrice());
                    // 子表字段
                    vo.setItemId(item.getId());
                    vo.setProductName(item.getProductName());
                    vo.setProductCode(item.getProductCode());
                    vo.setProductUnitName(item.getProductUnitName());
                    vo.setModel(item.getModel());
                    vo.setQty(item.getQty());
                    vo.setGrossPrice(item.getGrossPrice());
                    vo.setGrossTotalPrice(item.getGrossTotalPrice());
                    vo.setTaxRate(item.getTaxRate());
                    vo.setTax(item.getTax());
                    vo.setItemWarehouseName(item.getWarehouseName());
                    vo.setItemOffStatus(item.getOffStatus());
                    vo.setItemInboundStatus(item.getInboundStatus());
                    vo.setPurchaseOrderCode(item.getPurchaseOrderCode());
                    vo.setPurchaseOrderItemId(item.getPurchaseOrderItemId());
                    vo.setDeliveryTime(item.getDeliveryTime());
                    vo.setItemRemark(item.getRemark());
                    result.add(vo);
                }
            }
        }
        return result;
    }
} 