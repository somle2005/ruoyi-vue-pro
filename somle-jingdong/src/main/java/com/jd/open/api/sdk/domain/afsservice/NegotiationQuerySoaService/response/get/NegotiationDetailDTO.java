package com.jd.open.api.sdk.domain.afsservice.NegotiationQuerySoaService.response.get;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class NegotiationDetailDTO implements Serializable {
   private String negotiationPlan;
   private String negotiationReason;
   private Integer negotiationStatus;
   private Long overTime;
   private Integer refType;
   private Long negotiationId;
   private Long refId;
   private Integer negotiationPurpose;
   private NegotiationCloseDetailDTO negotiationCloseDetail;

   @JsonProperty("negotiationPlan")
   public void setNegotiationPlan(String negotiationPlan) {
      this.negotiationPlan = negotiationPlan;
   }

   @JsonProperty("negotiationPlan")
   public String getNegotiationPlan() {
      return this.negotiationPlan;
   }

   @JsonProperty("negotiationReason")
   public void setNegotiationReason(String negotiationReason) {
      this.negotiationReason = negotiationReason;
   }

   @JsonProperty("negotiationReason")
   public String getNegotiationReason() {
      return this.negotiationReason;
   }

   @JsonProperty("negotiationStatus")
   public void setNegotiationStatus(Integer negotiationStatus) {
      this.negotiationStatus = negotiationStatus;
   }

   @JsonProperty("negotiationStatus")
   public Integer getNegotiationStatus() {
      return this.negotiationStatus;
   }

   @JsonProperty("overTime")
   public void setOverTime(Long overTime) {
      this.overTime = overTime;
   }

   @JsonProperty("overTime")
   public Long getOverTime() {
      return this.overTime;
   }

   @JsonProperty("refType")
   public void setRefType(Integer refType) {
      this.refType = refType;
   }

   @JsonProperty("refType")
   public Integer getRefType() {
      return this.refType;
   }

   @JsonProperty("negotiationId")
   public void setNegotiationId(Long negotiationId) {
      this.negotiationId = negotiationId;
   }

   @JsonProperty("negotiationId")
   public Long getNegotiationId() {
      return this.negotiationId;
   }

   @JsonProperty("refId")
   public void setRefId(Long refId) {
      this.refId = refId;
   }

   @JsonProperty("refId")
   public Long getRefId() {
      return this.refId;
   }

   @JsonProperty("negotiationPurpose")
   public void setNegotiationPurpose(Integer negotiationPurpose) {
      this.negotiationPurpose = negotiationPurpose;
   }

   @JsonProperty("negotiationPurpose")
   public Integer getNegotiationPurpose() {
      return this.negotiationPurpose;
   }

   @JsonProperty("negotiationCloseDetail")
   public void setNegotiationCloseDetail(NegotiationCloseDetailDTO negotiationCloseDetail) {
      this.negotiationCloseDetail = negotiationCloseDetail;
   }

   @JsonProperty("negotiationCloseDetail")
   public NegotiationCloseDetailDTO getNegotiationCloseDetail() {
      return this.negotiationCloseDetail;
   }
}
