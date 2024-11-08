package cn.iocoder.yudao.module.erp.service.sale;

import cn.hutool.core.collection.CollUtil;
import cn.iocoder.yudao.framework.common.exception.util.ThrowUtil;
import cn.iocoder.yudao.framework.mybatis.core.dataobject.BaseDO;
import cn.iocoder.yudao.module.erp.controller.admin.sale.vo.channel.ErpChannelListReqVO;
import cn.iocoder.yudao.module.erp.controller.admin.sale.vo.channel.ErpChannelSaveReqVO;
import cn.iocoder.yudao.module.erp.dal.dataobject.sale.ErpChannelDO;
import cn.iocoder.yudao.module.erp.dal.dataobject.sale.ErpChannelProductDO;
import cn.iocoder.yudao.module.erp.dal.mysql.sale.ErpChannelMapper;
import cn.iocoder.yudao.module.erp.dal.mysql.sale.ErpChannelProductMapper;
import org.springframework.stereotype.Service;
import jakarta.annotation.Resource;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;
import cn.iocoder.yudao.framework.common.util.object.BeanUtils;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

import static cn.iocoder.yudao.framework.common.exception.enums.GlobalErrorCodeConstants.*;
import static cn.iocoder.yudao.framework.common.exception.util.ServiceExceptionUtil.exception;
import static cn.iocoder.yudao.module.erp.enums.ErrorCodeConstants.*;

/**
 * ERP 渠道 Service 实现类
 *
 * @author 王奇辉
 */
@Service
@Validated
public class ErpChannelServiceImpl implements ErpChannelService {

    @Resource
    private ErpChannelMapper channelMapper;
    @Resource
    private ErpChannelProductMapper channelProductMapper;

