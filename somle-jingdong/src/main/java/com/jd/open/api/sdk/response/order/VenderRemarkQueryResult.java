package com.jd.open.api.sdk.response.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class VenderRemarkQueryResult implements Serializable {
   private ApiJosResult apiJosResult;
   private VenderRemark venderRemark;

   @JsonProperty("api_jos_result")
   public void setApiJosResult(ApiJosResult apiJosResult) {
      this.apiJosResult = apiJosResult;
   }

   @JsonProperty("api_jos_result")
   public ApiJosResult getApiJosResult() {
      return this.apiJosResult;
   }

   @JsonProperty("vender_remark")
   public void setVenderRemark(VenderRemark venderRemark) {
      this.venderRemark = venderRemark;
   }

   @JsonProperty("vender_remark")
   public VenderRemark getVenderRemark() {
      return this.venderRemark;
   }
}
