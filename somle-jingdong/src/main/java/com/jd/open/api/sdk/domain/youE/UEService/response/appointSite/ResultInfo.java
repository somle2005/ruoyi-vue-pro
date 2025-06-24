package com.jd.open.api.sdk.domain.youE.UEService.response.appointSite;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class ResultInfo implements Serializable {
   private Integer resultCode;
   private String errMsg;
   private List<FwTast> fwTastList;
   private Integer pageSize;
   private List<DeliverInfo> deliverInfoList;
   private List<ColseOrder> closeOrderList;

   @JsonProperty("resultCode")
   public void setResultCode(Integer resultCode) {
      this.resultCode = resultCode;
   }

   @JsonProperty("resultCode")
   public Integer getResultCode() {
      return this.resultCode;
   }

   @JsonProperty("errMsg")
   public void setErrMsg(String errMsg) {
      this.errMsg = errMsg;
   }

   @JsonProperty("errMsg")
   public String getErrMsg() {
      return this.errMsg;
   }

   @JsonProperty("fwTastList")
   public void setFwTastList(List<FwTast> fwTastList) {
      this.fwTastList = fwTastList;
   }

   @JsonProperty("fwTastList")
   public List<FwTast> getFwTastList() {
      return this.fwTastList;
   }

   @JsonProperty("pageSize")
   public void setPageSize(Integer pageSize) {
      this.pageSize = pageSize;
   }

   @JsonProperty("pageSize")
   public Integer getPageSize() {
      return this.pageSize;
   }

   @JsonProperty("deliverInfoList")
   public void setDeliverInfoList(List<DeliverInfo> deliverInfoList) {
      this.deliverInfoList = deliverInfoList;
   }

   @JsonProperty("deliverInfoList")
   public List<DeliverInfo> getDeliverInfoList() {
      return this.deliverInfoList;
   }

   @JsonProperty("closeOrderList")
   public void setCloseOrderList(List<ColseOrder> closeOrderList) {
      this.closeOrderList = closeOrderList;
   }

   @JsonProperty("closeOrderList")
   public List<ColseOrder> getCloseOrderList() {
      return this.closeOrderList;
   }
}
