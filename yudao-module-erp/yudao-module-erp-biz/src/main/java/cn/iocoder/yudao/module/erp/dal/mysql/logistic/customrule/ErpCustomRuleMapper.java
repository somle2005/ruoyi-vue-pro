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
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * ERP 海关规则 Mapper
 *
 * @author 索迈管理员
 */
@Mapper
public interface ErpCustomRuleMapper extends BaseMapperX<ErpCustomRuleDO> {
    // 公共查询逻辑，用于 selectPage 和 selectErpCustomRuleBOPage 方法
    private MPJLambdaWrapper<ErpCustomRuleDO> buildBaseQuery(ErpCustomRulePageReqVO reqVO) {
        return new MPJLambdaWrapperX<ErpCustomRuleDO>()
            .selectAll(ErpCustomRuleDO.class)
            .eqIfPresent(ErpCustomRuleDO::getCountryCode, reqVO.getCountryCode())
            .eqIfPresent(ErpCustomRuleDO::getDeclaredValue, reqVO.getDeclaredValue())
            .eqIfPresent(ErpCustomRuleDO::getDeclaredValueCurrencyCode, reqVO.getDeclaredValueCurrencyCode())
            .eqIfPresent(ErpCustomRuleDO::getLogisticAttribute, reqVO.getLogisticAttribute())
            .likeIfPresent(ErpCustomRuleDO::getFbaBarCode, reqVO.getFbaBarCode())
            .betweenIfPresent(ErpCustomRuleDO::getCreateTime, reqVO.getCreateTime())
            .orderByDesc(ErpCustomRuleDO::getId)
            .leftJoin(ErpProductDO.class, ErpProductDO::getId, ErpCustomRuleDO::getProductId)
            .likeIfExists(ErpProductDO::getBarCode, reqVO.getBarCode());
    }

    // 分页查询 ERP 海关规则数据
    default PageResult<ErpCustomRuleDO> selectPage(ErpCustomRulePageReqVO reqVO) {
        MPJLambdaWrapper<ErpCustomRuleDO> query = buildBaseQuery(reqVO);
        return selectJoinPage(reqVO, ErpCustomRuleDO.class, query);
    }

    // 分页查询 ERP 海关规则 BO 数据
    default PageResult<ErpCustomRuleDO> selectErpCustomRuleBOPage(ErpCustomRulePageReqVO reqVO) {
        MPJLambdaWrapper<ErpCustomRuleDO> wrapper = new MPJLambdaWrapperX<ErpCustomRuleDO>()
            .selectAsClass(ErpCustomRuleDO.class, ErpCustomRuleBO.class) // 将 ErpCustomRuleDO 的字段映射到 ErpCustomRuleBO
            .eqIfPresent(ErpCustomRuleDO::getCountryCode, reqVO.getCountryCode())  // 国家编码
            .eqIfPresent(ErpCustomRuleDO::getDeclaredValue, reqVO.getDeclaredValue())  // 申报金额
            .eqIfPresent(ErpCustomRuleDO::getDeclaredValueCurrencyCode, reqVO.getDeclaredValueCurrencyCode())  // 申报金额币种
            .eqIfPresent(ErpCustomRuleDO::getLogisticAttribute, reqVO.getLogisticAttribute())  // 物流属性
            .likeIfPresent(ErpCustomRuleDO::getFbaBarCode, reqVO.getFbaBarCode())  // FBA条形码
            .betweenIfPresent(ErpCustomRuleDO::getCreateTime, reqVO.getCreateTime())  // 创建时间范围
            .betweenIfPresent(ErpCustomRuleDO::getUpdateTime, reqVO.getUpdateTime())  // 更新时间范围
            .orderByDesc(ErpCustomRuleDO::getId)
            .leftJoin(ErpProductDO.class, ErpProductDO::getId, ErpCustomRuleDO::getProductId)
            .likeIfExists(ErpProductDO::getBarCode, reqVO.getBarCode())  // 产品条形码
            .leftJoin(ErpCustomCategoryDO.class, ErpCustomCategoryDO::getId, ErpProductDO::getCustomCategoryId)
            .selectAs(ErpCustomCategoryDO::getMaterial, ErpCustomRuleBO::getMaterial)
            .selectAs(ErpCustomCategoryDO::getDeclaredType, ErpCustomRuleBO::getDeclaredType)
            .selectAs(ErpCustomCategoryDO::getDeclaredTypeEn, ErpCustomRuleBO::getDeclaredTypeEn)
            .leftJoin(ErpCustomCategoryItemDO.class, ErpCustomCategoryItemDO::getCustomCategoryId, ErpCustomCategoryDO::getId)
//            .selectAs(ErpCustomRuleBO::getHsCode, ErpCustomCategoryItemDO::getHscode)  // hsCode
            .selectAs(ErpCustomCategoryItemDO::getTaxRate, ErpCustomRuleBO::getTaxRate)  // 税率
            .eqIfExists(ErpCustomCategoryItemDO::getCountryCode, reqVO.getCountryCode());  // 匹配 ErpCustomCategoryItemDO 的 countryCode 与请求中的 countryCode

        return selectJoinPage(reqVO, ErpCustomRuleDO.class, wrapper);
    }

    // 分页查询 ERP 海关规则 BO 数据
    default PageResult<ErpCustomRuleBO> selectErpCustomRuleBOPage2(ErpCustomRulePageReqVO reqVO) {
        MPJLambdaWrapper<ErpCustomRuleDO> wrapper = new MPJLambdaWrapperX<ErpCustomRuleDO>()
//            .selectAsClass(ErpCustomRuleDO.class, ErpCustomRuleBO.class) // 将 ErpCustomRuleDO 的字段映射到 ErpCustomRuleBO
            .selectAs(ErpCustomRuleDO::getCountryCode, ErpCustomRuleBO::getCountryCode)
            .selectAs(ErpCustomRuleDO::getDeclaredValue, ErpCustomRuleBO::getDeclaredValue)
            .selectAs(ErpCustomRuleDO::getDeclaredValueCurrencyCode, ErpCustomRuleBO::getDeclaredValueCurrencyCode)
            .leftJoin(ErpProductDO.class, ErpProductDO::getId, ErpCustomRuleDO::getProductId)
            .leftJoin(ErpCustomCategoryDO.class, ErpCustomCategoryDO::getId, ErpProductDO::getCustomCategoryId)
            .selectAs(ErpCustomCategoryDO::getMaterial, ErpCustomRuleBO::getMaterial)
            .selectAs(ErpCustomCategoryDO::getDeclaredType, ErpCustomRuleBO::getDeclaredType)
            .selectAs(ErpCustomCategoryDO::getDeclaredTypeEn, ErpCustomRuleBO::getDeclaredTypeEn)
            .leftJoin(ErpCustomCategoryItemDO.class, ErpCustomCategoryItemDO::getCustomCategoryId, ErpCustomCategoryDO::getId)
            .selectAs(ErpCustomCategoryItemDO::getTaxRate, ErpCustomRuleBO::getTaxRate);  // 税率
        List<ErpCustomRuleBO> list = selectJoinList(ErpCustomRuleBO.class, wrapper);
        // 执行查询并返回分页结果，查询的结果会映射为 ErpCustomRuleBO 类型
        return null;
//        return selectJoinPage(reqVO, ErpCustomRuleBO.class, wrapper);
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

    default List<ErpCustomRuleDO> selectByProductId(List<Long> productIds) {
        return selectList(new LambdaQueryWrapperX<ErpCustomRuleDO>()
            .in(ErpCustomRuleDO::getProductId, productIds));
    }
}
