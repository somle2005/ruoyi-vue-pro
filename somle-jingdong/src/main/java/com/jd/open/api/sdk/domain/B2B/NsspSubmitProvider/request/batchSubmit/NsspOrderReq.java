package com.jd.open.api.sdk.domain.B2B.NsspSubmitProvider.request.batchSubmit;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class NsspOrderReq implements Serializable {
   private List<NSSkuReq> skuList;
   private String thirdNsspId;
   private String buyerPin;
   private Integer classifyType;
   private Long jdOrderId;
   private Integer nsspSource;
   private String openIdBuyer;
   private String xidBuyer;

   @JsonProperty("skuList")
   public void setSkuList(List<NSSkuReq> skuList) {
      this.skuList = skuList;
   }

   @JsonProperty("skuList")
   public List<NSSkuReq> getSkuList() {
      return this.skuList;
   }

   @JsonProperty("thirdNsspId")
   public void setThirdNsspId(String thirdNsspId) {
      this.thirdNsspId = thirdNsspId;
   }

   @JsonProperty("thirdNsspId")
   public String getThirdNsspId() {
      return this.thirdNsspId;
   }

   @JsonProperty("buyerPin")
   public void setBuyerPin(String buyerPin) {
      this.buyerPin = buyerPin;
   }

   @JsonProperty("buyerPin")
   public String getBuyerPin() {
      return this.buyerPin;
   }

   @JsonProperty("classifyType")
   public void setClassifyType(Integer classifyType) {
      this.classifyType = classifyType;
   }

   @JsonProperty("classifyType")
   public Integer getClassifyType() {
      return this.classifyType;
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
