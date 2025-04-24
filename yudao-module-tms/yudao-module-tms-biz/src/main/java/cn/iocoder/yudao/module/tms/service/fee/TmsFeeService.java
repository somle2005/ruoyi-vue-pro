package cn.iocoder.yudao.module.tms.service.fee;

import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.module.tms.controller.admin.fee.vo.TmsFeePageReqVO;
import cn.iocoder.yudao.module.tms.controller.admin.fee.vo.TmsFeeSaveReqVO;
import cn.iocoder.yudao.module.tms.dal.dataobject.fee.TmsFeeDO;
import jakarta.validation.Valid;

/**
 * 出运订单费用明细 Service 接口
 *
 * @author wdy
 */
public interface TmsFeeService {

    /**
     * 创建出运订单费用明细
     *
     * @param createReqVO 创建信息
     * @return 编号
     */
    Long createFee(@Valid TmsFeeSaveReqVO createReqVO);

    /**
     * 更新出运订单费用明细
     *
     * @param updateReqVO 更新信息
     */
    void updateFee(@Valid TmsFeeSaveReqVO updateReqVO);

    /**
     * 删除出运订单费用明细
     *
     * @param id 编号
     */
    void deleteFee(Long id);

    /**
     * 获得出运订单费用明细
     *
     * @param id 编号
     * @return 出运订单费用明细
     */
    TmsFeeDO getFee(Long id);

    /**
     * 获得出运订单费用明细分页
     *
     * @param pageReqVO 分页查询
     * @return 出运订单费用明细分页
     */
    PageResult<TmsFeeDO> getFeePage(TmsFeePageReqVO pageReqVO);

}