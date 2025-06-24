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
                vo.setId(main.getId());
                vo.setVersion(main.getVersion());
                vo.setCode(main.getCode());
                vo.setReturnTime(main.getReturnTime());
                vo.setCreator(main.getCreator());
                vo.setCreateTime(main.getCreateTime());
                vo.setUpdater(main.getUpdater());
                vo.setUpdateTime(main.getUpdateTime());
                vo.setRemark(main.getRemark());
                vo.setFileUrl(main.getFileUrl());
                vo.setAuditStatus(main.getAuditStatus());
                vo.setAuditorId(main.getAuditorId());
                vo.setAuditorName(main.getAuditorName());
                vo.setAuditTime(main.getAuditTime());
                vo.setAuditAdvice(main.getAuditAdvice());
                vo.setSupplierId(main.getSupplierId());
                vo.setSupplierName(main.getSupplierName());
                vo.setAccountId(main.getAccountId());
                vo.setAccountName(main.getAccountName());
                vo.setCurrencyId(main.getCurrencyId());
                vo.setCurrencyName(main.getCurrencyName());
                vo.setTotalCount(main.getTotalCount());
                vo.setTotalProductPrice(main.getTotalProductPrice());
                vo.setTotalGrossPrice(main.getTotalGrossPrice());
                vo.setGrossTotalPrice(main.getGrossTotalPrice());
                vo.setTotalPrice(main.getTotalPrice());
                vo.setDiscountPercent(main.getDiscountPercent());
                vo.setDiscountPrice(main.getDiscountPrice());
                vo.setOtherPrice(main.getOtherPrice());
                vo.setRefundStatus(main.getRefundStatus());
                vo.setRefundPrice(main.getRefundPrice());
                vo.setOutboundStatus(main.getOutboundStatus());
                vo.setTotalWeight(main.getTotalWeight());
                vo.setTotalVolume(main.getTotalVolume());
                result.add(vo);
            } else {
                for (SrmPurchaseReturnBaseRespVO.Item item : main.getItems()) {
                    SrmPurchaseReturnExcelRespVO vo = new SrmPurchaseReturnExcelRespVO();
                    vo.setId(main.getId());
                    vo.setVersion(main.getVersion());
                    vo.setCode(main.getCode());
                    vo.setReturnTime(main.getReturnTime());
                    vo.setCreator(main.getCreator());
                    vo.setCreateTime(main.getCreateTime());
                    vo.setUpdater(main.getUpdater());
                    vo.setUpdateTime(main.getUpdateTime());
                    vo.setRemark(main.getRemark());
                    vo.setFileUrl(main.getFileUrl());
                    vo.setAuditStatus(main.getAuditStatus());
                    vo.setAuditorId(main.getAuditorId());
                    vo.setAuditorName(main.getAuditorName());
                    vo.setAuditTime(main.getAuditTime());
                    vo.setAuditAdvice(main.getAuditAdvice());
                    vo.setSupplierId(main.getSupplierId());
                    vo.setSupplierName(main.getSupplierName());
                    vo.setAccountId(main.getAccountId());
                    vo.setAccountName(main.getAccountName());
                    vo.setCurrencyId(main.getCurrencyId());
                    vo.setCurrencyName(main.getCurrencyName());
                    vo.setTotalCount(main.getTotalCount());
                    vo.setTotalProductPrice(main.getTotalProductPrice());
                    vo.setTotalGrossPrice(main.getTotalGrossPrice());
                    vo.setGrossTotalPrice(main.getGrossTotalPrice());
                    vo.setTotalPrice(main.getTotalPrice());
                    vo.setDiscountPercent(main.getDiscountPercent());
                    vo.setDiscountPrice(main.getDiscountPrice());
                    vo.setOtherPrice(main.getOtherPrice());
                    vo.setRefundStatus(main.getRefundStatus());
                    vo.setRefundPrice(main.getRefundPrice());
                    vo.setOutboundStatus(main.getOutboundStatus());
                    vo.setTotalWeight(main.getTotalWeight());
                    vo.setTotalVolume(main.getTotalVolume());
                    vo.setItemId(item.getId());
                    vo.setItemVersion(item.getVersion());
                    vo.setReturnId(item.getReturnId());
                    vo.setArriveItemId(item.getArriveItemId());
                    vo.setArriveCode(item.getArriveCode());
                    vo.setProductId(item.getProductId());
                    vo.setProductName(item.getProductName());
                    vo.setProductCode(item.getProductCode());
                    vo.setDeclaredType(item.getDeclaredType());
                    vo.setDeclaredTypeEn(item.getDeclaredTypeEn());
                    vo.setProductUnitId(item.getProductUnitId());
                    vo.setProductUnitName(item.getProductUnitName());
                    vo.setWarehouseId(item.getWarehouseId());
                    vo.setItemWarehouseName(item.getWarehouseName());
                    vo.setQty(item.getQty());
                    vo.setSellableQty(item.getSellableQty());
                    vo.setActualQty(item.getActualQty());
                    vo.setProductPrice(item.getProductPrice());
                    vo.setGrossPrice(item.getGrossPrice());
                    vo.setTaxRate(item.getTaxRate());
                    vo.setTax(item.getTax());
                    vo.setItemTotalPrice(item.getTotalPrice());
                    vo.setGrossTotalPriceItem(item.getGrossTotalPrice());
                    vo.setApplicantId(item.getApplicantId());
                    vo.setApplicantName(item.getApplicantName());
                    vo.setApplicationDeptId(item.getApplicationDeptId());
                    vo.setApplicationDeptName(item.getApplicationDeptName());
                    vo.setItemOutboundStatus(item.getOutboundStatus());
                    vo.setItemRemark(item.getRemark());
                    vo.setContainerRate(item.getContainerRate());
                    vo.setItemCreator(item.getCreator());
                    vo.setItemCreateTime(item.getCreateTime());
                    vo.setItemUpdater(item.getUpdater());
                    vo.setItemUpdateTime(item.getUpdateTime());
                    result.add(vo);
                }
            }
        }
        return result;
    }
} 