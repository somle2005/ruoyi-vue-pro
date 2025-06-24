package com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.queryServiceItemInfoByServiceNo;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class ServiceItemInfo implements Serializable {
   private String[] isvGoodsNo;
   private String[] partReceiveType;
   private String[] goodsStatus;
   private String[] wareType;
   private String[] approveNotes;

   @JsonProperty("isvGoodsNo")
   public void setIsvGoodsNo(String[] isvGoodsNo) {
      this.isvGoodsNo = isvGoodsNo;
   }

   @JsonProperty("isvGoodsNo")
   public String[] getIsvGoodsNo() {
      return this.isvGoodsNo;
   }

   @JsonProperty("partReceiveType")
   public void setPartReceiveType(String[] partReceiveType) {
      this.partReceiveType = partReceiveType;
   }

   @JsonProperty("partReceiveType")
   public String[] getPartReceiveType() {
      return this.partReceiveType;
   }

   @JsonProperty("goodsStatus")
   public void setGoodsStatus(String[] goodsStatus) {
      this.goodsStatus = goodsStatus;
   }

   @JsonProperty("goodsStatus")
   public String[] getGoodsStatus() {
      return this.goodsStatus;
   }

   @JsonProperty("wareType")
   public void setWareType(String[] wareType) {
      this.wareType = wareType;
   }

   @JsonProperty("wareType")
   public String[] getWareType() {
      return this.wareType;
   }

   @JsonProperty("approveNotes")
   public void setApproveNotes(String[] approveNotes) {
      this.approveNotes = approveNotes;
   }

   @JsonProperty("approveNotes")
   public String[] getApproveNotes() {
      return this.approveNotes;
   }
}
