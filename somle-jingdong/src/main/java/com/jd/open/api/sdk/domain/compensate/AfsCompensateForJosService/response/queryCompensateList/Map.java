package com.jd.open.api.sdk.domain.compensate.AfsCompensateForJosService.response.queryCompensateList;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class Map implements Serializable {
   private String venderId;
   private Long compensateId;
   private Long compensateKeyid;
   private Long type;
   private String orderId;
   private Long orderType;
   private String modified;
   private String created;
   private Long compensateType;
   private Double shouldpay;
   private Double compensateamount;
   private String compensateReason;
   private Integer checkStatus;
   private Integer erpCheckStatus;
   private Integer canSecondAppeal;
   private Integer refType;
   private Long refId;

   @JsonProperty("vender_id")
   public void setVenderId(String venderId) {
      this.venderId = venderId;
   }

   @JsonProperty("vender_id")
   public String getVenderId() {
      return this.venderId;
   }

   @JsonProperty("compensate_id")
   public void setCompensateId(Long compensateId) {
      this.compensateId = compensateId;
   }

   @JsonProperty("compensate_id")
   public Long getCompensateId() {
      return this.compensateId;
   }

   @JsonProperty("compensate_keyid")
   public void setCompensateKeyid(Long compensateKeyid) {
      this.compensateKeyid = compensateKeyid;
   }

   @JsonProperty("compensate_keyid")
   public Long getCompensateKeyid() {
      return this.compensateKeyid;
   }

   @JsonProperty("type")
   public void setType(Long type) {
      this.type = type;
   }

   @JsonProperty("type")
   public Long getType() {
      return this.type;
   }

   @JsonProperty("order_id")
   public void setOrderId(String orderId) {
      this.orderId = orderId;
   }

   @JsonProperty("order_id")
   public String getOrderId() {
      return this.orderId;
   }

   @JsonProperty("order_type")
   public void setOrderType(Long orderType) {
      this.orderType = orderType;
   }

   @JsonProperty("order_type")
   public Long getOrderType() {
      return this.orderType;
   }

   @JsonProperty("modified")
   public void setModified(String modified) {
      this.modified = modified;
   }

   @JsonProperty("modified")
   public String getModified() {
      return this.modified;
   }

   @JsonProperty("created")
   public void setCreated(String created) {
      this.created = created;
   }

   @JsonProperty("created")
   public String getCreated() {
      return this.created;
   }

   @JsonProperty("compensate_type")
   public void setCompensateType(Long compensateType) {
      this.compensateType = compensateType;
   }

   @JsonProperty("compensate_type")
   public Long getCompensateType() {
      return this.compensateType;
   }

   @JsonProperty("shouldpay")
   public void setShouldpay(Double shouldpay) {
      this.shouldpay = shouldpay;
   }

   @JsonProperty("shouldpay")
   public Double getShouldpay() {
      return this.shouldpay;
   }

   @JsonProperty("compensateamount")
   public void setCompensateamount(Double compensateamount) {
      this.compensateamount = compensateamount;
   }

   @JsonProperty("compensateamount")
   public Double getCompensateamount() {
      return this.compensateamount;
   }

   @JsonProperty("compensate_reason")
   public void setCompensateReason(String compensateReason) {
      this.compensateReason = compensateReason;
   }

   @JsonProperty("compensate_reason")
   public String getCompensateReason() {
      return this.compensateReason;
   }

   @JsonProperty("check_status")
   public void setCheckStatus(Integer checkStatus) {
      this.checkStatus = checkStatus;
   }

   @JsonProperty("check_status")
   public Integer getCheckStatus() {
      return this.checkStatus;
   }

   @JsonProperty("erp_check_status")
   public void setErpCheckStatus(Integer erpCheckStatus) {
      this.erpCheckStatus = erpCheckStatus;
   }

   @JsonProperty("erp_check_status")
   public Integer getErpCheckStatus() {
      return this.erpCheckStatus;
   }

   @JsonProperty("can_second_appeal")
   public void setCanSecondAppeal(Integer canSecondAppeal) {
      this.canSecondAppeal = canSecondAppeal;
   }

   @JsonProperty("can_second_appeal")
   public Integer getCanSecondAppeal() {
      return this.canSecondAppeal;
   }

   @JsonProperty("ref_type")
   public void setRefType(Integer refType) {
      this.refType = refType;
   }

   @JsonProperty("ref_type")
   public Integer getRefType() {
      return this.refType;
   }

   @JsonProperty("ref_id")
   public void setRefId(Long refId) {
      this.refId = refId;
   }

   @JsonProperty("ref_id")
   public Long getRefId() {
      return this.refId;
   }
}