    @Override
    public Long createChannel(ErpChannelSaveReqVO createReqVO) {
        // 校验父渠道的有效性
        validateParentChannel(null, createReqVO.getParentId());
        // 校验渠道名的唯一性
        validateChannelNameUnique(null,createReqVO.getName(),createReqVO.getCode());
        // 插入
        ErpChannelDO channel = BeanUtils.toBean(createReqVO, ErpChannelDO.class);
        ThrowUtil.ifSqlThrow(channelMapper.insert(channel), DB_INSERT_ERROR);
        // 返回
        return channel.getId();
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public void updateChannel(ErpChannelSaveReqVO updateReqVO) {
        Long id = updateReqVO.getId();
        Long parentId = updateReqVO.getParentId();
        // 校验存在
        ErpChannelDO erpChannelDO = validateChannelExists(id);
        // 校验父渠道的有效性
        validateParentChannel(id, parentId);
        // 校验渠道名的唯一性
        validateChannelNameUnique(id,updateReqVO.getName(),updateReqVO.getCode());
        // 更新
        ErpChannelDO updateObj = BeanUtils.toBean(updateReqVO, ErpChannelDO.class);
        //获取原状态
        boolean oldStatus = erpChannelDO.getStatus();
        //获取新状态
        boolean newStatus = updateReqVO.getStatus();
        if (!Objects.equals(oldStatus,newStatus)){
            //判断是否存在父渠道，并且是关闭的
            if(!Objects.equals(parentId, ErpChannelDO.PARENT_ID_ROOT)){
                ErpChannelDO erpParentChannelDO = channelMapper.selectById(parentId);
                ThrowUtil.ifThrow(Objects.equals(erpParentChannelDO.getStatus(),false),CHANNEL_PARENT_STATUS_NOT_ENABLE);
            }
            //获取所有的子渠道
            List<ErpChannelDO> children = getAllChildChannel(id,new ArrayList<>());
            //过滤掉与父渠道相同状态的渠道
            children = children.stream().filter(c->!Objects.equals(c.getStatus(),newStatus)).toList();
            if (CollUtil.isNotEmpty(children)){
                //修改子渠道状态
                children.forEach(c->c.setStatus(newStatus));
                //更新所有子渠道的状态
                ThrowUtil.ifThrow(!channelMapper.updateBatch(children),DB_UPDATE_ERROR);
            }
        }
        ThrowUtil.ifSqlThrow(channelMapper.updateById(updateObj),DB_UPDATE_ERROR);
    }

    /**
    * @Author Wqh
    * @Description 递归获取所有的子孙渠道
    * @Date 14:12 2024/11/7
    * @Param [parentId, list]
    * @return java.util.List<cn.iocoder.yudao.module.erp.dal.dataobject.sale.ErpChannelDO>
    **/
    private List<ErpChannelDO> getAllChildChannel(Long parentId,List<ErpChannelDO> list) {
        List<ErpChannelDO> children = channelMapper.selectByParentId(parentId);
        if (CollUtil.isNotEmpty(children)){
            for (ErpChannelDO c : children){
                list.add(c);
                getAllChildChannel(c.getId(),list);
            }
        }
        return list;
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public void deleteChannel(Long id) {
        // 校验存在
        validateChannelExists(id);
        //判断是否存在子渠道
        ThrowUtil.ifThrow(channelMapper.selectCountByParentId(id) > 0,CHANNEL_EXISTS_CHILD);
        //判断该渠道是否被平台渠道关联
        List<ErpChannelProductDO> channelProductList = channelProductMapper.selectListByChannelId(id);
        ThrowUtil.ifThrow(CollUtil.isNotEmpty(channelProductList),CHANNEL_EXISTS_PRODUCT);
        // 删除
        ThrowUtil.ifSqlThrow(channelMapper.deleteById(id),DB_DELETE_ERROR);
    }

    @Override
    public ErpChannelDO getChannel(Long id) {
        return channelMapper.selectById(id);
    }

    @Override
    public List<ErpChannelDO> getChannelList(ErpChannelListReqVO erpChannelListReqVO) {
        List<ErpChannelDO> list = channelMapper.selectList(erpChannelListReqVO);
        list.sort(Comparator.comparing(BaseDO::getCreateTime).reversed());
        return list;
    }

    private ErpChannelDO validateChannelExists(Long id) {
        ErpChannelDO erpChannelDO = channelMapper.selectById(id);
        ThrowUtil.ifEmptyThrow(erpChannelDO,CHANNEL_NOT_EXISTS);
        return erpChannelDO;
    }

    private void validateChannelNameUnique(Long id, String name,String code) {
        //校验渠道名称是否重复 || 渠道编码是否重复
        List<ErpChannelDO> channels = channelMapper.selectByParentIdAndNameOrCode(name,code);
        if (CollUtil.isEmpty(channels)) {
            return;
        }
        // 如果 id 为空，说明不用比较是否为相同 id 的部门
        ThrowUtil.ifEmptyThrow(id,CHANNEL_EXISTS);
        ThrowUtil.ifThrow(!channels.stream().allMatch(i->Objects.equals(i.getId(), id)),CHANNEL_EXISTS);
    }

    private void validateParentChannel(Long id, Long parentId) {
        if (parentId == null || ErpChannelDO.PARENT_ID_ROOT.equals(parentId)) {
            return;
        }
        // 1. 不能设置自己为父渠道
        if (Objects.equals(id, parentId)) {
            throw exception(CHANNEL_NOT_SELF_PARENT);
        }
        // 2. 父渠道不存在
        ErpChannelDO parentChannel = channelMapper.selectById(parentId);
        ThrowUtil.ifEmptyThrow(parentChannel, CHANNEL_PARENT_NOT_EXISTS);
        // 3. 递归校验父渠道，如果父渠道是自己的子渠道，则报错，避免形成环路
        // id 为空，说明新增，不需要考虑环路
        if (id == null) {
            return;
        }
        for (int i = 0; i < Short.MAX_VALUE; i++) {
            // 3.1 校验环路
            parentId = parentChannel.getParentId();
            ThrowUtil.ifThrow(Objects.equals(id, parentId),CHANNEL_PARENT_IS_SELF_CHILD);
            // 3.2 继续递归下一级父渠道
            if (parentId == null || ErpChannelDO.PARENT_ID_ROOT.equals(parentId)) {
                break;
            }
            parentChannel = channelMapper.selectById(parentId);
            if (parentChannel == null) {
                break;
            }
        }
    }

}