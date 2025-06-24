package com.jd.open.api.sdk.domain.O2O.LocOrderCodeSoaService.request.revokeCheckNumber;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class RevokeCheckNumParam implements Serializable {
   private Long orderId;
   private String requestId;
   private String codeNum;
   private String pwdNumber;
   private List<RevokeCheckNumCardParam> cardList;

   @JsonProperty("orderId")
   public void setOrderId(Long orderId) {
      this.orderId = orderId;
   }

   @JsonProperty("orderId")
   public Long getOrderId() {
      return this.orderId;
   }

   @JsonProperty("requestId")
   public void setRequestId(String requestId) {
      this.requestId = requestId;
   }

   @JsonProperty("requestId")
   public String getRequestId() {
      return this.requestId;
   }

   @JsonProperty("codeNum")
   public void setCodeNum(String codeNum) {
      this.codeNum = codeNum;
   }

   @JsonProperty("codeNum")
   public String getCodeNum() {
      return this.codeNum;
   }

   @JsonProperty("pwdNumber")
   public void setPwdNumber(String pwdNumber) {
      this.pwdNumber = pwdNumber;
   }

   @JsonProperty("pwdNumber")
   public String getPwdNumber() {
      return this.pwdNumber;
   }

   @JsonProperty("cardList")
   public void setCardList(List<RevokeCheckNumCardParam> cardList) {
      this.cardList = cardList;
   }

   @JsonProperty("cardList")
   public List<RevokeCheckNumCardParam> getCardList() {
      return this.cardList;
   }
}
