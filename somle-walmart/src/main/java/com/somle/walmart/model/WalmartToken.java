package com.somle.walmart.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "walmart_token_maomao")
public class WalmartToken {
    @Id
    private Long id;
    private String shopName;
    private String clientId;
    private String clientSecret;
    private String svcName;
    private String consumerChannelType;
    private String accessToken;
    private String shipNode;
}
