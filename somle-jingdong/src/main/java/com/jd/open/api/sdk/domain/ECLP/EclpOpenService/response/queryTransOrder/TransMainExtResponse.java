package com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.queryTransOrder;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class TransMainExtResponse implements Serializable {
   private String msg;
   private Integer code;
   private List<TransMainExtMain> transMainList;

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

   @JsonProperty("transMainList")
   public void setTransMainList(List<TransMainExtMain> transMainList) {
      this.transMainList = transMainList;
   }

   @JsonProperty("transMainList")
   public List<TransMainExtMain> getTransMainList() {
      return this.transMainList;
   }
}
