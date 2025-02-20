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
    /**
     * 分页查询ERP海关规则数据
     *
     * @param reqVO 包含分页和筛选条件的请求对象
     * @return 满足条件的海关规则数据分页结果
     */
    default PageResult<ErpCustomRuleDO> selectPage(ErpCustomRulePageReqVO reqVO) {
        MPJLambdaWrapper<ErpCustomRuleDO> query = new MPJLambdaWrapperX<ErpCustomRuleDO>()
            .selectAll(ErpCustomRuleDO.class)
            .eqIfPresent(ErpCustomRuleDO::getCountryCode, reqVO.getCountryCode())  // 国家编码
//            .likeIfPresent(ErpCustomRuleDO::getDeclaredTypeEn, reqVO.getDeclaredTypeEn())  // 申报品名（英文）
//            .likeIfPresent(ErpCustomRuleDO::getDeclaredType, reqVO.getDeclaredType())  // 申报品名
            .eqIfPresent(ErpCustomRuleDO::getDeclaredValue, reqVO.getDeclaredValue())  // 申报金额
            .eqIfPresent(ErpCustomRuleDO::getDeclaredValueCurrencyCode, reqVO.getDeclaredValueCurrencyCode())  // 申报金额币种
//            .eqIfPresent(ErpCustomRuleDO::getTaxRate, reqVO.getTaxRate())  // 税率
            .eqIfPresent(ErpCustomRuleDO::getHscode, reqVO.getHscode())  // HS编码
            .eqIfPresent(ErpCustomRuleDO::getLogisticAttribute, reqVO.getLogisticAttribute())  // 物流属性
            .likeIfPresent(ErpCustomRuleDO::getFbaBarCode, reqVO.getFbaBarCode())  // FBA条形码
            .betweenIfPresent(ErpCustomRuleDO::getCreateTime, reqVO.getCreateTime())  // 创建时间范围
            .orderByDesc(ErpCustomRuleDO::getId)
            .leftJoin(ErpProductDO.class, ErpProductDO::getId, ErpCustomRuleDO::getProductId)
            .likeIfExists(ErpProductDO::getBarCode, reqVO.getBarCode())
            .leftJoin(ErpCustomCategoryDO.class, ErpCustomCategoryDO::getId, ErpProductDO::getCustomCategoryId) // 关联分类表
            .select(ErpCustomCategoryDO::getDeclaredType)
            .select(ErpCustomCategoryDO::getDeclaredTypeEn)
            .select(ErpCustomCategoryDO::getMaterial)
            .leftJoin(ErpCustomCategoryItemDO.class, ErpCustomCategoryItemDO::getId, ErpCustomCategoryDO::getId)
            .select(ErpCustomCategoryItemDO::getCountryCode)
            .select(ErpCustomCategoryItemDO::getHsCode)
            .select(ErpCustomCategoryItemDO::getTaxRate)
            .eqIfExists(ErpCustomCategoryItemDO::getCountryCode, reqVO.getCountryCode())  // 匹配 ErpCustomCategoryItemDO 的 countryCode 与 ErpCustomRuleDO 的 countryCode
            ;

        return selectJoinPage(reqVO, ErpCustomRuleDO.class, query);
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
