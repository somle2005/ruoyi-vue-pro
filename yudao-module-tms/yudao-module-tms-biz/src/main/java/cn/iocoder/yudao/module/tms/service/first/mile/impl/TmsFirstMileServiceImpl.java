package cn.iocoder.yudao.module.tms.service.first.mile.impl;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.date.DatePattern;
import cn.hutool.core.date.DateUtil;
import cn.iocoder.yudao.framework.cola.statemachine.StateMachine;
import cn.iocoder.yudao.framework.common.exception.ErrorCode;
import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.common.util.collection.CollectionUtils;
import cn.iocoder.yudao.framework.common.util.object.BeanUtils;
import cn.iocoder.yudao.framework.idempotent.core.annotation.Idempotent;
import cn.iocoder.yudao.module.system.enums.somle.BillType;
import cn.iocoder.yudao.module.tms.api.first.FistMileDTO;
import cn.iocoder.yudao.module.tms.controller.admin.fee.vo.TmsFeeRespVO;
import cn.iocoder.yudao.module.tms.controller.admin.fee.vo.TmsFeeSaveReqVO;
import cn.iocoder.yudao.module.tms.controller.admin.first.mile.item.vo.TmsFirstMileItemSaveReqVO;
import cn.iocoder.yudao.module.tms.controller.admin.first.mile.vo.req.TmsFirstMileAuditReqVO;
import cn.iocoder.yudao.module.tms.controller.admin.first.mile.vo.req.TmsFirstMilePageReqVO;
import cn.iocoder.yudao.module.tms.controller.admin.first.mile.vo.req.TmsFirstMileSaveReqVO;
import cn.iocoder.yudao.module.tms.convert.first.mile.TmsFirstMileConvert;
import cn.iocoder.yudao.module.tms.dal.dataobject.fee.TmsFeeDO;
import cn.iocoder.yudao.module.tms.dal.dataobject.first.mile.TmsFirstMileDO;
import cn.iocoder.yudao.module.tms.dal.dataobject.first.mile.item.TmsFirstMileItemDO;
import cn.iocoder.yudao.module.tms.dal.mysql.first.mile.TmsFirstMileMapper;
import cn.iocoder.yudao.module.tms.dal.mysql.first.mile.item.TmsFirstMileItemMapper;
import cn.iocoder.yudao.module.tms.dal.redis.no.TmsNoRedisDAO;
import cn.iocoder.yudao.module.tms.enums.TmsEventEnum;
import cn.iocoder.yudao.module.tms.enums.status.TmsAuditStatus;
import cn.iocoder.yudao.module.tms.service.bo.TmsFirstMileBO;
import cn.iocoder.yudao.module.tms.service.bo.TmsFirstMileItemBO;
import cn.iocoder.yudao.module.tms.service.fee.TmsFeeService;
import cn.iocoder.yudao.module.tms.service.first.mile.TmsFirstMileService;
import jakarta.annotation.Resource;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

import static cn.iocoder.yudao.framework.common.exception.util.ServiceExceptionUtil.exception;
import static cn.iocoder.yudao.module.tms.enums.ErrorCodeConstants.*;
import static cn.iocoder.yudao.module.tms.enums.TmsStateMachines.FIRST_MILE_AUDIT_STATE_MACHINE;

/**
 * 头程单 Service 实现类
 *
 * @author wdy
 */
