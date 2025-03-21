package com.somle.walmart.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.somle.walmart.domain.WalmartShopAndTokenInfo;
import com.somle.walmart.domain.WalmartToken;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface WalmartTokenMapper extends BaseMapper<WalmartToken> {

    List<WalmartShopAndTokenInfo> getShopAndTokenInfo();

}