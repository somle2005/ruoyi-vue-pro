package com.jd.open.api.sdk.domain.risk.KeeperWareRectificationService.response.detail;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;
import java.util.Set;

public class RectificationModuleInfoVO implements Serializable {
   private Set<String> reasons;
   private List<RectificationModuleInfoVO> moduleInfoVOList;
   private String wareId;
   private String wareName;
   private Long timestamp;

   @JsonProperty("reasons")
   public void setReasons(Set<String> reasons) {
      this.reasons = reasons;
   }

   @JsonProperty("reasons")
   public Set<String> getReasons() {
      return this.reasons;
   }

   @JsonProperty("moduleInfoVOList")
   public void setModuleInfoVOList(List<RectificationModuleInfoVO> moduleInfoVOList) {
      this.moduleInfoVOList = moduleInfoVOList;
   }

   @JsonProperty("moduleInfoVOList")
   public List<RectificationModuleInfoVO> getModuleInfoVOList() {
      return this.moduleInfoVOList;
   }

   @JsonProperty("wareId")
   public void setWareId(String wareId) {
      this.wareId = wareId;
   }

   @JsonProperty("wareId")
   public String getWareId() {
      return this.wareId;
   }

   @JsonProperty("wareName")
   public void setWareName(String wareName) {
      this.wareName = wareName;
   }

   @JsonProperty("wareName")
   public String getWareName() {
      return this.wareName;
   }

   @JsonProperty("timestamp")
   public void setTimestamp(Long timestamp) {
      this.timestamp = timestamp;
   }

   @JsonProperty("timestamp")
   public Long getTimestamp() {
      return this.timestamp;
   }
}
