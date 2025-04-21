package cn.iocoder.yudao.module.tms.service.first.mile.request.impl;

import cn.iocoder.yudao.framework.cola.statemachine.StateMachine;
import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.common.util.collection.CollectionUtils;
import cn.iocoder.yudao.framework.common.util.object.BeanUtils;
import cn.iocoder.yudao.module.tms.controller.admin.first.mile.request.vo.TmsFirstMileRequestAuditReqVO;
import cn.iocoder.yudao.module.tms.controller.admin.first.mile.request.vo.TmsFirstMileRequestPageReqVO;
import cn.iocoder.yudao.module.tms.controller.admin.first.mile.request.vo.TmsFirstMileRequestSaveReqVO;
import cn.iocoder.yudao.module.tms.dal.dataobject.first.mile.request.TmsFirstMileRequestDO;
import cn.iocoder.yudao.module.tms.dal.dataobject.first.mile.request.item.TmsFirstMileRequestItemDO;
import cn.iocoder.yudao.module.tms.dal.mysql.first.mile.request.TmsFirstMileRequestMapper;
import cn.iocoder.yudao.module.tms.dal.mysql.first.mile.request.item.TmsFirstMileRequestItemMapper;
import cn.iocoder.yudao.module.tms.enums.TmsEventEnum;
import cn.iocoder.yudao.module.tms.enums.status.TmsAuditStatus;
import cn.iocoder.yudao.module.tms.enums.status.TmsOffStatus;
import cn.iocoder.yudao.module.tms.service.bo.TmsFirstMileRequestBO;
import cn.iocoder.yudao.module.tms.service.bo.TmsFirstMileRequestItemBO;
import cn.iocoder.yudao.module.tms.service.first.mile.request.TmsFirstMileRequestService;
import jakarta.annotation.Resource;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

import static cn.iocoder.yudao.framework.common.exception.util.ServiceExceptionUtil.exception;
import static cn.iocoder.yudao.module.tms.enums.ErrorCodeConstants.FIRST_MILE_REQUEST_NOT_EXISTS;
import static cn.iocoder.yudao.module.tms.enums.ErrorCodeConstants.FIRST_MILE_REQUEST_OFF_STATUS_NOT_ALLOWED;
import static cn.iocoder.yudao.module.tms.enums.TmsStateMachines.FIRST_MILE_REQUEST_AUDIT_STATE_MACHINE;

/**
 * 头程申请单 Service 实现类
 *
 * @author wdy
 */
