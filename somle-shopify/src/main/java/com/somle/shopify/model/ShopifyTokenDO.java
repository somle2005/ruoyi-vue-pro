package com.somle.shopify.model;

import cn.iocoder.yudao.framework.mybatis.core.dataobject.BaseDO;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serial;

@Data
@TableName(value = "shopify_token")
public class ShopifyTokenDO extends BaseDO {

    @Serial
    private static final long serialVersionUID = 2142261931287687446L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @TableField(value = "access_token")
    private String accessToken;

    @TableField(value = "subdomain")
    private String subdomain;

    @TableField(value = "domain")
    private String domain;
}