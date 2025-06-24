package com.jd.open.api.sdk.request.yjs;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.yjs.MedicineDsOrderGetStorePriceResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class MedicineDsOrderGetStorePriceRequest extends AbstractRequest implements JdRequest<MedicineDsOrderGetStorePriceResponse> {
   private String outerId;
   private String exStoreId;
   private String storeId;
   private String skuId;

   public void setOuterId(String outerId) {
      this.outerId = outerId;
   }

   public String getOuterId() {
      return this.outerId;
   }

   public void setExStoreId(String exStoreId) {
      this.exStoreId = exStoreId;
   }

   public String getExStoreId() {
      return this.exStoreId;
   }

   public void setStoreId(String storeId) {
      this.storeId = storeId;
   }

   public String getStoreId() {
      return this.storeId;
   }

   public void setSkuId(String skuId) {
      this.skuId = skuId;
   }

   public String getSkuId() {
      return this.skuId;
   }

   public String getApiMethod() {
      return "jingdong.medicine.ds.order.getStorePrice";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("outerId", this.outerId);
      pmap.put("exStoreId", this.exStoreId);
      pmap.put("storeId", this.storeId);
      pmap.put("skuId", this.skuId);
      return JsonUtil.toJson(pmap);
   }

   public Class<MedicineDsOrderGetStorePriceResponse> getResponseClass() {
      return MedicineDsOrderGetStorePriceResponse.class;
   }
}
