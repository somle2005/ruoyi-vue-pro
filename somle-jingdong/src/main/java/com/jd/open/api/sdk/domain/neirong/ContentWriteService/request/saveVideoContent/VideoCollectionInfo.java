package com.jd.open.api.sdk.domain.neirong.ContentWriteService.request.saveVideoContent;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class VideoCollectionInfo implements Serializable {
   private Long videoCollectionId;
   private Integer epiNum;
   private Long ipId;
   private List<Long> vTagIds;

   @JsonProperty("videoCollectionId")
   public void setVideoCollectionId(Long videoCollectionId) {
      this.videoCollectionId = videoCollectionId;
   }

   @JsonProperty("videoCollectionId")
   public Long getVideoCollectionId() {
      return this.videoCollectionId;
   }

   @JsonProperty("epiNum")
   public void setEpiNum(Integer epiNum) {
      this.epiNum = epiNum;
   }

   @JsonProperty("epiNum")
   public Integer getEpiNum() {
      return this.epiNum;
   }

   @JsonProperty("ipId")
   public void setIpId(Long ipId) {
      this.ipId = ipId;
   }

   @JsonProperty("ipId")
   public Long getIpId() {
      return this.ipId;
   }

   @JsonProperty("vTagIds")
   public void setVTagIds(List<Long> vTagIds) {
      this.vTagIds = vTagIds;
   }

   @JsonProperty("vTagIds")
   public List<Long> getVTagIds() {
      return this.vTagIds;
   }
}
