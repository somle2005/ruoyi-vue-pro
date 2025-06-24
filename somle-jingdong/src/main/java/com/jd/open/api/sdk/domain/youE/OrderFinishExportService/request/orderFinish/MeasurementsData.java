package com.jd.open.api.sdk.domain.youE.OrderFinishExportService.request.orderFinish;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class MeasurementsData implements Serializable {
   private String serialNo;
   private String room;
   private String width;
   private String widthDesc;
   private String heigth;
   private String heigthDesc;

   @JsonProperty("serialNo")
   public void setSerialNo(String serialNo) {
      this.serialNo = serialNo;
   }

   @JsonProperty("serialNo")
   public String getSerialNo() {
      return this.serialNo;
   }

   @JsonProperty("room")
   public void setRoom(String room) {
      this.room = room;
   }

   @JsonProperty("room")
   public String getRoom() {
      return this.room;
   }

   @JsonProperty("width")
   public void setWidth(String width) {
      this.width = width;
   }

   @JsonProperty("width")
   public String getWidth() {
      return this.width;
   }

   @JsonProperty("widthDesc")
   public void setWidthDesc(String widthDesc) {
      this.widthDesc = widthDesc;
   }

   @JsonProperty("widthDesc")
   public String getWidthDesc() {
      return this.widthDesc;
   }

   @JsonProperty("heigth")
   public void setHeigth(String heigth) {
      this.heigth = heigth;
   }

   @JsonProperty("heigth")
   public String getHeigth() {
      return this.heigth;
   }

   @JsonProperty("heigthDesc")
   public void setHeigthDesc(String heigthDesc) {
      this.heigthDesc = heigthDesc;
   }

   @JsonProperty("heigthDesc")
   public String getHeigthDesc() {
      return this.heigthDesc;
   }
}
