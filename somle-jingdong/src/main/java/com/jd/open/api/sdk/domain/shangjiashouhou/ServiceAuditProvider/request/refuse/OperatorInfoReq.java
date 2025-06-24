package com.jd.open.api.sdk.domain.shangjiashouhou.ServiceAuditProvider.request.refuse;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;

public class OperatorInfoReq implements Serializable {
   private String operatorPin;
   private String operatorNick;
   private String operatorRemark;
   private Date operatorDate;
   private Integer platformSrc;

   @JsonProperty("operatorPin")
   public void setOperatorPin(String operatorPin) {
      this.operatorPin = operatorPin;
   }

   @JsonProperty("operatorPin")
   public String getOperatorPin() {
      return this.operatorPin;
   }

   @JsonProperty("operatorNick")
   public void setOperatorNick(String operatorNick) {
      this.operatorNick = operatorNick;
   }

   @JsonProperty("operatorNick")
   public String getOperatorNick() {
      return this.operatorNick;
   }

   @JsonProperty("operatorRemark")
   public void setOperatorRemark(String operatorRemark) {
      this.operatorRemark = operatorRemark;
   }

   @JsonProperty("operatorRemark")
   public String getOperatorRemark() {
      return this.operatorRemark;
   }

   @JsonProperty("operatorDate")
   public void setOperatorDate(Date operatorDate) {
      this.operatorDate = operatorDate;
   }

   @JsonProperty("operatorDate")
   public Date getOperatorDate() {
      return this.operatorDate;
   }

   @JsonProperty("platformSrc")
   public void setPlatformSrc(Integer platformSrc) {
      this.platformSrc = platformSrc;
   }

   @JsonProperty("platformSrc")
   public Integer getPlatformSrc() {
      return this.platformSrc;
   }
}
