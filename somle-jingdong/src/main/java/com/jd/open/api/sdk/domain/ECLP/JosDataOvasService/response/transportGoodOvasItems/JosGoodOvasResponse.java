package com.jd.open.api.sdk.domain.ECLP.JosDataOvasService.response.transportGoodOvasItems;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class JosGoodOvasResponse implements Serializable {
   private String msg;
   private Integer code;
   private List<GvasModifyStatusResponse> data;

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

   @JsonProperty("data")
   public void setData(List<GvasModifyStatusResponse> data) {
      this.data = data;
   }

   @JsonProperty("data")
   public List<GvasModifyStatusResponse> getData() {
      return this.data;
   }
}
