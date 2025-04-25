package cn.iocoder.yudao.module.tms.convert.first.mile.request;

import cn.iocoder.yudao.framework.common.util.object.BeanUtils;
import cn.iocoder.yudao.module.tms.controller.admin.first.mile.item.vo.TmsFirstMileItemSaveReqVO;
import cn.iocoder.yudao.module.tms.controller.admin.first.mile.request.item.vo.TmsFirstMileRequestItemSaveReqVO;
import cn.iocoder.yudao.module.tms.controller.admin.first.mile.request.vo.TmsFirstMileRequestSaveReqVO;
import cn.iocoder.yudao.module.tms.dal.dataobject.first.mile.request.TmsFirstMileRequestDO;
import cn.iocoder.yudao.module.tms.dal.dataobject.first.mile.request.item.TmsFirstMileRequestItemDO;
import cn.iocoder.yudao.module.tms.service.bo.TmsFirstMileRequestBO;
import cn.iocoder.yudao.module.tms.service.bo.TmsFirstMileRequestItemItemBO;
import org.springframework.util.CollectionUtils;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 头程单申请 Convert
 *
 * @author wdy
 */
public class TmsFirstMileRequestConvert {

    /**
     * 将 VO 转换为 DO
     *
     * @param saveReqVO VO
     * @return DO
     */
    public static TmsFirstMileRequestDO convert(TmsFirstMileRequestSaveReqVO saveReqVO) {
        return BeanUtils.toBean(saveReqVO, TmsFirstMileRequestDO.class);
    }

    /**
     * 将 DO 和明细列表转换为 BO
     *
     * @param firstMileRequest DO
     * @param itemList         明细列表
     * @return BO
     */
    public static TmsFirstMileRequestBO convert(TmsFirstMileRequestDO firstMileRequest, List<TmsFirstMileRequestItemDO> itemList) {
        return BeanUtils.toBean(firstMileRequest, TmsFirstMileRequestBO.class, bo -> bo.setItems(itemList));
    }

    /**
     * 将明细 VO 列表转换为 DO 列表
     *
     * @param itemList 明细 VO 列表
     * @return 明细 DO 列表
     */
    public static List<TmsFirstMileRequestItemDO> convertItemList(List<TmsFirstMileRequestItemSaveReqVO> itemList) {
        return BeanUtils.toBean(itemList, TmsFirstMileRequestItemDO.class);
    }

    /**
     * 将明细 DO 列表转换为 VO 列表
     *
     * @param itemList 明细 DO 列表
     * @return 明细 VO 列表
     */
    public static List<TmsFirstMileRequestItemSaveReqVO> convertItemListToVO(List<TmsFirstMileRequestItemDO> itemList) {
        return BeanUtils.toBean(itemList, TmsFirstMileRequestItemSaveReqVO.class);
    }

    /**
     * 将明细 BO 转换为 DO
     *
     * @param itemBO 明细 BO
     * @return 明细 DO
     */
    public static TmsFirstMileRequestItemDO convertItem(TmsFirstMileRequestItemItemBO itemBO) {
        return BeanUtils.toBean(itemBO, TmsFirstMileRequestItemDO.class);
    }

    /**
     * 将头程申请单明细转换为头程单明细
     *
     * @param itemList 头程申请单明细列表
     * @return 头程单明细列表
     */
    public static List<TmsFirstMileItemSaveReqVO> convertToFirstMileItemList(List<TmsFirstMileRequestItemDO> itemList) {
        if (CollectionUtils.isEmpty(itemList)) {
            return Collections.emptyList();
        }
        return itemList.stream()
            .map(item -> {
                TmsFirstMileItemSaveReqVO firstMileItem = new TmsFirstMileItemSaveReqVO();
                firstMileItem.setRequestItemId(item.getId());
                firstMileItem.setProductId(item.getProductId());
                firstMileItem.setPackageWeight(item.getPackageWeight());
                firstMileItem.setVolume(item.getVolume());
                return firstMileItem;
            })
            .collect(Collectors.toList());
    }
} 