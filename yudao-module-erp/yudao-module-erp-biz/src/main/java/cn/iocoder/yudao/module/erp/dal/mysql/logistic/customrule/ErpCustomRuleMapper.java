package cn.iocoder.yudao.module.erp.dal.mysql.logistic.customrule;

import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.mybatis.core.mapper.BaseMapperX;
import cn.iocoder.yudao.framework.mybatis.core.query.LambdaQueryWrapperX;
import cn.iocoder.yudao.framework.mybatis.core.query.MPJLambdaWrapperX;
import cn.iocoder.yudao.module.erp.controller.admin.logistic.customrule.vo.ErpCustomRulePageReqVO;
import cn.iocoder.yudao.module.erp.dal.dataobject.logistic.category.ErpCustomCategoryDO;
import cn.iocoder.yudao.module.erp.dal.dataobject.logistic.category.item.ErpCustomCategoryItemDO;
import cn.iocoder.yudao.module.erp.dal.dataobject.logistic.customrule.ErpCustomRuleDO;
import cn.iocoder.yudao.module.erp.dal.dataobject.product.ErpProductDO;
import cn.iocoder.yudao.module.erp.service.logistic.customrule.bo.ErpCustomRuleBO;
import com.github.yulichang.wrapper.MPJLambdaWrapper;
import jakarta.validation.constraints.NotNull;
import org.apache.ibatis.annotations.Mapper;

import java.util.Collection;
import java.util.List;

/**
 * ERP 海关规则 Mapper
 *
 * @author 索迈管理员
 */
@Mapper
public interface ErpCustomRuleMapper extends BaseMapperX<ErpCustomRuleDO> {
    default MPJLambdaWrapper<ErpCustomRuleDO> bindQueryWrapper(ErpCustomRulePageReqVO reqVO) {
        return new MPJLambdaWrapperX<ErpCustomRuleDO>()
            .selectAll(ErpCustomRuleDO.class)  // 选择所有列
            .eqIfPresent(ErpCustomRuleDO::getCountryCode, reqVO.getCountryCode())  // 国家编码
            .eqIfPresent(ErpCustomRuleDO::getDeclaredValue, reqVO.getDeclaredValue())  // 申报金额
            .eqIfPresent(ErpCustomRuleDO::getDeclaredValueCurrencyCode, reqVO.getDeclaredValueCurrencyCode())  // 申报金额币种
            .eqIfPresent(ErpCustomRuleDO::getLogisticAttribute, reqVO.getLogisticAttribute())  // 物流属性
            .likeIfPresent(ErpCustomRuleDO::getFbaBarCode, reqVO.getFbaBarCode())  // FBA条形码
            .betweenIfPresent(ErpCustomRuleDO::getCreateTime, reqVO.getCreateTime())  // 创建时间范围
            .betweenIfPresent(ErpCustomRuleDO::getUpdateTime, reqVO.getUpdateTime())  // 更新时间范围
            .orderByDesc(ErpCustomRuleDO::getId)  // 按id降序排序
            .leftJoin(ErpProductDO.class, ErpProductDO::getId, ErpCustomRuleDO::getProductId)  // 左连接产品表
            .likeIfExists(ErpProductDO::getBarCode, reqVO.getBarCode()) // 产品SKU编码
            ;
    }

    default PageResult<ErpCustomRuleDO> selectPage(ErpCustomRulePageReqVO reqVO) {
        // 构建查询，应用条件并进行分页查询
        return selectJoinPage(reqVO, ErpCustomRuleDO.class, bindQueryWrapper(reqVO));
    }

    /**
     * 根据 城市code 和 产品id 查询一个
     *
     * @param countryCode 国家代码
     * @param productId   产品id
     * @return ErpCustomRuleDO
     */
    default ErpCustomRuleDO getCustomRuleByCountryCodeAndProductId(Integer countryCode, Long productId) {
        return selectOne(new LambdaQueryWrapperX<ErpCustomRuleDO>()
            .eq(ErpCustomRuleDO::getCountryCode, countryCode)
            .eq(ErpCustomRuleDO::getProductId, productId));
    }

    /**
     * 根据 产品id 查询多个规则BO
     *
     * @param productIds ids
     * @return List<ErpCustomRuleDO>
     */
    default List<ErpCustomRuleBO> selectByProductId(@NotNull List<Long> productIds) {
        MPJLambdaWrapper<ErpCustomRuleDO> boWrapper = getBOWrapper(new ErpCustomRulePageReqVO());
        boWrapper.in(ErpCustomRuleDO::getProductId, productIds);
        return selectJoinList(ErpCustomRuleBO.class, boWrapper);
    }

    //连表查询
    private MPJLambdaWrapper<ErpCustomRuleDO> getBOWrapper(@NotNull ErpCustomRulePageReqVO reqVO) {
        return bindQueryWrapper(reqVO)
            .leftJoin(ErpCustomCategoryDO.class, ErpCustomCategoryDO::getId, ErpProductDO::getCustomCategoryId)
            .selectAsClass(ErpCustomCategoryDO.class, ErpCustomRuleBO.class)
            .leftJoin(ErpCustomCategoryItemDO.class, ErpCustomCategoryItemDO::getCustomCategoryId, ErpCustomCategoryDO::getId)
            .selectAsClass(ErpCustomCategoryItemDO.class, ErpCustomRuleBO.class)
            .eqIfExists(ErpCustomCategoryItemDO::getCountryCode, reqVO.getCountryCode())  // 匹配 ErpCustomCategoryItemDO 的 countryCode 与请求中的 countryCode
            ;
    }

    // 分页查询 ErpCustomRuleBO 海关规则数据(3表联查)
    default PageResult<ErpCustomRuleBO> selectBOPage(@NotNull ErpCustomRulePageReqVO reqVO) {
        return selectJoinPage(reqVO, ErpCustomRuleBO.class, getBOWrapper(reqVO));
    }

    //查到ErpCustomRuleBO通过id
    default ErpCustomRuleBO getCustomRuleBOById(@NotNull Long id) {
        MPJLambdaWrapper<ErpCustomRuleDO> wrapper = getBOWrapper(new ErpCustomRulePageReqVO());
        wrapper.eq(ErpCustomRuleDO::getId, id);
        //根据海关规则的国别1-1映射 分类子表
        wrapper.eq(ErpCustomRuleDO::getCountryCode, ErpCustomCategoryItemDO::getCountryCode);
        return this.selectJoinOne(ErpCustomRuleBO.class, wrapper);
    }

    //通过ids查ErpCustomRuleBO集合
    default List<ErpCustomRuleBO> selectCustomRuleBOByIds(Collection<Long> ids) {
        MPJLambdaWrapper<ErpCustomRuleDO> wrapper = getBOWrapper(new ErpCustomRulePageReqVO());
        if (ids != null) {
            wrapper.in(ErpCustomRuleDO::getId, ids);
        }
        return this.selectJoinList(ErpCustomRuleBO.class, wrapper);
    }
}
