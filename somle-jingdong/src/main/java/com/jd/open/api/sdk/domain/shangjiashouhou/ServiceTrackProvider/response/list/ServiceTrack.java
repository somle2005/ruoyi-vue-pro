package com.jd.open.api.sdk.domain.shangjiashouhou.ServiceTrackProvider.response.list;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;

public class ServiceTrack implements Serializable {
   private Date trackCreateDate;
   private String trackContext;
   private String createPin;
   private String createName;
   private String extJsonStr;

   @JsonProperty("trackCreateDate")
   public void setTrackCreateDate(Date trackCreateDate) {
      this.trackCreateDate = trackCreateDate;
   }

   @JsonProperty("trackCreateDate")
   public Date getTrackCreateDate() {
      return this.trackCreateDate;
   }

   @JsonProperty("trackContext")
   public void setTrackContext(String trackContext) {
      this.trackContext = trackContext;
   }

   @JsonProperty("trackContext")
   public String getTrackContext() {
      return this.trackContext;
   }

   @JsonProperty("createPin")
   public void setCreatePin(String createPin) {
      this.createPin = createPin;
   }

   @JsonProperty("createPin")
   public String getCreatePin() {
      return this.createPin;
   }

   @JsonProperty("createName")
   public void setCreateName(String createName) {
      this.createName = createName;
   }

   @JsonProperty("createName")
   public String getCreateName() {
      return this.createName;
   }

   @JsonProperty("extJsonStr")
   public void setExtJsonStr(String extJsonStr) {
      this.extJsonStr = extJsonStr;
   }

   @JsonProperty("extJsonStr")
   public String getExtJsonStr() {
      return this.extJsonStr;
   }
}
