package com.jd.open.api.sdk.domain.c2mdzkfpt.SkuCustomServiceOpenApi.response.getServiceProjectInfo;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class ServiceTechInfo implements Serializable {
   private String techName;
   private Long techId;

   @JsonProperty("techName")
   public void setTechName(String techName) {
      this.techName = techName;
   }

   @JsonProperty("techName")
   public String getTechName() {
      return this.techName;
   }

   @JsonProperty("techId")
   public void setTechId(Long techId) {
      this.techId = techId;
   }

   @JsonProperty("techId")
   public Long getTechId() {
      return this.techId;
   }
}
