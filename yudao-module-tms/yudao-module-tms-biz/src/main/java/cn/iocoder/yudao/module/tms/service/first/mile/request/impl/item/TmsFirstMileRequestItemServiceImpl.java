package cn.iocoder.yudao.module.tms.service.first.mile.request.impl.item;

import cn.iocoder.yudao.framework.common.util.object.BeanUtils;
import cn.iocoder.yudao.module.tms.controller.admin.first.mile.request.item.vo.TmsFirstMileRequestItemSaveReqVO;
import cn.iocoder.yudao.module.tms.dal.dataobject.first.mile.request.item.TmsFirstMileRequesItemtDO;
import cn.iocoder.yudao.module.tms.dal.mysql.first.mile.request.item.TmsFirstMileRequestItemMapper;
import cn.iocoder.yudao.module.tms.service.first.mile.request.TmsFirstMileRequestItemService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import static cn.iocoder.yudao.framework.common.exception.util.ServiceExceptionUtil.exception;
import static cn.iocoder.yudao.module.tms.enums.ErrorCodeConstants.FIRST_MILE_REQUEST_ITEM_NOT_EXISTS;

/**
 * 头程申请表明细 Service 实现类
 *
 * @author wdy
 */
@Service
@Validated
public class TmsFirstMileRequestItemServiceImpl implements TmsFirstMileRequestItemService {

    @Resource
    private TmsFirstMileRequestItemMapper firstMileRequestItemMapper;

    @Override
    public Long createFirstMileRequestItem(TmsFirstMileRequestItemSaveReqVO createReqVO) {
        // 插入
        TmsFirstMileRequesItemtDO firstMileRequestItem = BeanUtils.toBean(createReqVO, TmsFirstMileRequesItemtDO.class);
        firstMileRequestItemMapper.insert(firstMileRequestItem);
        // 返回
        return firstMileRequestItem.getId();
    }

    @Override
    public void updateFirstMileRequestItem(TmsFirstMileRequestItemSaveReqVO updateReqVO) {
        // 校验存在
        validateFirstMileRequestItemExists(updateReqVO.getId());
        // 更新
        TmsFirstMileRequesItemtDO updateObj = BeanUtils.toBean(updateReqVO, TmsFirstMileRequesItemtDO.class);
        firstMileRequestItemMapper.updateById(updateObj);
    }

    @Override
    public void deleteFirstMileRequestItem(Long id) {
        // 校验存在
        validateFirstMileRequestItemExists(id);
        // 删除
        firstMileRequestItemMapper.deleteById(id);
    }

    public TmsFirstMileRequesItemtDO validateFirstMileRequestItemExists(Long id) {
        TmsFirstMileRequesItemtDO tmsFirstMileRequestItemDO = firstMileRequestItemMapper.selectById(id);
        if (tmsFirstMileRequestItemDO == null) throw exception(FIRST_MILE_REQUEST_ITEM_NOT_EXISTS);
        return tmsFirstMileRequestItemDO;
    }

    @Override
    public TmsFirstMileRequesItemtDO getFirstMileRequestItem(Long id) {
        return firstMileRequestItemMapper.selectById(id);
    }

    @Override
    public void updateFirstMileRequestItemStatus(Long id, Integer openStatus, Integer orderStatus) {
        TmsFirstMileRequesItemtDO firstMileRequestItemDO = validateFirstMileRequestItemExists(id);
        if (openStatus != null) {
            firstMileRequestItemDO.setOffStatus(openStatus);
        }
        if (orderStatus != null) {
            firstMileRequestItemDO.setOrderStatus(orderStatus);
        }
        firstMileRequestItemMapper.updateById(firstMileRequestItemDO);
    }
}