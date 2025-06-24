package cn.iocoder.yudao.module.srm.controller.admin.purchase.vo.order.convert;

import cn.iocoder.yudao.module.srm.controller.admin.purchase.vo.order.SrmPurchaseOrderBaseRespVO;
import cn.iocoder.yudao.module.srm.controller.admin.purchase.vo.order.SrmPurchaseOrderExcelRespVO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SrmPurchaseOrderExportConvert {
    public static List<SrmPurchaseOrderExcelRespVO> buildExcelList(List<SrmPurchaseOrderBaseRespVO> list) {
        if (list == null || list.isEmpty()) {
            return Collections.emptyList();
        }
        List<SrmPurchaseOrderExcelRespVO> result = new ArrayList<>();
        for (SrmPurchaseOrderBaseRespVO main : list) {
            if (main.getItems() == null || main.getItems().isEmpty()) {
                SrmPurchaseOrderExcelRespVO vo = new SrmPurchaseOrderExcelRespVO();
                // 主表字段
                vo.setCode(main.getCode());
                vo.setSupplierName(main.getSupplierName());
                vo.setBillTime(main.getBillTime());
                vo.setOrderTime(main.getOrderTime());
                vo.setDeliveryDate(main.getDeliveryDate());
                vo.setSettlementDate(main.getSettlementDate());
                vo.setAddress(main.getAddress());
                vo.setAuditor(main.getAuditor());
                vo.setAuditTime(main.getAuditTime());
                vo.setAuditAdvice(main.getAuditAdvice());
                vo.setAuditStatus(main.getAuditStatus());
                vo.setOffStatus(main.getOffStatus());
                vo.setExecuteStatus(main.getExecuteStatus());
                vo.setInboundStatus(main.getInboundStatus());
                vo.setPayStatus(main.getPayStatus());
                vo.setDiscountPercent(main.getDiscountPercent());
                vo.setDiscountPrice(main.getDiscountPrice());
                vo.setDepositPrice(main.getDepositPrice());
                vo.setTotalCount(main.getTotalCount());
                vo.setTotalPrice(main.getTotalPrice());
                vo.setTotalProductPrice(main.getTotalProductPrice());
                vo.setTotalGrossPrice(main.getTotalGrossPrice());
                vo.setTotalInboundCount(main.getTotalInboundCount());
                vo.setTotalReturnCount(main.getTotalReturnCount());
                vo.setRemark(main.getRemark());
                vo.setPaymentTerms(main.getPaymentTerms());
                vo.setCurrencyName(main.getCurrencyName());
                vo.setFromPortName(main.getFromPortName());
                vo.setToPortName(main.getToPortName());
                result.add(vo);
            } else {
                for (SrmPurchaseOrderBaseRespVO.Item item : main.getItems()) {
                    SrmPurchaseOrderExcelRespVO vo = new SrmPurchaseOrderExcelRespVO();
                    // 主表字段
                    vo.setCode(main.getCode());
                    vo.setSupplierName(main.getSupplierName());
                    vo.setBillTime(main.getBillTime());
                    vo.setOrderTime(main.getOrderTime());
                    vo.setDeliveryDate(main.getDeliveryDate());
                    vo.setSettlementDate(main.getSettlementDate());
                    vo.setAddress(main.getAddress());
                    vo.setAuditor(main.getAuditor());
                    vo.setAuditTime(main.getAuditTime());
                    vo.setAuditAdvice(main.getAuditAdvice());
                    vo.setAuditStatus(main.getAuditStatus());
                    vo.setOffStatus(main.getOffStatus());
                    vo.setExecuteStatus(main.getExecuteStatus());
                    vo.setInboundStatus(main.getInboundStatus());
                    vo.setPayStatus(main.getPayStatus());
                    vo.setDiscountPercent(main.getDiscountPercent());
                    vo.setDiscountPrice(main.getDiscountPrice());
                    vo.setDepositPrice(main.getDepositPrice());
                    vo.setTotalCount(main.getTotalCount());
                    vo.setTotalPrice(main.getTotalPrice());
                    vo.setTotalProductPrice(main.getTotalProductPrice());
                    vo.setTotalGrossPrice(main.getTotalGrossPrice());
                    vo.setTotalInboundCount(main.getTotalInboundCount());
                    vo.setTotalReturnCount(main.getTotalReturnCount());
                    vo.setRemark(main.getRemark());
                    vo.setPaymentTerms(main.getPaymentTerms());
                    vo.setCurrencyName(main.getCurrencyName());
                    vo.setFromPortName(main.getFromPortName());
                    vo.setToPortName(main.getToPortName());
                    // 子表字段
                    vo.setItemId(item.getId());
                    vo.setProductName(item.getProductName());
                    vo.setProductCode(item.getProductCode());
                    vo.setProductUnitName(item.getProductUnitName());
                    vo.setModel(item.getModel());
                    vo.setFbaCode(item.getFbaCode());
                    vo.setContainerRate(item.getContainerRate());
                    vo.setDeclaredType(item.getDeclaredType());
                    vo.setDeclaredTypeEn(item.getDeclaredTypeEn());
                    vo.setCustomsDeclaration(item.getCustomsDeclaration());
                    vo.setQty(item.getQty());
                    vo.setProductPrice(item.getProductPrice());
                    vo.setGrossPrice(item.getGrossPrice());
                    vo.setTaxRate(item.getTaxRate());
                    vo.setTax(item.getTax());
                    vo.setGrossTotalPrice(item.getGrossTotalPrice());
                    vo.setPayPrice(item.getPayPrice());
                    vo.setWaitInCount(item.getWaitInCount());
                    vo.setInboundClosedQty(item.getInboundClosedQty());
                    vo.setReturnCount(item.getReturnCount());
                    vo.setWarehouseName(item.getWarehouseName());
                    vo.setAvailableStock(item.getAvailableStock());
                    vo.setItemOffStatus(item.getOffStatus());
                    vo.setItemExecuteStatus(item.getExecuteStatus());
                    vo.setItemInboundStatus(item.getInboundStatus());
                    vo.setItemPayStatus(item.getPayStatus());
                    vo.setPurchaseApplyCode(item.getPurchaseApplyCode());
                    vo.setDeliveryTime(item.getDeliveryTime());
                    vo.setApplicantName(item.getApplicantName());
                    vo.setDepartmentName(item.getDepartmentName());
                    vo.setItemRemark(item.getRemark());
                    vo.setSupplierRule(item.getSupplierRule());
                    vo.setTotalInspectionPassCount(item.getTotalInspectionPassCount());
                    vo.setTotalCompletionPassCount(item.getTotalCompletionPassCount());
                    result.add(vo);
                }
            }
        }
        return result;
    }
} 