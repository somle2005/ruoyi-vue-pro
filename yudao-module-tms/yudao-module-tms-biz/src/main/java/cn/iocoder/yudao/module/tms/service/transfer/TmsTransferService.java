package cn.iocoder.yudao.module.tms.service.transfer;

import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.module.system.api.utils.Validation;
import cn.iocoder.yudao.module.tms.controller.admin.transfer.vo.TmsTransferAuditReqVO;
import cn.iocoder.yudao.module.tms.controller.admin.transfer.vo.TmsTransferOffStatusReqVO;
import cn.iocoder.yudao.module.tms.controller.admin.transfer.vo.TmsTransferPageReqVO;
import cn.iocoder.yudao.module.tms.controller.admin.transfer.vo.TmsTransferSaveReqVO;
import cn.iocoder.yudao.module.tms.dal.dataobject.transfer.TmsTransferDO;
import jakarta.validation.constraints.Size;
import org.springframework.validation.annotation.Validated;

import java.util.List;

/**
 * 调拨单 Service 接口
 *
 * @author wdy
 */
@Validated
public interface TmsTransferService {

    /**
     * 创建调拨单
     *
     * @param createReqVO 创建信息
     * @return 编号
     */
    Long createTransfer(@Validated(Validation.OnCreate.class) TmsTransferSaveReqVO createReqVO);

    /**
     * 更新调拨单
     *
     * @param updateReqVO 更新信息
     */
    void updateTransfer(@Validated(Validation.OnUpdate.class) TmsTransferSaveReqVO updateReqVO);

    /**
     * 删除调拨单
     *
     * @param id 编号
     */
    void deleteTransfer(Long id);

    /**
     * 获得调拨单
     *
     * @param id 编号
     * @return 调拨单
     */
    TmsTransferDO getTransfer(Long id);

    /**
     * 获得调拨单分页
     *
     * @param pageReqVO 分页查询
     * @return 调拨单分页
     */
    PageResult<TmsTransferDO> getTransferPage(TmsTransferPageReqVO pageReqVO);

    void switchOpen(TmsTransferOffStatusReqVO reqVO);

    void review(TmsTransferAuditReqVO reqVO);

    void submitAudit(@Size(min = 1, message = "提交审核的单据数量不小于1") List<Long> transferIds);
}