package cn.iocoder.yudao.module.tms.service.fee;

import cn.hutool.core.collection.CollUtil;
import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.common.util.object.BeanUtils;
import cn.iocoder.yudao.module.tms.controller.admin.fee.vo.TmsFeePageReqVO;
import cn.iocoder.yudao.module.tms.controller.admin.fee.vo.TmsFeeSaveReqVO;
import cn.iocoder.yudao.module.tms.dal.dataobject.fee.TmsFeeDO;
import cn.iocoder.yudao.module.tms.dal.mysql.fee.TmsFeeMapper;
import cn.iocoder.yudao.module.tms.enums.SourceTypeEnum;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import java.util.Collections;
import java.util.List;

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
    public Long createFee(TmsFeeSaveReqVO createReqVO, SourceTypeEnum sourceType) {
        // 插入
        TmsFeeDO fee = BeanUtils.toBean(createReqVO, TmsFeeDO.class);
        fee.setSourceType(sourceType.getType());
        feeMapper.insert(fee);
        // 返回
        return fee.getId();
    }

    @Override
    public void updateFee(TmsFeeSaveReqVO updateReqVO, SourceTypeEnum sourceType) {
        // 校验存在
        validateFeeExists(updateReqVO.getId(), sourceType);
        // 更新
        TmsFeeDO updateObj = BeanUtils.toBean(updateReqVO, TmsFeeDO.class);
        updateObj.setSourceType(sourceType.getType());
        feeMapper.updateById(updateObj);
    }

    @Override
    public void deleteFee(Long id, SourceTypeEnum sourceType) {
        // 校验存在
        validateFeeExists(id, sourceType);
        // 删除
        feeMapper.deleteByIdAndType(id, sourceType);
    }

    private void validateFeeExists(Long id, SourceTypeEnum sourceType) {
        if (feeMapper.selectByIdAndType(id, sourceType) == null) {
            throw exception(FEE_NOT_EXISTS);
        }
    }

    @Override
    public TmsFeeDO getFee(Long id, SourceTypeEnum sourceType) {
        return feeMapper.selectByIdAndType(id, sourceType);
    }

    @Override
    public PageResult<TmsFeeDO> getFeePage(TmsFeePageReqVO pageReqVO) {
        return feeMapper.selectPage(pageReqVO);
    }

    @Override
    public List<Long> selectFirstMileIdsByFeePageReqVO(TmsFeePageReqVO reqVO) {
        // 设置源类型为头程单
        reqVO.setSourceType(SourceTypeEnum.FIRST_MILE.getType());
        return feeMapper.selectFirstMileIdsByFeePageReqVO(reqVO);
    }

    @Override
    public List<TmsFeeDO> getFeeListBySourceId(Long sourceId, SourceTypeEnum sourceType) {
        return feeMapper.selectListBySourceIdAndType(sourceId, sourceType);
    }

    @Override
    public List<Long> createFeeList(List<TmsFeeDO> feeList, SourceTypeEnum sourceType) {
        if (CollUtil.isEmpty(feeList)) {
            return Collections.emptyList();
        }
        // 设置源类型
        feeList.forEach(fee -> fee.setSourceType(sourceType.getType()));
        // 批量插入
        feeMapper.insertBatch(feeList);
        // 返回 ID 列表
        return feeList.stream().map(TmsFeeDO::getId).toList();
    }

    @Override
    public void updateFeeList(List<TmsFeeDO> feeList, SourceTypeEnum sourceType) {
        if (CollUtil.isEmpty(feeList)) {
            return;
        }
        // 校验存在
        feeList.forEach(fee -> validateFeeExists(fee.getId(), sourceType));
        // 设置源类型
        feeList.forEach(fee -> fee.setSourceType(sourceType.getType()));
        // 批量更新
        feeMapper.updateBatch(feeList);
    }

    @Override
    public void deleteFeeList(List<Long> ids, SourceTypeEnum sourceType) {
        if (CollUtil.isEmpty(ids)) {
            return;
        }
        // 校验存在
        ids.forEach(id -> validateFeeExists(id, sourceType));
        // 批量删除
        feeMapper.deleteByIds(ids);
    }
}