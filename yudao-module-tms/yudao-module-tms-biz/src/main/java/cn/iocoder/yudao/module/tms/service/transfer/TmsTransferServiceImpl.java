package cn.iocoder.yudao.module.tms.service.transfer;

import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.common.util.object.BeanUtils;
import cn.iocoder.yudao.module.tms.controller.admin.transfer.vo.TmsTransferAuditReqVO;
import cn.iocoder.yudao.module.tms.controller.admin.transfer.vo.TmsTransferOffStatusReqVO;
import cn.iocoder.yudao.module.tms.controller.admin.transfer.vo.TmsTransferPageReqVO;
import cn.iocoder.yudao.module.tms.controller.admin.transfer.vo.TmsTransferSaveReqVO;
import cn.iocoder.yudao.module.tms.dal.dataobject.transfer.TmsTransferDO;
import cn.iocoder.yudao.module.tms.dal.mysql.transfer.TmsTransferMapper;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import java.util.List;

import static cn.iocoder.yudao.framework.common.exception.util.ServiceExceptionUtil.exception;
import static cn.iocoder.yudao.module.tms.enums.TmsErrorCodeConstants.TRANSFER_NOT_EXISTS;

/**
 * 调拨单 Service 实现类
 *
 * @author wdy
 */
@Service
@Validated
public class TmsTransferServiceImpl implements TmsTransferService {

    @Resource
    private TmsTransferMapper transferMapper;

    @Override
    public Long createTransfer(TmsTransferSaveReqVO createReqVO) {
        // 插入
        TmsTransferDO transfer = BeanUtils.toBean(createReqVO, TmsTransferDO.class);
        transferMapper.insert(transfer);
        // 返回
        return transfer.getId();
    }

    @Override
    public void updateTransfer(TmsTransferSaveReqVO updateReqVO) {
        // 校验存在
        validateTransferExists(updateReqVO.getId());
        // 更新
        TmsTransferDO updateObj = BeanUtils.toBean(updateReqVO, TmsTransferDO.class);
        transferMapper.updateById(updateObj);
    }

    @Override
    public void deleteTransfer(Long id) {
        // 校验存在
        validateTransferExists(id);
        // 删除
        transferMapper.deleteById(id);
    }

    private void validateTransferExists(Long id) {
        if (transferMapper.selectById(id) == null) {
            throw exception(TRANSFER_NOT_EXISTS);
        }
    }

    @Override
    public TmsTransferDO getTransfer(Long id) {
        return transferMapper.selectById(id);
    }

    @Override
    public PageResult<TmsTransferDO> getTransferPage(TmsTransferPageReqVO pageReqVO) {
        return null;
    }

    @Override
    public void switchOpen(TmsTransferOffStatusReqVO reqVO) {

    }

    @Override
    public void review(TmsTransferAuditReqVO reqVO) {

    }

    @Override
    public void submitAudit(List<Long> transferIds) {

    }

}