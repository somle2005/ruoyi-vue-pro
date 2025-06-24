package com.jd.open.api.sdk.domain.unboundedShop.BusinessFacade.response.findBusinessByVenderId;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class BusinessInfo implements Serializable {
   private long bId;
   private long pId;
   private String businessName;
   private Long companyId;
   private String lastOpertor;
   private int status;
   private String mark;

   @JsonProperty("bId")
   public void setBId(long bId) {
      this.bId = bId;
   }

   @JsonProperty("bId")
   public long getBId() {
      return this.bId;
   }

   @JsonProperty("pId")
   public void setPId(long pId) {
      this.pId = pId;
   }

   @JsonProperty("pId")
   public long getPId() {
      return this.pId;
   }

   @JsonProperty("businessName")
   public void setBusinessName(String businessName) {
      this.businessName = businessName;
   }

   @JsonProperty("businessName")
   public String getBusinessName() {
      return this.businessName;
   }

   @JsonProperty("companyId")
   public void setCompanyId(Long companyId) {
      this.companyId = companyId;
   }

   @JsonProperty("companyId")
   public Long getCompanyId() {
      return this.companyId;
   }

   @JsonProperty("lastOpertor")
   public void setLastOpertor(String lastOpertor) {
      this.lastOpertor = lastOpertor;
   }

   @JsonProperty("lastOpertor")
   public String getLastOpertor() {
      return this.lastOpertor;
   }

   @JsonProperty("status")
   public void setStatus(int status) {
      this.status = status;
   }

   @JsonProperty("status")
   public int getStatus() {
      return this.status;
   }

   @JsonProperty("mark")
   public void setMark(String mark) {
      this.mark = mark;
   }

   @JsonProperty("mark")
   public String getMark() {
      return this.mark;
   }
}
