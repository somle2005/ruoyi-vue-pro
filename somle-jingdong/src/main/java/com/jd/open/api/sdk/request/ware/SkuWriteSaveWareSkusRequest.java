package com.jd.open.api.sdk.request.ware;

import com.jd.open.api.sdk.domain.Sku;
import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ware.SkuWriteSaveWareSkusResponse;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class SkuWriteSaveWareSkusRequest extends AbstractRequest implements JdRequest<SkuWriteSaveWareSkusResponse> {
   private Long wareId;
   private List<Sku> skus;

   public void setWareId(Long wareId) {
      this.wareId = wareId;
   }

   public Long getWareId() {
      return this.wareId;
   }

   public List<Sku> getSkus() {
      return this.skus;
   }

   public void setSkus(List<Sku> skus) {
      this.skus = skus;
   }

   public String getApiMethod() {
      return "jingdong.sku.write.saveWareSkus";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("wareId", this.wareId);
      pmap.put("skus", this.skus);
      return JsonUtil.toJson(pmap);
   }

   public Class<SkuWriteSaveWareSkusResponse> getResponseClass() {
      return SkuWriteSaveWareSkusResponse.class;
   }
}
