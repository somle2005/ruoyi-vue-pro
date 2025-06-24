package com.jd.open.api.sdk.response.ware;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.ware.KeeperAuditResultService.response.detail.WareInfoAuditResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class WareViolationDetailResponse extends AbstractResponse {
   private WareInfoAuditResult data;

   @JsonProperty("data")
   public void setData(WareInfoAuditResult data) {
      this.data = data;
   }

   @JsonProperty("data")
   public WareInfoAuditResult getData() {
      return this.data;
   }
}
