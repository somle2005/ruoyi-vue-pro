package cn.iocoder.yudao.module.tms.service.first.mile;

import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.common.util.object.BeanUtils;
import cn.iocoder.yudao.module.tms.controller.admin.first.mile.vo.TmsFirstMilePageReqVO;
import cn.iocoder.yudao.module.tms.controller.admin.first.mile.vo.TmsFirstMileSaveReqVO;
import cn.iocoder.yudao.module.tms.convert.first.mile.TmsFirstMileConvert;
import cn.iocoder.yudao.module.tms.dal.dataobject.fee.TmsFeeDO;
import cn.iocoder.yudao.module.tms.dal.dataobject.first.mile.TmsFirstMileDO;
import cn.iocoder.yudao.module.tms.dal.dataobject.first.mile.item.TmsFirstMileItemDO;
import cn.iocoder.yudao.module.tms.dal.mysql.fee.TmsFeeMapper;
import cn.iocoder.yudao.module.tms.dal.mysql.first.mile.TmsFirstMileMapper;
import cn.iocoder.yudao.module.tms.dal.mysql.first.mile.item.TmsFirstMileItemMapper;
import cn.iocoder.yudao.module.tms.service.bo.TmsFirstMileBO;
import cn.iocoder.yudao.module.tms.service.bo.TmsFirstMileItemBO;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;

import java.util.Collections;
import java.util.List;

import static cn.iocoder.yudao.framework.common.exception.util.ServiceExceptionUtil.exception;
import static cn.iocoder.yudao.module.tms.enums.ErrorCodeConstants.FIRST_MILE_NOT_EXISTS;

/**
 * 头程单 Service 实现类
 *
 * @author wdy
 */
@Service
@Validated
public class TmsFirstMileServiceImpl implements TmsFirstMileService {

    @Resource
    private TmsFirstMileMapper firstMileMapper;
    @Resource
    private TmsFirstMileItemMapper firstMileItemMapper;
    @Resource
    private TmsFeeMapper feeMapper;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Long createFirstMile(TmsFirstMileSaveReqVO createReqVO) {
        // 插入
        TmsFirstMileDO firstMile = BeanUtils.toBean(createReqVO, TmsFirstMileDO.class);
        firstMileMapper.insert(firstMile);

        // 插入子表
        createFirstMileItemList(firstMile.getId(), createReqVO.getFirstMileItems());
        createFeeList(firstMile.getId(), createReqVO.getFees());
        // 返回
        return firstMile.getId();
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void updateFirstMile(TmsFirstMileSaveReqVO updateReqVO) {
        // 校验存在
        validateFirstMileExists(updateReqVO.getId());
        // 更新
        TmsFirstMileDO updateObj = BeanUtils.toBean(updateReqVO, TmsFirstMileDO.class);
        firstMileMapper.updateById(updateObj);

        // 更新子表
        updateFirstMileItemList(updateReqVO.getId(), updateReqVO.getFirstMileItems());
        updateFeeList(updateReqVO.getId(), updateReqVO.getFees());
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void deleteFirstMile(Long id) {
        // 校验存在
        validateFirstMileExists(id);
        // 删除
        firstMileMapper.deleteById(id);

        // 删除子表
        deleteFirstMileItemByFirstMileId(id);
        deleteFeeBySourceId(id);
    }

    private void validateFirstMileExists(Long id) {
        if (firstMileMapper.selectById(id) == null) {
            throw exception(FIRST_MILE_NOT_EXISTS);
        }
    }

    @Override
    public TmsFirstMileDO getFirstMile(Long id) {
        return firstMileMapper.selectById(id);
    }


    @Override
    public PageResult<TmsFirstMileBO> getFirstMileBOPage(TmsFirstMilePageReqVO pageReqVO) {
        // 1. 获取明细分页数据（包含主表信息）
        PageResult<TmsFirstMileItemBO> itemPageResult = firstMileItemMapper.selectPageBO(pageReqVO);
        if (itemPageResult.getList().isEmpty()) {
            return new PageResult<>(Collections.emptyList(), itemPageResult.getTotal());
        }
        // 2. 转换
        List<TmsFirstMileBO> firstMileBOList = TmsFirstMileConvert.convertBOList(itemPageResult.getList());

        return new PageResult<>(firstMileBOList, itemPageResult.getTotal());
    }

    // ==================== 子表（头程单明细） ====================

    @Override
    public List<TmsFirstMileItemDO> getFirstMileItemListByFirstMileId(Long firstMileId) {
        return firstMileItemMapper.selectListByFirstMileId(firstMileId);
    }

    private void createFirstMileItemList(Long firstMileId, List<TmsFirstMileItemDO> list) {
        list.forEach(o -> o.setFirstMileId(firstMileId));
        firstMileItemMapper.insertBatch(list);
    }

    private void updateFirstMileItemList(Long firstMileId, List<TmsFirstMileItemDO> list) {
        deleteFirstMileItemByFirstMileId(firstMileId);
        list.forEach(o -> o.setId(null).setUpdater(null).setUpdateTime(null)); // 解决更新情况下：1）id 冲突；2）updateTime 不更新
        createFirstMileItemList(firstMileId, list);
    }

    private void deleteFirstMileItemByFirstMileId(Long firstMileId) {
        firstMileItemMapper.deleteByFirstMileId(firstMileId);
    }

    // ==================== 子表（出运订单费用明细） ====================

    @Override
    public List<TmsFeeDO> getFeeListBySourceId(Long sourceId) {
        return feeMapper.selectListBySourceId(sourceId);
    }

    private void createFeeList(Long sourceId, List<TmsFeeDO> list) {
        list.forEach(o -> o.setSourceId(sourceId));
        feeMapper.insertBatch(list);
    }

    private void updateFeeList(Long sourceId, List<TmsFeeDO> list) {
        deleteFeeBySourceId(sourceId);
        list.forEach(o -> o.setId(null).setUpdater(null).setUpdateTime(null)); // 解决更新情况下：1）id 冲突；2）updateTime 不更新
        createFeeList(sourceId, list);
    }

    private void deleteFeeBySourceId(Long sourceId) {
        feeMapper.deleteBySourceId(sourceId);
    }

}