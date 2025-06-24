package com.jd.open.api.sdk.domain.promotion.PromoActivityWriteService.request.addSkus;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class ParticipantRequest implements Serializable {
   private BaseRequest baseRequest;
   private ActivityParticipantDTO activityParticipantDTO;

   @JsonProperty("baseRequest")
   public void setBaseRequest(BaseRequest baseRequest) {
      this.baseRequest = baseRequest;
   }

   @JsonProperty("baseRequest")
   public BaseRequest getBaseRequest() {
      return this.baseRequest;
   }

   @JsonProperty("activityParticipantDTO")
   public void setActivityParticipantDTO(ActivityParticipantDTO activityParticipantDTO) {
      this.activityParticipantDTO = activityParticipantDTO;
   }

   @JsonProperty("activityParticipantDTO")
   public ActivityParticipantDTO getActivityParticipantDTO() {
      return this.activityParticipantDTO;
   }
}
