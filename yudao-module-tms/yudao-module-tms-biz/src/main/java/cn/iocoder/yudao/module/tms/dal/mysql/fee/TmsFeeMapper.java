package cn.iocoder.yudao.module.tms.dal.mysql.fee;

import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.mybatis.core.mapper.BaseMapperX;
import cn.iocoder.yudao.framework.mybatis.core.query.LambdaQueryWrapperX;
import cn.iocoder.yudao.module.tms.controller.admin.fee.vo.TmsFeePageReqVO;
import cn.iocoder.yudao.module.tms.dal.dataobject.fee.TmsFeeDO;
import org.apache.ibatis.annotations.Mapper;

/**
 * 出运订单费用明细 Mapper
 *
 * @author wdy
 */
@Mapper
public interface TmsFeeMapper extends BaseMapperX<TmsFeeDO> {

    default PageResult<TmsFeeDO> selectPage(TmsFeePageReqVO reqVO) {
        return selectPage(reqVO, new LambdaQueryWrapperX<TmsFeeDO>()
            .eqIfPresent(TmsFeeDO::getSourceType, reqVO.getSourceType())
            .eqIfPresent(TmsFeeDO::getSourceId, reqVO.getSourceId())
            .eqIfPresent(TmsFeeDO::getCostType, reqVO.getCostType())
            .betweenIfPresent(TmsFeeDO::getAmount, reqVO.getAmount())
            .betweenIfPresent(TmsFeeDO::getCurrencyType, reqVO.getCurrencyType())
            .likeIfPresent(TmsFeeDO::getRemark, reqVO.getRemark())
            .eqIfPresent(TmsFeeDO::getRevision, reqVO.getRevision())
            .betweenIfPresent(TmsFeeDO::getCreateTime, reqVO.getCreateTime())
            .orderByDesc(TmsFeeDO::getId));
    }

}