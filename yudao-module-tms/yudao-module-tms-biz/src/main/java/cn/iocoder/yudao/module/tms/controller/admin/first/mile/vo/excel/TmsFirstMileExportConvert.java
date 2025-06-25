package cn.iocoder.yudao.module.tms.controller.admin.first.mile.vo.excel;

import cn.iocoder.yudao.module.tms.controller.admin.first.mile.item.vo.TmsFirstMileItemRespVO;
import cn.iocoder.yudao.module.tms.controller.admin.first.mile.vo.resp.TmsFirstMileRespVO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TmsFirstMileExportConvert {
    public static List<TmsFirstMileExcelRespVO> buildExcelList(List<TmsFirstMileRespVO> list) {
        if (list == null || list.isEmpty()) {
            return Collections.emptyList();
        }
        List<TmsFirstMileExcelRespVO> result = new ArrayList<>();
        for (TmsFirstMileRespVO main : list) {
            if (main.getFirstMileItems() == null || main.getFirstMileItems().isEmpty()) {
                TmsFirstMileExcelRespVO vo = new TmsFirstMileExcelRespVO();
                vo.setCreateTime(main.getCreateTime());
                vo.setCode(main.getCode());
                vo.setBillTime(main.getBillTime());
                vo.setCarrierId(main.getCarrierId());
                vo.setSettlementDate(main.getSettlementDate());
                vo.setBalance(main.getBalance());
                vo.setAuditorName(main.getAuditorName());
                vo.setAuditTime(main.getAuditTime());
                vo.setAuditStatus(main.getAuditStatus());
                vo.setToWarehouseName(main.getToWarehouseName());
                vo.setCabinetType(main.getCabinetType());
                vo.setPackTime(main.getPackTime());
                vo.setArrivePlanTime(main.getArrivePlanTime());
                vo.setTotalVolume(main.getTotalVolume());
                vo.setTotalPackageWeight(main.getTotalPackageWeight());
                vo.setNetWeight(main.getNetWeight());
                vo.setTotalValue(main.getTotalValue());
                vo.setTotalQty(main.getTotalQty());
                vo.setTotalBoxQty(main.getTotalBoxQty());
                vo.setOutboundStatus(main.getOutboundStatus());
                vo.setOutboundTime(main.getOutboundTime());
                vo.setInboundStatus(main.getInboundStatus());
                vo.setInboundTime(main.getInboundTime());
                vo.setExportCompanyShortName(main.getExportCompanyShortName());
                vo.setTransitCompanyShortName(main.getTransitCompanyShortName());
                result.add(vo);
            } else {
                for (TmsFirstMileItemRespVO item : main.getFirstMileItems()) {
                    TmsFirstMileExcelRespVO vo = new TmsFirstMileExcelRespVO();
                    // 主表字段
                    vo.setCreateTime(main.getCreateTime());
                    vo.setCode(main.getCode());
                    vo.setBillTime(main.getBillTime());
                    vo.setCarrierId(main.getCarrierId());
                    vo.setSettlementDate(main.getSettlementDate());
                    vo.setBalance(main.getBalance());
                    vo.setAuditorName(main.getAuditorName());
                    vo.setAuditTime(main.getAuditTime());
                    vo.setAuditStatus(main.getAuditStatus());
                    vo.setToWarehouseName(main.getToWarehouseName());
                    vo.setCabinetType(main.getCabinetType());
                    vo.setPackTime(main.getPackTime());
                    vo.setArrivePlanTime(main.getArrivePlanTime());
                    vo.setTotalVolume(main.getTotalVolume());
                    vo.setTotalPackageWeight(main.getTotalPackageWeight());
                    vo.setNetWeight(main.getNetWeight());
                    vo.setTotalValue(main.getTotalValue());
                    vo.setTotalQty(main.getTotalQty());
                    vo.setTotalBoxQty(main.getTotalBoxQty());
                    vo.setOutboundStatus(main.getOutboundStatus());
                    vo.setOutboundTime(main.getOutboundTime());
                    vo.setInboundStatus(main.getInboundStatus());
                    vo.setInboundTime(main.getInboundTime());
                    vo.setExportCompanyShortName(main.getExportCompanyShortName());
                    vo.setTransitCompanyShortName(main.getTransitCompanyShortName());
                    // 子表字段
                    vo.setItemId(item.getId());
                    vo.setRequestCode(item.getRequestCode());
                    vo.setQty(item.getQty());
                    vo.setBoxQty(item.getBoxQty());
                    vo.setCompanyName(item.getCompanyName());
                    vo.setDeptName(item.getDeptName());
                    vo.setItemRemark(item.getRemark());
                    vo.setOutboundClosedQty(item.getOutboundClosedQty());
                    vo.setOutboundPlanQty(item.getOutboundPlanQty());
                    vo.setInboundClosedQty(item.getInboundClosedQty());
                    vo.setFromWarehouseName(item.getFromWarehouseName());
                    vo.setTotalPackageLength(item.getTotalPackageLength());
                    vo.setTotalPackageWidth(item.getTotalPackageWidth());
                    vo.setTotalPackageHeight(item.getTotalPackageHeight());
                    vo.setTotalItemPackageWeight(item.getTotalPackageWeight());
                    vo.setTotalItemVolume(item.getTotalVolume());
                    vo.setSalesCompanyName(item.getSalesCompanyName());
                    result.add(vo);
                }
            }
        }
        return result;
    }
} 