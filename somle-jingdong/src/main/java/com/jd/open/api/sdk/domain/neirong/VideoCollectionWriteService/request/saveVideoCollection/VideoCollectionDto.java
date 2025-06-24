package com.jd.open.api.sdk.domain.neirong.VideoCollectionWriteService.request.saveVideoCollection;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class VideoCollectionDto implements Serializable {
   private String indexImg;
   private Long creatorId;
   private String name;
   private String description;
   private Integer totalEpiNum;

   @JsonProperty("indexImg")
   public void setIndexImg(String indexImg) {
      this.indexImg = indexImg;
   }

   @JsonProperty("indexImg")
   public String getIndexImg() {
      return this.indexImg;
   }

   @JsonProperty("creatorId")
   public void setCreatorId(Long creatorId) {
      this.creatorId = creatorId;
   }

   @JsonProperty("creatorId")
   public Long getCreatorId() {
      return this.creatorId;
   }

   @JsonProperty("name")
   public void setName(String name) {
      this.name = name;
   }

   @JsonProperty("name")
   public String getName() {
      return this.name;
   }

   @JsonProperty("description")
   public void setDescription(String description) {
      this.description = description;
   }

   @JsonProperty("description")
   public String getDescription() {
      return this.description;
   }

   @JsonProperty("totalEpiNum")
   public void setTotalEpiNum(Integer totalEpiNum) {
      this.totalEpiNum = totalEpiNum;
   }

   @JsonProperty("totalEpiNum")
   public Integer getTotalEpiNum() {
      return this.totalEpiNum;
   }
}
