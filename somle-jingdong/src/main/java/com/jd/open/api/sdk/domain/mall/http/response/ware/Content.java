package com.jd.open.api.sdk.domain.mall.http.response.ware;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class Content implements Serializable {
   private String imageurl;
   private String warename;
   private String Slaveimageurl;

   @JsonProperty("imageurl")
   public void setImageurl(String imageurl) {
      this.imageurl = imageurl;
   }

   @JsonProperty("imageurl")
   public String getImageurl() {
      return this.imageurl;
   }

   @JsonProperty("warename")
   public void setWarename(String warename) {
      this.warename = warename;
   }

   @JsonProperty("warename")
   public String getWarename() {
      return this.warename;
   }

   @JsonProperty("Slaveimageurl")
   public void setSlaveimageurl(String Slaveimageurl) {
      this.Slaveimageurl = Slaveimageurl;
   }

   @JsonProperty("Slaveimageurl")
   public String getSlaveimageurl() {
      return this.Slaveimageurl;
   }
}
