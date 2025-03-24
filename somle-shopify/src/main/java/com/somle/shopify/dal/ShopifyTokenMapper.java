package com.somle.shopify.dal;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.somle.shopify.model.ShopifyToken;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface ShopifyTokenMapper extends BaseMapper<ShopifyToken> {

}