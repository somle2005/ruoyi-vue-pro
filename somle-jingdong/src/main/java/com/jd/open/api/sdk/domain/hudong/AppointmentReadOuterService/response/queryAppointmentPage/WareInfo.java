package com.jd.open.api.sdk.domain.hudong.AppointmentReadOuterService.response.queryAppointmentPage;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class WareInfo implements Serializable {
   private Long wareId;
   private String wareName;
   private String wareImg;

   @JsonProperty("wareId")
   public void setWareId(Long wareId) {
      this.wareId = wareId;
   }

   @JsonProperty("wareId")
   public Long getWareId() {
      return this.wareId;
   }

   @JsonProperty("wareName")
   public void setWareName(String wareName) {
      this.wareName = wareName;
   }

   @JsonProperty("wareName")
   public String getWareName() {
      return this.wareName;
   }

   @JsonProperty("wareImg")
   public void setWareImg(String wareImg) {
      this.wareImg = wareImg;
   }

   @JsonProperty("wareImg")
   public String getWareImg() {
      return this.wareImg;
   }
}
