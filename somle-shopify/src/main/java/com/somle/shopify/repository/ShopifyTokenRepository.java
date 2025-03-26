package com.somle.shopify.repository;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.somle.shopify.model.ShopifyTokenDO;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface ShopifyTokenRepository extends BaseMapper<ShopifyTokenDO> {

}