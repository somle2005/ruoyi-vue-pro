package com.jd.open.api.sdk.domain.ware.JosDraftWriteService.request.commitDraft;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class JosDraftInfo implements Serializable {
   private JosHouseSpu house;
   private JosProductAll josProductAll;

   @JsonProperty("house")
   public void setHouse(JosHouseSpu house) {
      this.house = house;
   }

   @JsonProperty("house")
   public JosHouseSpu getHouse() {
      return this.house;
   }

   @JsonProperty("josProductAll")
   public void setJosProductAll(JosProductAll josProductAll) {
      this.josProductAll = josProductAll;
   }

   @JsonProperty("josProductAll")
   public JosProductAll getJosProductAll() {
      return this.josProductAll;
   }
}
