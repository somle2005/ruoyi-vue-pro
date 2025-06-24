package com.jd.open.api.sdk.domain.ware.QualFileService.request.upload;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class FileParam implements Serializable {
   private String applyId;
   private byte[] fileByte;
   private String name;
   private String type;

   @JsonProperty("applyId")
   public void setApplyId(String applyId) {
      this.applyId = applyId;
   }

   @JsonProperty("applyId")
   public String getApplyId() {
      return this.applyId;
   }

   @JsonProperty("fileByte")
   public void setFileByte(byte[] fileByte) {
      this.fileByte = fileByte;
   }

   @JsonProperty("fileByte")
   public byte[] getFileByte() {
      return this.fileByte;
   }

   @JsonProperty("name")
   public void setName(String name) {
      this.name = name;
   }

   @JsonProperty("name")
   public String getName() {
      return this.name;
   }

   @JsonProperty("type")
   public void setType(String type) {
      this.type = type;
   }

   @JsonProperty("type")
   public String getType() {
      return this.type;
   }
}
