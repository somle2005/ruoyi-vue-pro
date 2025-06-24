package com.somle.doudian.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "doudian_account")
public class DouDianAccount {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String appKey;
    private String appSecret;
    @Column(columnDefinition = "TEXT")
    private String refreshToken;
    @Column(columnDefinition = "TEXT")
    private String accessToken;
    // 店铺id与access_token是一对一关系
    private Long shopId;
    private String shopName;
    @Column(columnDefinition = "TEXT")
    private String accessTokenJson;
}
