package cn.iocoder.yudao.module.wms.api.outbound;

import cn.iocoder.yudao.framework.common.util.object.BeanUtils;
import cn.iocoder.yudao.module.wms.controller.admin.outbound.vo.WmsOutboundSaveReqVO;
import cn.iocoder.yudao.module.wms.dal.dataobject.outbound.WmsOutboundDO;
import cn.iocoder.yudao.module.wms.enums.api.outbound.WmsOutboundApi;
import cn.iocoder.yudao.module.wms.enums.api.outbound.dto.WmsOutboundDTO;
import cn.iocoder.yudao.module.wms.enums.api.outbound.dto.WmsOutboundSaveReqDTO;
import cn.iocoder.yudao.module.wms.service.outbound.WmsOutboundService;
import jakarta.annotation.Resource;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import java.util.List;

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

    public Long createOutbound(WmsOutboundSaveReqDTO createReqDTO) {
        WmsOutboundSaveReqVO createReqVO = BeanUtils.toBean(createReqDTO, WmsOutboundSaveReqVO.class);
        WmsOutboundDO outboundDO = outboundService.createOutbound(createReqVO);
        return outboundDO.getId();
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

}
