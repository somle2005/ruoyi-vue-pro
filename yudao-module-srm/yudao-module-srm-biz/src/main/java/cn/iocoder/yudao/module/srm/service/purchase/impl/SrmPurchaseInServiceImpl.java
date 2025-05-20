package cn.iocoder.yudao.module.srm.service.purchase.impl;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.date.DatePattern;
import cn.hutool.core.date.DateUtil;
import cn.iocoder.yudao.framework.cola.statemachine.StateMachine;
import cn.iocoder.yudao.framework.common.exception.enums.GlobalErrorCodeConstants;
import cn.iocoder.yudao.framework.common.exception.util.ThrowUtil;
import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.common.util.number.MoneyUtils;
import cn.iocoder.yudao.framework.common.util.object.BeanUtils;
import cn.iocoder.yudao.module.erp.api.product.ErpProductApi;
import cn.iocoder.yudao.module.fms.api.finance.FmsAccountApi;
import cn.iocoder.yudao.module.srm.api.purchase.order.SrmOrderInCountDTO;
import cn.iocoder.yudao.module.srm.controller.admin.purchase.vo.in.req.SrmPurchaseInAuditReqVO;
import cn.iocoder.yudao.module.srm.controller.admin.purchase.vo.in.req.SrmPurchaseInPageReqVO;
import cn.iocoder.yudao.module.srm.controller.admin.purchase.vo.in.req.SrmPurchaseInPayReqVO;
import cn.iocoder.yudao.module.srm.controller.admin.purchase.vo.in.req.SrmPurchaseInSaveReqVO;
import cn.iocoder.yudao.module.srm.dal.dataobject.purchase.SrmPurchaseInDO;
import cn.iocoder.yudao.module.srm.dal.dataobject.purchase.SrmPurchaseInItemDO;
import cn.iocoder.yudao.module.srm.dal.dataobject.purchase.SrmPurchaseOrderItemDO;
import cn.iocoder.yudao.module.srm.dal.mysql.purchase.SrmPurchaseInItemMapper;
import cn.iocoder.yudao.module.srm.dal.mysql.purchase.SrmPurchaseInMapper;
import cn.iocoder.yudao.module.srm.dal.mysql.purchase.SrmPurchaseReturnItemMapper;
import cn.iocoder.yudao.module.srm.dal.redis.no.SrmNoRedisDAO;
import cn.iocoder.yudao.module.srm.enums.LogRecordConstants;
import cn.iocoder.yudao.module.srm.enums.SrmEventEnum;
import cn.iocoder.yudao.module.srm.enums.SrmPurchaseOrderSourceEnum;
import cn.iocoder.yudao.module.srm.enums.status.SrmAuditStatus;
import cn.iocoder.yudao.module.srm.enums.status.SrmPaymentStatus;
import cn.iocoder.yudao.module.srm.enums.status.SrmStorageStatus;
import cn.iocoder.yudao.module.srm.service.purchase.SrmPurchaseInService;
import cn.iocoder.yudao.module.srm.service.purchase.SrmPurchaseOrderService;
import cn.iocoder.yudao.module.system.enums.somle.BillType;
import cn.iocoder.yudao.module.wms.api.inbound.WmsInboundApi;
import cn.iocoder.yudao.module.wms.api.inbound.dto.WmsInboundSaveReqDTO;
import cn.iocoder.yudao.module.wms.enums.inbound.WmsInboundStatus;
import com.mzt.logapi.context.LogRecordContext;
import com.mzt.logapi.starter.annotation.LogRecord;
import jakarta.annotation.Resource;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import static cn.iocoder.yudao.framework.common.exception.util.ServiceExceptionUtil.exception;
import static cn.iocoder.yudao.framework.common.util.collection.CollectionUtils.*;
import static cn.iocoder.yudao.module.srm.enums.SrmErrorCodeConstants.*;
import static cn.iocoder.yudao.module.srm.enums.SrmEventEnum.PAYMENT_ADJUSTMENT;
import static cn.iocoder.yudao.module.srm.enums.SrmEventEnum.PAYMENT_INIT;
import static cn.iocoder.yudao.module.srm.enums.SrmStateMachines.*;

/**
 * ERP 采购入库 Service 实现类
 *
 * @author wdy
 */
