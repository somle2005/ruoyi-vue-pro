package com.jd.open.api.sdk.domain.plgz.CategoryOptionalOperateFacade.response.batchJudgeCategorySelect;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class ReminderDto implements Serializable {
   private String reason;
   private List<RedirectDto> redirectList;

   @JsonProperty("reason")
   public void setReason(String reason) {
      this.reason = reason;
   }

   @JsonProperty("reason")
   public String getReason() {
      return this.reason;
   }

   @JsonProperty("redirectList")
   public void setRedirectList(List<RedirectDto> redirectList) {
      this.redirectList = redirectList;
   }

   @JsonProperty("redirectList")
   public List<RedirectDto> getRedirectList() {
      return this.redirectList;
   }
}
