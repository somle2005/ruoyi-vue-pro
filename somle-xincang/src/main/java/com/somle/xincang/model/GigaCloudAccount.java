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
@Table(name = "gigacloud_account")
public class GigaCloudAccount {
    @Id
    private Long id;
    private String userName;
    private String password;
    private String token;

}
