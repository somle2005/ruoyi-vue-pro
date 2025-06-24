package com.jd.open.api.sdk.domain.wujiemiandan.SignSuccessQueryApi.response.get;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class SignSuccessQueryDTO implements Serializable {
   private String providerCode;
   private Integer providerId;
   private String providerName;
   private Byte providerType;
   private Boolean supportCod;
   private Byte operationType;
   private String branchCode;
   private String branchName;
   private String settlementCode;
   private Long amount;
   private WaybillAddress address;
   private List<ValueAddedServiceDTO> valueAddedServices;

   @JsonProperty("providerCode")
   public void setProviderCode(String providerCode) {
      this.providerCode = providerCode;
   }

   @JsonProperty("providerCode")
   public String getProviderCode() {
      return this.providerCode;
   }

   @JsonProperty("providerId")
   public void setProviderId(Integer providerId) {
      this.providerId = providerId;
   }

   @JsonProperty("providerId")
   public Integer getProviderId() {
      return this.providerId;
   }

   @JsonProperty("providerName")
   public void setProviderName(String providerName) {
      this.providerName = providerName;
   }

   @JsonProperty("providerName")
   public String getProviderName() {
      return this.providerName;
   }

   @JsonProperty("providerType")
   public void setProviderType(Byte providerType) {
      this.providerType = providerType;
   }

   @JsonProperty("providerType")
   public Byte getProviderType() {
      return this.providerType;
   }

   @JsonProperty("supportCod")
   public void setSupportCod(Boolean supportCod) {
      this.supportCod = supportCod;
   }

   @JsonProperty("supportCod")
   public Boolean getSupportCod() {
      return this.supportCod;
   }

   @JsonProperty("operationType")
   public void setOperationType(Byte operationType) {
      this.operationType = operationType;
   }

   @JsonProperty("operationType")
   public Byte getOperationType() {
      return this.operationType;
   }

   @JsonProperty("branchCode")
   public void setBranchCode(String branchCode) {
      this.branchCode = branchCode;
   }

   @JsonProperty("branchCode")
   public String getBranchCode() {
      return this.branchCode;
   }

   @JsonProperty("branchName")
   public void setBranchName(String branchName) {
      this.branchName = branchName;
   }

   @JsonProperty("branchName")
   public String getBranchName() {
      return this.branchName;
   }

   @JsonProperty("settlementCode")
   public void setSettlementCode(String settlementCode) {
      this.settlementCode = settlementCode;
   }

   @JsonProperty("settlementCode")
   public String getSettlementCode() {
      return this.settlementCode;
   }

   @JsonProperty("amount")
   public void setAmount(Long amount) {
      this.amount = amount;
   }

   @JsonProperty("amount")
   public Long getAmount() {
      return this.amount;
   }

   @JsonProperty("address")
   public void setAddress(WaybillAddress address) {
      this.address = address;
   }

   @JsonProperty("address")
   public WaybillAddress getAddress() {
      return this.address;
   }

   @JsonProperty("valueAddedServices")
   public void setValueAddedServices(List<ValueAddedServiceDTO> valueAddedServices) {
      this.valueAddedServices = valueAddedServices;
   }

   @JsonProperty("valueAddedServices")
   public List<ValueAddedServiceDTO> getValueAddedServices() {
      return this.valueAddedServices;
   }
}
