package com.jd.open.api.sdk.domain.risk.KeeperWareRectificationService.response.query;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class KeeperWareRectificationDTO implements Serializable {
   private Long wareId;
   private List<KeeperWareRectificationDetailDTO> details;
   private Long updateTime;
   private String wareName;
   private String mainImageUrl;

   @JsonProperty("wareId")
   public void setWareId(Long wareId) {
      this.wareId = wareId;
   }

   @JsonProperty("wareId")
   public Long getWareId() {
      return this.wareId;
   }

   @JsonProperty("details")
   public void setDetails(List<KeeperWareRectificationDetailDTO> details) {
      this.details = details;
   }

   @JsonProperty("details")
   public List<KeeperWareRectificationDetailDTO> getDetails() {
      return this.details;
   }

   @JsonProperty("updateTime")
   public void setUpdateTime(Long updateTime) {
      this.updateTime = updateTime;
   }

   @JsonProperty("updateTime")
   public Long getUpdateTime() {
      return this.updateTime;
   }

   @JsonProperty("wareName")
   public void setWareName(String wareName) {
      this.wareName = wareName;
   }

   @JsonProperty("wareName")
   public String getWareName() {
      return this.wareName;
   }

   @JsonProperty("mainImageUrl")
   public void setMainImageUrl(String mainImageUrl) {
      this.mainImageUrl = mainImageUrl;
   }

   @JsonProperty("mainImageUrl")
   public String getMainImageUrl() {
      return this.mainImageUrl;
   }
}
