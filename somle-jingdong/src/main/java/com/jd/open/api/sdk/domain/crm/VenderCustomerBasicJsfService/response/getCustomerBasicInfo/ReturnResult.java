package com.jd.open.api.sdk.domain.crm.VenderCustomerBasicJsfService.response.getCustomerBasicInfo;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class ReturnResult implements Serializable {
   private String code;
   private String desc;
   private VenderCustomerBasic data;

   @JsonProperty("code")
   public void setCode(String code) {
      this.code = code;
   }

   @JsonProperty("code")
   public String getCode() {
      return this.code;
   }

   @JsonProperty("desc")
   public void setDesc(String desc) {
      this.desc = desc;
   }

   @JsonProperty("desc")
   public String getDesc() {
      return this.desc;
   }

   @JsonProperty("data")
   public void setData(VenderCustomerBasic data) {
      this.data = data;
   }

   @JsonProperty("data")
   public VenderCustomerBasic getData() {
      return this.data;
   }
}
