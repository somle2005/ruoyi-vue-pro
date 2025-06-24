package com.jd.open.api.sdk.domain.afsservice.ServiceQueryProvider.response.findServiceDetail;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;

public class ServiceTrackInfoExport implements Serializable {
   private Long[] afsServiceId;
   private String[] title;
   private String[] context;
   private Date[] createDate;
   private String[] createName;
   private String[] createPin;

   @JsonProperty("afsServiceId")
   public void setAfsServiceId(Long[] afsServiceId) {
      this.afsServiceId = afsServiceId;
   }

   @JsonProperty("afsServiceId")
   public Long[] getAfsServiceId() {
      return this.afsServiceId;
   }

   @JsonProperty("title")
   public void setTitle(String[] title) {
      this.title = title;
   }

   @JsonProperty("title")
   public String[] getTitle() {
      return this.title;
   }

   @JsonProperty("context")
   public void setContext(String[] context) {
      this.context = context;
   }

   @JsonProperty("context")
   public String[] getContext() {
      return this.context;
   }

   @JsonProperty("createDate")
   public void setCreateDate(Date[] createDate) {
      this.createDate = createDate;
   }

   @JsonProperty("createDate")
   public Date[] getCreateDate() {
      return this.createDate;
   }

   @JsonProperty("createName")
   public void setCreateName(String[] createName) {
      this.createName = createName;
   }

   @JsonProperty("createName")
   public String[] getCreateName() {
      return this.createName;
   }

   @JsonProperty("createPin")
   public void setCreatePin(String[] createPin) {
      this.createPin = createPin;
   }

   @JsonProperty("createPin")
   public String[] getCreatePin() {
      return this.createPin;
   }
}
