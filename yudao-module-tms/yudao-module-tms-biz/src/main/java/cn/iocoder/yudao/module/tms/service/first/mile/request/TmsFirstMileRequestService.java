package cn.iocoder.yudao.module.tms.service.first.mile.request;

import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.module.tms.controller.admin.first.mile.request.vo.TmsFirstMileRequestPageReqVO;
import cn.iocoder.yudao.module.tms.controller.admin.first.mile.request.vo.TmsFirstMileRequestSaveReqVO;
import cn.iocoder.yudao.module.tms.dal.dataobject.first.mile.request.item.TmsFirstMileRequestItemDO;
import cn.iocoder.yudao.module.tms.service.bo.TmsFirstMileRequestBO;
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
     * 获得头程申请单BO分页
     *
     * @param pageReqVO 分页查询
     * @return 头程申请单BO分页
     */
    PageResult<TmsFirstMileRequestBO> getFirstMileRequestBOPage(TmsFirstMileRequestPageReqVO pageReqVO);

    /**
     * 获得头程申请单BO
     *
     * @param id 主表编号
     * @return 头程申请单BO
     */
    TmsFirstMileRequestBO getFirstMileRequestBO(Long id);

    // ==================== 子表（头程申请表明细） ====================

    /**
     * 获得头程申请表明细列表
     *
     * @param requestId 所属申请单ID
     * @return 头程申请表明细列表
     */
    List<TmsFirstMileRequestItemDO> getFirstMileRequestItemListByRequestId(Long requestId);

    /**
     * 提交审核
     *
     * @param ids 头程申请单ID列表
     */
    void submitAudit(List<Long> ids);

}