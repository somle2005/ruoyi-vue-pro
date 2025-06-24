package com.jd.open.api.sdk.domain.vender;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class Vender implements Serializable {
   private static final long serialVersionUID = 2089830496122875606L;
   private long venderId;
   private int colType;
   private int subAccount;
   private String accessCode;
   private int categoryMain;
   private String loginName;
   private String shopName;
   private long shopId;

   @JsonProperty("vender_id")
   public long getVenderId() {
      return this.venderId;
   }

   @JsonProperty("vender_id")
   public void setVenderId(long venderId) {
      this.venderId = venderId;
   }

   @JsonProperty("col_type")
   public int getColType() {
      return this.colType;
   }

   @JsonProperty("col_type")
   public void setColType(int colType) {
      this.colType = colType;
   }

   @JsonProperty("sub_account")
   public int isSubAccount() {
      return this.subAccount;
   }

   @JsonProperty("sub_account")
   public void setSubAccount(int subAccount) {
      this.subAccount = subAccount;
   }

   @JsonProperty("access_code")
   public String getAccessCode() {
      return this.accessCode;
   }

   @JsonProperty("access_code")
   public void setAccessCode(String accessCode) {
      this.accessCode = accessCode;
   }

   @JsonProperty("category_main")
   public int getCategoryMain() {
      return this.categoryMain;
   }

   @JsonProperty("category_main")
   public void setCategoryMain(int categoryMain) {
      this.categoryMain = categoryMain;
   }

   @JsonProperty("login_name")
   public String getLoginName() {
      return this.loginName;
   }

   @JsonProperty("login_name")
   public void setLoginName(String loginName) {
      this.loginName = loginName;
   }

   @JsonProperty("shop_id")
   public long getShopId() {
      return this.shopId;
   }

   @JsonProperty("shop_id")
   public void setShopId(long shopId) {
      this.shopId = shopId;
   }

   @JsonProperty("shop_name")
   public String getShopName() {
      return this.shopName;
   }

   @JsonProperty("shop_name")
   public void setShopName(String shopName) {
      this.shopName = shopName;
   }
}
