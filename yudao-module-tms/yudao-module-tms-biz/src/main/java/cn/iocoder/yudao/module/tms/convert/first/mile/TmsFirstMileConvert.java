package cn.iocoder.yudao.module.tms.convert.first.mile;

import cn.hutool.core.collection.CollUtil;
import cn.iocoder.yudao.framework.common.util.object.BeanUtils;
import cn.iocoder.yudao.module.tms.controller.admin.fee.vo.TmsFeeRespVO;
import cn.iocoder.yudao.module.tms.controller.admin.first.mile.vo.resp.TmsFirstMileExcelVO;
import cn.iocoder.yudao.module.tms.dal.dataobject.fee.TmsFeeDO;
import cn.iocoder.yudao.module.tms.dal.dataobject.first.mile.item.TmsFirstMileItemDO;
import cn.iocoder.yudao.module.tms.service.bo.TmsFirstMileBO;
import cn.iocoder.yudao.module.tms.service.bo.TmsFirstMileItemBO;
import cn.iocoder.yudao.module.wms.api.outbound.dto.WmsOutboundItemSaveReqDTO;
import cn.iocoder.yudao.module.wms.api.outbound.dto.WmsOutboundSaveReqDTO;
import cn.iocoder.yudao.module.wms.enums.outbound.WmsOutboundType;
import lombok.extern.slf4j.Slf4j;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static cn.iocoder.yudao.framework.common.exception.util.ServiceExceptionUtil.exception;
import static cn.iocoder.yudao.module.tms.enums.TmsErrorCodeConstants.FIRST_MILE_ITEM_LIST_NOT_EMPTY;

/**
 *
 * 头程单 Convert
 *
 * @author wdy
 */
@Slf4j
public class TmsFirstMileConvert {

    /**
     * 将明细BO列表按主表ID分组，并转换为BO对象列表
     *
     * @param itemBOList 明细BO列表
     * @return BO对象列表
     */
    public static List<TmsFirstMileBO> convertBOList(List<TmsFirstMileItemBO> itemBOList) {
        // 按主表ID分组
        Map<Long, List<TmsFirstMileItemBO>> itemMap = itemBOList.stream().collect(Collectors.groupingBy(item -> item.getTmsFirstMileDO().getId()));
        log.debug("转换主表BO列表，itemMap: {}", itemMap);
        // 转换为主表BO列表
        return itemMap.values().stream()
            .map(tmsFirstMileItemBOS -> {
                // 获取第一个明细项的主表信息（同一主表ID下的所有明细项，其主表信息相同）
                TmsFirstMileItemBO firstItem = tmsFirstMileItemBOS.stream().findFirst().orElseThrow(() -> exception(FIRST_MILE_ITEM_LIST_NOT_EMPTY));
                return BeanUtils.toBean(firstItem.getTmsFirstMileDO(), TmsFirstMileBO.class, bo -> bo.setItems(BeanUtils.toBean(tmsFirstMileItemBOS, TmsFirstMileItemDO.class)));
            })
            .toList();
    }

    /**
     * 将单个明细BO转换为BO对象
     *
     * @param itemBO 明细BO
     * @return BO对象
     */
    public static TmsFirstMileBO convertBO(TmsFirstMileItemBO itemBO) {
        return BeanUtils.toBean(itemBO.getTmsFirstMileDO(), TmsFirstMileBO.class,
            bo -> bo.setItems(List.of(BeanUtils.toBean(itemBO, TmsFirstMileItemDO.class))));
    }

    /**
     * 将费用 DO 列表转换为 VO 列表
     *
     * @param feeList 费用 DO 列表
     * @return 费用 VO 列表
     */
    public static List<TmsFeeRespVO> convertFeeList(List<TmsFeeDO> feeList) {
        return BeanUtils.toBean(feeList, TmsFeeRespVO.class);
    }

    /**
     * BO 列表转 Excel VO 列表
     *
     * @param list BO 列表
     * @return Excel VO 列表
     */
    public static List<TmsFirstMileExcelVO> convertExcelList(List<TmsFirstMileBO> list) {
        return list.stream().map(bo -> {
            TmsFirstMileExcelVO vo = BeanUtils.toBean(bo, TmsFirstMileExcelVO.class);
            // 转换子表信息
//            if (bo.getItems() != null) {
//                vo.setItems(BeanUtils.toBean(bo.getItems(), TmsFirstMileItemExcelVO.class));
//            }
            // 设置最新跟踪信息
            if (bo.getTracking() != null) {
                vo.setLatestTrackTime(bo.getTracking().getLastSyncTime());
                vo.setLatestTrackStatus(bo.getTracking().getTrackingStatus());
            }
            return vo;
        }).toList();
    }

    /**
     * 头程单 BO -> 出库单DTO
     */
    public static WmsOutboundSaveReqDTO convertOutbound(TmsFirstMileBO firstMileBO) {
        WmsOutboundSaveReqDTO dto = new WmsOutboundSaveReqDTO();
        dto.setUpstreamBillId(firstMileBO.getId());
        dto.setUpstreamBillCode(firstMileBO.getCode());
//        dto.setType(BillType.TMS_FIRST_MILE.getValue());
        dto.setType(WmsOutboundType.OUTBOUND_BILL.getValue()); //出库单类型
        //子项映射，upstreamItemId是item的id
        // 设置明细项
        if (CollUtil.isNotEmpty(firstMileBO.getItems())) {
            List<WmsOutboundItemSaveReqDTO> items = firstMileBO.getItems().stream()
                .map(item -> {
                    WmsOutboundItemSaveReqDTO itemDTO = new WmsOutboundItemSaveReqDTO();
                    itemDTO.setUpstreamItemId(item.getId());
                    itemDTO.setProductId(item.getProductId());
                    itemDTO.setPlanQty(item.getQty());//计划出库量
                    itemDTO.setActualQty(item.getQty());//实际出库量
                    itemDTO.setCompanyId(item.getCompanyId());//库存公司
                    itemDTO.setDeptId(item.getDeptId()); //库存归属部门ID
                    itemDTO.setRemark(item.getRemark());
                    return itemDTO;
                }).collect(Collectors.toList());
            dto.setItemList(items);
        }
        return dto;
    }
} 