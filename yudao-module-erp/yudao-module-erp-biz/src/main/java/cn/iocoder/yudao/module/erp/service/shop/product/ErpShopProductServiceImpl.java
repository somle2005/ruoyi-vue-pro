package cn.iocoder.yudao.module.erp.service.shop.product;

import cn.hutool.core.util.ObjectUtil;
import cn.iocoder.yudao.framework.common.pojo.CommonResult;
import cn.iocoder.yudao.framework.common.util.collection.CollectionUtils;
import cn.iocoder.yudao.framework.common.util.collection.StreamX;
import cn.iocoder.yudao.framework.common.util.concurrent.AsyncTask;
import cn.iocoder.yudao.framework.common.util.number.NumberUtils;
import cn.iocoder.yudao.framework.common.util.spring.SpringUtils;
import cn.iocoder.yudao.framework.mybatis.core.query.LambdaQueryWrapperX;
import cn.iocoder.yudao.module.erp.api.shop.dto.SkuRelationDTO;
import cn.iocoder.yudao.module.erp.controller.admin.product.vo.product.ErpProductRespSimpleVO;
import cn.iocoder.yudao.module.erp.controller.admin.product.vo.product.ErpProductRespVO;
import cn.iocoder.yudao.module.erp.controller.admin.shop.product.item.vo.ErpShopProductItemRespVO;
import cn.iocoder.yudao.module.erp.controller.admin.shop.product.item.vo.ErpShopProductItemSaveReqVO;
import cn.iocoder.yudao.module.erp.controller.admin.shop.vo.ErpShopRespVO;
import cn.iocoder.yudao.module.erp.dal.dataobject.shop.ErpShopDO;
import cn.iocoder.yudao.module.erp.dal.dataobject.shop.product.item.ErpShopProductItemDO;
import cn.iocoder.yudao.module.erp.service.product.ErpProductService;
import cn.iocoder.yudao.module.erp.service.shop.ErpShopService;
import cn.iocoder.yudao.module.erp.service.shop.product.item.ErpShopProductItemService;
import cn.iocoder.yudao.module.system.api.dept.DeptApi;
import cn.iocoder.yudao.module.system.api.dept.dto.DeptRespDTO;
import cn.iocoder.yudao.module.system.api.user.AdminUserApi;
import cn.iocoder.yudao.module.system.api.user.dto.AdminUserRespDTO;
import jodd.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.MessageChannel;
import org.springframework.stereotype.Service;
import jakarta.annotation.Resource;
import org.springframework.validation.annotation.Validated;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;
import cn.iocoder.yudao.module.erp.controller.admin.shop.product.vo.*;
import cn.iocoder.yudao.module.erp.dal.dataobject.shop.product.ErpShopProductDO;
import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.common.util.object.BeanUtils;

import cn.iocoder.yudao.module.erp.dal.mysql.shop.product.ErpShopProductMapper;

import static cn.iocoder.yudao.framework.common.exception.util.ServiceExceptionUtil.exception;
import static cn.iocoder.yudao.framework.common.pojo.CommonResult.error;
import static cn.iocoder.yudao.framework.common.pojo.CommonResult.success;
import static cn.iocoder.yudao.module.erp.enums.ErrorCodeConstants.*;

/**
 * ERP 店铺产品 Service 实现类
 *
 * @author 索迈管理员
 */
@Service
@Validated
public class ErpShopProductServiceImpl implements ErpShopProductService {


    @Resource
    MessageChannel eccangSkuRelationOutputChannel;



    @Resource
    private ErpShopProductMapper shopProductMapper;

    @Resource
    private ErpShopProductItemService shopProductItemService;

    @Resource
    private ErpProductService productService;

    @Autowired
    private DeptApi deptApi;

    @Resource
    AdminUserApi userApi;

    @Resource
    private ErpShopService shopService;

    @Override
    public Long createShopProduct(ErpShopProductSaveReqVO createReqVO) {
        // 插入
        ErpShopProductDO shopProduct = BeanUtils.toBean(createReqVO, ErpShopProductDO.class);
        shopProductMapper.insert(shopProduct);
        // 返回
        return shopProduct.getId();
    }

    @Override
    public void updateShopProduct(ErpShopProductSaveReqVO updateReqVO) {
        // 校验存在
        validateShopProductExists(updateReqVO.getId());
        // 更新
        ErpShopProductDO updateObj = BeanUtils.toBean(updateReqVO, ErpShopProductDO.class);
        shopProductMapper.updateById(updateObj);
    }

    @Override
    public void deleteShopProduct(Long id) {
        // 校验存在
        validateShopProductExists(id);
        // 删除
        shopProductMapper.deleteById(id);
    }

