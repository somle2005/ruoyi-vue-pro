package com.jd.open.api.sdk.request.yjs;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.yjs.MedicineDsOrderStoreSkuUpOrDownResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class MedicineDsOrderStoreSkuUpOrDownRequest extends AbstractRequest implements JdRequest<MedicineDsOrderStoreSkuUpOrDownResponse> {
   private String exStoreId;
   private String skuId;
   private Integer storeSkuStatus;
   private String storeId;
   private String outerId;

   public void setExStoreId(String exStoreId) {
      this.exStoreId = exStoreId;
   }

   public String getExStoreId() {
      return this.exStoreId;
   }

   public void setSkuId(String skuId) {
      this.skuId = skuId;
   }

   public String getSkuId() {
      return this.skuId;
   }

   public void setStoreSkuStatus(Integer storeSkuStatus) {
      this.storeSkuStatus = storeSkuStatus;
   }

   public Integer getStoreSkuStatus() {
      return this.storeSkuStatus;
   }

   public void setStoreId(String storeId) {
      this.storeId = storeId;
   }

   public String getStoreId() {
      return this.storeId;
   }

   public void setOuterId(String outerId) {
      this.outerId = outerId;
   }

   public String getOuterId() {
      return this.outerId;
   }

   public String getApiMethod() {
      return "jingdong.medicine.ds.order.storeSkuUpOrDown";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("exStoreId", this.exStoreId);
      pmap.put("skuId", this.skuId);
      pmap.put("storeSkuStatus", this.storeSkuStatus);
      pmap.put("storeId", this.storeId);
      pmap.put("outerId", this.outerId);
      return JsonUtil.toJson(pmap);
   }

   public Class<MedicineDsOrderStoreSkuUpOrDownResponse> getResponseClass() {
      return MedicineDsOrderStoreSkuUpOrDownResponse.class;
   }
}
