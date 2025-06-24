package com.jd.open.api.sdk.domain.promotion.SmsModelConfigReadService.response.getSmsModelConfigByParams;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class SmsModelConfig implements Serializable {
   private String name;
   private Long id;
   private String detail;
   private ModelServeType modelServeType;

   @JsonProperty("name")
   public void setName(String name) {
      this.name = name;
   }

   @JsonProperty("name")
   public String getName() {
      return this.name;
   }

   @JsonProperty("id")
   public void setId(Long id) {
      this.id = id;
   }

   @JsonProperty("id")
   public Long getId() {
      return this.id;
   }

   @JsonProperty("detail")
   public void setDetail(String detail) {
      this.detail = detail;
   }

   @JsonProperty("detail")
   public String getDetail() {
      return this.detail;
   }

   @JsonProperty("modelServeType")
   public void setModelServeType(ModelServeType modelServeType) {
      this.modelServeType = modelServeType;
   }

   @JsonProperty("modelServeType")
   public ModelServeType getModelServeType() {
      return this.modelServeType;
   }
}
