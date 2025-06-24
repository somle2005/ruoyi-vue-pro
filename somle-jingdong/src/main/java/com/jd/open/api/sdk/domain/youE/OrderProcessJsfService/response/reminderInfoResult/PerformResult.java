package com.jd.open.api.sdk.domain.youE.OrderProcessJsfService.response.reminderInfoResult;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class PerformResult implements Serializable {
   private String msg;
   private Integer resultCode;
   private List<FailRemindInfo> data;

   @JsonProperty("msg")
   public void setMsg(String msg) {
      this.msg = msg;
   }

   @JsonProperty("msg")
   public String getMsg() {
      return this.msg;
   }

   @JsonProperty("resultCode")
   public void setResultCode(Integer resultCode) {
      this.resultCode = resultCode;
   }

   @JsonProperty("resultCode")
   public Integer getResultCode() {
      return this.resultCode;
   }

   @JsonProperty("data")
   public void setData(List<FailRemindInfo> data) {
      this.data = data;
   }

   @JsonProperty("data")
   public List<FailRemindInfo> getData() {
      return this.data;
   }
}
