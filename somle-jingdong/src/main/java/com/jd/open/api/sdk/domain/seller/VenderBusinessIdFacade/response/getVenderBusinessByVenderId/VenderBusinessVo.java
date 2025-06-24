package com.jd.open.api.sdk.domain.seller.VenderBusinessIdFacade.response.getVenderBusinessByVenderId;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Map;

public class VenderBusinessVo implements Serializable {
   private Map<String, BusinessValueVo> businessIdMap;
   private BusinessModelVo businessModel;
   private Map<String, String> extAttribute;

   @JsonProperty("businessIdMap")
   public void setBusinessIdMap(Map<String, BusinessValueVo> businessIdMap) {
      this.businessIdMap = businessIdMap;
   }

   @JsonProperty("businessIdMap")
   public Map<String, BusinessValueVo> getBusinessIdMap() {
      return this.businessIdMap;
   }

   @JsonProperty("businessModel")
   public void setBusinessModel(BusinessModelVo businessModel) {
      this.businessModel = businessModel;
   }

   @JsonProperty("businessModel")
   public BusinessModelVo getBusinessModel() {
      return this.businessModel;
   }

   @JsonProperty("extAttribute")
   public void setExtAttribute(Map<String, String> extAttribute) {
      this.extAttribute = extAttribute;
   }

   @JsonProperty("extAttribute")
   public Map<String, String> getExtAttribute() {
      return this.extAttribute;
   }
}
