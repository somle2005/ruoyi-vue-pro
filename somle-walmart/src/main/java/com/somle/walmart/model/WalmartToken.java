package com.somle.walmart.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName(value = "walmart_token")
public class WalmartToken {
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @TableField(value = "client_id")
    private String clientId;

    @TableField(value = "client_secret")
    private String clientSecret;

    @TableField(value = "svc_name")
    private String svcName;

    @TableField(value = "consumer_channel_type")
    private String consumerChannelType;

    @TableField(value = "correlation_id")
    private String correlationId;

    @TableField(value = "access_token")
    private String accessToken;

    @TableField(value = "domain")
    private String domain;

}