package com.jd.open.api.sdk.domain.youE.OfflineSettleJsfService.response.getRecyclerSettleBill;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class Result implements Serializable {
   private int count;
   private Integer code;
   private String msg;
   private List<RecyclerSettle> data;

   @JsonProperty("count")
   public void setCount(int count) {
      this.count = count;
   }

   @JsonProperty("count")
   public int getCount() {
      return this.count;
   }

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
   public void setData(List<RecyclerSettle> data) {
      this.data = data;
   }

   @JsonProperty("data")
   public List<RecyclerSettle> getData() {
      return this.data;
   }
}
