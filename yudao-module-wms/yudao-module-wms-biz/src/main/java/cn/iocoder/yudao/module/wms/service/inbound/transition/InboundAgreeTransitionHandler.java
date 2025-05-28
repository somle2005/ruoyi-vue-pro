package cn.iocoder.yudao.module.wms.service.inbound.transition;

/**
 * @author: LeeFJ
 * @date: 2025/3/31 16:14
 * @description: 同意
 */

import cn.iocoder.yudao.framework.cola.statemachine.builder.TransitionContext;
import cn.iocoder.yudao.framework.common.util.object.BeanUtils;
import cn.iocoder.yudao.module.srm.api.purchase.SrmPurchaseInApi;
import cn.iocoder.yudao.module.srm.api.purchase.dto.wms.SrmInboundReqDTO;
import cn.iocoder.yudao.module.system.enums.somle.BillType;
import cn.iocoder.yudao.module.wms.controller.admin.inbound.item.vo.WmsInboundItemRespVO;
import cn.iocoder.yudao.module.wms.controller.admin.inbound.vo.WmsInboundRespVO;
import cn.iocoder.yudao.module.wms.controller.admin.outbound.item.vo.WmsOutboundItemRespVO;
import cn.iocoder.yudao.module.wms.controller.admin.outbound.vo.WmsOutboundRespVO;
import cn.iocoder.yudao.module.wms.dal.dataobject.inbound.WmsInboundDO;
import cn.iocoder.yudao.module.wms.enums.inbound.WmsInboundAuditStatus;
import cn.iocoder.yudao.module.wms.service.quantity.InboundExecutor;
import cn.iocoder.yudao.module.wms.service.quantity.context.InboundContext;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public class InboundAgreeTransitionHandler extends BaseInboundTransitionHandler {

    @Resource
    private InboundExecutor inboundExecutor;

    @Resource
    private SrmPurchaseInApi srmPurchaseInApi;

    @Override
    public void perform(Integer from, Integer to, WmsInboundAuditStatus.Event event, TransitionContext<WmsInboundDO> context) {
        super.perform(from, to, event, context);
        // 调整库存
        InboundContext inboundContext=new InboundContext();
        inboundContext.setInboundId(context.data().getId());
        inboundExecutor.execute(inboundContext);
        //获取入库单
        WmsInboundRespVO inboundVO = inboundService.getInboundWithItemList(context.data().getId());
        List<WmsInboundItemRespVO> itemList = inboundVO.getItemList();
        //处理到货单逻辑
        if (inboundVO.getUpstreamBillType() != null && inboundVO.getUpstreamBillType().equals(BillType.SRM_PURCHASE_IN.getValue())) {
            //触发到货单明细行 状态机
            //如果成功创建入库单-触发SRM入库数量联动
            SrmInboundReqDTO reqDTO = BeanUtils.toBean(inboundVO, SrmInboundReqDTO.class);
            srmPurchaseInApi.updatePurchaseInItemQty(reqDTO);
        }

    }
}
