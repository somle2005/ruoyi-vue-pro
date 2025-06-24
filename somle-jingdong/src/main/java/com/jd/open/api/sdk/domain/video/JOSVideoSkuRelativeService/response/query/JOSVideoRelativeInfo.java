package com.jd.open.api.sdk.domain.video.JOSVideoSkuRelativeService.response.query;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class JOSVideoRelativeInfo implements Serializable {
   private Long productId;
   private Long skuId;
   private Long videoId;
   private Long agentVideoId;
   private String videoName;
   private Integer videoType;
   private Integer status;

   @JsonProperty("product_id")
   public void setProductId(Long productId) {
      this.productId = productId;
   }

   @JsonProperty("product_id")
   public Long getProductId() {
      return this.productId;
   }

   @JsonProperty("sku_id")
   public void setSkuId(Long skuId) {
      this.skuId = skuId;
   }

   @JsonProperty("sku_id")
   public Long getSkuId() {
      return this.skuId;
   }

   @JsonProperty("video_id")
   public void setVideoId(Long videoId) {
      this.videoId = videoId;
   }

   @JsonProperty("video_id")
   public Long getVideoId() {
      return this.videoId;
   }

   @JsonProperty("agent_video_id")
   public void setAgentVideoId(Long agentVideoId) {
      this.agentVideoId = agentVideoId;
   }

   @JsonProperty("agent_video_id")
   public Long getAgentVideoId() {
      return this.agentVideoId;
   }

   @JsonProperty("video_name")
   public void setVideoName(String videoName) {
      this.videoName = videoName;
   }

   @JsonProperty("video_name")
   public String getVideoName() {
      return this.videoName;
   }

   @JsonProperty("video_type")
   public void setVideoType(Integer videoType) {
      this.videoType = videoType;
   }

   @JsonProperty("video_type")
   public Integer getVideoType() {
      return this.videoType;
   }

   @JsonProperty("status")
   public void setStatus(Integer status) {
      this.status = status;
   }

   @JsonProperty("status")
   public Integer getStatus() {
      return this.status;
   }
}