    private void validateShopProductExists(Long id) {
        if (shopProductMapper.selectById(id) == null) {
            throw exception(SHOP_PRODUCT_NOT_EXISTS);
        }
    }

    @Override
    public ErpShopProductDO getShopProduct(Long id) {
        return shopProductMapper.selectById(id);
    }

    @Override
    public PageResult<ErpShopProductDO> getShopProductPage(ErpShopProductPageReqVO pageReqVO) {
        return shopProductMapper.selectPage(pageReqVO);
    }

    @Override
    public List<ErpShopProductDO> selectByShopId(Long id) {
        return shopProductMapper.selectList(
            LambdaQueryWrapperX.create(ErpShopProductDO.class).eq(ErpShopProductDO::getShopId,id)
        );
    }

    @Override
    public void batchCreate(List<ErpShopProductDO> listToCreate) {
        shopProductMapper.insertBatch(listToCreate);
    }

    @Override
    public void batchUpdate(List<ErpShopProductDO> listToUpdate) {
        shopProductMapper.updateBatch(listToUpdate);
    }

    /**
     * 根据店铺编号查询产品
     *
     * @param id 店铺产品ID
     * @return 产品
     */
    @Override
    public ErpShopProductRespVO getShopProductVoModel(Long id) {
        ErpShopProductDO shopProduct = this.getShopProduct(id);
        if (shopProduct == null) {
            throw exception(SHOP_PRODUCT_NOT_EXISTS);
        }
        ErpShopProductRespVO respVO = BeanUtils.toBean(shopProduct, ErpShopProductRespVO.class);
        List<ErpShopProductItemDO> items = shopProductItemService.getShopProductItemsByProductId(shopProduct.getId());
        List<ErpShopProductItemRespVO> itemRespVOS=BeanUtils.toBean(items, ErpShopProductItemRespVO.class);
        List<ErpProductRespVO> productList= productService.getProductVOList(StreamX.from(items).map(ErpShopProductItemDO::getProductId).toList());
        List<ErpProductRespSimpleVO> simpleProductList = BeanUtils.toBean(productList, ErpProductRespSimpleVO.class);
        StreamX.from(itemRespVOS).assemble(simpleProductList,ErpProductRespSimpleVO::getId,ErpShopProductItemRespVO::getProductId,ErpShopProductItemRespVO::setProduct);
        respVO.setItems(itemRespVOS);
        // 店铺
        ErpShopDO shopDO = shopService.getShop(respVO.getShopId());
        respVO.setShop(BeanUtils.toBean(shopDO, ErpShopRespVO.class));

        return respVO;
    }

    @Override
    public Map<Long, List<ErpShopProductItemRespVO>> getItemGroupMap(List<Long> productIds) {
        if(CollectionUtils.isEmpty(productIds)) {
            return Map.of();
        }
        List<ErpShopProductItemDO> itemsInDB=shopProductItemService.getShopProductItemsByProductIds(productIds);
        List<ErpShopProductItemRespVO> respItemsVOs=BeanUtils.toBean(itemsInDB, ErpShopProductItemRespVO.class);
        List<ErpProductRespVO> productList= productService.getProductVOList(StreamX.from(itemsInDB).map(ErpShopProductItemDO::getProductId).toList());
        Map<Long,ErpProductRespSimpleVO> productMap= StreamX.from(productList).toMap(ErpProductRespVO::getId, t->BeanUtils.toBean(t, ErpProductRespSimpleVO.class));
        StreamX.from(respItemsVOs).assemble(productMap,ErpShopProductItemRespVO::getProductId,ErpShopProductItemRespVO::setProduct);
        Map<Long,List<ErpShopProductItemRespVO>> itemsGroup=StreamX.from(respItemsVOs).groupBy(ErpShopProductItemRespVO::getShopProductId);
        return itemsGroup;
    }


    @Transactional
    @Override
    public Long createShopProductWithItems(ErpShopProductSaveReqVO createReqVO) {
        Long id=this.createShopProduct(createReqVO);
        createReqVO.setId(id);
        updateShopProductWithItems(createReqVO);
        sendToEccang(createReqVO.getId());
        return id;
    }

    @Override
    public ErpShopProductDO getShopProductByCode(String code) {
        return shopProductMapper.getShopProductByCode(code);
    }

