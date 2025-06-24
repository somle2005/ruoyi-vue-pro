package com.jd.open.api.sdk.request.jialilue;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.jialilue.SynchSubmitSettlementTradeResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class SynchSubmitSettlementTradeRequest extends AbstractRequest implements JdRequest<SynchSubmitSettlementTradeResponse> {
   private String billingBusinessType;
   private String systemId;
   private String settleEntityType;
   private String accountType;
   private String extJson;
   private String feeType;
   private String tradeBillId;
   private String billingBusinessId;
   private String accountId;
   private String createby;
   private String settleEntityId;
   private String balance;
   private String requestId;
   private String tradeBillType;
   private String currency;
   private String direction;

   public void setBillingBusinessType(String billingBusinessType) {
      this.billingBusinessType = billingBusinessType;
   }

   public String getBillingBusinessType() {
      return this.billingBusinessType;
   }

   public void setSystemId(String systemId) {
      this.systemId = systemId;
   }

   public String getSystemId() {
      return this.systemId;
   }

   public void setSettleEntityType(String settleEntityType) {
      this.settleEntityType = settleEntityType;
   }

   public String getSettleEntityType() {
      return this.settleEntityType;
   }

   public void setAccountType(String accountType) {
      this.accountType = accountType;
   }

   public String getAccountType() {
      return this.accountType;
   }

   public void setExtJson(String extJson) {
      this.extJson = extJson;
   }

   public String getExtJson() {
      return this.extJson;
   }

   public void setFeeType(String feeType) {
      this.feeType = feeType;
   }

   public String getFeeType() {
      return this.feeType;
   }

   public void setTradeBillId(String tradeBillId) {
      this.tradeBillId = tradeBillId;
   }

   public String getTradeBillId() {
      return this.tradeBillId;
   }

   public void setBillingBusinessId(String billingBusinessId) {
      this.billingBusinessId = billingBusinessId;
   }

   public String getBillingBusinessId() {
      return this.billingBusinessId;
   }

   public void setAccountId(String accountId) {
      this.accountId = accountId;
   }

   public String getAccountId() {
      return this.accountId;
   }

   public void setCreateby(String createby) {
      this.createby = createby;
   }

   public String getCreateby() {
      return this.createby;
   }

   public void setSettleEntityId(String settleEntityId) {
      this.settleEntityId = settleEntityId;
   }

   public String getSettleEntityId() {
      return this.settleEntityId;
   }

   public void setBalance(String balance) {
      this.balance = balance;
   }

   public String getBalance() {
      return this.balance;
   }

   public void setRequestId(String requestId) {
      this.requestId = requestId;
   }

   public String getRequestId() {
      return this.requestId;
   }

   public void setTradeBillType(String tradeBillType) {
      this.tradeBillType = tradeBillType;
   }

   public String getTradeBillType() {
      return this.tradeBillType;
   }

   public void setCurrency(String currency) {
      this.currency = currency;
   }

   public String getCurrency() {
      return this.currency;
   }

   public void setDirection(String direction) {
      this.direction = direction;
   }

   public String getDirection() {
      return this.direction;
   }

   public String getApiMethod() {
      return "jingdong.synchSubmitSettlementTrade";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("billingBusinessType", this.billingBusinessType);
      pmap.put("systemId", this.systemId);
      pmap.put("settleEntityType", this.settleEntityType);
      pmap.put("accountType", this.accountType);
      pmap.put("extJson", this.extJson);
      pmap.put("feeType", this.feeType);
      pmap.put("tradeBillId", this.tradeBillId);
      pmap.put("billingBusinessId", this.billingBusinessId);
      pmap.put("accountId", this.accountId);
      pmap.put("createby", this.createby);
      pmap.put("settleEntityId", this.settleEntityId);
      pmap.put("balance", this.balance);
      pmap.put("requestId", this.requestId);
      pmap.put("tradeBillType", this.tradeBillType);
      pmap.put("currency", this.currency);
      pmap.put("direction", this.direction);
      return JsonUtil.toJson(pmap);
   }

   public Class<SynchSubmitSettlementTradeResponse> getResponseClass() {
      return SynchSubmitSettlementTradeResponse.class;
   }
}
