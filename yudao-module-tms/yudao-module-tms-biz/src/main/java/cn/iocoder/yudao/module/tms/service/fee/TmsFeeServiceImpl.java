package cn.iocoder.yudao.module.tms.service.fee;

import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.common.util.object.BeanUtils;
import cn.iocoder.yudao.module.tms.controller.admin.fee.vo.TmsFeePageReqVO;
import cn.iocoder.yudao.module.tms.controller.admin.fee.vo.TmsFeeSaveReqVO;
import cn.iocoder.yudao.module.tms.dal.dataobject.fee.TmsFeeDO;
import cn.iocoder.yudao.module.tms.dal.mysql.fee.TmsFeeMapper;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import static cn.iocoder.yudao.framework.common.exception.util.ServiceExceptionUtil.exception;
import static cn.iocoder.yudao.module.tms.enums.ErrorCodeConstants.FEE_NOT_EXISTS;

/**
 * 出运订单费用明细 Service 实现类
 *
 * @author wdy
 */
@Service
@Validated
public class TmsFeeServiceImpl implements TmsFeeService {

    @Resource
    private TmsFeeMapper feeMapper;

    @Override
    public Long createFee(TmsFeeSaveReqVO createReqVO) {
        // 插入
        TmsFeeDO fee = BeanUtils.toBean(createReqVO, TmsFeeDO.class);
        feeMapper.insert(fee);
        // 返回
        return fee.getId();
    }

    @Override
    public void updateFee(TmsFeeSaveReqVO updateReqVO) {
        // 校验存在
        validateFeeExists(updateReqVO.getId());
        // 更新
        TmsFeeDO updateObj = BeanUtils.toBean(updateReqVO, TmsFeeDO.class);
        feeMapper.updateById(updateObj);
    }

    @Override
    public void deleteFee(Long id) {
        // 校验存在
        validateFeeExists(id);
        // 删除
        feeMapper.deleteById(id);
    }

    private void validateFeeExists(Long id) {
        if (feeMapper.selectById(id) == null) {
            throw exception(FEE_NOT_EXISTS);
        }
    }

    @Override
    public TmsFeeDO getFee(Long id) {
        return feeMapper.selectById(id);
    }

    @Override
    public PageResult<TmsFeeDO> getFeePage(TmsFeePageReqVO pageReqVO) {
        return feeMapper.selectPage(pageReqVO);
    }

}