package com.somle.walmart.repository;

import cn.iocoder.yudao.framework.mybatis.core.mapper.BaseMapperX;
import com.somle.walmart.model.WalmartTokenDO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface WalmartTokenRepository extends BaseMapperX<WalmartTokenDO> {

}