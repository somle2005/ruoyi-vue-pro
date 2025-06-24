package com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.queryB2BSWbMain;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class CoCreateLwbResultForQueryB2BSWbMain implements Serializable {
   private int resultCode;
   private String resultMsg;
   private LwbMain lwbMain;
   private List<Waybill> waybillList;

   @JsonProperty("resultCode")
   public void setResultCode(int resultCode) {
      this.resultCode = resultCode;
   }

   @JsonProperty("resultCode")
   public int getResultCode() {
      return this.resultCode;
   }

   @JsonProperty("resultMsg")
   public void setResultMsg(String resultMsg) {
      this.resultMsg = resultMsg;
   }

   @JsonProperty("resultMsg")
   public String getResultMsg() {
      return this.resultMsg;
   }

   @JsonProperty("lwbMain")
   public void setLwbMain(LwbMain lwbMain) {
      this.lwbMain = lwbMain;
   }

   @JsonProperty("lwbMain")
   public LwbMain getLwbMain() {
      return this.lwbMain;
   }

   @JsonProperty("waybillList")
   public void setWaybillList(List<Waybill> waybillList) {
      this.waybillList = waybillList;
   }

   @JsonProperty("waybillList")
   public List<Waybill> getWaybillList() {
      return this.waybillList;
   }
}
