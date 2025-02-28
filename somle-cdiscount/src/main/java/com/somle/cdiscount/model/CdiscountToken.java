package com.somle.cdiscount.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CdiscountToken {
    @Id
    private String access_token;
    private int expires_in;
    private int refresh_expires_in;
    private String token_type;
    private int not_before_policy;
    private String scope;
}
