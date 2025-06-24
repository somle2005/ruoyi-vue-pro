package com.jd.open.api.sdk.domain.hudong.SearchRecomJsfService.response.getSearchRecomList;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class Results implements Serializable {
   private String msg;
   private Long code;
   private List<SearchRecomVo> data;

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
   public void setData(List<SearchRecomVo> data) {
      this.data = data;
   }

   @JsonProperty("data")
   public List<SearchRecomVo> getData() {
      return this.data;
   }
}
