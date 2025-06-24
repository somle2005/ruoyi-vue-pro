package com.jd.open.api.sdk.domain.youE.OrderFinishExportService.request.orderFinish;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class RecycleCarInfo implements Serializable {
   private String oldBrand;
   private String oldLicencePlate;
   private String oldVehicleFrame;
   private RecycleBatteryInfo recycleBatteryInfo;
   private String saleBicTime;

   @JsonProperty("oldBrand")
   public void setOldBrand(String oldBrand) {
      this.oldBrand = oldBrand;
   }

   @JsonProperty("oldBrand")
   public String getOldBrand() {
      return this.oldBrand;
   }

   @JsonProperty("oldLicencePlate")
   public void setOldLicencePlate(String oldLicencePlate) {
      this.oldLicencePlate = oldLicencePlate;
   }

   @JsonProperty("oldLicencePlate")
   public String getOldLicencePlate() {
      return this.oldLicencePlate;
   }

   @JsonProperty("oldVehicleFrame")
   public void setOldVehicleFrame(String oldVehicleFrame) {
      this.oldVehicleFrame = oldVehicleFrame;
   }

   @JsonProperty("oldVehicleFrame")
   public String getOldVehicleFrame() {
      return this.oldVehicleFrame;
   }

   @JsonProperty("recycleBatteryInfo")
   public void setRecycleBatteryInfo(RecycleBatteryInfo recycleBatteryInfo) {
      this.recycleBatteryInfo = recycleBatteryInfo;
   }

   @JsonProperty("recycleBatteryInfo")
   public RecycleBatteryInfo getRecycleBatteryInfo() {
      return this.recycleBatteryInfo;
   }

   @JsonProperty("saleBicTime")
   public void setSaleBicTime(String saleBicTime) {
      this.saleBicTime = saleBicTime;
   }

   @JsonProperty("saleBicTime")
   public String getSaleBicTime() {
      return this.saleBicTime;
   }
}
