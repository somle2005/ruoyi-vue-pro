package cn.iocoder.yudao.module.wms.api.outbound;

import cn.iocoder.yudao.framework.common.util.collection.CollectionUtils;
import cn.iocoder.yudao.framework.common.util.collection.StreamX;
import cn.iocoder.yudao.framework.common.util.object.BeanUtils;
import cn.iocoder.yudao.module.system.enums.somle.BillType;
import cn.iocoder.yudao.module.wms.controller.admin.approval.history.vo.WmsApprovalReqVO;
import cn.iocoder.yudao.module.wms.controller.admin.outbound.item.vo.WmsOutboundItemSaveReqVO;
import cn.iocoder.yudao.module.wms.controller.admin.outbound.vo.WmsOutboundSaveReqVO;
import cn.iocoder.yudao.module.wms.dal.dataobject.inbound.item.WmsInboundItemBinQueryDO;
import cn.iocoder.yudao.module.wms.dal.dataobject.outbound.WmsOutboundDO;
import cn.iocoder.yudao.module.wms.enums.api.outbound.WmsOutboundApi;
import cn.iocoder.yudao.module.wms.enums.api.outbound.dto.WmsOutboundDTO;
import cn.iocoder.yudao.module.wms.enums.api.outbound.dto.WmsOutboundSaveReqDTO;
import cn.iocoder.yudao.module.wms.enums.outbound.WmsOutboundAuditStatus;
import cn.iocoder.yudao.module.wms.service.inbound.item.WmsInboundItemService;
import cn.iocoder.yudao.module.wms.service.outbound.WmsOutboundService;
import jakarta.annotation.Resource;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * @author: LeeFJ
 * @date: 2025/4/28 17:03
 * @description: 入库单 API 实现
 */
@Service
public class WmsOutboundApiImpl implements WmsOutboundApi {

    @Resource
    @Lazy
    private WmsOutboundService outboundService;

    @Resource
    @Lazy
    private WmsInboundItemService inboundItemService;

    public Long createOutbound(WmsOutboundSaveReqDTO createReqDTO) {

        BillType billType = BillType.parse(createReqDTO.getUpstreamBillType());
        WmsOutboundSaveReqVO createReqVO = BeanUtils.toBean(createReqDTO, WmsOutboundSaveReqVO.class);
        // 如果是头程单，处理
        if(billType==BillType.TMS_FIRST_MILE) {
            processFirstMileVO(createReqVO);
        }
        WmsOutboundDO outboundDO = outboundService.createOutbound(createReqVO);

        WmsApprovalReqVO approvalReqVO = new WmsApprovalReqVO();
        approvalReqVO.setBillId(outboundDO.getId());


        if(billType==BillType.TMS_FIRST_MILE) {
            approvalReqVO.setComment("头程出库");
            outboundService.approve(WmsOutboundAuditStatus.Event.SUBMIT, approvalReqVO);
            outboundService.approve(WmsOutboundAuditStatus.Event.AGREE, approvalReqVO);
            outboundService.approve(WmsOutboundAuditStatus.Event.FINISH, approvalReqVO);
        }

        return outboundDO.getId();
    }

    private void processFirstMileVO(WmsOutboundSaveReqVO createReqVO) {

        List<WmsOutboundItemSaveReqVO> processedList = new ArrayList<>();
        Map<Long, List<WmsInboundItemBinQueryDO>> binMap = inboundItemService.selectInboundItemBinMap(createReqVO.getWarehouseId(), StreamX.from(createReqVO.getItemList()).toSet(WmsOutboundItemSaveReqVO::getProductId), true);
        for (WmsOutboundItemSaveReqVO outboundItemSaveReqVO : createReqVO.getItemList()) {
            List<WmsInboundItemBinQueryDO> binList = binMap.get(outboundItemSaveReqVO.getProductId());
            if(CollectionUtils.isEmpty(binList)) {
                // 异常
            }
            binList=binList.stream().filter(wmsInboundItemBinQueryDO -> Objects.equals(wmsInboundItemBinQueryDO.getDeptId(),outboundItemSaveReqVO.getDeptId())).toList();
            if(CollectionUtils.isEmpty(binList)) {
                // 异常
            }
            Integer leftQty=outboundItemSaveReqVO.getActualQty();
            Integer qty = -1;
            for (WmsInboundItemBinQueryDO wmsInboundItemBinQueryDO : binList) {
                WmsOutboundItemSaveReqVO saveReqVO=BeanUtils.toBean(outboundItemSaveReqVO, WmsOutboundItemSaveReqVO.class);
                // 剩余出库量大于仓位可售库存
                if(leftQty>wmsInboundItemBinQueryDO.getBinSellableQty()) {
                    qty=wmsInboundItemBinQueryDO.getBinSellableQty();
                    leftQty-=qty;
                    saveReqVO.setPlanQty(qty);
                    saveReqVO.setActualQty(qty);
                    saveReqVO.setBinId(wmsInboundItemBinQueryDO.getBinId());
                    saveReqVO.setDeptId(wmsInboundItemBinQueryDO.getInboundDeptId());
                    saveReqVO.setCompanyId(wmsInboundItemBinQueryDO.getInboundCompanyId());
                    processedList.add(saveReqVO);
                } else {
                    qty=leftQty;
                    saveReqVO.setPlanQty(qty);
                    saveReqVO.setActualQty(qty);
                    saveReqVO.setBinId(wmsInboundItemBinQueryDO.getBinId());
                    saveReqVO.setDeptId(wmsInboundItemBinQueryDO.getInboundDeptId());
                    saveReqVO.setCompanyId(wmsInboundItemBinQueryDO.getInboundCompanyId());
                    processedList.add(saveReqVO);
                    break;
                }

            }
            if(leftQty>0) {
                // 异常 货不够
            }


        }

        createReqVO.setItemList(processedList);

    }

    @Override
    public WmsOutboundDTO getOutbound(Long id) {
        WmsOutboundDO outboundDO = outboundService.getOutbound(id);
        return BeanUtils.toBean(outboundDO, WmsOutboundDTO.class);
    }

    @Override
    public List<WmsOutboundDTO> getOutboundList(Integer upstreamBillType, Long upstreamBillId) {
        List<WmsOutboundDO> outboundList = outboundService.getOutboundList(upstreamBillType, upstreamBillId);
        return BeanUtils.toBean(outboundList, WmsOutboundDTO.class);
    }


    /**
     * 出库单作废
     **/
    public void abandonOutbound(Long id,String comment) {
        WmsApprovalReqVO approvalReqVO = new WmsApprovalReqVO();
        approvalReqVO.setBillId(id);
        approvalReqVO.setComment(comment);
        outboundService.approve(WmsOutboundAuditStatus.Event.ABANDON, approvalReqVO);
    }

}
