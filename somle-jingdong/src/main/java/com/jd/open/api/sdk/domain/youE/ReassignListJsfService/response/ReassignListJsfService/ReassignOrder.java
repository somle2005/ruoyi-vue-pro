package com.jd.open.api.sdk.domain.youE.ReassignListJsfService.response.ReassignListJsfService;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class ReassignOrder implements Serializable {
   private String orderNo;
   private Integer reassignInfo;
   private String userMobile;
   private String userName;

   @JsonProperty("orderNo")
   public void setOrderNo(String orderNo) {
      this.orderNo = orderNo;
   }

   @JsonProperty("orderNo")
   public String getOrderNo() {
      return this.orderNo;
   }

   @JsonProperty("reassignInfo")
   public void setReassignInfo(Integer reassignInfo) {
      this.reassignInfo = reassignInfo;
   }

   @JsonProperty("reassignInfo")
   public Integer getReassignInfo() {
      return this.reassignInfo;
   }

   @JsonProperty("userMobile")
   public void setUserMobile(String userMobile) {
      this.userMobile = userMobile;
   }

   @JsonProperty("userMobile")
   public String getUserMobile() {
      return this.userMobile;
   }

   @JsonProperty("userName")
   public void setUserName(String userName) {
      this.userName = userName;
   }

   @JsonProperty("userName")
   public String getUserName() {
      return this.userName;
   }
}
