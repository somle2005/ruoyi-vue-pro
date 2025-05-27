package cn.iocoder.yudao.module.tms.service.transfer.item;

import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.common.util.object.BeanUtils;
import cn.iocoder.yudao.module.tms.controller.admin.transfer.item.vo.TmsTransferItemPageReqVO;
import cn.iocoder.yudao.module.tms.controller.admin.transfer.item.vo.TmsTransferItemSaveReqVO;
import cn.iocoder.yudao.module.tms.dal.dataobject.transfer.item.TmsTransferItemDO;
import cn.iocoder.yudao.module.tms.dal.mysql.transfer.item.TmsTransferItemMapper;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import static cn.iocoder.yudao.framework.common.exception.util.ServiceExceptionUtil.exception;
import static cn.iocoder.yudao.module.tms.enums.TmsErrorCodeConstants.TRANSFER_ITEM_NOT_EXISTS;


/**
 * 调拨单明细 Service 实现类
 *
 * @author wdy
 */
@Service
@Validated
public class TmsTransferItemServiceImpl implements TmsTransferItemService {

    @Resource
    private TmsTransferItemMapper transferItemMapper;

    @Override
    public Long createTransferItem(TmsTransferItemSaveReqVO createReqVO) {
        // 插入
        TmsTransferItemDO transferItem = BeanUtils.toBean(createReqVO, TmsTransferItemDO.class);
        transferItemMapper.insert(transferItem);
        // 返回
        return transferItem.getId();
    }

    @Override
    public void updateTransferItem(TmsTransferItemSaveReqVO updateReqVO) {
        // 校验存在
        validateTransferItemExists(updateReqVO.getId());
        // 更新
        TmsTransferItemDO updateObj = BeanUtils.toBean(updateReqVO, TmsTransferItemDO.class);
        transferItemMapper.updateById(updateObj);
    }

    @Override
    public void deleteTransferItem(Long id) {
        // 校验存在
        validateTransferItemExists(id);
        // 删除
        transferItemMapper.deleteById(id);
    }

    private void validateTransferItemExists(Long id) {
        if (transferItemMapper.selectById(id) == null) {
            throw exception(TRANSFER_ITEM_NOT_EXISTS);
        }
    }

    @Override
    public TmsTransferItemDO getTransferItem(Long id) {
        return transferItemMapper.selectById(id);
    }

    @Override
    public PageResult<TmsTransferItemDO> getTransferItemPage(TmsTransferItemPageReqVO pageReqVO) {
        return transferItemMapper.selectPage(pageReqVO);
    }

}