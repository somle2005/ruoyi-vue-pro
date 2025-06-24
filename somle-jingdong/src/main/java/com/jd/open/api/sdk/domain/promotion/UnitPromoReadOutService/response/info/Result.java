package com.jd.open.api.sdk.domain.promotion.UnitPromoReadOutService.response.info;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class Result implements Serializable {
   private String msg;
   private Integer code;
   private Boolean success;
   private UnitPromoShowVO unitPromoShowVO;

   @JsonProperty("msg")
   public void setMsg(String msg) {
      this.msg = msg;
   }

   @JsonProperty("msg")
   public String getMsg() {
      return this.msg;
   }

   @JsonProperty("code")
   public void setCode(Integer code) {
      this.code = code;
   }

   @JsonProperty("code")
   public Integer getCode() {
      return this.code;
   }

   @JsonProperty("success")
   public void setSuccess(Boolean success) {
      this.success = success;
   }

   @JsonProperty("success")
   public Boolean getSuccess() {
      return this.success;
   }

   @JsonProperty("unitPromoShowVO")
   public void setUnitPromoShowVO(UnitPromoShowVO unitPromoShowVO) {
      this.unitPromoShowVO = unitPromoShowVO;
   }

   @JsonProperty("unitPromoShowVO")
   public UnitPromoShowVO getUnitPromoShowVO() {
      return this.unitPromoShowVO;
   }
}
