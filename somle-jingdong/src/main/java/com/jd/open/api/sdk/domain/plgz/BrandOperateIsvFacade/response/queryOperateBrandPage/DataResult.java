package com.jd.open.api.sdk.domain.plgz.BrandOperateIsvFacade.response.queryOperateBrandPage;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class DataResult implements Serializable {
   private String msg;
   private String code;
   private Boolean success;
   private PageList data;

   @JsonProperty("msg")
   public void setMsg(String msg) {
      this.msg = msg;
   }

   @JsonProperty("msg")
   public String getMsg() {
      return this.msg;
   }

   @JsonProperty("code")
   public void setCode(String code) {
      this.code = code;
   }

   @JsonProperty("code")
   public String getCode() {
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

   @JsonProperty("data")
   public void setData(PageList data) {
      this.data = data;
   }

   @JsonProperty("data")
   public PageList getData() {
      return this.data;
   }
}
