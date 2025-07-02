package com.somle.xincang.model;

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
@Table(name = "xincang_account")
public class XinCangAccount {
    @Id
    private Long id;
    private String appKey;
    private String secret;
    private String token;

}
