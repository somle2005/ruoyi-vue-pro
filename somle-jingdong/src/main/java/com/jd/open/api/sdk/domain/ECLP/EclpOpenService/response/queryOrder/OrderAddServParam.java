package com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.queryOrder;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class OrderAddServParam implements Serializable {
   private String servCode;
   private String servName;
   private Integer servPlanNum;
   private Integer servActNum;
   private String servDemand;

   @JsonProperty("servCode")
   public void setServCode(String servCode) {
      this.servCode = servCode;
   }

   @JsonProperty("servCode")
   public String getServCode() {
      return this.servCode;
   }

   @JsonProperty("servName")
   public void setServName(String servName) {
      this.servName = servName;
   }

   @JsonProperty("servName")
   public String getServName() {
      return this.servName;
   }

   @JsonProperty("servPlanNum")
   public void setServPlanNum(Integer servPlanNum) {
      this.servPlanNum = servPlanNum;
   }

   @JsonProperty("servPlanNum")
   public Integer getServPlanNum() {
      return this.servPlanNum;
   }

   @JsonProperty("servActNum")
   public void setServActNum(Integer servActNum) {
      this.servActNum = servActNum;
   }

   @JsonProperty("servActNum")
   public Integer getServActNum() {
      return this.servActNum;
   }

   @JsonProperty("servDemand")
   public void setServDemand(String servDemand) {
      this.servDemand = servDemand;
   }

   @JsonProperty("servDemand")
   public String getServDemand() {
      return this.servDemand;
   }
}
