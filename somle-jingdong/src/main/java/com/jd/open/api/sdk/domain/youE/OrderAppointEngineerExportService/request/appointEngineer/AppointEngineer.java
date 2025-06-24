package com.jd.open.api.sdk.domain.youE.OrderAppointEngineerExportService.request.appointEngineer;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class AppointEngineer implements Serializable {
   private String dispatchTime;
   private String orderNo;
   private String engineerJDId;
   private String engineerIdCard;
   private String siteName;
   private String remark;
   private String engineerName;
   private String engineerMobile;

   @JsonProperty("dispatchTime")
   public void setDispatchTime(String dispatchTime) {
      this.dispatchTime = dispatchTime;
   }

   @JsonProperty("dispatchTime")
   public String getDispatchTime() {
      return this.dispatchTime;
   }

   @JsonProperty("orderNo")
   public void setOrderNo(String orderNo) {
      this.orderNo = orderNo;
   }

   @JsonProperty("orderNo")
   public String getOrderNo() {
      return this.orderNo;
   }

   @JsonProperty("engineerJDId")
   public void setEngineerJDId(String engineerJDId) {
      this.engineerJDId = engineerJDId;
   }

   @JsonProperty("engineerJDId")
   public String getEngineerJDId() {
      return this.engineerJDId;
   }

   @JsonProperty("engineerIdCard")
   public void setEngineerIdCard(String engineerIdCard) {
      this.engineerIdCard = engineerIdCard;
   }

   @JsonProperty("engineerIdCard")
   public String getEngineerIdCard() {
      return this.engineerIdCard;
   }

   @JsonProperty("siteName")
   public void setSiteName(String siteName) {
      this.siteName = siteName;
   }

   @JsonProperty("siteName")
   public String getSiteName() {
      return this.siteName;
   }

   @JsonProperty("remark")
   public void setRemark(String remark) {
      this.remark = remark;
   }

   @JsonProperty("remark")
   public String getRemark() {
      return this.remark;
   }

   @JsonProperty("engineerName")
   public void setEngineerName(String engineerName) {
      this.engineerName = engineerName;
   }

   @JsonProperty("engineerName")
   public String getEngineerName() {
      return this.engineerName;
   }

   @JsonProperty("engineerMobile")
   public void setEngineerMobile(String engineerMobile) {
      this.engineerMobile = engineerMobile;
   }

   @JsonProperty("engineerMobile")
   public String getEngineerMobile() {
      return this.engineerMobile;
   }
}
