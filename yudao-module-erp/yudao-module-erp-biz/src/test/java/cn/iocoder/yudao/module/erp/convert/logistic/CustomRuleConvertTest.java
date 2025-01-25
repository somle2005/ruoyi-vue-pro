package cn.iocoder.yudao.module.erp.convert.logistic;

import cn.iocoder.yudao.framework.test.core.ut.BaseDbUnitTest;
import cn.iocoder.yudao.module.erp.api.logistic.customrule.dto.ErpCustomRuleDTO;
import cn.iocoder.yudao.module.erp.api.product.dto.ErpProductDetailDTO;
import cn.iocoder.yudao.module.erp.dal.dataobject.logistic.customrule.ErpCustomRuleDO;
import cn.iocoder.yudao.module.erp.dal.dataobject.product.ErpProductDO;
import cn.iocoder.yudao.module.erp.dal.mysql.logistic.customrule.ErpCustomRuleMapper;
import cn.iocoder.yudao.module.erp.dal.mysql.product.ErpProductMapper;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static cn.iocoder.yudao.framework.common.util.collection.CollectionUtils.convertMap;

@Slf4j
class CustomRuleConvertTest extends BaseDbUnitTest {
    @Resource
    ErpCustomRuleMapper customRuleMapper;
    @Resource
    ErpProductMapper productMapper;

    @Test
    void convert() {
        customRuleMapper.selectList().forEach(customRule -> {
            ErpCustomRuleDTO convert = CustomRuleConvert.INSTANCE.convert(customRule);
            log.info("{}", convert);
        });
    }

    @Test
    void testConvert() {
    }

    @Test
    void testConvert1() {
        List<ErpProductDO> erpProductDOS = productMapper.selectList();
        //获得ids
        List<Long> ids = erpProductDOS.stream().map(ErpProductDO::getId).toList();
        //构造map
        Map<Long, ErpProductDO> doMap = convertMap(productMapper.selectBatchIds(ids), ErpProductDO::getId);
        //构造customRules
        List<ErpCustomRuleDO> ruleDOS = customRuleMapper.selectByProductId(ids);
        //转换
        List<ErpProductDetailDTO> convert = CustomRuleConvert.INSTANCE.convert(ruleDOS, doMap);
        //log
        convert.forEach(convert1 -> {
            log.info("{}", convert1);
        });
        //
        Map<Long, List<ErpCustomRuleDO>> ruleDOMap = customRuleMapper.selectList().stream()
            .collect(Collectors.groupingBy(ErpCustomRuleDO::getProductId));
        System.out.println("ruleDOMap = " + ruleDOMap);
//        for (ErpProductDetailDTO dto : CustomRuleConvert.INSTANCE.convertByProduct(erpProductDOS, ruleDOMap)) {
//            log.info("{}", dto);
//        }

    }

    @Test
    void testConvert2() {
    }

    @Test
    void testConvert3() {
    }
}