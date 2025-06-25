package cn.iocoder.yudao.module.tms.controller.admin.first.mile.vo.excel;

import cn.iocoder.yudao.framework.common.util.object.BeanUtils;
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
                // 没有子表数据，只导出主表信息
                TmsFirstMileExcelRespVO vo = BeanUtils.toBean(main, TmsFirstMileExcelRespVO.class);
                result.add(vo);
            } else {
                // 有子表数据，每个子表项都包含完整的主表信息
                for (TmsFirstMileItemRespVO item : main.getFirstMileItems()) {
                    // 先复制主表字段
                    TmsFirstMileExcelRespVO vo = BeanUtils.toBean(main, TmsFirstMileExcelRespVO.class);
                    // 手动设置子表特有字段，避免覆盖主表字段
                    vo.setItemId(item.getId());
                    vo.setRequestCode(item.getRequestCode());
                    vo.setProductName(item.getProduct() != null ? item.getProduct().getName() : null);
                    vo.setProductCode(item.getProduct() != null ? item.getProduct().getCode() : null);
                    vo.setFbaBarCode(item.getFbaBarCode());
                    vo.setQty(item.getQty());
                    vo.setBoxQty(item.getBoxQty());
                    vo.setCompanyName(item.getCompanyName());
                    vo.setDeptName(item.getDeptName());
                    vo.setItemRemark(item.getRemark());
                    vo.setOutboundClosedQty(item.getOutboundClosedQty());
                    vo.setOutboundPlanQty(item.getOutboundPlanQty());
                    vo.setInboundClosedQty(item.getInboundClosedQty());
                    vo.setFromWarehouseName(item.getFromWarehouseName());
                    vo.setPackageLength(item.getPackageLength());
                    vo.setPackageWidth(item.getPackageWidth());
                    vo.setPackageHeight(item.getPackageHeight());
                    vo.setPackageWeight(item.getPackageWeight());
                    vo.setWeight(item.getWeight());
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