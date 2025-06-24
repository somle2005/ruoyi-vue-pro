package com.jd.open.api.sdk.domain.mall.http.response.ware;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class IcoTagInfo implements Serializable {
   private String tagurl;

   @JsonProperty("tagurl")
   public void setTagurl(String tagurl) {
      this.tagurl = tagurl;
   }

   @JsonProperty("tagurl")
   public String getTagurl() {
      return this.tagurl;
   }
}
