package cn.iocoder.yudao.module.tms.convert.first.mile;

import cn.iocoder.yudao.framework.common.util.object.BeanUtils;
import cn.iocoder.yudao.module.tms.dal.dataobject.first.mile.item.TmsFirstMileItemDO;
import cn.iocoder.yudao.module.tms.service.bo.TmsFirstMileBO;
import cn.iocoder.yudao.module.tms.service.bo.TmsFirstMileItemBO;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

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
                TmsFirstMileItemBO firstItem = tmsFirstMileItemBOS.stream().findFirst().orElseThrow(() -> new IllegalArgumentException("头程单明细列表不能为空"));
                return BeanUtils.toBean(firstItem.getTmsFirstMileDO(), TmsFirstMileBO.class, bo -> bo.setItems(BeanUtils.toBean(tmsFirstMileItemBOS, TmsFirstMileItemDO.class)));
            })
            .toList();
    }

} 