    @Override
    @Transactional
    public void updateShopProductWithItems(ErpShopProductSaveReqVO updateReqVO) {
        // 保存主表
        this.updateShopProduct(updateReqVO);
        // 处理重表数据
        List<ErpShopProductItemDO> itemsInDB = shopProductItemService.getShopProductItemsByProductId(updateReqVO.getId());
        Set<Long> itemIdsInDB = StreamX.from(itemsInDB).toSet(ErpShopProductItemDO::getId);
        Set<Long> itemIdsToDelete = new HashSet<>(itemIdsInDB);

        // 循环处理
        for (ErpShopProductItemSaveReqVO itemVO : updateReqVO.getItems()) {
            // 此ID不使用前端传入的ID
            itemVO.setShopProductId(updateReqVO.getId());
            // id为空的需要新增
            if(itemVO.getId()==null) {
                shopProductItemService.createShopProductItem(itemVO);
            } else {
                shopProductItemService.updateShopProductItem(itemVO);
            }
            // 移除不需要删除的ID
            itemIdsToDelete.remove(itemVO.getId());
        }

        // 删除需要删除的
        for (Long itemId : itemIdsToDelete) {
            shopProductItemService.deleteShopProductItem(itemId);
        }


        sendToEccang(updateReqVO.getId());

    }

    private void sendToEccang(Long id) {
        ErpShopProductRespVO productVo = this.getShopProductVoModel(id);

        // 条件判断
        if(productVo==null) {
            return;
        }

        // 需要有店铺
        if(productVo.getShop()==null) {
            return;
        }

        // 店铺需要维护别名
        if(StringUtil.isBlank(productVo.getShop().getAccount())) {
            return;
        }

        // 与产品有关联关系
        if(!CollectionUtils.isEmpty(productVo.getItems())) {
            for (ErpShopProductItemRespVO item : productVo.getItems()) {
                if(item.getProduct()==null) {
                    return;
                }
            }
        }



        SkuRelationDTO dto = SkuRelationDTO.builder()
            .platformSku(productVo.getName())
            .account(productVo.getShop().getAccount())
            .relations(StreamX.from(productVo.getItems()).map(item->SkuRelationDTO.Relation.builder()
                // 如果是非生产环境加 TEST- 前缀区别
                .productSku(SpringUtils.isProd()?"":"TEST-"+item.getProduct().getBarCode())
                .productSkuQty(item.getQuantity())
                .build()).toList())
            .build();


        AsyncTask.run(()->{
            eccangSkuRelationOutputChannel.send(MessageBuilder.withPayload(dto).build());
        });

    }

    @Override
    public CommonResult<PageResult<ErpShopProductRespVO>> getShopProductPageVO(ErpShopProductPageReqVO pageReqVO) {



        PageResult<ErpShopProductDO> pageResult = this.getShopProductPage(pageReqVO);
        List<Long> userIds=new ArrayList<>();
        for(ErpShopProductDO product:pageResult.getList()) {
            userIds.add(NumberUtils.parseLong(product.getCreator()));
            userIds.add(NumberUtils.parseLong(product.getUpdater()));
        }
        Map<Long, AdminUserRespDTO> userMap=userApi.getUserMap(userIds);
        for(ErpShopProductDO product:pageResult.getList()) {
            AdminUserRespDTO creator=userMap.get(NumberUtils.parseLong(product.getCreator()));
            if(creator!=null) {
                product.setCreator(creator.getNickname());
            }
            AdminUserRespDTO updater=userMap.get(NumberUtils.parseLong(product.getUpdater()));
            if(updater!=null) {
                product.setUpdater(updater.getNickname());
            }
        }

        PageResult<ErpShopProductRespVO> pageResultVO=BeanUtils.toBean(pageResult, ErpShopProductRespVO.class);
        Set<Long> shopIds= StreamX.from(pageResultVO.getList()).toSet(ErpShopProductRespVO::getShopId);
        Map<Long, ErpShopRespVO> shopVoMap = shopService.getShopMapByIds(shopIds);
        // 装配对象
        StreamX.from(pageResultVO.getList()).assemble(shopVoMap,ErpShopProductRespVO::getShopId, ErpShopProductRespVO::setShop);
        List<Long> productIds=StreamX.from(pageResultVO.getList()).toList(ErpShopProductRespVO::getId);
        Map<Long,List<ErpShopProductItemRespVO>> itemsGroup=this.getItemGroupMap(productIds);
        StreamX.from(pageResultVO.getList()).assemble(itemsGroup,ErpShopProductRespVO::getId, ErpShopProductRespVO::setItems);

        List<Long> deptIds=StreamX.from(pageResultVO.getList()).filter(ObjectUtil::isNotNull).toList(ErpShopProductRespVO::getDeptId);
        List<DeptRespDTO> deptDTOList=deptApi.getDeptList(deptIds);
        deptDTOList=StreamX.from(deptDTOList).filter(ObjectUtil::isNotNull).toList();
        StreamX.from(pageResultVO.getList()).assemble(deptDTOList,DeptRespDTO::getId,ErpShopProductRespVO::getDeptId,(prod,dept)->{
            if(dept!=null) {
                prod.setDeptName(dept.getName());
            }
        });

        //
        return success(pageResultVO);
    }



}