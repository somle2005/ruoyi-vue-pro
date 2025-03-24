package com.somle.shopify.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName(value = "shopify_token")
public class ShopifyToken {
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField(value = "shop_id")
    private Integer shopId;

    @TableField(value = "shop_name")
    private String shopName;

    @TableField(value = "access_token")
    private String accessToken;

    @TableField(value = "subdomain")
    private String subdomain;

    @TableField(value = "domain")
    private String domain;
}