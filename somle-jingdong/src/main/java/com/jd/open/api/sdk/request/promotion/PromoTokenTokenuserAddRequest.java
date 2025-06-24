package com.jd.open.api.sdk.request.promotion;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.promotion.PromoTokenTokenuserAddResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

public class PromoTokenTokenuserAddRequest extends AbstractRequest implements JdRequest<PromoTokenTokenuserAddResponse> {
   private long tokenId;
   private String userPin;
   private Date timeStart;
   private Date timeEnd;
   private String openIdBuyer;
   private String xidBuyer;
   private Boolean existUpdate;
   private String secretKey;
   private String appCode;
   private String authKey;

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

   public void setTimeStart(Date timeStart) {
      this.timeStart = timeStart;
   }

   public Date getTimeStart() {
      return this.timeStart;
   }

   public void setTimeEnd(Date timeEnd) {
      this.timeEnd = timeEnd;
   }

   public Date getTimeEnd() {
      return this.timeEnd;
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

   public void setExistUpdate(Boolean existUpdate) {
      this.existUpdate = existUpdate;
   }

   public Boolean getExistUpdate() {
      return this.existUpdate;
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

   public String getApiMethod() {
      return "jingdong.promo.token.tokenuser.add";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("tokenId", this.tokenId);
      pmap.put("userPin", this.userPin);

      try {
         if (this.timeStart != null) {
            pmap.put("timeStart", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.timeStart));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      try {
         if (this.timeEnd != null) {
            pmap.put("timeEnd", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.timeEnd));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      pmap.put("open_id_buyer", this.openIdBuyer);
      pmap.put("xid_buyer", this.xidBuyer);
      pmap.put("existUpdate", this.existUpdate);
      pmap.put("secretKey", this.secretKey);
      pmap.put("appCode", this.appCode);
      pmap.put("authKey", this.authKey);
      return JsonUtil.toJson(pmap);
   }

   public Class<PromoTokenTokenuserAddResponse> getResponseClass() {
      return PromoTokenTokenuserAddResponse.class;
   }
}