@Service
@Validated
@Slf4j
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class SrmPurchaseInServiceImpl implements SrmPurchaseInService {

    private final SrmPurchaseInMapper purchaseInMapper;
    private final SrmPurchaseInItemMapper purchaseInItemMapper;
    private final ErpProductApi erpProductApi;
    private final SrmNoRedisDAO noRedisDAO;
    private final FmsAccountApi erpAccountApi;
    private final SrmPurchaseReturnItemMapper srmPurchaseReturnItemMapper;
    private final WmsInboundApi wmsInboundApi;
    @Resource
    @Lazy // 延迟加载，避免循环依赖
    SrmPurchaseOrderService purchaseOrderService;

    @Resource(name = PURCHASE_IN_AUDIT_STATE_MACHINE)
    private StateMachine<SrmAuditStatus, SrmEventEnum, SrmPurchaseInAuditReqVO> auditMachine;
    @Resource(name = PURCHASE_IN_PAYMENT_STATE_MACHINE)
    private StateMachine<SrmPaymentStatus, SrmEventEnum, SrmPurchaseInDO> paymentMachine;
    @Resource(name = PURCHASE_IN_ITEM_PAYMENT_STATE_MACHINE)
    private StateMachine<SrmPaymentStatus, SrmEventEnum, SrmPurchaseInItemDO> itemPaymentMachine;
    @Resource(name = PURCHASE_ORDER_ITEM_STORAGE_STATE_MACHINE_NAME)
    private StateMachine<SrmStorageStatus, SrmEventEnum, SrmOrderInCountDTO> orderItemStorageMachine;
    @Resource(name = PURCHASE_IN_AUDIT_STATE_MACHINE)
    private StateMachine<SrmAuditStatus, SrmEventEnum, SrmPurchaseInAuditReqVO> purchaseInAuditStateMachine;

    @Override
    @LogRecord(type = LogRecordConstants.SRM_PURCHASE_IN_TYPE,
            subType = LogRecordConstants.SRM_PURCHASE_IN_CREATE_SUB_TYPE,
            bizNo = "{{#id}}",
            extra = "{{#vo.code}}",
            success = LogRecordConstants.SRM_PURCHASE_IN_CREATE_SUCCESS)
    @Transactional(rollbackFor = Exception.class)
    public Long createPurchaseIn(@Validated SrmPurchaseInSaveReqVO vo) {
        //默认入库时间
        vo.setInTime(vo.getInTime() == null ? LocalDateTime.now() : vo.getInTime());
        // 1.2.1 校验到货项对应的采购项可入库数量是否充足。
        validatePurchaseOrderItemQty(vo.getItems());
        // 1.2 校验入库项的有效性
        List<SrmPurchaseInItemDO> purchaseInItems = validatePurchaseInItemsAndCopyProperty(vo.getItems());
        // 1.3 校验结算账户
//        erpAccountApi.validateAccount(vo.getAccountId());
        // 1.4 生成入库单号，并校验唯一性
        String no;
        if (vo.getCode() != null) {
            // 1.4.1 手动输入编号
            no = vo.getCode();
            validateAndUpdateCode(no, null);
        } else {
            // 1.4.2 自动生成编号
            no = noRedisDAO.generate(SrmNoRedisDAO.PURCHASE_IN_NO_PREFIX, PURCHASE_IN_NO_OUT_OF_BOUNDS);
            // 校验编号是否已存在
            ThrowUtil.ifThrow(purchaseInMapper.selectByNo(no) != null, PURCHASE_IN_NO_EXISTS);
        }

        // 2.1 插入入库
        SrmPurchaseInDO purchaseIn = BeanUtils.toBean(vo, SrmPurchaseInDO.class, in -> in.setCode(no));
        //计算总量、总价、总产品价、总税价、优惠金额、其它金额、支付金额
        calculateTotalPrice(purchaseIn, purchaseInItems);
        ThrowUtil.ifSqlThrow(purchaseInMapper.insert(purchaseIn), GlobalErrorCodeConstants.DB_INSERT_ERROR);
        // 2.2 插入入库项
        purchaseInItems.forEach(o -> o.setInId(purchaseIn.getId()));
        ThrowUtil.ifThrow(!purchaseInItemMapper.insertBatch(purchaseInItems), GlobalErrorCodeConstants.DB_BATCH_INSERT_ERROR);
        //3.0 设置初始化状态
        initMasterStatus(purchaseIn);
        initSlaveStatus(purchaseInItems);
        return purchaseIn.getId();
    }

    /**
     * 校验到货项对应的采购项可入库数量是否充足。
     *
     * @param voItems 采购入库项
     */
    private void validatePurchaseOrderItemQty(List<SrmPurchaseInSaveReqVO.Item> voItems) {
        if (CollUtil.isEmpty(voItems)) {
            return;
        }

        //1.0 订单项对应到货项未审核 -> e
        List<Long> orderItemIds = voItems.stream()
            .map(SrmPurchaseInSaveReqVO.Item::getOrderItemId)
            .distinct()
            .toList();

        // 1.1 批量获取入库项和入库单信息,减少数据库查询
        List<SrmPurchaseInItemDO> srmPurchaseInItemDOS = purchaseInItemMapper.selectListByOrderItemIds(orderItemIds);
        if (CollUtil.isNotEmpty(srmPurchaseInItemDOS)) {
            List<Long> inIds = srmPurchaseInItemDOS.stream().map(SrmPurchaseInItemDO::getInId).distinct().toList();
            // 批量查询入库单状态
            Map<Long, SrmPurchaseInDO> inMap = convertMap(purchaseInMapper.selectByIds(inIds), SrmPurchaseInDO::getId);

            // 获取订单项信息,用于异常提示
            Map<Long, SrmPurchaseOrderItemDO> orderItemMap = convertMap(
                purchaseOrderService.getPurchaseOrderItemList(orderItemIds),
                SrmPurchaseOrderItemDO::getId
            );

            // 校验入库单状态,并关联订单项信息
            srmPurchaseInItemDOS.stream()
                .filter(item -> {
                    SrmPurchaseInDO in = inMap.get(item.getInId());
                    return in != null && !Objects.equals(in.getAuditStatus(), SrmAuditStatus.APPROVED.getCode());
                })
                .findFirst()
                .ifPresent(item -> {
                    SrmPurchaseOrderItemDO orderItem = orderItemMap.get(item.getOrderItemId());
                    String orderItemInfo = orderItem != null ? String.format("订单项[%s-编号:%s]", orderItem.getProductName(), orderItem.getId()) : String.format("订单项ID[%s]", item.getOrderItemId());
                    SrmPurchaseInDO in = inMap.get(item.getInId());
                    throw exception(PURCHASE_IN_ITEM_ORDER_ITEM_NOT_AUDIT_PASS,
                        orderItemInfo, // 订单项信息
                        in.getCode()); // 到货单编号
                });
        }

        // 2.0 校验vo创建数量是否超过了采购订单的采购项可到货数量 voItem.qty >  (SrmPurchaseOrderItemDO.qty - SrmPurchaseOrderItemDO.inboundClosedQty) -> e
        // 2.1 批量获取采购订单项信息
        Map<Long, SrmPurchaseOrderItemDO> orderItemMap = convertMap(purchaseOrderService.getPurchaseOrderItemList(orderItemIds), SrmPurchaseOrderItemDO::getId);

        // 2.2 校验每个入库项的数量是否超过可入库数量
        for (SrmPurchaseInSaveReqVO.Item voItem : voItems) {
            // 2.2.1 校验采购订单项是否存在
            SrmPurchaseOrderItemDO orderItem = orderItemMap.get(voItem.getOrderItemId());
            if (orderItem == null) {
                throw exception(PURCHASE_ORDER_ITEM_NOT_EXISTS, voItem.getOrderItemId());
            }

            // 2.2.2 计算可到货数量 = 采购数量 - 已完成入库数量
            BigDecimal availableQty = orderItem.getQty().subtract(orderItem.getInboundClosedQty());

            // 2.2.3 校验当前到货数量是否超过可入库数量
            if (voItem.getQty().compareTo(availableQty) > 0) {
                throw exception(PURCHASE_IN_ITEM_QTY_EXCEED, orderItem.getId(), orderItem.getProductName(), availableQty, voItem.getQty());
            }
        }
    }

    private void initSlaveStatus(List<SrmPurchaseInItemDO> purchaseInItems) {
        for (SrmPurchaseInItemDO purchaseInItem : purchaseInItems) {
            itemPaymentMachine.fireEvent(SrmPaymentStatus.NONE_PAYMENT, SrmEventEnum.PAYMENT_INIT, purchaseInItem);
        }
    }

    private void initMasterStatus(SrmPurchaseInDO purchaseIn) {
        auditMachine.fireEvent(SrmAuditStatus.DRAFT, SrmEventEnum.AUDIT_INIT, SrmPurchaseInAuditReqVO.builder().inId(purchaseIn.getId()).build());
        paymentMachine.fireEvent(SrmPaymentStatus.NONE_PAYMENT, SrmEventEnum.PAYMENT_INIT, purchaseIn);
    }

    private void rollbackSlaveStatus(List<SrmPurchaseInItemDO> diffList) {
        for (SrmPurchaseInItemDO inItemDO : diffList) {
            Optional.ofNullable(inItemDO.getOrderItemId()).ifPresent(orderItemId -> {
                SrmPurchaseOrderItemDO orderItemDO = purchaseOrderService.validatePurchaseOrderItemExists(orderItemId);
                orderItemStorageMachine.fireEvent(SrmStorageStatus.fromCode(orderItemDO.getInStatus()),
                    SrmEventEnum.STOCK_ADJUSTMENT,
                        //取反数量
                    SrmOrderInCountDTO.builder().orderItemId(orderItemId).inCount(inItemDO.getQty().negate()).build());
            });
        }
    }

    //判断当前状态是否可以更新 方法
    private static void updateStatusCheck(SrmPurchaseInDO srmPurchaseInDO) {
        //1.1 不处于草稿、审核不通过、审核撤销 状态->e
        ThrowUtil.ifThrow(
            !SrmAuditStatus.DRAFT.getCode().equals(srmPurchaseInDO.getAuditStatus()) && !SrmAuditStatus.REJECTED.getCode()
                .equals(srmPurchaseInDO.getAuditStatus()) && !SrmAuditStatus.REVOKED.getCode()
                .equals(srmPurchaseInDO.getAuditStatus()), PURCHASE_IN_UPDATE_FAIL_APPROVE, srmPurchaseInDO.getCode(),
            SrmAuditStatus.fromCode(srmPurchaseInDO.getAuditStatus()).getDesc());
    }

    @Override
    @LogRecord(type = LogRecordConstants.SRM_PURCHASE_IN_TYPE,
            subType = LogRecordConstants.SRM_PURCHASE_IN_UPDATE_SUB_TYPE,
            bizNo = "{{#vo.id}}",
            extra = "{{#vo.code}}",
            success = LogRecordConstants.SRM_PURCHASE_IN_UPDATE_SUCCESS)
    @Transactional(rollbackFor = Exception.class)
    public void updatePurchaseIn(@Validated SrmPurchaseInSaveReqVO vo) {
        //默认入库时间
        vo.setInTime(vo.getInTime() == null ? LocalDateTime.now() : vo.getInTime());
        // 1.1 校验存在
        SrmPurchaseInDO purchaseIn = validatePurchaseInExists(vo.getId());
        // 1.2 校验采购到货审核状态可以修改
        updateStatusCheck(purchaseIn);
        // 1.3 校验结算账户
        erpAccountApi.validateAccount(vo.getAccountId());
        // 1.4 校验编号
        if (vo.getCode() != null && !vo.getCode().equals(purchaseIn.getCode())) {
            validateAndUpdateCode(vo.getCode(), purchaseIn.getCode());
        }
        // 1.5 校验订单项的有效性
        List<SrmPurchaseInItemDO> purchaseInItems = validatePurchaseInItemsAndCopyProperty(vo.getItems());
        // 1.6 如果vo和旧item不同,则校验订单项到货数量是否超过采购订单的采购项入库数量
        validQtyWhenUpdate(vo);

        // 2.1 更新入库
        SrmPurchaseInDO updateObj = BeanUtils.toBean(vo, SrmPurchaseInDO.class);
        calculateTotalPrice(updateObj, purchaseInItems);//合计
        purchaseInMapper.updateById(updateObj);
        // 2.2 更新入库项
        updatePurchaseInItemList(vo.getId(), purchaseInItems);
    }

    /**
     * 校验采购订单项的入库数量是否超过采购订单的采购项入库数量,在更新的时候
     *
     * @param vo SrmPurchaseInSaveReqVO
     */
    private void validQtyWhenUpdate(SrmPurchaseInSaveReqVO vo) {
        List<SrmPurchaseInItemDO> oldItems = purchaseInItemMapper.selectListByInId(vo.getId());
        if (CollUtil.isNotEmpty(oldItems)) {
            // 1.6.1 找出数量变更的项
            Map<Long, BigDecimal> oldItemMap = convertMap(oldItems, SrmPurchaseInItemDO::getOrderItemId, SrmPurchaseInItemDO::getQty);
            Map<Long, String> oldItemNameMap = convertMap(oldItems, SrmPurchaseInItemDO::getOrderItemId, SrmPurchaseInItemDO::getProductName);

            // 1.6.2 计算需要校验的增量项
            List<SrmPurchaseInSaveReqVO.Item> diffItems = vo.getItems().stream()
                .filter(voItem -> {
                    BigDecimal oldQty = oldItemMap.getOrDefault(voItem.getOrderItemId(), BigDecimal.ZERO);
                    return oldQty.compareTo(voItem.getQty()) < 0; // 只处理数量增加的项
                })
                .map(voItem -> {
                    BigDecimal oldQty = oldItemMap.getOrDefault(voItem.getOrderItemId(), BigDecimal.ZERO);
                    return new SrmPurchaseInSaveReqVO.Item()
                        .setId(voItem.getId())
                        .setOrderItemId(voItem.getOrderItemId())
                        .setProductName(oldItemNameMap.getOrDefault(voItem.getOrderItemId(), voItem.getProductName()))
                        .setQty(voItem.getQty().subtract(oldQty)); // 增量数量
                })
                .collect(Collectors.toList());

            // 1.6.3 校验变更后的数量是否超过可到货数量
            if (CollUtil.isNotEmpty(diffItems)) {
                validatePurchaseOrderItemQty(diffItems);
            }
        }
    }

    private void calculateTotalPrice(SrmPurchaseInDO purchaseIn, List<SrmPurchaseInItemDO> purchaseInItems) {
        purchaseIn.setTotalCount(getSumValue(purchaseInItems, SrmPurchaseInItemDO::getQty, BigDecimal::add));
        purchaseIn.setTotalProductPrice(getSumValue(purchaseInItems, SrmPurchaseInItemDO::getTotalPrice, BigDecimal::add, BigDecimal.ZERO));
        purchaseIn.setTotalTaxPrice(getSumValue(purchaseInItems, SrmPurchaseInItemDO::getTaxPrice, BigDecimal::add, BigDecimal.ZERO));
        purchaseIn.setTotalPrice(purchaseIn.getTotalProductPrice().add(purchaseIn.getTotalTaxPrice()));
        // 计算优惠价格
        if (purchaseIn.getDiscountPercent() == null) {
            purchaseIn.setDiscountPercent(BigDecimal.ZERO);
        }
        purchaseIn.setDiscountPrice(MoneyUtils.priceMultiplyPercent(purchaseIn.getTotalPrice(), purchaseIn.getDiscountPercent()));
        purchaseIn.setTotalPrice(purchaseIn.getTotalPrice().subtract(purchaseIn.getDiscountPrice()).add(purchaseIn.getOtherPrice()));
    }

    @Override
    public void updatePurchaseInPaymentPrice(Long id, BigDecimal paymentPrice) {
        SrmPurchaseInDO purchaseIn = purchaseInMapper.selectById(id);
        if (purchaseIn.getPaymentPrice().equals(paymentPrice)) {
            return;
        }
        if (paymentPrice.compareTo(purchaseIn.getTotalPrice()) > 0) {
            throw exception(PURCHASE_IN_FAIL_PAYMENT_PRICE_EXCEED, paymentPrice, purchaseIn.getTotalPrice());
        }
        purchaseInMapper.updateById(new SrmPurchaseInDO().setId(id).setPaymentPrice(paymentPrice));
    }

    //updatePurchaseInItemPaymentPrice
    public void updatePurchaseInItemPaymentPrice(Long id, BigDecimal paymentPrice) {
        SrmPurchaseInItemDO purchaseInItem = purchaseInItemMapper.selectById(id);
        if (purchaseInItem.getPayPrice().equals(paymentPrice)) {
            return;
        }
        if (paymentPrice.compareTo(purchaseInItem.getTotalPrice()) > 0) {
            throw exception(PURCHASE_IN_FAIL_PAYMENT_ITEM_PRICE_EXCEED, paymentPrice, purchaseInItem.getTotalPrice());
        }
        purchaseInItemMapper.updateById(new SrmPurchaseInItemDO().setId(id).setPayPrice(paymentPrice));
    }

    /**
     * 校验入库项+汇总金额，如果存在关联则复制对应属性
     *
     * @param voItems 入库项
     * @return SrmPurchaseInItemDOs
     */
    private List<SrmPurchaseInItemDO> validatePurchaseInItemsAndCopyProperty(List<SrmPurchaseInSaveReqVO.Item> voItems) {
        // 1.1 批量获取订单项,根据入库项的订单项id
        Map<Long, SrmPurchaseOrderItemDO> orderItemMap = convertMap(purchaseOrderService.getPurchaseOrderItemList(convertSet(voItems, SrmPurchaseInSaveReqVO.Item::getOrderItemId)), SrmPurchaseOrderItemDO::getId);
        //
        return convertList(voItems, voItem -> BeanUtils.toBean(voItem, SrmPurchaseInItemDO.class, inItemDO -> {
            //总价
            inItemDO.setTotalPrice(MoneyUtils.priceMultiply(inItemDO.getProductPrice(), inItemDO.getQty()));
            //税率
            if (inItemDO.getTaxPercent() != null && inItemDO.getTotalPrice() != null) {
                inItemDO.setTaxPrice(MoneyUtils.priceMultiplyPercent(inItemDO.getTotalPrice(), inItemDO.getTaxPercent()));
            }
            // 存在关联 -> 填充订单项字段
            Optional.ofNullable(inItemDO.getOrderItemId())
                .flatMap(orderItemId -> Optional.ofNullable(orderItemMap.get(orderItemId))).ifPresent(orderItemDO -> copyOrderItemToInItem(orderItemDO, inItemDO));
        }));
    }

    /**
     * 将订单项属性复制到入库项中
     *
     * @param orderItemDO 订单项
     * @param inItemDO    入库项
     */
    private void copyOrderItemToInItem(SrmPurchaseOrderItemDO orderItemDO, SrmPurchaseInItemDO inItemDO) {
        if (orderItemDO == null || inItemDO == null) {
            return;
        }
        // 复制产品相关信息
        inItemDO.setProductId(orderItemDO.getProductId());
        inItemDO.setProductUnitId(orderItemDO.getProductUnitId());
        inItemDO.setProductUnitName(orderItemDO.getProductUnitName());
        inItemDO.setProductPrice(orderItemDO.getProductPrice());
        inItemDO.setProductName(orderItemDO.getProductName());
        inItemDO.setDeclaredType(orderItemDO.getDeclaredType());
        inItemDO.setDeclaredTypeEn(orderItemDO.getDeclaredTypeEn());
        inItemDO.setXcode(orderItemDO.getXcode());
        inItemDO.setContainerRate(orderItemDO.getContainerRate());
        inItemDO.setBarCode(orderItemDO.getBarCode());

        //产品价格
        inItemDO.setActTaxPrice(orderItemDO.getActTaxPrice());
        // 复制税率相关
        inItemDO.setTaxPercent(orderItemDO.getTaxPercent());

        // 复制规格型号等信息
        // 不需要复制ID和入库单ID等字段，这些应该是新生成的
    }

    private void updatePurchaseInItemList(Long id, List<SrmPurchaseInItemDO> newList) {
        //1 对比列表
        List<SrmPurchaseInItemDO> oldList = purchaseInItemMapper.selectListByInId(id);
        List<List<SrmPurchaseInItemDO>> diffList = diffList(oldList, newList, // id 不同，就认为是不同的记录
            (oldVal, newVal) -> oldVal.getId().equals(newVal.getId()));

        //2 批量添加、修改、删除
        if (CollUtil.isNotEmpty(diffList.get(0))) {
            diffList.get(0).forEach(o -> {
                o.setInId(id);
                o.setSource(SrmPurchaseOrderSourceEnum.WEB_ENTRY.getDesc());
            });
            purchaseInItemMapper.insertBatch(diffList.get(0));
        }
        if (CollUtil.isNotEmpty(diffList.get(1))) {
            purchaseInItemMapper.updateBatch(diffList.get(1));
        }
        if (CollUtil.isNotEmpty(diffList.get(2))) {
            if (diffList.get(2) != null) {
                purchaseInItemMapper.deleteByIds(convertList(diffList.get(2), SrmPurchaseInItemDO::getId));
            }
        }
    }

    private void linkSlaveStatus(List<SrmPurchaseInItemDO> purchaseInItems) {
        //执行状态+入库状态
        for (SrmPurchaseInItemDO purchaseInItem : purchaseInItems) {
            //传递给订单项入库状态机 数量
            Optional.ofNullable(purchaseInItem.getOrderItemId()).ifPresent(orderItemId -> {//存在订单项
                //校验订单项是否存在
                SrmPurchaseOrderItemDO orderItemDO = purchaseOrderService.validatePurchaseOrderItemExists(orderItemId);
                //更新订单项入库数量+状态 入库状态机,创建入库单->增加入库数量
                orderItemStorageMachine.fireEvent(SrmStorageStatus.fromCode(orderItemDO.getInStatus()), SrmEventEnum.STOCK_ADJUSTMENT,
                    SrmOrderInCountDTO.builder().orderItemId(orderItemId)
                        //正数
                        .inCount(purchaseInItem.getQty()).build());
            });
        }
    }

    @Override
    @LogRecord(type = LogRecordConstants.SRM_PURCHASE_IN_TYPE,
            subType = LogRecordConstants.SRM_PURCHASE_IN_DELETE_SUB_TYPE,
            bizNo = "{{#ids[0]}}",
            extra = "{{#businessName}}",
            success = LogRecordConstants.SRM_PURCHASE_IN_DELETE_SUCCESS)
    @Transactional(rollbackFor = Exception.class)
    public void deletePurchaseIn(List<Long> ids) {
        // 获取业务名称用于日志记录
        List<SrmPurchaseInDO> ins = purchaseInMapper.selectByIds(ids);
        String businessName = CollUtil.join(ins.stream().map(SrmPurchaseInDO::getCode).collect(Collectors.toList()), ",");
        LogRecordContext.putVariable("businessName", businessName);
        
        // 1. 已审批->无法删除
        if (CollUtil.isEmpty(ins)) {
            return;
        }
        for (SrmPurchaseInDO inDO : ins) {
            //校验,入库项存在对应的退货项 -> 异常
            purchaseInItemMapper.selectListByInId(inDO.getId()).forEach(purchaseInItem -> {
                boolean b = srmPurchaseReturnItemMapper.existsByInItemId(purchaseInItem.getId());
                ThrowUtil.ifThrow(b, PURCHASE_IN_DELETE_FAIL, purchaseInItem.getId());
            });
        }

        //2. 联动回滚状态数量
        ins.forEach(purchaseIn -> {
            if (SrmAuditStatus.APPROVED.getCode().equals(purchaseIn.getAuditStatus())) {
                throw exception(PURCHASE_IN_DELETE_FAIL_APPROVE, purchaseIn.getCode());
            }
            rollbackSlaveStatus(purchaseInItemMapper.selectListByInId(purchaseIn.getId()));
        });
        // 2. 遍历删除，并记录操作日志
        ins.forEach(purchaseIn -> {
            // 2.1 删除订单
            purchaseInMapper.deleteById(purchaseIn.getId());
            // 2.2 删除订单项
            purchaseInItemMapper.deleteByInId(purchaseIn.getId());
        });
    }

    public SrmPurchaseInDO validatePurchaseInExists(Long id) {
        SrmPurchaseInDO purchaseIn = purchaseInMapper.selectById(id);
        if (purchaseIn == null) {
            throw exception(PURCHASE_IN_NOT_EXISTS);
        }
        return purchaseIn;
    }

    //验证入库项是否存在
    private SrmPurchaseInItemDO validatePurchaseInItemExists(Long id) {
        SrmPurchaseInItemDO purchaseInItem = purchaseInItemMapper.selectById(id);
        if (purchaseInItem == null) {
            throw exception(PURCHASE_IN_ITEM_NOT_EXISTS, id);
        }
        return purchaseInItem;
    }

    @Override
    public SrmPurchaseInDO getPurchaseIn(Long id) {
        return purchaseInMapper.selectById(id);
    }


    @Override
    public PageResult<SrmPurchaseInDO> getPurchaseInPage(SrmPurchaseInPageReqVO pageReqVO) {
        return purchaseInMapper.selectPage(pageReqVO);
    }

    // ==================== 采购入库项 ====================

    @Override
    public List<SrmPurchaseInItemDO> getPurchaseInItemListByInId(Long inId) {
        return purchaseInItemMapper.selectListByInId(inId);
    }

    @Override
    public List<SrmPurchaseInItemDO> getPurchaseInItemListByInIds(Collection<Long> inIds) {
        if (CollUtil.isEmpty(inIds)) {
            return Collections.emptyList();
        }
        return purchaseInItemMapper.selectListByInIds(inIds);
    }

    @Override
    public List<SrmPurchaseInItemDO> validatePurchaseInItemExists(List<Long> inIds) {
        if (CollUtil.isEmpty(inIds)) {
            return Collections.emptyList();
        }
        List<SrmPurchaseInItemDO> inItemDOS = purchaseInItemMapper.selectByIds(inIds);
        //检验是否和ids数量一致，报错未对应入库项
        if (inItemDOS.size() != inIds.size()) {
            throw exception(PURCHASE_IN_ITEM_NOT_EXISTS,
                CollUtil.subtract(inIds, CollUtil.newArrayList(inItemDOS.stream().map(SrmPurchaseInItemDO::getId).collect(Collectors.toSet()))));
        }
        return inItemDOS;
    }

    @Override
    @LogRecord(type = LogRecordConstants.SRM_PURCHASE_IN_TYPE,
            subType = LogRecordConstants.SRM_PURCHASE_IN_AUDIT_SUB_TYPE,
            bizNo = "{{#inIds[0]}}",
            extra = "{{#codes}}",
            success = LogRecordConstants.SRM_PURCHASE_IN_AUDIT_SUCCESS)
    public void submitAudit(Collection<Long> inIds) {
        // 获取单据编号用于日志记录
        List<SrmPurchaseInDO> ins = purchaseInMapper.selectByIds(inIds);
        String codes = CollUtil.join(ins.stream().map(SrmPurchaseInDO::getCode).collect(Collectors.toList()), ",");
        LogRecordContext.putVariable("codes", codes);
        
        for (Long inId : inIds) {
            SrmPurchaseInDO srmPurchaseInDO = validatePurchaseInExists(inId);
            purchaseInAuditStateMachine.fireEvent(SrmAuditStatus.fromCode(srmPurchaseInDO.getAuditStatus()), SrmEventEnum.SUBMIT_FOR_REVIEW,
                SrmPurchaseInAuditReqVO.builder().inId(inId).build());//提交审核
        }
    }

    @Override
    @LogRecord(type = LogRecordConstants.SRM_PURCHASE_IN_TYPE,
            subType = LogRecordConstants.SRM_PURCHASE_IN_SUBMIT_AUDIT_SUB_TYPE,
            bizNo = "{{#req.inId}}",
            extra = "{{#codes}}",
            success = LogRecordConstants.SRM_PURCHASE_IN_SUBMIT_AUDIT_SUCCESS)
    @Transactional(rollbackFor = Exception.class)
    public void review(SrmPurchaseInAuditReqVO req) {
        // 查询采购订单信息
        SrmPurchaseInDO inDO = validatePurchaseInExists(req.getInId());
        // 获取当前订单状态
        SrmAuditStatus currentStatus = SrmAuditStatus.fromCode(inDO.getAuditStatus());
        if (Boolean.TRUE.equals(req.getReviewed())) {
            // 审核操作
            if (req.getPass()) {
                log.debug("采购订单通过审核，ID: {}", inDO.getId());
                //联动状态
                auditMachine.fireEvent(currentStatus, SrmEventEnum.AGREE, req);
                linkSlaveStatus(purchaseInItemMapper.selectListByInId(inDO.getId()));
                //生成入库单
                generateInBoundData(inDO);
            } else {
                log.debug("采购订单拒绝审核，ID: {}", inDO.getId());
                auditMachine.fireEvent(currentStatus, SrmEventEnum.REJECT, req);
            }
        } else {
            //撤销审核
            //校验,入库项存在对应的退货项 -> 异常
            purchaseInItemMapper.selectListByInId(inDO.getId()).forEach(purchaseInItem -> {
                boolean b = srmPurchaseReturnItemMapper.existsByInItemId(purchaseInItem.getId());
                ThrowUtil.ifThrow(b, PURCHASE_IN_PROCESS_FAIL_RETURN_ITEM_EXISTS, purchaseInItem.getId());
            });

            // 1.3 校验已付款
            if (!Objects.equals(inDO.getPayStatus(), SrmPaymentStatus.NONE_PAYMENT.getCode())) {
                throw exception(PURCHASE_IN_PROCESS_FAIL_PAYMENT_STATUS);
            }
            //回滚状态
            rollbackSlaveStatus(purchaseInItemMapper.selectListByInId(inDO.getId()));
            log.debug("采购订单撤回审核，ID: {}", inDO.getId());
            auditMachine.fireEvent(currentStatus, SrmEventEnum.WITHDRAW_REVIEW, req);
            // 1.4 删除入库单
            //如果未入库(草稿)则 -> 作废删除，已入库-> e
            Optional.ofNullable(wmsInboundApi.getInboundList(BillType.WMS_INBOUND.getValue(), inDO.getId())).ifPresent(inbounds -> {
                inbounds.forEach(inbound -> {
                    if (Objects.equals(inbound.getInboundStatus(), WmsInboundStatus.NONE.getValue())) {
                        //TODO 未入库 -> 作废
//                        wmsInboundApi.deleteInbound(inDO.getId());
                    } else {
                        //已入库 -> 拒绝
                        throw exception(PURCHASE_IN_PROCESS_FAIL_IN_BOUND_EXISTS);
                    }
                });
            });
        }
    }

    //生成入库单
    private void generateInBoundData(SrmPurchaseInDO inDO) {
        wmsInboundApi.createInbound(
            WmsInboundSaveReqDTO.builder()
                .type(BillType.WMS_INBOUND.getValue())
                .upstreamBillType(BillType.SRM_PURCHASE_IN.getValue())
                .upstreamBillId(inDO.getId())
                .upstreamBillCode(inDO.getCode())
                //归属部门
                .traceNo(inDO.getCode())
                .build()
        );
    }

    @Override
    public void switchPayStatus(SrmPurchaseInPayReqVO vo) {
        //1.0 校验，已审核才可以
        List<Long> itemIds = vo.getItems().stream().map(SrmPurchaseInPayReqVO.Item::getId).distinct().toList();
        //map itemId:item
        Map<Long, SrmPurchaseInPayReqVO.Item> itemMap =
            vo.getItems().stream().collect(Collectors.toMap(SrmPurchaseInPayReqVO.Item::getId, Function.identity()));
        itemIds.stream().distinct().forEach(item -> {
            Long inId = purchaseInItemMapper.selectById(item).getInId();
            SrmPurchaseInDO purchaseInDO = purchaseInMapper.selectById(inId);
            ThrowUtil.ifThrow(!purchaseInDO.getAuditStatus().equals(SrmAuditStatus.APPROVED.getCode()), PURCHASE_IN_NOT_APPROVE, purchaseInDO.getCode());
        });

        itemIds.stream().distinct().forEach(inItemId -> {
            //校验
            SrmPurchaseInItemDO inItemDO = validatePurchaseInItemExists(inItemId);
            if (vo.getPass()) {
                updatePurchaseInItemPaymentPrice(inItemDO.getInId(), itemMap.get(inItemId).getPayPrice());
            } else {
                updatePurchaseInItemPaymentPrice(inItemDO.getInId(), BigDecimal.ZERO);
            }
            if (inItemDO.getPayStatus() == null) {
                itemPaymentMachine.fireEvent(SrmPaymentStatus.NONE_PAYMENT, PAYMENT_INIT, inItemDO);
            } else {
                //付款金额调整
                updatePurchaseInItemPaymentPrice(inItemDO.getInId(), itemMap.get(inItemId).getPayPrice());
                itemPaymentMachine.fireEvent(SrmPaymentStatus.fromCode(inItemDO.getPayStatus()), PAYMENT_ADJUSTMENT, inItemDO);
            }
        });
    }

    /**
     * 校验并更新编号
     *
     * @param newCode 新编号
     * @param oldCode 旧编号
     */
    private void validateAndUpdateCode(String newCode, String oldCode) {
        // 校验编号是否已存在
        if (purchaseInMapper.selectByNo(newCode) != null) {
            throw exception(PURCHASE_IN_NO_EXISTS);
        }
        // 校验是否是当日的编号
        String today = DateUtil.format(LocalDateTime.now(), DatePattern.PURE_DATE_PATTERN);
        if (!newCode.contains(today)) {
            throw exception(PURCHASE_IN_CODE_NOT_TODAY);
        }
        // 更新 Redis 中的最大编号
        noRedisDAO.setManualSerial(SrmNoRedisDAO.PURCHASE_IN_NO_PREFIX, newCode);
    }
}