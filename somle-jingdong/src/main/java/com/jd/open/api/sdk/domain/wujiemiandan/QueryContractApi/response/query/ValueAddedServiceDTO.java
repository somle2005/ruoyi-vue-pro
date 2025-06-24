package com.jd.open.api.sdk.domain.wujiemiandan.QueryContractApi.response.query;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class ValueAddedServiceDTO implements Serializable {
   private String serviceCode;
   private String serviceName;

   @JsonProperty("serviceCode")
   public void setServiceCode(String serviceCode) {
      this.serviceCode = serviceCode;
   }

   @JsonProperty("serviceCode")
   public String getServiceCode() {
      return this.serviceCode;
   }

   @JsonProperty("serviceName")
   public void setServiceName(String serviceName) {
      this.serviceName = serviceName;
   }

   @JsonProperty("serviceName")
   public String getServiceName() {
      return this.serviceName;
   }
}
