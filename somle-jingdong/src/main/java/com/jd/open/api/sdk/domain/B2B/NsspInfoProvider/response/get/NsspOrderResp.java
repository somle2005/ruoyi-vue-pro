package com.jd.open.api.sdk.domain.B2B.NsspInfoProvider.response.get;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class NsspOrderResp implements Serializable {
   private Long nsspId;
   private Long parentNsspId;
   private Long jdOrderId;
   private Long parentJdOrderId;
   private Long rootJdOrderId;
   private Integer nsspOrderType;
   private Integer nsspOrderStatus;
   private String pin;
   private Long venderId;
   private List<NsspSkuResp> skuList;
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

   @JsonProperty("parentNsspId")
   public void setParentNsspId(Long parentNsspId) {
      this.parentNsspId = parentNsspId;
   }

   @JsonProperty("parentNsspId")
   public Long getParentNsspId() {
      return this.parentNsspId;
   }

   @JsonProperty("jdOrderId")
   public void setJdOrderId(Long jdOrderId) {
      this.jdOrderId = jdOrderId;
   }

   @JsonProperty("jdOrderId")
   public Long getJdOrderId() {
      return this.jdOrderId;
   }

   @JsonProperty("parentJdOrderId")
   public void setParentJdOrderId(Long parentJdOrderId) {
      this.parentJdOrderId = parentJdOrderId;
   }

   @JsonProperty("parentJdOrderId")
   public Long getParentJdOrderId() {
      return this.parentJdOrderId;
   }

   @JsonProperty("rootJdOrderId")
   public void setRootJdOrderId(Long rootJdOrderId) {
      this.rootJdOrderId = rootJdOrderId;
   }

   @JsonProperty("rootJdOrderId")
   public Long getRootJdOrderId() {
      return this.rootJdOrderId;
   }

   @JsonProperty("nsspOrderType")
   public void setNsspOrderType(Integer nsspOrderType) {
      this.nsspOrderType = nsspOrderType;
   }

   @JsonProperty("nsspOrderType")
   public Integer getNsspOrderType() {
      return this.nsspOrderType;
   }

   @JsonProperty("nsspOrderStatus")
   public void setNsspOrderStatus(Integer nsspOrderStatus) {
      this.nsspOrderStatus = nsspOrderStatus;
   }

   @JsonProperty("nsspOrderStatus")
   public Integer getNsspOrderStatus() {
      return this.nsspOrderStatus;
   }

   @JsonProperty("pin")
   public void setPin(String pin) {
      this.pin = pin;
   }

   @JsonProperty("pin")
   public String getPin() {
      return this.pin;
   }

   @JsonProperty("venderId")
   public void setVenderId(Long venderId) {
      this.venderId = venderId;
   }

   @JsonProperty("venderId")
   public Long getVenderId() {
      return this.venderId;
   }

   @JsonProperty("skuList")
   public void setSkuList(List<NsspSkuResp> skuList) {
      this.skuList = skuList;
   }

   @JsonProperty("skuList")
   public List<NsspSkuResp> getSkuList() {
      return this.skuList;
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
