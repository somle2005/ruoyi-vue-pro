package com.jd.open.api.sdk.domain.ware.QualFileService.response.upload;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class SimpleFileFacetDTO implements Serializable {
   private String name;
   private String fileKey;
   private String fileUrl;

   @JsonProperty("name")
   public void setName(String name) {
      this.name = name;
   }

   @JsonProperty("name")
   public String getName() {
      return this.name;
   }

   @JsonProperty("fileKey")
   public void setFileKey(String fileKey) {
      this.fileKey = fileKey;
   }

   @JsonProperty("fileKey")
   public String getFileKey() {
      return this.fileKey;
   }

   @JsonProperty("fileUrl")
   public void setFileUrl(String fileUrl) {
      this.fileUrl = fileUrl;
   }

   @JsonProperty("fileUrl")
   public String getFileUrl() {
      return this.fileUrl;
   }
}
