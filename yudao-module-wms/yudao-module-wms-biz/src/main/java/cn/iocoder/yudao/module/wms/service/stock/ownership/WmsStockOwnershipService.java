package cn.iocoder.yudao.module.wms.service.stock.ownership;

import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.module.wms.controller.admin.stock.ownership.vo.WmsStockOwnershipPageReqVO;
import cn.iocoder.yudao.module.wms.controller.admin.stock.ownership.vo.WmsStockOwnershipRespVO;
import cn.iocoder.yudao.module.wms.controller.admin.stock.ownership.vo.WmsStockOwnershipSaveReqVO;
import cn.iocoder.yudao.module.wms.dal.dataobject.stock.ownership.WmsStockOwnershipDO;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.util.List;

/**
 * 所有者库存 Service 接口
 *
 * @author 李方捷
 */
public interface WmsStockOwnershipService {

    /**
     * 创建所有者库存
     *
     * @param createReqVO 创建信息
     * @return 编号
     */
    WmsStockOwnershipDO createStockOwnership(@Valid WmsStockOwnershipSaveReqVO createReqVO);

    /**
     * 更新所有者库存
     *
     * @param updateReqVO 更新信息
     */
    WmsStockOwnershipDO updateStockOwnership(@Valid WmsStockOwnershipSaveReqVO updateReqVO);

    /**
     * 删除所有者库存
     *
     * @param id 编号
     */
    void deleteStockOwnership(Long id);

    /**
     * 获得所有者库存
     *
     * @param id 编号
     * @return 所有者库存
     */
    WmsStockOwnershipDO getStockOwnership(Long id);

    /**
     * 获得所有者库存分页
     *
     * @param pageReqVO 分页查询
     * @return 所有者库存分页
     */
    PageResult<WmsStockOwnershipDO> getStockOwnershipPage(WmsStockOwnershipPageReqVO pageReqVO);

    /**
     * 获取库存归属列表
     *
     * @param warehouseId 仓库id，必填
     * @param productId 产品id，可选
     * @param companyId 公司id，可选
     * @param deptId 部门id，可选
     * @return 库存归属列表
     */
    List<WmsStockOwnershipDO> selectStockOwnership(@NotNull Long warehouseId, Long productId, Long companyId, Long deptId);

    /**
     * 批量获取产品的库存归属列表
     *
     * @param warehouseId 仓库id
     * @param productId   产品id列表
     * @return 库存归属列表
     */
    List<WmsStockOwnershipDO> selectStockOwnership(@NotNull Long warehouseId, List<Long> productId);

    /**
     * 根据唯一键获取库存归属，如果不存在则创建
     *
     * @param warehouseId 仓库id
     * @param companyId 公司id
     * @param deptId 部门id
     * @param productId 产品id
     * @param createNew 是否创建新记录
     * @return 库存归属
     */
    WmsStockOwnershipDO getByUkProductOwner(Long warehouseId, Long companyId, Long deptId, Long productId, boolean createNew);

    /**
     * 插入或更新库存归属记录
     *
     * @param stockOwnershipDO 库存归属信息
     */
    void insertOrUpdate(WmsStockOwnershipDO stockOwnershipDO);

    /**
     * 装配产品信息
     *
     * @param list 库存归属列表
     */
    void assembleProducts(List<WmsStockOwnershipRespVO> list);

    /**
     * 装配仓库信息
     *
     * @param list 库存归属列表
     */
    void assembleWarehouse(List<WmsStockOwnershipRespVO> list);

    /**
     * 装配部门信息
     *
     * @param list 库存归属列表
     */
    void assembleDept(List<WmsStockOwnershipRespVO> list);

    /**
     * 装配公司信息
     *
     * @param list 库存归属列表
     */
    void assembleCompany(List<WmsStockOwnershipRespVO> list);

    /**
     * 根据ID列表批量查询库存归属
     *
     * @param stockOwnershipIds 库存归属ID列表
     * @return 库存归属列表
     */
    List<WmsStockOwnershipDO> selectByIds(List<Long> stockOwnershipIds);

    /**
     * 根据部门ID+产品ID+国别ID查询库存归属
     *
     * @param deptId    部门ID
     * @param productId 产品ID
     * @param country   国家字典值
     * @return 库存归属
     */
    List<WmsStockOwnershipDO> selectByDeptIdAndProductIdAndCountryId(Long deptId, Long productId, String country);
}
