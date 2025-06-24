package com.jd.open.api.sdk.domain.c2mdzkfpt.SkuCustomServiceOpenApi.response.skuCustomServiceBatchApply;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class SkuServiceBatchApplyResp implements Serializable {
   private int code;
   private String message;
   private List<SkuServiceApplyDetailResp> applyRespList;

   @JsonProperty("code")
   public void setCode(int code) {
      this.code = code;
   }

   @JsonProperty("code")
   public int getCode() {
      return this.code;
   }

   @JsonProperty("message")
   public void setMessage(String message) {
      this.message = message;
   }

   @JsonProperty("message")
   public String getMessage() {
      return this.message;
   }

   @JsonProperty("applyRespList")
   public void setApplyRespList(List<SkuServiceApplyDetailResp> applyRespList) {
      this.applyRespList = applyRespList;
   }

   @JsonProperty("applyRespList")
   public List<SkuServiceApplyDetailResp> getApplyRespList() {
      return this.applyRespList;
   }
}
