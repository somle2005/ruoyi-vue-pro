package com.jd.open.api.sdk.domain.promotion.PromoActivityWriteService.request.create;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class CreateActivityRequest implements Serializable {
   private BaseRequest baseRequest;
   private ActivityDTO activityDTO;
   private boolean stepSubmit;

   @JsonProperty("baseRequest")
   public void setBaseRequest(BaseRequest baseRequest) {
      this.baseRequest = baseRequest;
   }

   @JsonProperty("baseRequest")
   public BaseRequest getBaseRequest() {
      return this.baseRequest;
   }

   @JsonProperty("activityDTO")
   public void setActivityDTO(ActivityDTO activityDTO) {
      this.activityDTO = activityDTO;
   }

   @JsonProperty("activityDTO")
   public ActivityDTO getActivityDTO() {
      return this.activityDTO;
   }

   @JsonProperty("stepSubmit")
   public void setStepSubmit(boolean stepSubmit) {
      this.stepSubmit = stepSubmit;
   }

   @JsonProperty("stepSubmit")
   public boolean getStepSubmit() {
      return this.stepSubmit;
   }
}
