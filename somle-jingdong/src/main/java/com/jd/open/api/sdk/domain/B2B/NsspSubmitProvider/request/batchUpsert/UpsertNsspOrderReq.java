package com.jd.open.api.sdk.domain.B2B.NsspSubmitProvider.request.batchUpsert;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class UpsertNsspOrderReq implements Serializable {
   private Long nsspId;
   private List<UpsertNsspSkuReq> upsertNsspSkuReqList;
   private String operater;
   private String buyerPin;
   private Long jdOrderId;
   private Integer nsspSource;
   private String openIdBuyer;
   private String xidBuyer;

   @JsonProperty("nsspId")
   public void setNsspId(Long nsspId) {
      this.nsspId = nsspId;
   }

   @JsonProperty("nsspId")
   public Long getNsspId() {
      return this.nsspId;
   }

   @JsonProperty("upsertNsspSkuReqList")
   public void setUpsertNsspSkuReqList(List<UpsertNsspSkuReq> upsertNsspSkuReqList) {
      this.upsertNsspSkuReqList = upsertNsspSkuReqList;
   }

   @JsonProperty("upsertNsspSkuReqList")
   public List<UpsertNsspSkuReq> getUpsertNsspSkuReqList() {
      return this.upsertNsspSkuReqList;
   }

   @JsonProperty("operater")
   public void setOperater(String operater) {
      this.operater = operater;
   }

   @JsonProperty("operater")
   public String getOperater() {
      return this.operater;
   }

   @JsonProperty("buyerPin")
   public void setBuyerPin(String buyerPin) {
      this.buyerPin = buyerPin;
   }

   @JsonProperty("buyerPin")
   public String getBuyerPin() {
      return this.buyerPin;
   }

   @JsonProperty("jdOrderId")
   public void setJdOrderId(Long jdOrderId) {
      this.jdOrderId = jdOrderId;
   }

   @JsonProperty("jdOrderId")
   public Long getJdOrderId() {
      return this.jdOrderId;
   }

   @JsonProperty("nsspSource")
   public void setNsspSource(Integer nsspSource) {
      this.nsspSource = nsspSource;
   }

   @JsonProperty("nsspSource")
   public Integer getNsspSource() {
      return this.nsspSource;
   }

   @JsonProperty("open_id_buyer")
   public void setOpenIdBuyer(String openIdBuyer) {
      this.openIdBuyer = openIdBuyer;
   }

   @JsonProperty("open_id_buyer")
   public String getOpenIdBuyer() {
      return this.openIdBuyer;
   }

   @JsonProperty("xid_buyer")
   public void setXidBuyer(String xidBuyer) {
      this.xidBuyer = xidBuyer;
   }

   @JsonProperty("xid_buyer")
   public String getXidBuyer() {
      return this.xidBuyer;
   }
}
