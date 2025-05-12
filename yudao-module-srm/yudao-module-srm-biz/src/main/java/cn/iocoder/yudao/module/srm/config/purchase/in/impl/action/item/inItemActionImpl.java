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
            BigDecimal oldActualQty = srmPurchaseInItemDO.getActualQty();
            BigDecimal changeActualQty = context.getInCount() == null ? BigDecimal.ZERO : context.getInCount();
            BigDecimal finalActualQty = oldActualQty.add(changeActualQty);
            srmPurchaseInItemDO.setActualQty(finalActualQty);
        }


        //
        srmPurchaseInItemMapper.updateById(srmPurchaseInItemDO.setInStatus(to.getCode()));
    }
}
