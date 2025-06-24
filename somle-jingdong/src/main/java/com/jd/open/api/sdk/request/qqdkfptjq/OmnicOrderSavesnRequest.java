package com.jd.open.api.sdk.request.qqdkfptjq;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.qqdkfptjq.OmnicOrderSavesnResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class OmnicOrderSavesnRequest extends AbstractRequest implements JdRequest<OmnicOrderSavesnResponse> {
   private String authKey;
   private Long orderId;
   private Long storeId;
   private String venderStoreId;
   private String skuId;
   private String outSkuId;
   private String sn;

   public void setAuthKey(String authKey) {
      this.authKey = authKey;
   }

   public String getAuthKey() {
      return this.authKey;
   }

   public void setOrderId(Long orderId) {
      this.orderId = orderId;
   }

   public Long getOrderId() {
      return this.orderId;
   }

   public void setStoreId(Long storeId) {
      this.storeId = storeId;
   }

   public Long getStoreId() {
      return this.storeId;
   }

   public void setVenderStoreId(String venderStoreId) {
      this.venderStoreId = venderStoreId;
   }

   public String getVenderStoreId() {
      return this.venderStoreId;
   }

   public void setSkuId(String skuId) {
      this.skuId = skuId;
   }

   public String getSkuId() {
      return this.skuId;
   }

   public void setOutSkuId(String outSkuId) {
      this.outSkuId = outSkuId;
   }

   public String getOutSkuId() {
      return this.outSkuId;
   }

   public void setSn(String sn) {
      this.sn = sn;
   }

   public String getSn() {
      return this.sn;
   }

   public String getApiMethod() {
      return "jingdong.omnic.order.savesn";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("authKey", this.authKey);
      pmap.put("orderId", this.orderId);
      pmap.put("storeId", this.storeId);
      pmap.put("venderStoreId", this.venderStoreId);
      pmap.put("skuId", this.skuId);
      pmap.put("outSkuId", this.outSkuId);
      pmap.put("sn", this.sn);
      return JsonUtil.toJson(pmap);
   }

   public Class<OmnicOrderSavesnResponse> getResponseClass() {
      return OmnicOrderSavesnResponse.class;
   }
}
