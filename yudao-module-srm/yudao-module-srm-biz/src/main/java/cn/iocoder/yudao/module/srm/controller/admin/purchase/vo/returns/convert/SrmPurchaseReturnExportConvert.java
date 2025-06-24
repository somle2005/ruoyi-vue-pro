package cn.iocoder.yudao.module.srm.controller.admin.purchase.vo.returns.convert;

import cn.iocoder.yudao.module.srm.controller.admin.purchase.vo.returns.SrmPurchaseReturnBaseRespVO;
import cn.iocoder.yudao.module.srm.controller.admin.purchase.vo.returns.SrmPurchaseReturnExcelRespVO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SrmPurchaseReturnExportConvert {
    public static List<SrmPurchaseReturnExcelRespVO> buildExcelList(List<SrmPurchaseReturnBaseRespVO> list) {
        if (list == null || list.isEmpty()) {
            return Collections.emptyList();
        }
        List<SrmPurchaseReturnExcelRespVO> result = new ArrayList<>();
        for (SrmPurchaseReturnBaseRespVO main : list) {
            if (main.getItems() == null || main.getItems().isEmpty()) {
                SrmPurchaseReturnExcelRespVO vo = new SrmPurchaseReturnExcelRespVO();
                vo.setCode(main.getCode());
                vo.setSupplierName(main.getSupplierName());
                vo.setBillTime(main.getBillTime());
                vo.setReturnTime(main.getReturnTime());
                vo.setWarehouseName(main.getWarehouseName());
                vo.setAuditor(main.getAuditor());
                vo.setAuditTime(main.getAuditTime());
                vo.setAuditAdvice(main.getAuditAdvice());
                vo.setAuditStatus(main.getAuditStatus());
                vo.setOffStatus(main.getOffStatus());
                vo.setReturnStatus(main.getReturnStatus());
                vo.setRemark(main.getRemark());
                vo.setTotalCount(main.getTotalCount());
                vo.setTotalPrice(main.getTotalPrice());
                result.add(vo);
            } else {
                for (SrmPurchaseReturnBaseRespVO.Item item : main.getItems()) {
                    SrmPurchaseReturnExcelRespVO vo = new SrmPurchaseReturnExcelRespVO();
                    // 主表字段
                    vo.setCode(main.getCode());
                    vo.setSupplierName(main.getSupplierName());
                    vo.setBillTime(main.getBillTime());
                    vo.setReturnTime(main.getReturnTime());
                    vo.setWarehouseName(main.getWarehouseName());
                    vo.setAuditor(main.getAuditor());
                    vo.setAuditTime(main.getAuditTime());
                    vo.setAuditAdvice(main.getAuditAdvice());
                    vo.setAuditStatus(main.getAuditStatus());
                    vo.setOffStatus(main.getOffStatus());
                    vo.setReturnStatus(main.getReturnStatus());
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
                    vo.setItemReturnStatus(item.getReturnStatus());
                    vo.setPurchaseInCode(item.getPurchaseInCode());
                    vo.setPurchaseInItemId(item.getPurchaseInItemId());
                    vo.setDeliveryTime(item.getDeliveryTime());
                    vo.setItemRemark(item.getRemark());
                    result.add(vo);
                }
            }
        }
        return result;
    }
} 