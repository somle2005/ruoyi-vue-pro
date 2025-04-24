package cn.iocoder.yudao.module.tms.service.first.mile.item;

import cn.iocoder.yudao.framework.common.util.object.BeanUtils;
import cn.iocoder.yudao.module.tms.controller.admin.first.mile.item.vo.TmsFirstMileItemSaveReqVO;
import cn.iocoder.yudao.module.tms.dal.dataobject.first.mile.item.TmsFirstMileItemDO;
import cn.iocoder.yudao.module.tms.dal.mysql.first.mile.item.TmsFirstMileItemMapper;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import static cn.iocoder.yudao.framework.common.exception.util.ServiceExceptionUtil.exception;
import static cn.iocoder.yudao.module.tms.enums.ErrorCodeConstants.FIRST_MILE_ITEM_NOT_EXISTS;

/**
 * 头程单明细 Service 实现类
 *
 * @author wdy
 */
@Service
@Validated
public class TmsFirstMileItemServiceImpl implements TmsFirstMileItemService {

    @Resource
    private TmsFirstMileItemMapper firstMileItemMapper;

    @Override
    public Long createFirstMileItem(TmsFirstMileItemSaveReqVO createReqVO) {
        // 插入
        TmsFirstMileItemDO firstMileItem = BeanUtils.toBean(createReqVO, TmsFirstMileItemDO.class);
        firstMileItemMapper.insert(firstMileItem);
        // 返回
        return firstMileItem.getId();
    }

    @Override
    public void updateFirstMileItem(TmsFirstMileItemSaveReqVO updateReqVO) {
        // 校验存在
        validateFirstMileItemExists(updateReqVO.getId());
        // 更新
        TmsFirstMileItemDO updateObj = BeanUtils.toBean(updateReqVO, TmsFirstMileItemDO.class);
        firstMileItemMapper.updateById(updateObj);
    }

    @Override
    public void deleteFirstMileItem(Long id) {
        // 校验存在
        validateFirstMileItemExists(id);
        // 删除
        firstMileItemMapper.deleteById(id);
    }

    private void validateFirstMileItemExists(Long id) {
        if (firstMileItemMapper.selectById(id) == null) {
            throw exception(FIRST_MILE_ITEM_NOT_EXISTS);
        }
    }

    @Override
    public TmsFirstMileItemDO getFirstMileItem(Long id) {
        return firstMileItemMapper.selectById(id);
    }

//    @Override
//    public PageResult<TmsFirstMileItemDO> getFirstMileItemPage(TmsFirstMileItemPageReqVO pageReqVO) {
//        return firstMileItemMapper.selectPage(pageReqVO);
//    }

}