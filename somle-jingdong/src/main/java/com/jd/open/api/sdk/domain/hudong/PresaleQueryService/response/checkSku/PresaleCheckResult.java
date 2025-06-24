package com.jd.open.api.sdk.domain.hudong.PresaleQueryService.response.checkSku;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class PresaleCheckResult implements Serializable {
   private String attendMessage;
   private Integer attendActivity;
   private Long id;
   private Boolean attendPresale;
   private String type;
   private String encryptId;

   @JsonProperty("attendMessage")
   public void setAttendMessage(String attendMessage) {
      this.attendMessage = attendMessage;
   }

   @JsonProperty("attendMessage")
   public String getAttendMessage() {
      return this.attendMessage;
   }

   @JsonProperty("attendActivity")
   public void setAttendActivity(Integer attendActivity) {
      this.attendActivity = attendActivity;
   }

   @JsonProperty("attendActivity")
   public Integer getAttendActivity() {
      return this.attendActivity;
   }

   @JsonProperty("id")
   public void setId(Long id) {
      this.id = id;
   }

   @JsonProperty("id")
   public Long getId() {
      return this.id;
   }

   @JsonProperty("attendPresale")
   public void setAttendPresale(Boolean attendPresale) {
      this.attendPresale = attendPresale;
   }

   @JsonProperty("attendPresale")
   public Boolean getAttendPresale() {
      return this.attendPresale;
   }

   @JsonProperty("type")
   public void setType(String type) {
      this.type = type;
   }

   @JsonProperty("type")
   public String getType() {
      return this.type;
   }

   @JsonProperty("encrypt_id")
   public void setEncryptId(String encryptId) {
      this.encryptId = encryptId;
   }

   @JsonProperty("encrypt_id")
   public String getEncryptId() {
      return this.encryptId;
   }
}
