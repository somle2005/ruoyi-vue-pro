package cn.iocoder.yudao.module.tms.service.first.mile;

import cn.hutool.core.collection.CollUtil;
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
import cn.iocoder.yudao.module.tms.enums.SourceTypeEnum;
import cn.iocoder.yudao.module.tms.service.bo.TmsFirstMileBO;
import cn.iocoder.yudao.module.tms.service.bo.TmsFirstMileItemBO;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;

import java.util.Collections;
import java.util.List;

import static cn.iocoder.yudao.framework.common.exception.util.ServiceExceptionUtil.exception;
import static cn.iocoder.yudao.framework.common.util.collection.CollectionUtils.convertList;
import static cn.iocoder.yudao.framework.common.util.collection.CollectionUtils.diffList;
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
        // 获取原有的子表数据
        List<TmsFirstMileItemDO> oldList = firstMileItemMapper.selectListByFirstMileId(firstMileId);

        // 使用diff方法比较新旧数据
        List<List<TmsFirstMileItemDO>> diffedList = diffList(oldList, list,
            (oldVal, newVal) -> oldVal.getId().equals(newVal.getId()));

        // 处理新增的数据
        if (CollUtil.isNotEmpty(diffedList.get(0))) {
            diffedList.get(0).forEach(item -> item.setFirstMileId(firstMileId));
            firstMileItemMapper.insertBatch(diffedList.get(0));
        }

        // 处理更新的数据
        if (CollUtil.isNotEmpty(diffedList.get(1))) {
            firstMileItemMapper.updateBatch(diffedList.get(1));
        }

        // 处理删除的数据
        if (CollUtil.isNotEmpty(diffedList.get(2))) {
            List<Long> deleteIds = convertList(diffedList.get(2), TmsFirstMileItemDO::getId);
            firstMileItemMapper.deleteByIds(deleteIds);
        }
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
        // 获取原有的费用明细数据
        List<TmsFeeDO> oldList = feeMapper.selectListBySourceId(sourceId);

        // 使用diff方法比较新旧数据
        List<List<TmsFeeDO>> diffedList = diffList(oldList, list,
            (oldVal, newVal) -> oldVal.getId().equals(newVal.getId()));

        // 处理新增的数据
        if (CollUtil.isNotEmpty(diffedList.get(0))) {
            diffedList.get(0).forEach(item -> {
                item.setSourceId(sourceId);
                item.setSourceType(SourceTypeEnum.FIRST_MILE.getType());
            });
            feeMapper.insertBatch(diffedList.get(0));
        }

        // 处理更新的数据
        if (CollUtil.isNotEmpty(diffedList.get(1))) {
            diffedList.get(1).forEach(item -> {
                item.setSourceId(sourceId);
                item.setSourceType(SourceTypeEnum.FIRST_MILE.getType());
            });
            feeMapper.updateBatch(diffedList.get(1));
        }

        // 处理删除的数据
        if (CollUtil.isNotEmpty(diffedList.get(2))) {
            List<Long> deleteIds = convertList(diffedList.get(2), TmsFeeDO::getId);
            feeMapper.deleteByIds(deleteIds);
        }
    }

    private void deleteFeeBySourceId(Long sourceId) {
        feeMapper.deleteBySourceId(sourceId);
    }

}