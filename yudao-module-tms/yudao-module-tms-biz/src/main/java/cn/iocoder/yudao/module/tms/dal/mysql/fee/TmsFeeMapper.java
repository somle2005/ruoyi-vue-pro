package cn.iocoder.yudao.module.tms.dal.mysql.fee;

import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.mybatis.core.mapper.BaseMapperX;
import cn.iocoder.yudao.framework.mybatis.core.query.MPJLambdaWrapperX;
import cn.iocoder.yudao.module.tms.controller.admin.fee.vo.TmsFeePageReqVO;
import cn.iocoder.yudao.module.tms.dal.dataobject.fee.TmsFeeDO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.stream.Collectors;

/**
 * 出运订单费用明细 Mapper
 *
 * @author wdy
 */
@Mapper
public interface TmsFeeMapper extends BaseMapperX<TmsFeeDO> {
    //build wrapper MPJLambdaWrapperX
    default MPJLambdaWrapperX<TmsFeeDO> buildWrapper(TmsFeePageReqVO reqVO) {
        return new MPJLambdaWrapperX<TmsFeeDO>()
            .eqIfPresent(TmsFeeDO::getSourceType, reqVO.getSourceType())
            .eqIfPresent(TmsFeeDO::getSourceId, reqVO.getSourceId())
            .eqIfPresent(TmsFeeDO::getCostType, reqVO.getCostType())
            .betweenIfPresent(TmsFeeDO::getAmount, reqVO.getAmount())
            .betweenIfPresent(TmsFeeDO::getCurrencyType, reqVO.getCurrencyType())
            .likeIfPresent(TmsFeeDO::getRemark, reqVO.getRemark())
            .betweenIfPresent(TmsFeeDO::getCreateTime, reqVO.getCreateTime())
            .orderByDesc(TmsFeeDO::getId);
    }


    default PageResult<TmsFeeDO> selectPage(TmsFeePageReqVO reqVO) {
        return selectPage(reqVO, buildWrapper(reqVO));
    }

    default List<TmsFeeDO> selectListBySourceId(Long sourceId) {
        return selectList(TmsFeeDO::getSourceId, sourceId);
    }

    default int deleteBySourceId(Long sourceId) {
        return delete(TmsFeeDO::getSourceId, sourceId);
    }

    default List<TmsFeeDO> selectListBySourceIdAndType(Long sourceId, Integer sourceType) {
        return selectList(new MPJLambdaWrapperX<TmsFeeDO>()
            .eq(TmsFeeDO::getSourceId, sourceId)
            .eq(TmsFeeDO::getSourceType, sourceType));
    }

    default List<Long> selectFirstMileIdsByFeePageReqVO(TmsFeePageReqVO reqVO) {
        return selectList(new MPJLambdaWrapperX<TmsFeeDO>()
            .eqIfPresent(TmsFeeDO::getSourceType, reqVO.getSourceType())
            .eqIfPresent(TmsFeeDO::getCostType, reqVO.getCostType())
            .betweenIfPresent(TmsFeeDO::getAmount, reqVO.getAmount())
            .betweenIfPresent(TmsFeeDO::getCurrencyType, reqVO.getCurrencyType())
            .likeIfPresent(TmsFeeDO::getRemark, reqVO.getRemark())
            .betweenIfPresent(TmsFeeDO::getCreateTime, reqVO.getCreateTime()))
            .stream()
            .map(TmsFeeDO::getSourceId)
            .distinct()
            .collect(Collectors.toList());
    }

    default List<TmsFeeDO> selectByIdAndType(Long id, Integer sourceType) {
        return selectList(new MPJLambdaWrapperX<TmsFeeDO>()
            .eq(TmsFeeDO::getId, id)
            .eq(TmsFeeDO::getSourceType, sourceType));
    }

    default int deleteByIdAndType(Long id, Integer sourceType) {
        return delete(new MPJLambdaWrapperX<TmsFeeDO>()
            .eq(TmsFeeDO::getId, id)
            .eq(TmsFeeDO::getSourceType, sourceType));
    }

    default int deleteBySourceIdAndType(Long sourceId, Integer sourceType) {
        return delete(new MPJLambdaWrapperX<TmsFeeDO>()
            .eq(TmsFeeDO::getSourceId, sourceId)
            .eq(TmsFeeDO::getSourceType, sourceType));
    }
}