package com.jd.open.api.sdk.domain.youE.SettleBillQueryJsfService.response.querySettleBillDetail;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class PerformResult implements Serializable {
   private String msg;
   private Integer resultCode;
   private List<SettleBillDetailInfo> data;
   private Integer totalNum;

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
   public void setData(List<SettleBillDetailInfo> data) {
      this.data = data;
   }

   @JsonProperty("data")
   public List<SettleBillDetailInfo> getData() {
      return this.data;
   }

   @JsonProperty("totalNum")
   public void setTotalNum(Integer totalNum) {
      this.totalNum = totalNum;
   }

   @JsonProperty("totalNum")
   public Integer getTotalNum() {
      return this.totalNum;
   }
}
