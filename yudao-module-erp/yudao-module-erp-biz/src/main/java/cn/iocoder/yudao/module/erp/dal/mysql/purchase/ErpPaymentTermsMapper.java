package cn.iocoder.yudao.module.erp.dal.mysql.purchase;

import java.util.*;

import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.mybatis.core.query.LambdaQueryWrapperX;
import cn.iocoder.yudao.framework.mybatis.core.mapper.BaseMapperX;
import cn.iocoder.yudao.module.erp.controller.admin.purchase.vo.paymentterms.ErpPaymentTermsPageReqVO;
import cn.iocoder.yudao.module.erp.dal.dataobject.purchase.ErpPaymentTermsDO;
import org.apache.ibatis.annotations.Mapper;


/**
 * 付款条款管理 Mapper
 *
 * @author 王奇辉
 */
@Mapper
public interface ErpPaymentTermsMapper extends BaseMapperX<ErpPaymentTermsDO> {

    default PageResult<ErpPaymentTermsDO> selectPage(ErpPaymentTermsPageReqVO reqVO) {
        return selectPage(reqVO, new LambdaQueryWrapperX<ErpPaymentTermsDO>()
                .eqIfPresent(ErpPaymentTermsDO::getCode, reqVO.getCode())
                .eqIfPresent(ErpPaymentTermsDO::getDescription, reqVO.getDescription())
                .eqIfPresent(ErpPaymentTermsDO::getIsDomestic, reqVO.getIsDomestic())
                .eqIfPresent(ErpPaymentTermsDO::getDescriptionEn, reqVO.getDescriptionEn())
                .betweenIfPresent(ErpPaymentTermsDO::getCreateTime, reqVO.getCreateTime())
                .orderByDesc(ErpPaymentTermsDO::getId));
    }

}