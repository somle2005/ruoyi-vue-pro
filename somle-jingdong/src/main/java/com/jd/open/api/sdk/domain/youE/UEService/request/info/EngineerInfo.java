package com.jd.open.api.sdk.domain.youE.UEService.request.info;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class EngineerInfo implements Serializable {
   private String pid;
   private String engineerName;
   private String engineerMobile;

   @JsonProperty("pid")
   public void setPid(String pid) {
      this.pid = pid;
   }

   @JsonProperty("pid")
   public String getPid() {
      return this.pid;
   }

   @JsonProperty("engineerName")
   public void setEngineerName(String engineerName) {
      this.engineerName = engineerName;
   }

   @JsonProperty("engineerName")
   public String getEngineerName() {
      return this.engineerName;
   }

   @JsonProperty("engineerMobile")
   public void setEngineerMobile(String engineerMobile) {
      this.engineerMobile = engineerMobile;
   }

   @JsonProperty("engineerMobile")
   public String getEngineerMobile() {
      return this.engineerMobile;
   }
}
