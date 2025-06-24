package com.jd.open.api.sdk.domain.youE.PerformInfoSyncExportService.response.updateOrderInfo;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class PerformResult implements Serializable {
   private String msg;
   private Integer resultCode;
   private SyncOrderInfoResult data;

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
   public void setData(SyncOrderInfoResult data) {
      this.data = data;
   }

   @JsonProperty("data")
   public SyncOrderInfoResult getData() {
      return this.data;
   }
}
