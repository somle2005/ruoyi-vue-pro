package com.jd.open.api.sdk.domain.video.JOSMaterialService.request.skuBatchBindMaterial;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class Material implements Serializable {
   private Long videoId;
   private Integer type;
   private String url;
   private Integer order;

   @JsonProperty("videoId")
   public void setVideoId(Long videoId) {
      this.videoId = videoId;
   }

   @JsonProperty("videoId")
   public Long getVideoId() {
      return this.videoId;
   }

   @JsonProperty("type")
   public void setType(Integer type) {
      this.type = type;
   }

   @JsonProperty("type")
   public Integer getType() {
      return this.type;
   }

   @JsonProperty("url")
   public void setUrl(String url) {
      this.url = url;
   }

   @JsonProperty("url")
   public String getUrl() {
      return this.url;
   }

   @JsonProperty("order")
   public void setOrder(Integer order) {
      this.order = order;
   }

   @JsonProperty("order")
   public Integer getOrder() {
      return this.order;
   }
}
