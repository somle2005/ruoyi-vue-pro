package com.jd.open.api.sdk.domain.ECLP.WaybillQueryApi.response.WaybillQueryApi;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class WaybillQryFreightsResultDTO implements Serializable {
   private Boolean result;
   private String errMsg;
   private String waybillCode;
   private String totalFreights;
   private String basicFreight;
   private String boxCharge;
   private WaybillExtraCharge waybillExtraCharge;
   private String springFestivalPeakSurcharge;

   @JsonProperty("result")
   public void setResult(Boolean result) {
      this.result = result;
   }

   @JsonProperty("result")
   public Boolean getResult() {
      return this.result;
   }

   @JsonProperty("errMsg")
   public void setErrMsg(String errMsg) {
      this.errMsg = errMsg;
   }

   @JsonProperty("errMsg")
   public String getErrMsg() {
      return this.errMsg;
   }

   @JsonProperty("waybillCode")
   public void setWaybillCode(String waybillCode) {
      this.waybillCode = waybillCode;
   }

   @JsonProperty("waybillCode")
   public String getWaybillCode() {
      return this.waybillCode;
   }

   @JsonProperty("totalFreights")
   public void setTotalFreights(String totalFreights) {
      this.totalFreights = totalFreights;
   }

   @JsonProperty("totalFreights")
   public String getTotalFreights() {
      return this.totalFreights;
   }

   @JsonProperty("basicFreight")
   public void setBasicFreight(String basicFreight) {
      this.basicFreight = basicFreight;
   }

   @JsonProperty("basicFreight")
   public String getBasicFreight() {
      return this.basicFreight;
   }

   @JsonProperty("boxCharge")
   public void setBoxCharge(String boxCharge) {
      this.boxCharge = boxCharge;
   }

   @JsonProperty("boxCharge")
   public String getBoxCharge() {
      return this.boxCharge;
   }

   @JsonProperty("waybillExtraCharge")
   public void setWaybillExtraCharge(WaybillExtraCharge waybillExtraCharge) {
      this.waybillExtraCharge = waybillExtraCharge;
   }

   @JsonProperty("waybillExtraCharge")
   public WaybillExtraCharge getWaybillExtraCharge() {
      return this.waybillExtraCharge;
   }

   @JsonProperty("springFestivalPeakSurcharge")
   public void setSpringFestivalPeakSurcharge(String springFestivalPeakSurcharge) {
      this.springFestivalPeakSurcharge = springFestivalPeakSurcharge;
   }

   @JsonProperty("springFestivalPeakSurcharge")
   public String getSpringFestivalPeakSurcharge() {
      return this.springFestivalPeakSurcharge;
   }
}
