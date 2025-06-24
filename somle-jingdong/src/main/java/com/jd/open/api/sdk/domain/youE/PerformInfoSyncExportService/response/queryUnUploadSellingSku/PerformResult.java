package com.jd.open.api.sdk.domain.youE.PerformInfoSyncExportService.response.queryUnUploadSellingSku;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class PerformResult implements Serializable {
   private String msg;
   private Integer resultCode;
   private Integer total;
   private List<SkuInfo> data;

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

   @JsonProperty("total")
   public void setTotal(Integer total) {
      this.total = total;
   }

   @JsonProperty("total")
   public Integer getTotal() {
      return this.total;
   }

   @JsonProperty("data")
   public void setData(List<SkuInfo> data) {
      this.data = data;
   }

   @JsonProperty("data")
   public List<SkuInfo> getData() {
      return this.data;
   }
}
