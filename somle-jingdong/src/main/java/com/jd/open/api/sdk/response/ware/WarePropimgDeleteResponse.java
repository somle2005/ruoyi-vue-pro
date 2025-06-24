package com.jd.open.api.sdk.response.ware;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.response.AbstractResponse;

public class WarePropimgDeleteResponse extends AbstractResponse {
   private long imageId;
   private String created;

   @JsonProperty("image_id")
   public long getImageId() {
      return this.imageId;
   }

   @JsonProperty("image_id")
   public void setImageId(long imageId) {
      this.imageId = imageId;
   }

   public String getCreated() {
      return this.created;
   }

   public void setCreated(String created) {
      this.created = created;
   }
}
