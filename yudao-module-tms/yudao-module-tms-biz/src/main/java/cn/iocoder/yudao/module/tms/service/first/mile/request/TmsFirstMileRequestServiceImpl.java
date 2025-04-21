package cn.iocoder.yudao.module.tms.service.first.mile.request;

import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.common.util.object.BeanUtils;
import cn.iocoder.yudao.module.tms.controller.admin.first.mile.request.vo.TmsFirstMileRequestPageReqVO;
import cn.iocoder.yudao.module.tms.controller.admin.first.mile.request.vo.TmsFirstMileRequestSaveReqVO;
import cn.iocoder.yudao.module.tms.dal.dataobject.first.mile.request.TmsFirstMileRequestDO;
import cn.iocoder.yudao.module.tms.dal.dataobject.first.mile.request.item.TmsFirstMileRequestItemDO;
import cn.iocoder.yudao.module.tms.dal.mysql.first.mile.request.TmsFirstMileRequestMapper;
import cn.iocoder.yudao.module.tms.dal.mysql.first.mile.request.item.TmsFirstMileRequestItemMapper;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;

import java.util.List;

import static cn.iocoder.yudao.framework.common.exception.util.ServiceExceptionUtil.exception;
import static cn.iocoder.yudao.module.tms.enums.ErrorCodeConstants.FIRST_MILE_REQUEST_NOT_EXISTS;

/**
 * 头程申请单 Service 实现类
 *
 * @author wdy
 */
@Service
@Validated
public class TmsFirstMileRequestServiceImpl implements TmsFirstMileRequestService {

    @Resource
    private TmsFirstMileRequestMapper firstMileRequestMapper;
    @Resource
    private TmsFirstMileRequestItemMapper firstMileRequestItemMapper;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Long createFirstMileRequest(TmsFirstMileRequestSaveReqVO vo) {
        // 插入
        TmsFirstMileRequestDO firstMileRequest = BeanUtils.toBean(vo, TmsFirstMileRequestDO.class);
        firstMileRequestMapper.insert(firstMileRequest);

        // 插入子表
        createFirstMileRequestItemList(firstMileRequest.getId(), BeanUtils.toBean(vo.getFirstMileRequestItems(), TmsFirstMileRequestItemDO.class));
        // 返回
        return firstMileRequest.getId();
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void updateFirstMileRequest(TmsFirstMileRequestSaveReqVO vo) {
        // 校验存在
        validateFirstMileRequestExists(vo.getId());
        // 更新
        TmsFirstMileRequestDO updateObj = BeanUtils.toBean(vo, TmsFirstMileRequestDO.class);
        firstMileRequestMapper.updateById(updateObj);

        // 更新子表
        updateFirstMileRequestItemList(vo.getId(), BeanUtils.toBean(vo.getFirstMileRequestItems(), TmsFirstMileRequestItemDO.class));
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void deleteFirstMileRequest(Long id) {
        // 校验存在
        validateFirstMileRequestExists(id);
        // 删除
        firstMileRequestMapper.deleteById(id);

        // 删除子表
        deleteFirstMileRequestItemByRequestId(id);
    }

    private void validateFirstMileRequestExists(Long id) {
        if (firstMileRequestMapper.selectById(id) == null) {
            throw exception(FIRST_MILE_REQUEST_NOT_EXISTS);
        }
    }

    @Override
    public TmsFirstMileRequestDO getFirstMileRequest(Long id) {
        return firstMileRequestMapper.selectById(id);
    }

    @Override
    public PageResult<TmsFirstMileRequestDO> getFirstMileRequestPage(TmsFirstMileRequestPageReqVO pageReqVO) {
        return firstMileRequestMapper.selectPage(pageReqVO);
    }

    // ==================== 子表（头程申请表明细） ====================

    @Override
    public List<TmsFirstMileRequestItemDO> getFirstMileRequestItemListByRequestId(Long requestId) {
        return firstMileRequestItemMapper.selectListByRequestId(requestId);
    }

    private void createFirstMileRequestItemList(Long requestId, List<TmsFirstMileRequestItemDO> list) {
        list.forEach(o -> o.setRequestId(requestId));
        firstMileRequestItemMapper.insertBatch(list);
    }

    private void updateFirstMileRequestItemList(Long requestId, List<TmsFirstMileRequestItemDO> list) {
        deleteFirstMileRequestItemByRequestId(requestId);
        list.forEach(o -> o.setId(null).setUpdater(null).setUpdateTime(null)); // 解决更新情况下：1）id 冲突；2）updateTime 不更新
        createFirstMileRequestItemList(requestId, list);
    }

    private void deleteFirstMileRequestItemByRequestId(Long requestId) {
        firstMileRequestItemMapper.deleteById(requestId);
    }

}