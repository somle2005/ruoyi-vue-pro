package com.jd.open.api.sdk.domain.c2mdzkfpt.BespokeInfoWebService.response.getSuitProduct;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class SuitProductVo implements Serializable {
   private Boolean vaildCustomService;
   private Boolean vaildGiftCustomService;
   private List<SuitProductChildVo> groupPacks;

   @JsonProperty("vaildCustomService")
   public void setVaildCustomService(Boolean vaildCustomService) {
      this.vaildCustomService = vaildCustomService;
   }

   @JsonProperty("vaildCustomService")
   public Boolean getVaildCustomService() {
      return this.vaildCustomService;
   }

   @JsonProperty("vaildGiftCustomService")
   public void setVaildGiftCustomService(Boolean vaildGiftCustomService) {
      this.vaildGiftCustomService = vaildGiftCustomService;
   }

   @JsonProperty("vaildGiftCustomService")
   public Boolean getVaildGiftCustomService() {
      return this.vaildGiftCustomService;
   }

   @JsonProperty("groupPacks")
   public void setGroupPacks(List<SuitProductChildVo> groupPacks) {
      this.groupPacks = groupPacks;
   }

   @JsonProperty("groupPacks")
   public List<SuitProductChildVo> getGroupPacks() {
      return this.groupPacks;
   }
}
