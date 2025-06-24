package com.jd.open.api.sdk.domain.mall.ProductWrapService.response.query;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class AttributeValue implements Serializable {
   private Integer valueId;
   private String valueName;
   private Integer attId;
   private Integer type;

   @JsonProperty("valueId")
   public void setValueId(Integer valueId) {
      this.valueId = valueId;
   }

   @JsonProperty("valueId")
   public Integer getValueId() {
      return this.valueId;
   }

   @JsonProperty("valueName")
   public void setValueName(String valueName) {
      this.valueName = valueName;
   }

   @JsonProperty("valueName")
   public String getValueName() {
      return this.valueName;
   }

   @JsonProperty("attId")
   public void setAttId(Integer attId) {
      this.attId = attId;
   }

   @JsonProperty("attId")
   public Integer getAttId() {
      return this.attId;
   }

   @JsonProperty("type")
   public void setType(Integer type) {
      this.type = type;
   }

   @JsonProperty("type")
   public Integer getType() {
      return this.type;
   }
}
