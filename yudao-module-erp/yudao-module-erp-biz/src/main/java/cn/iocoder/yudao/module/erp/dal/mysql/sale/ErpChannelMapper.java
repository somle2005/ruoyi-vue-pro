package cn.iocoder.yudao.module.erp.dal.mysql.sale;

import java.util.*;

import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.mybatis.core.query.LambdaQueryWrapperX;
import cn.iocoder.yudao.framework.mybatis.core.mapper.BaseMapperX;
import cn.iocoder.yudao.module.erp.controller.admin.sale.vo.channel.ErpChannelListReqVO;
import cn.iocoder.yudao.module.erp.controller.admin.sale.vo.channel.ErpChannelPageReqVO;
import cn.iocoder.yudao.module.erp.dal.dataobject.sale.ErpChannelDO;
import org.apache.ibatis.annotations.Mapper;

/**
 * ERP 渠道 Mapper
 *
 * @author 王奇辉
 */
@Mapper
public interface ErpChannelMapper extends BaseMapperX<ErpChannelDO> {

    default List<ErpChannelDO> selectList(ErpChannelListReqVO reqVO) {
        return selectList(new LambdaQueryWrapperX<ErpChannelDO>()
                .likeIfPresent(ErpChannelDO::getName, reqVO.getName())
                .eqIfPresent(ErpChannelDO::getStatus, reqVO.getStatus()));
    }

    /**
    * @Author Wqh
    * @Description 校验渠道名称是否重复 || 渠道编码是否重复
    * @Date 15:47 2024/11/6
    * @Param [parentId, name, code]
    * @return cn.iocoder.yudao.module.erp.dal.dataobject.sale.ErpChannelDO
    **/
    default List<ErpChannelDO> selectByParentIdAndNameOrCode(String name, String code){
        return selectList(new LambdaQueryWrapperX<ErpChannelDO>()
                .eq(ErpChannelDO::getName, name)
                        .or()
                        .eq(ErpChannelDO::getCode, code));
    }

    /**
    * @Author Wqh
    * @Description 获取子渠道的数量
    * @Date 8:54 2024/11/7
    * @Param [id]
    * @return java.lang.Long
    **/
    default Long selectCountByParentId(Long id){
        return selectCount(new LambdaQueryWrapperX<ErpChannelDO>()
                .eq(ErpChannelDO::getParentId, id));
    }

    /**
    * @Author Wqh
    * @Description 获取所有的子渠道
    * @Date 8:54 2024/11/7
    * @Param [id]
    * @return java.util.List<cn.iocoder.yudao.module.erp.dal.dataobject.sale.ErpChannelDO>
    **/
    default List<ErpChannelDO> selectByParentId(Long id){
        return selectList(new LambdaQueryWrapperX<ErpChannelDO>()
                .eq(ErpChannelDO::getParentId, id));
    }
}