@Service
@Validated
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class TmsFirstMileServiceImpl implements TmsFirstMileService {

    private final TmsFirstMileMapper firstMileMapper;
    private final TmsFirstMileItemMapper firstMileItemMapper;
    private final TmsFeeService feeService;
    private final TmsNoRedisDAO noRedisDAO;

    @Resource(name = FIRST_MILE_AUDIT_STATE_MACHINE)
    StateMachine<TmsAuditStatus, TmsEventEnum, TmsFirstMileAuditReqVO> auditStateMachine;

    //校验code中间日期是否是当天
    private static void validCodeDateIsToday(TmsFirstMileSaveReqVO vo) {
        String[] parts = vo.getCode().split("-");
        if (parts.length != 3) {
            throw exception(FIRST_MILE_CODE_FORMAT_ERROR, vo.getCode());
        }
        String dateStr = parts[1];
        String today = DateUtil.format(LocalDateTime.now(), DatePattern.PURE_DATE_PATTERN);
        if (!dateStr.equals(today)) {
            throw exception(FIRST_MILE_CODE_DATE_NOT_TODAY, dateStr);
        }
    }

    @Override
    @Idempotent
    @Transactional(rollbackFor = Exception.class)
    public Long createFirstMile(TmsFirstMileSaveReqVO vo) {
        if (vo.getCode() != null) {
            validCodeDateIsToday(vo);
            if (validCodeDuplicate(vo.getCode())) {
                throw exception(FIRST_MILE_CODE_DUPLICATE, vo.getCode());
            }
        } else {
            vo.setCode(noRedisDAO.generate(TmsNoRedisDAO.FIRST_MILE_NO_PREFIX, FIRST_MILE_CODE_DUPLICATE));
        }

        TmsFirstMileDO firstMile = BeanUtils.toBean(vo, TmsFirstMileDO.class);
        firstMileMapper.insert(firstMile);

        Long firstMileId = firstMile.getId();

        // 保存头程明细
        createFirstMileItemList(firstMileId, vo.getFirstMileItems());

        // 保存费用项
        createFeeList(firstMileId, vo.getFees());

        return firstMileId;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void updateFirstMile(TmsFirstMileSaveReqVO vo) {
        TmsFirstMileDO tmsFirstMileDO = validateFirstMileExists(vo.getId());

        //校验code
        if (!Objects.equals(vo.getCode(), tmsFirstMileDO.getCode())) {
            validCodeDateIsToday(vo);
            if (validCodeDuplicate(vo.getCode(), vo.getId())) {
                throw exception(FIRST_MILE_CODE_DUPLICATE, vo.getCode());
            }
        }

        statusCheckForEdit(tmsFirstMileDO, FIRST_MILE_UPDATE_FAIL_APPROVE);

        TmsFirstMileDO updateObj = BeanUtils.toBean(vo, TmsFirstMileDO.class);
        firstMileMapper.updateById(updateObj);

        updateFirstMileItemList(vo.getId(), vo.getFirstMileItems());
        updateFeeList(vo.getId(), vo.getFees());
    }

    //草稿+审核不通过才能修改
    private void statusCheckForEdit(TmsFirstMileDO tmsFirstMileDO, ErrorCode errorCode) {
        // 只有草稿状态或审核不通过状态才能修改
        if (tmsFirstMileDO.getAuditStatus() != null) {
            // 如果不是草稿状态或审核不通过状态，则抛出异常
            if (!TmsAuditStatus.DRAFT.getCode().equals(tmsFirstMileDO.getAuditStatus())
                && !TmsAuditStatus.REJECTED.getCode().equals(tmsFirstMileDO.getAuditStatus())) {
                throw exception(errorCode, tmsFirstMileDO.getCode(), TmsAuditStatus.fromCode(tmsFirstMileDO.getAuditStatus()).getDesc());
            }
        }
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void deleteFirstMile(Long id) {
        statusCheckForEdit(validateFirstMileExists(id), FIRST_MILE_DELETE_FAIL_APPROVE);
        firstMileMapper.deleteById(id);
        //删明细
        deleteFirstMileItemByFirstMileId(id);
        //删费用
        deleteFeeBySourceId(id);
    }

    private TmsFirstMileDO validateFirstMileExists(Long id) {
        TmsFirstMileDO tmsFirstMileDO = firstMileMapper.selectById(id);
        if (tmsFirstMileDO == null) {
            throw exception(FIRST_MILE_NOT_EXISTS);
        }
        return tmsFirstMileDO;
    }

    @Override
    public TmsFirstMileDO getFirstMile(Long id) {
        return firstMileMapper.selectById(id);
    }

    /**
     * 获得头程单BO
     *
     * @param id 头程单id
     */
    @Override
    public TmsFirstMileBO getFirstMileBO(Long id) {
        TmsFirstMileItemBO tmsFirstMileItemBO = firstMileItemMapper.selectBOById(id);
        return TmsFirstMileConvert.convertBO(tmsFirstMileItemBO);
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

    @Override
    public String getLatestCode() {
        return noRedisDAO.getMaxSerial(TmsNoRedisDAO.FIRST_MILE_NO_PREFIX, FIRST_MILE_CODE_GENERATE_FAIL);
    }

    @Override
    public void submitAudit(List<Long> ids) {
        // 检查参数是否为空
        if (ids == null || ids.isEmpty()) {
            throw exception(FIRST_MILE_ID_NOT_EXISTS, ids);
        }

        // 查询所有记录
        List<TmsFirstMileDO> requestDOList = firstMileMapper.selectByIds(ids);
        // 找出不存在的记录ID
        List<Long> existingIds = requestDOList.stream().map(TmsFirstMileDO::getId).toList();
        List<Long> notExistIds = ids.stream().filter(id -> !existingIds.contains(id)).toList();

        // 如果有不存在的记录，抛出异常
        if (!notExistIds.isEmpty()) {
            throw exception(FIRST_MILE_ID_NOT_EXISTS, notExistIds);
        }

        // 批量执行状态转换
        for (TmsFirstMileDO firstMileDO : requestDOList) {
            TmsFirstMileAuditReqVO auditReqVO = TmsFirstMileAuditReqVO.builder().id(firstMileDO.getId()).build();
            auditStateMachine.fireEvent(TmsAuditStatus.DRAFT, TmsEventEnum.SUBMIT_FOR_REVIEW, auditReqVO);
        }
    }

    @Override
    public void review(TmsFirstMileAuditReqVO req) {
        TmsFirstMileDO tmsFirstMileDO = validateFirstMileExists(req.getId());
        if (Boolean.TRUE.equals(req.getReviewed())) {
            if (req.getPass()) {
                //通过
                auditStateMachine.fireEvent(TmsAuditStatus.fromCode(tmsFirstMileDO.getAuditStatus()), TmsEventEnum.AGREE, req);
            } else {
                //不通过
                auditStateMachine.fireEvent(TmsAuditStatus.fromCode(tmsFirstMileDO.getAuditStatus()), TmsEventEnum.REJECT, req);
            }
            //TODO api 生成出库单
        } else {
            //TODO api 校验是否存在出库单，出库单是否删除了？报废了？
            //反审核
            auditStateMachine.fireEvent(TmsAuditStatus.fromCode(tmsFirstMileDO.getAuditStatus()), TmsEventEnum.WITHDRAW_REVIEW, req);
        }
    }
    // ==================== 子表（头程单明细） ====================
    @Override
    public List<TmsFirstMileItemDO> getFirstMileItemListByFirstMileId(Long firstMileId) {
        return firstMileItemMapper.selectListByFirstMileId(firstMileId);
    }

    /**
     * 通过申请项ID获得 头程明细列表
     *
     * @param requestItemId 申请项ID
     */
    @Override
    public List<TmsFirstMileItemDO> getFirstMileItemListByRequestItemId(Long requestItemId) {
        return firstMileItemMapper.selectListByRequestItemId(requestItemId);
    }

    private void createFirstMileItemList(Long firstMileId, List<TmsFirstMileItemSaveReqVO> list) {
        if (CollUtil.isEmpty(list)) {
            return;
        }
        List<TmsFirstMileItemDO> itemList = TmsFirstMileConvert.convertItemList(list);
        itemList.forEach(item -> item.setFirstMileId(firstMileId));
        firstMileItemMapper.insertBatch(itemList);
    }

    private void updateFirstMileItemList(Long firstMileId, List<TmsFirstMileItemSaveReqVO> list) {
        if (CollUtil.isEmpty(list)) {
            return;
        }
        List<TmsFirstMileItemDO> oldList = firstMileItemMapper.selectListByFirstMileId(firstMileId);
        List<TmsFirstMileItemDO> newList = TmsFirstMileConvert.convertItemList(list);

        List<List<TmsFirstMileItemDO>> diffedList = CollectionUtils.diffList(oldList, newList, (oldVal, newVal) -> oldVal.getId().equals(newVal.getId()));

        if (CollUtil.isNotEmpty(diffedList.get(0))) {
            diffedList.get(0).forEach(item -> item.setFirstMileId(firstMileId));
            firstMileItemMapper.insertBatch(diffedList.get(0));
        }
        if (CollUtil.isNotEmpty(diffedList.get(1))) {
            firstMileItemMapper.updateBatch(diffedList.get(1));
        }
        if (CollUtil.isNotEmpty(diffedList.get(2))) {
            List<Long> deleteIds = CollectionUtils.convertList(diffedList.get(2), TmsFirstMileItemDO::getId);
            firstMileItemMapper.deleteByIds(deleteIds);
        }
    }

    private void deleteFirstMileItemByFirstMileId(Long firstMileId) {
        firstMileItemMapper.deleteByFirstMileId(firstMileId);
    }

    // ==================== 子表（出运订单费用明细） ====================

    @Override
    public List<TmsFeeRespVO> getFeeListBySourceId(Long sourceId) {
        List<TmsFeeDO> feeList = feeService.getFeeListBySourceId(sourceId, BillType.TMS_FIRST_MILE.getValue());
        return TmsFirstMileConvert.convertFeeList(feeList);
    }

    private boolean validCodeDuplicate(String code) {
        return firstMileMapper.selectByCode(code);
    }

    private boolean validCodeDuplicate(String code, Long excludeId) {
        TmsFirstMileDO exist = firstMileMapper.selectByCodeRaw(code);
        return exist != null && !exist.getId().equals(excludeId);
    }

    private void createFeeList(Long sourceId, List<TmsFeeSaveReqVO> list) {
        if (CollUtil.isEmpty(list)) {
            return;
        }
        List<TmsFeeDO> feeList = TmsFirstMileConvert.convertFeeListToDO(list);
        feeList.forEach(fee -> fee.setSourceId(sourceId));
        feeService.createFeeList(feeList, BillType.TMS_FIRST_MILE.getValue());
    }

    private void updateFeeList(Long sourceId, List<TmsFeeSaveReqVO> list) {
        if (CollUtil.isEmpty(list)) {
            return;
        }
        List<TmsFeeDO> oldList = feeService.getFeeListBySourceId(sourceId, BillType.TMS_FIRST_MILE.getValue());
        List<TmsFeeDO> newList = TmsFirstMileConvert.convertFeeListToDO(list);

        List<List<TmsFeeDO>> diffedList = CollectionUtils.diffList(oldList, newList, Object::equals);

        if (CollUtil.isNotEmpty(diffedList.get(0))) {
            diffedList.get(0).forEach(fee -> fee.setSourceId(sourceId));
            feeService.createFeeList(diffedList.get(0), BillType.TMS_FIRST_MILE.getValue());
        }
        if (CollUtil.isNotEmpty(diffedList.get(1))) {
            diffedList.get(1).forEach(fee -> fee.setSourceId(sourceId));
            feeService.updateFeeList(diffedList.get(1), BillType.TMS_FIRST_MILE.getValue());
        }
        if (CollUtil.isNotEmpty(diffedList.get(2))) {
            List<Long> deleteIds = CollectionUtils.convertList(diffedList.get(2), TmsFeeDO::getId);
            feeService.deleteFeeList(deleteIds, BillType.TMS_FIRST_MILE.getValue());
        }
    }

    private void deleteFeeBySourceId(Long sourceId) {
        List<TmsFeeDO> feeList = feeService.getFeeListBySourceId(sourceId, BillType.TMS_FIRST_MILE.getValue());
        if (CollUtil.isEmpty(feeList)) {
            return;
        }
        List<Long> deleteIds = CollectionUtils.convertList(feeList, TmsFeeDO::getId);
        feeService.deleteFeeList(deleteIds, BillType.TMS_FIRST_MILE.getValue());
    }

    /**
     * 更新头程单状态
     *
     * @param fistMileDTO dto
     */
    @Override
    public void updateFirstMileStatus(FistMileDTO fistMileDTO) {
        validateFirstMileExists(fistMileDTO.getId());
        TmsFirstMileDO firstMileDO = TmsFirstMileConvert.convertDO(fistMileDTO);
        firstMileMapper.updateById(firstMileDO);
    }
}