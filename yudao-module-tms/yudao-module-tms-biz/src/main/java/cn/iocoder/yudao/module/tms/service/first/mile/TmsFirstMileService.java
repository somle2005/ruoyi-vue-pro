package cn.iocoder.yudao.module.tms.service.first.mile;

import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.module.tms.controller.admin.fee.vo.TmsFeeRespVO;
import cn.iocoder.yudao.module.tms.controller.admin.first.mile.vo.TmsFirstMilePageReqVO;
import cn.iocoder.yudao.module.tms.controller.admin.first.mile.vo.TmsFirstMileSaveReqVO;
import cn.iocoder.yudao.module.tms.dal.dataobject.first.mile.TmsFirstMileDO;
import cn.iocoder.yudao.module.tms.dal.dataobject.first.mile.item.TmsFirstMileItemDO;
import cn.iocoder.yudao.module.tms.service.bo.TmsFirstMileBO;
import jakarta.validation.Valid;

import java.util.List;

/**
 * 头程单 Service 接口
 *
 * @author wdy
 */
public interface TmsFirstMileService {

    /**
     * 创建头程单
     *
     * @param createReqVO 创建信息
     * @return 编号
     */
    Long createFirstMile(@Valid TmsFirstMileSaveReqVO createReqVO);

    /**
     * 更新头程单
     *
     * @param updateReqVO 更新信息
     */
    void updateFirstMile(@Valid TmsFirstMileSaveReqVO updateReqVO);

    /**
     * 删除头程单
     *
     * @param id 编号
     */
    void deleteFirstMile(Long id);

    /**
     * 获得头程单
     *
     * @param id 编号
     * @return 头程单
     */
    TmsFirstMileDO getFirstMile(Long id);


    /**
     * 获得头程单分页BO
     *
     * @param pageReqVO 分页查询
     * @return 头程单分页
     */
    PageResult<TmsFirstMileBO> getFirstMileBOPage(TmsFirstMilePageReqVO pageReqVO);
    // ==================== 子表（头程单明细） ====================

    /**
     * 获得头程单明细列表
     *
     * @param firstMileId 头程主表ID
     * @return 头程单明细列表
     */
    List<TmsFirstMileItemDO> getFirstMileItemListByFirstMileId(Long firstMileId);

    // ==================== 子表（出运订单费用明细） ====================

    /**
     * 根据源ID获取费用列表
     *
     * @param sourceId 源ID
     * @return 费用列表
     */
    List<TmsFeeRespVO> getFeeListBySourceId(Long sourceId);

}