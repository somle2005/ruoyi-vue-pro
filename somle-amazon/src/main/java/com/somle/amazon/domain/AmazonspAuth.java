package com.somle.amazon.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;
import lombok.Data;

@Data
@TableName(value = "amazonsp_auth")
public class AmazonspAuth {
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField(value = "seller_id")
    private String sellerId;

    @TableField(value = "region_code")
    private String regionCode;

    @TableField(value = "client_id")
    private String clientId;

    @TableField(value = "access_token")
    private String accessToken;

    @TableField(value = "refresh_token")
    private String refreshToken;

    @TableField(value = "sp_url")
    private String spUrl;

    @TableField(value = "ad_url")
    private String adUrl;

    @TableField(value = "expiration_date")
    private LocalDateTime expirationDate;
}