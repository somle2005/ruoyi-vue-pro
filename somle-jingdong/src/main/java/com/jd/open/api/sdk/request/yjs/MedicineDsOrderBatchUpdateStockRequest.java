package com.jd.open.api.sdk.request.yjs;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.yjs.MedicineDsOrderBatchUpdateStockResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class MedicineDsOrderBatchUpdateStockRequest extends AbstractRequest implements JdRequest<MedicineDsOrderBatchUpdateStockResponse> {
   private Integer siteId;
   private String num;
   private String skuId;

   public void setSiteId(Integer siteId) {
      this.siteId = siteId;
   }

   public Integer getSiteId() {
      return this.siteId;
   }

   public void setNum(String num) {
      this.num = num;
   }

   public String getNum() {
      return this.num;
   }

   public void setSkuId(String skuId) {
      this.skuId = skuId;
   }

   public String getSkuId() {
      return this.skuId;
   }

   public String getApiMethod() {
      return "jingdong.medicine.ds.order.batchUpdateStock";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("siteId", this.siteId);
      pmap.put("num", this.num);
      pmap.put("skuId", this.skuId);
      return JsonUtil.toJson(pmap);
   }

   public Class<MedicineDsOrderBatchUpdateStockResponse> getResponseClass() {
      return MedicineDsOrderBatchUpdateStockResponse.class;
   }
}
