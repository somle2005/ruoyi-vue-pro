package com.jd.open.api.sdk.domain.youE.CompletedJsfService.response.syncCompletedGetOrderPicList;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class RecOrderPic implements Serializable {
   private String picUrl;
   private Integer picType;

   @JsonProperty("picUrl")
   public void setPicUrl(String picUrl) {
      this.picUrl = picUrl;
   }

   @JsonProperty("picUrl")
   public String getPicUrl() {
      return this.picUrl;
   }

   @JsonProperty("picType")
   public void setPicType(Integer picType) {
      this.picType = picType;
   }

   @JsonProperty("picType")
   public Integer getPicType() {
      return this.picType;
   }
}
