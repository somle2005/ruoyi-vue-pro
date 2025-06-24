package com.jd.open.api.sdk.domain.O2O.LocOrderCodeSoaService.request.revokeCheckNumber;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class RevokeCheckNumCardParam implements Serializable {
   private String extCodeNum;
   private String extPwdNumber;
   private Integer count;

   @JsonProperty("extCodeNum")
   public void setExtCodeNum(String extCodeNum) {
      this.extCodeNum = extCodeNum;
   }

   @JsonProperty("extCodeNum")
   public String getExtCodeNum() {
      return this.extCodeNum;
   }

   @JsonProperty("extPwdNumber")
   public void setExtPwdNumber(String extPwdNumber) {
      this.extPwdNumber = extPwdNumber;
   }

   @JsonProperty("extPwdNumber")
   public String getExtPwdNumber() {
      return this.extPwdNumber;
   }

   @JsonProperty("count")
   public void setCount(Integer count) {
      this.count = count;
   }

   @JsonProperty("count")
   public Integer getCount() {
      return this.count;
   }
}
