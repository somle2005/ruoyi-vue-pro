package cn.iocoder.yudao.module.erp.service.logistic.customrule;

import cn.iocoder.yudao.framework.common.exception.util.ThrowUtil;
import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.common.util.object.BeanUtils;
import cn.iocoder.yudao.module.erp.api.product.dto.ErpCustomRuleDTO;
import cn.iocoder.yudao.module.erp.controller.admin.logistic.customrule.vo.ErpCustomRulePageReqVO;
import cn.iocoder.yudao.module.erp.controller.admin.logistic.customrule.vo.ErpCustomRuleSaveReqVO;
import cn.iocoder.yudao.module.erp.convert.logistic.CustomRuleConvert;
import cn.iocoder.yudao.module.erp.dal.dataobject.logistic.customrule.ErpCustomRuleDO;
import cn.iocoder.yudao.module.erp.dal.dataobject.product.ErpProductDO;
import cn.iocoder.yudao.module.erp.dal.mysql.logistic.customrule.ErpCustomRuleMapper;
import cn.iocoder.yudao.module.erp.dal.mysql.product.ErpProductMapper;
import cn.iocoder.yudao.module.erp.service.product.ErpProductService;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import java.util.List;
import java.util.Objects;

import static cn.iocoder.yudao.framework.common.exception.enums.GlobalErrorCodeConstants.DB_INSERT_ERROR;
import static cn.iocoder.yudao.framework.common.exception.enums.GlobalErrorCodeConstants.DB_UPDATE_ERROR;
import static cn.iocoder.yudao.framework.common.exception.util.ServiceExceptionUtil.exception;
import static cn.iocoder.yudao.module.erp.enums.ErrorCodeConstants.CUSTOM_RULE_NOT_EXISTS;
import static cn.iocoder.yudao.module.erp.enums.ErrorCodeConstants.NO_REPEAT_OF_COUNTRY_CODE_AND_PRODUCT_CODE;

/**
 * ERP 海关规则 Service 实现类
 *
 * @author 索迈管理员
 */
@Slf4j
@Service
@Validated
public class ErpCustomRuleServiceImpl implements ErpCustomRuleService {
    @Resource
    private MessageChannel erpCustomRuleChannel;

    @Resource
    ErpCustomRuleMapper customRuleMapper;

    @Resource
    ErpProductService erpProductService;
    @Autowired
    private ErpProductMapper erpProductMapper;
    @Autowired
    private ErpCustomRuleMapper erpCustomRuleMapper;


    @Override
    public Long createCustomRule(ErpCustomRuleSaveReqVO createReqVO) {
        //判断国别+产品编码是否重复
        validateExist(null, createReqVO.getCountryCode(), createReqVO.getProductId());
        //插入
        ErpCustomRuleDO customRule = BeanUtils.toBean(createReqVO, ErpCustomRuleDO.class);
        //填充barCode(产品sku),根据产品id
        ThrowUtil.ifSqlThrow(customRuleMapper.insert(customRule
        ), DB_INSERT_ERROR);
        Long id = customRule.getId();
        //同步产品数据
        ErpCustomRuleDTO dto = listErpCustomRuleDTOById(id);
        erpCustomRuleChannel.send(MessageBuilder.withPayload(List.of(dto)).build());
        // 返回
        return id;
    }

    @Override
    public void updateCustomRule(ErpCustomRuleSaveReqVO updateReqVO) {
        Long id = updateReqVO.getId();
        //判断国别+产品编码是否重复
        validateExist(id, updateReqVO.getCountryCode(), updateReqVO.getProductId());
        // 校验存在
        validateCustomRuleExists(id);
        // 更新
        ErpCustomRuleDO updateObj = BeanUtils.toBean(updateReqVO, ErpCustomRuleDO.class);
        ThrowUtil.ifSqlThrow(customRuleMapper.updateById(updateObj), DB_UPDATE_ERROR);
        //同步产品数据
        ErpCustomRuleDTO dto = listErpCustomRuleDTOById(id);
        erpCustomRuleChannel.send(MessageBuilder.withPayload(List.of(dto)).build());
    }

    @Override
    public void deleteCustomRule(Long id) {
        // 校验存在
        validateCustomRuleExists(id);
        // 删除
        customRuleMapper.deleteById(id);
    }

    private void validateCustomRuleExists(Long id) {
        if (customRuleMapper.selectById(id) == null) {
            throw exception(CUSTOM_RULE_NOT_EXISTS);
        }
    }

    @Override
    public ErpCustomRuleDO getCustomRule(Long id) {
        return customRuleMapper.selectById(id);
    }

    @Override
    public PageResult<ErpCustomRuleDO> getCustomRulePage(ErpCustomRulePageReqVO pageReqVO) {
        return customRuleMapper.selectPage(pageReqVO);
    }

    private void validateExist(Long id, Integer countryCode, Long productId) {
        //TODO 城市code+产品id是否存在,校验-wdy
        ErpCustomRuleDO erpCustomRuleDO = customRuleMapper.getCustomRuleByCountryCodeAndProductId(countryCode, productId);
        if (erpCustomRuleDO == null) {
            return;
        }
        // 如果 id 为空，说明不用比较是否为相同 id 的字典类型
        if (id == null) {
            throw exception(NO_REPEAT_OF_COUNTRY_CODE_AND_PRODUCT_CODE);
        }
        if (!erpCustomRuleDO.getId().equals(id)) {
            throw exception(NO_REPEAT_OF_COUNTRY_CODE_AND_PRODUCT_CODE);
        }
    }

    /**
     * 获得所有海关规则列表
     *
     * @return List<ErpCustomRuleDTO>
     */
    @Override
    public List<ErpCustomRuleDTO> listCustomRules() {
        List<ErpCustomRuleDO> customRuleDOS = customRuleMapper.selectList();
        //收集海关规则的productIds
        List<Long> productIds = customRuleDOS.stream().filter(Objects::nonNull).map(ErpCustomRuleDO::getProductId).toList();
        return CustomRuleConvert.INSTANCE.convertToDTOList(customRuleDOS, erpProductService.getProductMap(productIds));
    }

    /**
     * 根据海关规则id获取产品的全量信息（海关规则，产品供应商） 1规则：1产品
     *
     * @param id 海关规则id
     * @return List<ErpCustomRuleDTO> DTO 海关信息+产品信息
     */
    @Override
    public ErpCustomRuleDTO listErpCustomRuleDTOById(Long id) {
        validateCustomRuleExists(id);
        //1.0 根据海关规则的id获得产品id
        ErpCustomRuleDO erpCustomRuleDO = erpCustomRuleMapper.selectById(id);
        //2.0 获得产品id
        Long productId = erpCustomRuleDO.getProductId();
        //2.1 获得产品
        ErpProductDO erpProductDO = erpProductMapper.selectById(productId);
        return CustomRuleConvert.INSTANCE.convert(erpCustomRuleDO, erpProductDO);
    }



}