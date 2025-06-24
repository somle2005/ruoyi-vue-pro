package com.jd.open.api.sdk.domain.etms.ServiceFrontCheckApi.request.check;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class ProCheckDTO implements Serializable {
   private Integer checkType;
   private String customerCode;
   private String tid;
   private List<Address> addressList;

   @JsonProperty("checkType")
   public void setCheckType(Integer checkType) {
      this.checkType = checkType;
   }

   @JsonProperty("checkType")
   public Integer getCheckType() {
      return this.checkType;
   }

   @JsonProperty("customerCode")
   public void setCustomerCode(String customerCode) {
      this.customerCode = customerCode;
   }

   @JsonProperty("customerCode")
   public String getCustomerCode() {
      return this.customerCode;
   }

   @JsonProperty("tid")
   public void setTid(String tid) {
      this.tid = tid;
   }

   @JsonProperty("tid")
   public String getTid() {
      return this.tid;
   }

   @JsonProperty("addressList")
   public void setAddressList(List<Address> addressList) {
      this.addressList = addressList;
   }

   @JsonProperty("addressList")
   public List<Address> getAddressList() {
      return this.addressList;
   }
}
