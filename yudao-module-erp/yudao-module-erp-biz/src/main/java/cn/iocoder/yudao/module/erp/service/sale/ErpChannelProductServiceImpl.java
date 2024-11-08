package cn.iocoder.yudao.module.erp.service.sale;

import cn.hutool.core.collection.CollUtil;
import cn.iocoder.yudao.framework.common.exception.util.ThrowUtil;
import cn.iocoder.yudao.module.erp.controller.admin.sale.vo.channel.product.ErpChannelProductSaveReqVO;
import cn.iocoder.yudao.module.erp.dal.mysql.sale.ErpChannelProductMapper;
import org.springframework.stereotype.Service;
import jakarta.annotation.Resource;
import org.springframework.validation.annotation.Validated;
import java.util.*;
import cn.iocoder.yudao.module.erp.controller.admin.sale.vo.channel.product.ErpChannelProductPageReqVO;
import cn.iocoder.yudao.module.erp.dal.dataobject.sale.ErpChannelProductDO;
import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.common.util.object.BeanUtils;

import static cn.iocoder.yudao.framework.common.exception.enums.GlobalErrorCodeConstants.*;
import static cn.iocoder.yudao.framework.common.exception.util.ServiceExceptionUtil.exception;
import static cn.iocoder.yudao.module.erp.enums.ErrorCodeConstants.CHANNEL_EXISTS;
import static cn.iocoder.yudao.module.erp.enums.ErrorCodeConstants.CHANNEL_PRODUCT_NOT_EXISTS;

/**
 * ERP 渠道平台产品 Service 实现类
 *
 * @author 王奇辉
 */
@Service
@Validated
public class ErpChannelProductServiceImpl implements ErpChannelProductService {

    @Resource
    private ErpChannelProductMapper channelProductMapper;

    @Override
    public Long createChannelProduct(ErpChannelProductSaveReqVO createReqVO) {
        // 校验唯一性
        validateChannelProductUnique(null,createReqVO.getName(),createReqVO.getCode());
        // 插入
        ErpChannelProductDO channelProduct = BeanUtils.toBean(createReqVO, ErpChannelProductDO.class);
        ThrowUtil.ifSqlThrow(channelProductMapper.insert(channelProduct),DB_INSERT_ERROR);
        // 返回
        return channelProduct.getId();
    }

    @Override
    public void updateChannelProduct(ErpChannelProductSaveReqVO updateReqVO) {
        Long id = updateReqVO.getId();
        // 校验唯一性
        validateChannelProductUnique(id,updateReqVO.getName(),updateReqVO.getCode());
        // 校验存在
        validateChannelProductExists(id);
        // 更新
        ErpChannelProductDO updateObj = BeanUtils.toBean(updateReqVO, ErpChannelProductDO.class);
        ThrowUtil.ifSqlThrow(channelProductMapper.updateById(updateObj),DB_UPDATE_ERROR);
    }

    private void validateChannelProductUnique(Long id, String name, String code) {
        //校验名称是否重复 || 编码是否重复
        List<ErpChannelProductDO> channels = channelProductMapper.selectByParentIdAndNameOrCode(name,code);
        if (CollUtil.isEmpty(channels)) {
            return;
        }
        // 如果 id 为空，说明不用比较是否为相同 id 的部门
        ThrowUtil.ifEmptyThrow(id,CHANNEL_EXISTS);
        ThrowUtil.ifThrow(!channels.stream().allMatch(i->Objects.equals(i.getId(), id)),CHANNEL_EXISTS);
    }

    @Override
    public void deleteChannelProduct(Long id) {
        // 校验存在
        validateChannelProductExists(id);
        // 删除
        ThrowUtil.ifSqlThrow(channelProductMapper.deleteById(id),DB_DELETE_ERROR);
    }

    private void validateChannelProductExists(Long id) {
        if (channelProductMapper.selectById(id) == null) {
            throw exception(CHANNEL_PRODUCT_NOT_EXISTS);
        }
    }

    @Override
    public ErpChannelProductDO getChannelProduct(Long id) {
        return channelProductMapper.selectById(id);
    }

    @Override
    public PageResult<ErpChannelProductDO> getChannelProductPage(ErpChannelProductPageReqVO pageReqVO) {
        return channelProductMapper.selectPage(pageReqVO);
    }

}