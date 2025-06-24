package com.jd.open.api.sdk.domain.ware.OpReasonReadService.response.findOpReason;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class OpReason implements Serializable {
   private String note;

   @JsonProperty("note")
   public void setNote(String note) {
      this.note = note;
   }

   @JsonProperty("note")
   public String getNote() {
      return this.note;
   }
}
