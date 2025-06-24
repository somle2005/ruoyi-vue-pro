package com.jd.open.api.sdk.domain.hudong.SearchRecomJsfService.response.getSkuList;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class Results implements Serializable {
   private String msg;
   private Long code;
   private PageDTO data;

   @JsonProperty("msg")
   public void setMsg(String msg) {
      this.msg = msg;
   }

   @JsonProperty("msg")
   public String getMsg() {
      return this.msg;
   }

   @JsonProperty("code")
   public void setCode(Long code) {
      this.code = code;
   }

   @JsonProperty("code")
   public Long getCode() {
      return this.code;
   }

   @JsonProperty("data")
   public void setData(PageDTO data) {
      this.data = data;
   }

   @JsonProperty("data")
   public PageDTO getData() {
      return this.data;
   }
}
