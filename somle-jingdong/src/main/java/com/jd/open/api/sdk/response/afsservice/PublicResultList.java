package com.jd.open.api.sdk.response.afsservice;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class PublicResultList implements Serializable {
   private Integer resultCode;
   private AfsServiceDetailDto modelList;

   @JsonProperty("resultCode")
   public void setResultCode(Integer resultCode) {
      this.resultCode = resultCode;
   }

   @JsonProperty("resultCode")
   public Integer getResultCode() {
      return this.resultCode;
   }

   @JsonProperty("modelList")
   public void setModelList(AfsServiceDetailDto modelList) {
      this.modelList = modelList;
   }

   @JsonProperty("modelList")
   public AfsServiceDetailDto getModelList() {
      return this.modelList;
   }
}