@Service
@Validated
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class TmsFirstMileRequestServiceImpl implements TmsFirstMileRequestService {

    private final TmsFirstMileRequestMapper firstMileRequestMapper;
    private final TmsFirstMileRequestItemMapper firstMileRequestItemMapper;
    @Resource(name = FIRST_MILE_REQUEST_AUDIT_STATE_MACHINE)
    private StateMachine<TmsAuditStatus, TmsEventEnum, TmsFirstMileRequestAuditReqVO> tmsFirstMileRequestStatusMachine;


    @Override
    @Transactional(rollbackFor = Exception.class)
    public Long createFirstMileRequest(TmsFirstMileRequestSaveReqVO vo) {
        // 插入
        TmsFirstMileRequestDO firstMileRequest = BeanUtils.toBean(vo, TmsFirstMileRequestDO.class);

        // 计算主表的总重量和总体积
        List<TmsFirstMileRequestItemDO> requestItemDOS = BeanUtils.toBean(vo.getFirstMileRequestItems(), TmsFirstMileRequestItemDO.class);
        calculateTotalWeightAndVolume(firstMileRequest, requestItemDOS);
        
        firstMileRequestMapper.insert(firstMileRequest);

        // 插入子表
        createFirstMileRequestItemList(firstMileRequest.getId(), requestItemDOS);
        //初始化主子表状态
        initMasterStatus(firstMileRequest);

        // 返回
        return firstMileRequest.getId();
    }

    private void initMasterStatus(TmsFirstMileRequestDO firstMileRequest) {
        //审核
        tmsFirstMileRequestStatusMachine.fireEvent(TmsAuditStatus.DRAFT, TmsEventEnum.AUDIT_INIT, TmsFirstMileRequestAuditReqVO.builder().requestId(firstMileRequest.getId()).build());
        //开关
        //采购
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void updateFirstMileRequest(TmsFirstMileRequestSaveReqVO vo) {
        // 校验存在
        validateFirstMileRequestExists(vo.getId());

        // 更新
        TmsFirstMileRequestDO updateObj = BeanUtils.toBean(vo, TmsFirstMileRequestDO.class);

        // 计算主表的总重量和总体积
        List<TmsFirstMileRequestItemDO> requestItemDOS = BeanUtils.toBean(vo.getFirstMileRequestItems(), TmsFirstMileRequestItemDO.class);
        calculateTotalWeightAndVolume(updateObj, requestItemDOS);
        
        firstMileRequestMapper.updateById(updateObj);

        // 更新子表
        updateFirstMileRequestItemList(vo.getId(), requestItemDOS);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void deleteFirstMileRequest(Long id) {
        // 校验存在
        validateFirstMileRequestExists(id);
        // 删除
        firstMileRequestMapper.deleteById(id);

        // 删除子表
        deleteFirstMileRequestItemByRequestId(id);
    }

    @Override
    public TmsFirstMileRequestDO validateFirstMileRequestExists(Long id) {
        TmsFirstMileRequestDO mileRequestDO = firstMileRequestMapper.selectById(id);
        if (mileRequestDO == null) {
            throw exception(FIRST_MILE_REQUEST_NOT_EXISTS, id);
        }
        return mileRequestDO;
    }

    @Override
    public PageResult<TmsFirstMileRequestBO> getFirstMileRequestBOPage(TmsFirstMileRequestPageReqVO pageReqVO) {
        // 1. 获取子表分页数据
        PageResult<TmsFirstMileRequestItemBO> pageResult = firstMileRequestItemMapper.selectPageBO(pageReqVO);
        if (CollectionUtils.isEmpty(pageResult.getList())) {
            return new PageResult<>(Collections.emptyList(), 0L);
        }
        // 2. 转换为BO对象列表
        List<TmsFirstMileRequestBO> boList = bindBOList(pageResult.getList());
        // 3. 返回分页结果
        return new PageResult<>(boList, pageResult.getTotal());
    }

    @Override
    public TmsFirstMileRequestBO getFirstMileRequestBO(Long id) {
        // 查询主表
        TmsFirstMileRequestDO firstMileRequestDO = validateFirstMileRequestExists(id);
        // 查询子表
        List<TmsFirstMileRequestItemDO> firstMileRequestItemDOList = firstMileRequestItemMapper.selectListByRequestId(id);
        // 转换
        return BeanUtils.toBean(firstMileRequestDO, TmsFirstMileRequestBO.class).setItems(firstMileRequestItemDOList);
    }


    @Override
    @Transactional(rollbackFor = Exception.class)
    public TmsFirstMileRequestDO updateFirstMileRequestStatus(Long id, Integer offStatus, Integer orderStatus, Integer auditStatus) {
        // 获取头程申请单
        TmsFirstMileRequestDO requestDO = validateFirstMileRequestExists(id);
        // 更新状态字段
        if (offStatus != null) {
            requestDO.setOffStatus(offStatus);
        }
        if(orderStatus != null) {
            requestDO.setOrderStatus(orderStatus);
        }
        if(auditStatus != null) {
            requestDO.setAuditStatus(auditStatus);
        }
        // 执行更新
        firstMileRequestMapper.updateById(requestDO);
        return requestDO;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public TmsFirstMileRequestItemDO updateFirstMileRequestItemStatus(Long id, Integer openStatus, Integer orderStatus) {
        return null;
    }
    // ==================== 子表（头程申请表明细） ====================

    @Override
    public List<TmsFirstMileRequestItemDO> getFirstMileRequestItemListByRequestId(Long requestId) {
        return firstMileRequestItemMapper.selectListByRequestId(requestId);
    }

    private void createFirstMileRequestItemList(Long requestId, List<TmsFirstMileRequestItemDO> list) {
        list.forEach(o -> o.setRequestId(requestId));
        firstMileRequestItemMapper.insertBatch(list);
    }

    private void updateFirstMileRequestItemList(Long requestId, List<TmsFirstMileRequestItemDO> list) {
        deleteFirstMileRequestItemByRequestId(requestId);
        list.forEach(o -> o.setId(null).setUpdater(null).setUpdateTime(null)); // 解决更新情况下：1）id 冲突；2）updateTime 不更新
        createFirstMileRequestItemList(requestId, list);
    }

    private void deleteFirstMileRequestItemByRequestId(Long requestId) {
        firstMileRequestItemMapper.deleteById(requestId);
    }

    /**
     * 将List<TmsFirstMileRequestItemBO>转换为List<TmsFirstMileRequestBO>
     * 实现主表和子表数据的绑定
     *
     * @param itemBOList 包含主表和子表数据的BO对象列表
     * @return 转换后的BO对象列表
     */
    private List<TmsFirstMileRequestBO> bindBOList(List<TmsFirstMileRequestItemBO> itemBOList) {
        Map<Long, List<TmsFirstMileRequestItemBO>> itemMap = itemBOList.stream()
            .filter(item -> item.getTmsFirstMileRequestDO() != null)
            .collect(Collectors.groupingBy(item -> item.getTmsFirstMileRequestDO().getId()));
        List<TmsFirstMileRequestBO> boList = new ArrayList<>();
        for (TmsFirstMileRequestItemBO itemBO : itemBOList) {
            if (itemBO.getTmsFirstMileRequestDO() == null) {
                continue;
            }
            // 检查该主表是否已经转换过
            Long requestId = itemBO.getTmsFirstMileRequestDO().getId();
            if (boList.stream().anyMatch(bo -> bo.getId().equals(requestId))) {
                continue;
            }
            // 转换主表数据
            TmsFirstMileRequestBO bo = BeanUtils.toBean(itemBO.getTmsFirstMileRequestDO(), TmsFirstMileRequestBO.class);
            // 设置子表数据
            List<TmsFirstMileRequestItemDO> items = itemMap.get(requestId).stream()
                .map(item -> BeanUtils.toBean(item, TmsFirstMileRequestItemDO.class))
                .collect(Collectors.toList());
            bo.setItems(items);
            boList.add(bo);
        }
        return boList;
    }


    @Override
    public void submitAudit(List<Long> ids) {
        // 检查参数是否为空
        if (ids == null || ids.isEmpty()) {
            throw exception(FIRST_MILE_REQUEST_NOT_EXISTS, ids);
        }

        // 查询所有记录
        List<TmsFirstMileRequestDO> requestDOList = firstMileRequestMapper.selectByIds(ids);

        // 找出不存在的记录ID
        List<Long> existingIds = requestDOList.stream().map(TmsFirstMileRequestDO::getId).toList();
        List<Long> notExistIds = ids.stream().filter(id -> !existingIds.contains(id)).collect(Collectors.toList());

        // 如果有不存在的记录，抛出异常
        if(!notExistIds.isEmpty()) {
            throw exception(FIRST_MILE_REQUEST_NOT_EXISTS, notExistIds);
        }

        //关闭状态不能提审
        requestDOList.forEach(requestDO -> {
            if (!Objects.equals(requestDO.getOffStatus(), TmsOffStatus.OPEN.getCode())) {
                throw exception(FIRST_MILE_REQUEST_OFF_STATUS_NOT_ALLOWED, requestDO.getCode(), TmsOffStatus.fromCode(requestDO.getOffStatus()).getDesc());
            }
        });
        // 批量执行状态转换
        for(TmsFirstMileRequestDO requestDO : requestDOList) {
            TmsFirstMileRequestAuditReqVO auditReqVO = TmsFirstMileRequestAuditReqVO.builder().requestId(requestDO.getId()).build();
            tmsFirstMileRequestStatusMachine.fireEvent(TmsAuditStatus.DRAFT, TmsEventEnum.SUBMIT_FOR_REVIEW, auditReqVO);
        }
    }

    @Override
    public void review(TmsFirstMileRequestAuditReqVO req) {
        // 检查参数是否为空
        if (req == null || req.getRequestId() == null) {
            throw exception(FIRST_MILE_REQUEST_NOT_EXISTS, req);
        }

        // 查询记录
        TmsFirstMileRequestDO requestDO = firstMileRequestMapper.selectById(req.getRequestId());
        if (requestDO == null) {
            throw exception(FIRST_MILE_REQUEST_NOT_EXISTS, req.getRequestId());
        }

        // 关闭状态不能审核/反审核
        if (!Objects.equals(requestDO.getOffStatus(), TmsOffStatus.OPEN.getCode())) {
            throw exception(FIRST_MILE_REQUEST_OFF_STATUS_NOT_ALLOWED, requestDO.getCode(),
                TmsOffStatus.fromCode(requestDO.getOffStatus()).getDesc());
        }

        // 根据当前审核状态和操作类型，执行相应的状态转换
        TmsAuditStatus currentStatus = TmsAuditStatus.fromCode(requestDO.getAuditStatus());

        // 根据审核操作类型执行不同的状态转换
        if (Boolean.TRUE.equals(req.getReviewed())) {
            // 审核通过
            tmsFirstMileRequestStatusMachine.fireEvent(currentStatus, TmsEventEnum.AGREE, req);
        } else {
            // 审核拒绝或反审核
            tmsFirstMileRequestStatusMachine.fireEvent(currentStatus, TmsEventEnum.REJECT, req);
        }
    }

    /**
     * 计算主表的总重量和总体积
     *
     * @param firstMileRequest 主表对象
     * @param requestItemDOS   子表对象列表
     */
    private void calculateTotalWeightAndVolume(TmsFirstMileRequestDO firstMileRequest, List<TmsFirstMileRequestItemDO> requestItemDOS) {
        if (requestItemDOS == null || requestItemDOS.isEmpty()) {
            firstMileRequest.setTotalWeight(BigDecimal.ZERO);
            firstMileRequest.setTotalVolume(BigDecimal.ZERO);
            return;
        }
        // 计算总重量和总体积
        BigDecimal totalWeight = BigDecimal.ZERO;
        BigDecimal totalVolume = BigDecimal.ZERO;
        for (TmsFirstMileRequestItemDO item : requestItemDOS) {
            // 累加毛重
            if (item.getPackageWeight() != null) {
                totalWeight = totalWeight.add(item.getPackageWeight());
            }
            // 累加体积
            if (item.getVolume() != null) {
                totalVolume = totalVolume.add(item.getVolume());
            }
        }
        firstMileRequest.setTotalWeight(totalWeight);
        firstMileRequest.setTotalVolume(totalVolume);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void switchTmsFirstMileOpenStatus(List<Long> itemIds, Boolean enable) {
        if (itemIds == null || itemIds.isEmpty()) {
        }

    }
}