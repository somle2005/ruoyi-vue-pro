package com.jd.open.api.sdk.domain.video.JOSMaterialService.response.bindMaterial;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class RelativeMaterialResult implements Serializable {
   private Integer materiaType;
   private boolean success;
   private String message;
   private String content;

   @JsonProperty("materiaType")
   public void setMateriaType(Integer materiaType) {
      this.materiaType = materiaType;
   }

   @JsonProperty("materiaType")
   public Integer getMateriaType() {
      return this.materiaType;
   }

   @JsonProperty("success")
   public void setSuccess(boolean success) {
      this.success = success;
   }

   @JsonProperty("success")
   public boolean getSuccess() {
      return this.success;
   }

   @JsonProperty("message")
   public void setMessage(String message) {
      this.message = message;
   }

   @JsonProperty("message")
   public String getMessage() {
      return this.message;
   }

   @JsonProperty("content")
   public void setContent(String content) {
      this.content = content;
   }

   @JsonProperty("content")
   public String getContent() {
      return this.content;
   }
}
