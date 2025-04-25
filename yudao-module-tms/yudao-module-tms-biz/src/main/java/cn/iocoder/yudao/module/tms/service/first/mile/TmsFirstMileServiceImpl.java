package cn.iocoder.yudao.module.tms.service.first.mile;

import cn.hutool.core.collection.CollUtil;
import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.common.util.collection.CollectionUtils;
import cn.iocoder.yudao.framework.common.util.object.BeanUtils;
import cn.iocoder.yudao.module.tms.controller.admin.fee.vo.TmsFeeSaveReqVO;
import cn.iocoder.yudao.module.tms.controller.admin.first.mile.vo.TmsFirstMilePageReqVO;
import cn.iocoder.yudao.module.tms.controller.admin.first.mile.vo.TmsFirstMileSaveReqVO;
import cn.iocoder.yudao.module.tms.convert.first.mile.TmsFirstMileConvert;
import cn.iocoder.yudao.module.tms.dal.dataobject.fee.TmsFeeDO;
import cn.iocoder.yudao.module.tms.dal.dataobject.first.mile.TmsFirstMileDO;
import cn.iocoder.yudao.module.tms.dal.dataobject.first.mile.item.TmsFirstMileItemDO;
import cn.iocoder.yudao.module.tms.dal.mysql.first.mile.TmsFirstMileMapper;
import cn.iocoder.yudao.module.tms.dal.mysql.first.mile.item.TmsFirstMileItemMapper;
import cn.iocoder.yudao.module.tms.enums.SourceTypeEnum;
import cn.iocoder.yudao.module.tms.service.bo.TmsFirstMileBO;
import cn.iocoder.yudao.module.tms.service.bo.TmsFirstMileItemBO;
import cn.iocoder.yudao.module.tms.service.fee.TmsFeeService;
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
    private TmsFeeService feeService;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Long createFirstMile(TmsFirstMileSaveReqVO createReqVO) {
        TmsFirstMileDO firstMile = BeanUtils.toBean(createReqVO, TmsFirstMileDO.class);
        firstMileMapper.insert(firstMile);

        createFirstMileItemList(firstMile.getId(), createReqVO.getFirstMileItems());
        createFeeList(firstMile.getId(), createReqVO.getFees());
        return firstMile.getId();
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void updateFirstMile(TmsFirstMileSaveReqVO updateReqVO) {
        validateFirstMileExists(updateReqVO.getId());
        TmsFirstMileDO updateObj = BeanUtils.toBean(updateReqVO, TmsFirstMileDO.class);
        firstMileMapper.updateById(updateObj);

        updateFirstMileItemList(updateReqVO.getId(), updateReqVO.getFirstMileItems());
        updateFeeList(updateReqVO.getId(), updateReqVO.getFees());
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void deleteFirstMile(Long id) {
        validateFirstMileExists(id);
        firstMileMapper.deleteById(id);

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
        PageResult<TmsFirstMileItemBO> itemPageResult = firstMileItemMapper.selectPageBO(pageReqVO);
        if (itemPageResult.getList().isEmpty()) {
            return new PageResult<>(Collections.emptyList(), itemPageResult.getTotal());
        }
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
        List<TmsFirstMileItemDO> oldList = firstMileItemMapper.selectListByFirstMileId(firstMileId);
        List<List<TmsFirstMileItemDO>> diffedList = diffList(oldList, list,
            (oldVal, newVal) -> oldVal.getId().equals(newVal.getId()));
        if (CollUtil.isNotEmpty(diffedList.get(0))) {
            diffedList.get(0).forEach(item -> item.setFirstMileId(firstMileId));
            firstMileItemMapper.insertBatch(diffedList.get(0));
        }
        if (CollUtil.isNotEmpty(diffedList.get(1))) {
            firstMileItemMapper.updateBatch(diffedList.get(1));
        }
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
        return feeService.getFeeListBySourceId(sourceId, SourceTypeEnum.FIRST_MILE);
    }

    private void createFeeList(Long sourceId, List<TmsFeeSaveReqVO> list) {
        if (CollUtil.isEmpty(list)) {
            return;
        }
        list.forEach(fee -> fee.setSourceId(sourceId));
        feeService.createFeeList(BeanUtils.toBean(list, TmsFeeDO.class), SourceTypeEnum.FIRST_MILE);
    }

    private void updateFeeList(Long sourceId, List<TmsFeeSaveReqVO> list) {
        if (CollUtil.isEmpty(list)) {
            return;
        }
        List<TmsFeeDO> oldList = getFeeListBySourceId(sourceId);

        List<List<TmsFeeDO>> diffedList = CollectionUtils.diffList(oldList, BeanUtils.toBean(list, TmsFeeDO.class),
            Object::equals);
        if (CollUtil.isNotEmpty(diffedList.get(0))) {
            diffedList.get(0).forEach(fee -> fee.setSourceId(sourceId));
            feeService.createFeeList(diffedList.get(0), SourceTypeEnum.FIRST_MILE);
        }
        if (CollUtil.isNotEmpty(diffedList.get(1))) {
            diffedList.get(1).forEach(fee -> fee.setSourceId(sourceId));
            feeService.updateFeeList(diffedList.get(1), SourceTypeEnum.FIRST_MILE);
        }
        if (CollUtil.isNotEmpty(diffedList.get(2))) {
            List<Long> deleteIds = convertList(diffedList.get(2), TmsFeeDO::getId);
            feeService.deleteFeeList(deleteIds, SourceTypeEnum.FIRST_MILE);
        }
    }

    private void deleteFeeBySourceId(Long sourceId) {
        List<TmsFeeDO> feeList = getFeeListBySourceId(sourceId);
        if (CollUtil.isEmpty(feeList)) {
            return;
        }
        List<Long> deleteIds = CollectionUtils.convertList(feeList, TmsFeeDO::getId);
        feeService.deleteFeeList(deleteIds, SourceTypeEnum.FIRST_MILE);
    }

}