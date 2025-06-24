package com.jd.open.api.sdk.request.jialilue;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.jialilue.UpdateCheckStatusBatchResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class UpdateCheckStatusBatchRequest extends AbstractRequest implements JdRequest<UpdateCheckStatusBatchResponse> {
   private String authkey;
   private String pin;
   private Integer expStatus;
   private String venderSkuId;
   private String upc;
   private Long storeId;
   private String openIdBuyer;
   private String xidBuyer;

   public void setAuthkey(String authkey) {
      this.authkey = authkey;
   }

   public String getAuthkey() {
      return this.authkey;
   }

   public void setPin(String pin) {
      this.pin = pin;
   }

   public String getPin() {
      return this.pin;
   }

   public void setExpStatus(Integer expStatus) {
      this.expStatus = expStatus;
   }

   public Integer getExpStatus() {
      return this.expStatus;
   }

   public void setVenderSkuId(String venderSkuId) {
      this.venderSkuId = venderSkuId;
   }

   public String getVenderSkuId() {
      return this.venderSkuId;
   }

   public void setUpc(String upc) {
      this.upc = upc;
   }

   public String getUpc() {
      return this.upc;
   }

   public void setStoreId(Long storeId) {
      this.storeId = storeId;
   }

   public Long getStoreId() {
      return this.storeId;
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
      return "jingdong.updateCheckStatusBatch";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("authkey", this.authkey);
      pmap.put("pin", this.pin);
      pmap.put("expStatus", this.expStatus);
      pmap.put("venderSkuId", this.venderSkuId);
      pmap.put("upc", this.upc);
      pmap.put("storeId", this.storeId);
      pmap.put("open_id_buyer", this.openIdBuyer);
      pmap.put("xid_buyer", this.xidBuyer);
      return JsonUtil.toJson(pmap);
   }

   public Class<UpdateCheckStatusBatchResponse> getResponseClass() {
      return UpdateCheckStatusBatchResponse.class;
   }
}
