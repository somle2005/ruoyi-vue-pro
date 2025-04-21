package cn.iocoder.yudao.module.tms.service.first.mile.request;

import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.module.tms.controller.admin.first.mile.request.vo.TmsFirstMileRequestPageReqVO;
import cn.iocoder.yudao.module.tms.controller.admin.first.mile.request.vo.TmsFirstMileRequestSaveReqVO;
import cn.iocoder.yudao.module.tms.dal.dataobject.first.mile.request.TmsFirstMileRequestDO;
import cn.iocoder.yudao.module.tms.dal.dataobject.first.mile.request.item.TmsFirstMileRequestItemDO;
import jakarta.validation.Valid;

import java.util.List;

/**
 * 头程申请单 Service 接口
 *
 * @author wdy
 */
public interface TmsFirstMileRequestService {

    /**
     * 创建头程申请单
     *
     * @param createReqVO 创建信息
     * @return 编号
     */
    Long createFirstMileRequest(@Valid TmsFirstMileRequestSaveReqVO createReqVO);

    /**
     * 更新头程申请单
     *
     * @param updateReqVO 更新信息
     */
    void updateFirstMileRequest(@Valid TmsFirstMileRequestSaveReqVO updateReqVO);

    /**
     * 删除头程申请单
     *
     * @param id 编号
     */
    void deleteFirstMileRequest(Long id);

    /**
     * 获得头程申请单
     *
     * @param id 编号
     * @return 头程申请单
     */
    TmsFirstMileRequestDO getFirstMileRequest(Long id);

    /**
     * 获得头程申请单分页
     *
     * @param pageReqVO 分页查询
     * @return 头程申请单分页
     */
    PageResult<TmsFirstMileRequestDO> getFirstMileRequestPage(TmsFirstMileRequestPageReqVO pageReqVO);

    // ==================== 子表（头程申请表明细） ====================

    /**
     * 获得头程申请表明细列表
     *
     * @param requestId 所属申请单ID
     * @return 头程申请表明细列表
     */
    List<TmsFirstMileRequestItemDO> getFirstMileRequestItemListByRequestId(Long requestId);

}