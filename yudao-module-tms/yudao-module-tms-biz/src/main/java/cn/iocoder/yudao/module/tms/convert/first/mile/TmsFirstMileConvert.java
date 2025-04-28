package cn.iocoder.yudao.module.tms.convert.first.mile;

import cn.iocoder.yudao.framework.common.util.object.BeanUtils;
import cn.iocoder.yudao.module.tms.api.first.FistMileDTO;
import cn.iocoder.yudao.module.tms.controller.admin.fee.vo.TmsFeeRespVO;
import cn.iocoder.yudao.module.tms.controller.admin.fee.vo.TmsFeeSaveReqVO;
import cn.iocoder.yudao.module.tms.controller.admin.first.mile.item.vo.TmsFirstMileItemSaveReqVO;
import cn.iocoder.yudao.module.tms.dal.dataobject.fee.TmsFeeDO;
import cn.iocoder.yudao.module.tms.dal.dataobject.first.mile.TmsFirstMileDO;
import cn.iocoder.yudao.module.tms.dal.dataobject.first.mile.item.TmsFirstMileItemDO;
import cn.iocoder.yudao.module.tms.service.bo.TmsFirstMileBO;
import cn.iocoder.yudao.module.tms.service.bo.TmsFirstMileItemBO;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static cn.iocoder.yudao.framework.common.exception.util.ServiceExceptionUtil.exception;
import static cn.iocoder.yudao.module.tms.enums.ErrorCodeConstants.FIRST_MILE_ITEM_LIST_NOT_EMPTY;

/**
 * 头程单 Convert
 *
 * @author wdy
 */
public class TmsFirstMileConvert {

    /**
     * 将明细BO列表按主表ID分组，并转换为BO对象列表
     *
     * @param itemBOList 明细BO列表
     * @return BO对象列表
     */
    public static List<TmsFirstMileBO> convertBOList(List<TmsFirstMileItemBO> itemBOList) {
        // 按主表ID分组
        Map<Long, List<TmsFirstMileItemBO>> itemMap = itemBOList.stream()
            .collect(Collectors.groupingBy(item -> item.getTmsFirstMileDO().getId()));

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
     * 将费用 DO 列表转换为 VO 列表
     *
     * @param feeList 费用 DO 列表
     * @return 费用 VO 列表
     */
    public static List<TmsFeeRespVO> convertFeeList(List<TmsFeeDO> feeList) {
        return BeanUtils.toBean(feeList, TmsFeeRespVO.class);
    }

    /**
     * 将费用 VO 列表转换为 DO 列表
     *
     * @param feeList 费用 VO 列表
     * @return 费用 DO 列表
     */
    public static List<TmsFeeDO> convertFeeListToDO(List<TmsFeeSaveReqVO> feeList) {
        return BeanUtils.toBean(feeList, TmsFeeDO.class);
    }

    /**
     * 将头程单明细 VO 列表转换为 DO 列表
     *
     * @param itemList 头程单明细 VO 列表
     * @return 头程单明细 DO 列表
     */
    public static List<TmsFirstMileItemDO> convertItemList(List<TmsFirstMileItemSaveReqVO> itemList) {
        return BeanUtils.toBean(itemList, TmsFirstMileItemDO.class);
    }

    /**
     * 将头程单明细 DO 列表转换为 VO 列表
     *
     * @param itemList 头程单明细 DO 列表
     * @return 头程单明细 VO 列表
     */
    public static List<TmsFirstMileItemSaveReqVO> convertItemListToVO(List<TmsFirstMileItemDO> itemList) {
        return BeanUtils.toBean(itemList, TmsFirstMileItemSaveReqVO.class);
    }

    /**
     * 将 DO 转换为 DTO
     *
     * @param firstMile DO
     * @return DTO
     */
    public static FistMileDTO convertDTO(TmsFirstMileDO firstMile) {
        return BeanUtils.toBean(firstMile, FistMileDTO.class);
    }

    /**
     * 将 DTO 转换为 DO
     *
     * @param dto DTO
     * @return DO
     */
    public static TmsFirstMileDO convertDO(FistMileDTO dto) {
        return BeanUtils.toBean(dto, TmsFirstMileDO.class);
    }
} 