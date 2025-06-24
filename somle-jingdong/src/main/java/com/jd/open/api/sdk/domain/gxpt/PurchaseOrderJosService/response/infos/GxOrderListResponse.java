package com.jd.open.api.sdk.domain.gxpt.PurchaseOrderJosService.response.infos;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class GxOrderListResponse implements Serializable {
   private Integer code;
   private String msg;
   private List<Map> data;

   @JsonProperty("code")
   public void setCode(Integer code) {
      this.code = code;
   }

   @JsonProperty("code")
   public Integer getCode() {
      return this.code;
   }

   @JsonProperty("msg")
   public void setMsg(String msg) {
      this.msg = msg;
   }

   @JsonProperty("msg")
   public String getMsg() {
      return this.msg;
   }

   @JsonProperty("data")
   public void setData(List<Map> data) {
      this.data = data;
   }

   @JsonProperty("data")
   public List<Map> getData() {
      return this.data;
   }
}
