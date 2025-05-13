package cn.iocoder.yudao.module.srm.config.purchase.in.impl.action.item;

import cn.iocoder.yudao.framework.cola.statemachine.Action;
import cn.iocoder.yudao.module.srm.api.purchase.in.SrmPuchaseInCountDTO;
import cn.iocoder.yudao.module.srm.dal.dataobject.purchase.SrmPurchaseInItemDO;
import cn.iocoder.yudao.module.srm.dal.mysql.purchase.SrmPurchaseInItemMapper;
import cn.iocoder.yudao.module.srm.enums.SrmEventEnum;
import cn.iocoder.yudao.module.srm.enums.status.SrmStorageStatus;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

/**
 * 更改item实际入库数量+入库状态
 */
@Slf4j
@Component
public class inItemActionImpl implements Action<SrmStorageStatus, SrmEventEnum, SrmPuchaseInCountDTO> {
    @Autowired
    private SrmPurchaseInItemMapper srmPurchaseInItemMapper;

    @Override
    public void execute(SrmStorageStatus from, SrmStorageStatus to, SrmEventEnum event, SrmPuchaseInCountDTO context) {
        SrmPurchaseInItemDO srmPurchaseInItemDO = srmPurchaseInItemMapper.selectById(context.getInItemId());

        //调整库存
        if (event == SrmEventEnum.ORDER_ADJUSTMENT) {
            BigDecimal oldActualQty = srmPurchaseInItemDO.getActualQty(); // 原实际入库数量
            BigDecimal changeActualQty = context.getInCount() == null ? BigDecimal.ZERO : context.getInCount(); // 变更数量
            BigDecimal finalActualQty = oldActualQty.add(changeActualQty); // 最终实际入库数量
            BigDecimal qty = srmPurchaseInItemDO.getQty(); // 计划入库数量
            //qty == actualQty to为ALL_IN_STORAGE 完全入库
            //qty > actualQty to为PARTIALLY_IN_STORAGE 部分入库
            if (finalActualQty.compareTo(qty) >= 0) {
                // 实际入库数量大于等于计划数量,完全入库
                to = SrmStorageStatus.ALL_IN_STORAGE;
            } else if (finalActualQty.compareTo(BigDecimal.ZERO) > 0) {
                // 实际入库数量大于0但小于计划数量,部分入库
                to = SrmStorageStatus.PARTIALLY_IN_STORAGE;
            } else {
                // 实际入库数量为0,未入库
                to = SrmStorageStatus.NONE_IN_STORAGE;
            }

            //  更新数据库中的实际入库数量
            srmPurchaseInItemDO.setActualQty(finalActualQty);
        }


        //
        srmPurchaseInItemMapper.updateById(srmPurchaseInItemDO.setInStatus(to.getCode()));

        if (event != SrmEventEnum.ORDER_INIT) {
            //TODO 传递事件给订单项

        }
    }
}
