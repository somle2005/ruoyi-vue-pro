package com.jd.open.api.sdk.domain.promotion.PromoActivityQueryService.response.get;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

public class ActivityDTO implements Serializable {
   private ActivityBaseDTO activityBaseDTO;
   private ActivityScopeDTO activityScopeDTO;
   private ActivityLimitDTO activityLimitDTO;
   private List<ActivityRuleDTO> activityRuleDTOList;
   private ActivityShowDTO activityShowDTO;
   private OperatePermissionDTO operatePermission;
   private ActivityProcessTypeDTO activityProcessType;
   private Map<String, String> extMap;

   @JsonProperty("activityBaseDTO")
   public void setActivityBaseDTO(ActivityBaseDTO activityBaseDTO) {
      this.activityBaseDTO = activityBaseDTO;
   }

   @JsonProperty("activityBaseDTO")
   public ActivityBaseDTO getActivityBaseDTO() {
      return this.activityBaseDTO;
   }

   @JsonProperty("activityScopeDTO")
   public void setActivityScopeDTO(ActivityScopeDTO activityScopeDTO) {
      this.activityScopeDTO = activityScopeDTO;
   }

   @JsonProperty("activityScopeDTO")
   public ActivityScopeDTO getActivityScopeDTO() {
      return this.activityScopeDTO;
   }

   @JsonProperty("activityLimitDTO")
   public void setActivityLimitDTO(ActivityLimitDTO activityLimitDTO) {
      this.activityLimitDTO = activityLimitDTO;
   }

   @JsonProperty("activityLimitDTO")
   public ActivityLimitDTO getActivityLimitDTO() {
      return this.activityLimitDTO;
   }

   @JsonProperty("activityRuleDTOList")
   public void setActivityRuleDTOList(List<ActivityRuleDTO> activityRuleDTOList) {
      this.activityRuleDTOList = activityRuleDTOList;
   }

   @JsonProperty("activityRuleDTOList")
   public List<ActivityRuleDTO> getActivityRuleDTOList() {
      return this.activityRuleDTOList;
   }

   @JsonProperty("activityShowDTO")
   public void setActivityShowDTO(ActivityShowDTO activityShowDTO) {
      this.activityShowDTO = activityShowDTO;
   }

   @JsonProperty("activityShowDTO")
   public ActivityShowDTO getActivityShowDTO() {
      return this.activityShowDTO;
   }

   @JsonProperty("operatePermission")
   public void setOperatePermission(OperatePermissionDTO operatePermission) {
      this.operatePermission = operatePermission;
   }

   @JsonProperty("operatePermission")
   public OperatePermissionDTO getOperatePermission() {
      return this.operatePermission;
   }

   @JsonProperty("activityProcessType")
   public void setActivityProcessType(ActivityProcessTypeDTO activityProcessType) {
      this.activityProcessType = activityProcessType;
   }

   @JsonProperty("activityProcessType")
   public ActivityProcessTypeDTO getActivityProcessType() {
      return this.activityProcessType;
   }

   @JsonProperty("extMap")
   public void setExtMap(Map<String, String> extMap) {
      this.extMap = extMap;
   }

   @JsonProperty("extMap")
   public Map<String, String> getExtMap() {
      return this.extMap;
   }
}
