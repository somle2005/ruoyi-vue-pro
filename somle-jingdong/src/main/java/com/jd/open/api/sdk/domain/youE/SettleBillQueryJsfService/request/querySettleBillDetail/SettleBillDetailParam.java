package com.jd.open.api.sdk.domain.youE.SettleBillQueryJsfService.request.querySettleBillDetail;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class SettleBillDetailParam implements Serializable {
   private Integer pageNo;
   private Integer pageSize;
   private String settleNo;

   @JsonProperty("pageNo")
   public void setPageNo(Integer pageNo) {
      this.pageNo = pageNo;
   }

   @JsonProperty("pageNo")
   public Integer getPageNo() {
      return this.pageNo;
   }

   @JsonProperty("pageSize")
   public void setPageSize(Integer pageSize) {
      this.pageSize = pageSize;
   }

   @JsonProperty("pageSize")
   public Integer getPageSize() {
      return this.pageSize;
   }

   @JsonProperty("settleNo")
   public void setSettleNo(String settleNo) {
      this.settleNo = settleNo;
   }

   @JsonProperty("settleNo")
   public String getSettleNo() {
      return this.settleNo;
   }
}
