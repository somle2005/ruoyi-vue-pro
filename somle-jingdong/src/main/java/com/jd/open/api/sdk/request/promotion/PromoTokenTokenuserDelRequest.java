package com.jd.open.api.sdk.request.promotion;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.promotion.PromoTokenTokenuserDelResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class PromoTokenTokenuserDelRequest extends AbstractRequest implements JdRequest<PromoTokenTokenuserDelResponse> {
   private long tokenId;
   private String userPin;
   private String secretKey;
   private String appCode;
   private String authKey;
   private String openIdBuyer;
   private String xidBuyer;

   public void setTokenId(long tokenId) {
      this.tokenId = tokenId;
   }

   public long getTokenId() {
      return this.tokenId;
   }

   public void setUserPin(String userPin) {
      this.userPin = userPin;
   }

   public String getUserPin() {
      return this.userPin;
   }

   public void setSecretKey(String secretKey) {
      this.secretKey = secretKey;
   }

   public String getSecretKey() {
      return this.secretKey;
   }

   public void setAppCode(String appCode) {
      this.appCode = appCode;
   }

   public String getAppCode() {
      return this.appCode;
   }

   public void setAuthKey(String authKey) {
      this.authKey = authKey;
   }

   public String getAuthKey() {
      return this.authKey;
   }

   public void setOpenIdBuyer(String openIdBuyer) {
      this.openIdBuyer = openIdBuyer;
   }

   public String getOpenIdBuyer() {
      return this.openIdBuyer;
   }

   public void setXidBuyer(String xidBuyer) {
      this.xidBuyer = xidBuyer;
   }

   public String getXidBuyer() {
      return this.xidBuyer;
   }

   public String getApiMethod() {
      return "jingdong.promo.token.tokenuser.del";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("tokenId", this.tokenId);
      pmap.put("userPin", this.userPin);
      pmap.put("secretKey", this.secretKey);
      pmap.put("appCode", this.appCode);
      pmap.put("authKey", this.authKey);
      pmap.put("open_id_buyer", this.openIdBuyer);
      pmap.put("xid_buyer", this.xidBuyer);
      return JsonUtil.toJson(pmap);
   }

   public Class<PromoTokenTokenuserDelResponse> getResponseClass() {
      return PromoTokenTokenuserDelResponse.class;
   }
}
