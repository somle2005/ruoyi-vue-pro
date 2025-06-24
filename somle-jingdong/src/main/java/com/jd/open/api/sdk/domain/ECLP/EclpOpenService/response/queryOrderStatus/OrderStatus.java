package com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.queryOrderStatus;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class OrderStatus implements Serializable {
   private int[] soStatusCode;
   private String[] soStatusName;
   private String[] operateTime;
   private String[] operateUser;

   @JsonProperty("soStatusCode")
   public void setSoStatusCode(int[] soStatusCode) {
      this.soStatusCode = soStatusCode;
   }

   @JsonProperty("soStatusCode")
   public int[] getSoStatusCode() {
      return this.soStatusCode;
   }

   @JsonProperty("soStatusName")
   public void setSoStatusName(String[] soStatusName) {
      this.soStatusName = soStatusName;
   }

   @JsonProperty("soStatusName")
   public String[] getSoStatusName() {
      return this.soStatusName;
   }

   @JsonProperty("operateTime")
   public void setOperateTime(String[] operateTime) {
      this.operateTime = operateTime;
   }

   @JsonProperty("operateTime")
   public String[] getOperateTime() {
      return this.operateTime;
   }

   @JsonProperty("operateUser")
   public void setOperateUser(String[] operateUser) {
      this.operateUser = operateUser;
   }

   @JsonProperty("operateUser")
   public String[] getOperateUser() {
      return this.operateUser;
   }
}
