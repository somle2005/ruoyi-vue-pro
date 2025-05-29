package cn.iocoder.yudao.module.wms.service.outbound.transition;



import cn.iocoder.yudao.framework.cola.statemachine.builder.TransitionContext;
import cn.iocoder.yudao.framework.common.util.object.BeanUtils;
import cn.iocoder.yudao.module.srm.api.purchase.SrmPurchaseReturnApi;
import cn.iocoder.yudao.module.srm.api.purchase.dto.wms.SrmOutboundItemReqDTO;
import cn.iocoder.yudao.module.srm.api.purchase.dto.wms.SrmOutboundReqDTO;
import cn.iocoder.yudao.module.system.enums.somle.BillType;
import cn.iocoder.yudao.module.tms.api.transfer.TmsTransferApi;
import cn.iocoder.yudao.module.tms.api.transfer.dto.TmsOutboundItemReqDTO;
import cn.iocoder.yudao.module.tms.api.transfer.dto.TmsOutboundReqDTO;
import cn.iocoder.yudao.module.wms.controller.admin.outbound.vo.WmsOutboundRespVO;
import cn.iocoder.yudao.module.wms.dal.dataobject.outbound.WmsOutboundDO;
import cn.iocoder.yudao.module.wms.enums.outbound.WmsOutboundAuditStatus;
import cn.iocoder.yudao.module.wms.service.quantity.OutboundSubmitExecutor;
import cn.iocoder.yudao.module.wms.service.quantity.context.OutboundContext;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Component;


/**
 * @author: LeeFJ
 * @date: 2025/3/31 16:25
 * @description: 同意
 */
@Component
public class OutboundAgreeTransitionHandler extends BaseOutboundTransitionHandler {

    @Resource
    private OutboundSubmitExecutor outboundSubmitExecutor;

    @Resource
    private SrmPurchaseReturnApi srmPurchaseReturnApi;

    @Resource
    private TmsTransferApi tmsTransferApi;

    @Override
    public void perform(Integer from, Integer to, WmsOutboundAuditStatus.Event event, TransitionContext<WmsOutboundDO> context) {
        super.perform(from, to, event, context);
        // 调整库存
        OutboundContext outboundContext = new OutboundContext();
        outboundContext.setOutboundId(context.data().getId());
        outboundSubmitExecutor.execute(outboundContext);
        WmsOutboundRespVO outboundVO = outboundService.getOutboundWithItemList(context.data().getId());
        //更新SRM退货状态机
        if(outboundVO.getUpstreamBillType()!=null && outboundVO.getUpstreamBillType().equals(BillType.SRM_PURCHASE_RETURN.getValue())) {
            SrmOutboundReqDTO srmOutboundReqDTO = BeanUtils.toBean(outboundVO, SrmOutboundReqDTO.class);
            srmOutboundReqDTO.setItems(BeanUtils.toBean(outboundVO.getItemList(), SrmOutboundItemReqDTO.class));
                srmPurchaseReturnApi.updatePurchaseReturnItemQty(srmOutboundReqDTO);
        }
        //更新TMS调拨单状态机
        if(outboundVO.getUpstreamBillType()!=null && outboundVO.getUpstreamBillType().equals(BillType.TMS_TRANSFER.getValue())) {
            TmsOutboundReqDTO tmsOutboundReqDTO = BeanUtils.toBean(outboundVO, TmsOutboundReqDTO.class);
            tmsOutboundReqDTO.setItems(BeanUtils.toBean(outboundVO.getItemList(), TmsOutboundItemReqDTO.class));
            tmsTransferApi.afterOutboundAudit(tmsOutboundReqDTO);
        }
    }
}
