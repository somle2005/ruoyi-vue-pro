package com.jd.open.api.sdk.response.ware;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.response.AbstractResponse;

public class WarePropimgAddResponse extends AbstractResponse {
   private long wareId;
   private String attributeValueId;
   private long id;
   private String created;

   @JsonProperty("id")
   public long getId() {
      return this.id;
   }

   @JsonProperty("id")
   public void setId(long id) {
      this.id = id;
   }

   @JsonProperty("ware_id")
   public long getWareId() {
      return this.wareId;
   }

   @JsonProperty("ware_id")
   public void setWareId(long wareId) {
      this.wareId = wareId;
   }

   @JsonProperty("attribute_value_id")
   public String getAttributeValueId() {
      return this.attributeValueId;
   }

   @JsonProperty("attribute_value_id")
   public void setAttributeValueId(String attributeValueId) {
      this.attributeValueId = attributeValueId;
   }

   public String getCreated() {
      return this.created;
   }

   public void setCreated(String created) {
      this.created = created;
   }
}
