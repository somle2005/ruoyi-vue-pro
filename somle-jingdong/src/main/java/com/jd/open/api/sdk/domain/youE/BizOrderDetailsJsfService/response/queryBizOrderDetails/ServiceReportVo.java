package com.jd.open.api.sdk.domain.youE.BizOrderDetailsJsfService.response.queryBizOrderDetails;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class ServiceReportVo implements Serializable {
   private Integer serviceReportStatus;
   private String serviceReportConfirmTime;
   private String serviceReportInfo;

   @JsonProperty("serviceReportStatus")
   public void setServiceReportStatus(Integer serviceReportStatus) {
      this.serviceReportStatus = serviceReportStatus;
   }

   @JsonProperty("serviceReportStatus")
   public Integer getServiceReportStatus() {
      return this.serviceReportStatus;
   }

   @JsonProperty("serviceReportConfirmTime")
   public void setServiceReportConfirmTime(String serviceReportConfirmTime) {
      this.serviceReportConfirmTime = serviceReportConfirmTime;
   }

   @JsonProperty("serviceReportConfirmTime")
   public String getServiceReportConfirmTime() {
      return this.serviceReportConfirmTime;
   }

   @JsonProperty("serviceReportInfo")
   public void setServiceReportInfo(String serviceReportInfo) {
      this.serviceReportInfo = serviceReportInfo;
   }

   @JsonProperty("serviceReportInfo")
   public String getServiceReportInfo() {
      return this.serviceReportInfo;
   }
}
