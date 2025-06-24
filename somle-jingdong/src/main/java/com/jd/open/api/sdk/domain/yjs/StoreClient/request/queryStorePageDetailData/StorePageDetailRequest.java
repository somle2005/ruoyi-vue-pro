package com.jd.open.api.sdk.domain.yjs.StoreClient.request.queryStorePageDetailData;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class StorePageDetailRequest implements Serializable {
   private Float pointX;
   private Float pointY;
   private String storeId;
   private String opUid;
   private String externalChannel;

   @JsonProperty("pointX")
   public void setPointX(Float pointX) {
      this.pointX = pointX;
   }

   @JsonProperty("pointX")
   public Float getPointX() {
      return this.pointX;
   }

   @JsonProperty("pointY")
   public void setPointY(Float pointY) {
      this.pointY = pointY;
   }

   @JsonProperty("pointY")
   public Float getPointY() {
      return this.pointY;
   }

   @JsonProperty("storeId")
   public void setStoreId(String storeId) {
      this.storeId = storeId;
   }

   @JsonProperty("storeId")
   public String getStoreId() {
      return this.storeId;
   }

   @JsonProperty("opUid")
   public void setOpUid(String opUid) {
      this.opUid = opUid;
   }

   @JsonProperty("opUid")
   public String getOpUid() {
      return this.opUid;
   }

   @JsonProperty("externalChannel")
   public void setExternalChannel(String externalChannel) {
      this.externalChannel = externalChannel;
   }

   @JsonProperty("externalChannel")
   public String getExternalChannel() {
      return this.externalChannel;
   }
}
