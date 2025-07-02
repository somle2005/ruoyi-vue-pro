package cn.iocoder.yudao.module.tms.controller.admin.transfer.vo.convert;

import cn.iocoder.yudao.framework.common.util.object.BeanUtils;
import cn.iocoder.yudao.module.tms.controller.admin.transfer.item.vo.TmsTransferItemRespVO;
import cn.iocoder.yudao.module.tms.controller.admin.transfer.vo.TmsTransferExcelRespVO;
import cn.iocoder.yudao.module.tms.controller.admin.transfer.vo.TmsTransferRespVO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TmsTransferExportConvert {
    public static List<TmsTransferExcelRespVO> buildExcelList(List<TmsTransferRespVO> list) {
        if (list == null || list.isEmpty()) {
            return Collections.emptyList();
        }
        List<TmsTransferExcelRespVO> result = new ArrayList<>();
        for (TmsTransferRespVO main : list) {
            if (main.getItems() == null || main.getItems().isEmpty()) {
                // 没有子表数据，只导出主表信息
                TmsTransferExcelRespVO vo = BeanUtils.toBean(main, TmsTransferExcelRespVO.class);
                // 设置仓库名称
                if (main.getFromWarehouse() != null) {
                    vo.setFromWarehouseName(main.getFromWarehouse().getName());
                }
                if (main.getToWarehouse() != null) {
                    vo.setToWarehouseName(main.getToWarehouse().getName());
                }
                result.add(vo);
            } else {
                // 有子表数据，每个子表项都包含完整的主表信息
                for (TmsTransferItemRespVO item : main.getItems()) {
                    // 先复制主表字段
                    TmsTransferExcelRespVO vo = BeanUtils.toBean(main, TmsTransferExcelRespVO.class);
                    // 设置仓库名称
                    if (main.getFromWarehouse() != null) {
                        vo.setFromWarehouseName(main.getFromWarehouse().getName());
                    }
                    if (main.getToWarehouse() != null) {
                        vo.setToWarehouseName(main.getToWarehouse().getName());
                    }
                    // 手动设置子表特有字段，避免覆盖主表字段
                    vo.setItemId(item.getId());
                    vo.setProductName(item.getProduct() != null ? item.getProduct().getName() : null);
                    vo.setProductCode(item.getProduct() != null ? item.getProduct().getCode() : null);
                    vo.setQty(item.getQty());
                    vo.setSellableQty(item.getSellableQty());
                    vo.setBoxQty(item.getBoxQty());
                    vo.setPackageWeight(item.getPackageWeight());
                    vo.setPackageVolume(item.getPackageVolume());
                    vo.setStockCompanyName(item.getStockCompany() != null ? item.getStockCompany().getName() : null);
                    vo.setItemRemark(item.getRemark());
                    vo.setOutboundClosedQty(item.getOutboundClosedQty());
                    vo.setInboundClosedQty(item.getInboundClosedQty());
                    vo.setDeptName(item.getDept() != null ? item.getDept().getName() : null);
                    result.add(vo);
                }
            }
        }
        return result;
    }
} 