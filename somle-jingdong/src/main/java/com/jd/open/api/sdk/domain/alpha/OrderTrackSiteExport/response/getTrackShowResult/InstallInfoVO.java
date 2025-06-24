package com.jd.open.api.sdk.domain.alpha.OrderTrackSiteExport.response.getTrackShowResult;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class InstallInfoVO implements Serializable {
   private String installTime;
   private String installContent;
   private String installCodeName;
   private String source;

   @JsonProperty("installTime")
   public void setInstallTime(String installTime) {
      this.installTime = installTime;
   }

   @JsonProperty("installTime")
   public String getInstallTime() {
      return this.installTime;
   }

   @JsonProperty("installContent")
   public void setInstallContent(String installContent) {
      this.installContent = installContent;
   }

   @JsonProperty("installContent")
   public String getInstallContent() {
      return this.installContent;
   }

   @JsonProperty("installCodeName")
   public void setInstallCodeName(String installCodeName) {
      this.installCodeName = installCodeName;
   }

   @JsonProperty("installCodeName")
   public String getInstallCodeName() {
      return this.installCodeName;
   }

   @JsonProperty("source")
   public void setSource(String source) {
      this.source = source;
   }

   @JsonProperty("source")
   public String getSource() {
      return this.source;
   }
}
