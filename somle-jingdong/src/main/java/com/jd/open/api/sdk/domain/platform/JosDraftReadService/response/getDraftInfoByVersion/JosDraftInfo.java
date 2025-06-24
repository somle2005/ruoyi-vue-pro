package com.jd.open.api.sdk.domain.platform.JosDraftReadService.response.getDraftInfoByVersion;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class JosDraftInfo implements Serializable {
   private Long productId;
   private JosHouseSpu house;
   private JosDraftBaseInfo draftBaseInfo;
   private JosProductAll josProductAll;

   @JsonProperty("productId")
   public void setProductId(Long productId) {
      this.productId = productId;
   }

   @JsonProperty("productId")
   public Long getProductId() {
      return this.productId;
   }

   @JsonProperty("house")
   public void setHouse(JosHouseSpu house) {
      this.house = house;
   }

   @JsonProperty("house")
   public JosHouseSpu getHouse() {
      return this.house;
   }

   @JsonProperty("draftBaseInfo")
   public void setDraftBaseInfo(JosDraftBaseInfo draftBaseInfo) {
      this.draftBaseInfo = draftBaseInfo;
   }

   @JsonProperty("draftBaseInfo")
   public JosDraftBaseInfo getDraftBaseInfo() {
      return this.draftBaseInfo;
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
