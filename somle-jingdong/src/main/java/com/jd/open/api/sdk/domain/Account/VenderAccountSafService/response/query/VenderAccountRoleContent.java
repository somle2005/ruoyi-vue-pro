package com.jd.open.api.sdk.domain.Account.VenderAccountSafService.response.query;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class VenderAccountRoleContent implements Serializable {
   private String[] accountName;
   private Long[] roleId;
   private String[] roleName;

   @JsonProperty("account_name")
   public void setAccountName(String[] accountName) {
      this.accountName = accountName;
   }

   @JsonProperty("account_name")
   public String[] getAccountName() {
      return this.accountName;
   }

   @JsonProperty("role_id")
   public void setRoleId(Long[] roleId) {
      this.roleId = roleId;
   }

   @JsonProperty("role_id")
   public Long[] getRoleId() {
      return this.roleId;
   }

   @JsonProperty("role_name")
   public void setRoleName(String[] roleName) {
      this.roleName = roleName;
   }

   @JsonProperty("role_name")
   public String[] getRoleName() {
      return this.roleName;
   }
}
