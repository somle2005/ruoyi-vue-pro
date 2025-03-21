package com.somle.walmart.dal;

import cn.iocoder.yudao.framework.mybatis.core.mapper.BaseMapperX;
import com.somle.walmart.model.WalmartToken;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface WalmartTokenMapper extends BaseMapperX<WalmartToken> {

}