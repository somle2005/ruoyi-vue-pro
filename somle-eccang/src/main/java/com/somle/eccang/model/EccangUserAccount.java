package com.somle.eccang.model;

import java.time.LocalDateTime;


import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;

@Data
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class EccangUserAccount {
    private LocalDateTime lastOauthTime;
    private LocalDateTime lastAuthTime;
    private String tax;
    private String platform;
    private LocalDateTime updateDate;
    private String eori;
    private String belongPlatform;
    private String userAccountName;
    private String userAccount;
    private LocalDateTime createDate;
    private String isExpires;
    private LocalDateTime expiresIn;
    private LocalDateTime refreshTokenTimeout;
    private String status;

    // amazon only
    private String site;
}
