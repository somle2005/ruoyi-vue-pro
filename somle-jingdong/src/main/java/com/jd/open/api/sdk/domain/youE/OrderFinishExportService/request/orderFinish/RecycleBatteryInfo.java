package com.jd.open.api.sdk.domain.youE.OrderFinishExportService.request.orderFinish;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class RecycleBatteryInfo implements Serializable {
   private String batteryType;
   private String batteryCode;
   private String batteryEnterpriseName;

   @JsonProperty("batteryType")
   public void setBatteryType(String batteryType) {
      this.batteryType = batteryType;
   }

   @JsonProperty("batteryType")
   public String getBatteryType() {
      return this.batteryType;
   }

   @JsonProperty("batteryCode")
   public void setBatteryCode(String batteryCode) {
      this.batteryCode = batteryCode;
   }

   @JsonProperty("batteryCode")
   public String getBatteryCode() {
      return this.batteryCode;
   }

   @JsonProperty("batteryEnterpriseName")
   public void setBatteryEnterpriseName(String batteryEnterpriseName) {
      this.batteryEnterpriseName = batteryEnterpriseName;
   }

   @JsonProperty("batteryEnterpriseName")
   public String getBatteryEnterpriseName() {
      return this.batteryEnterpriseName;
   }
}
