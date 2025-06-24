package com.jd.open.api.sdk.request.ware;

import com.jd.open.api.sdk.domain.Sku;
import com.jd.open.api.sdk.domain.Ware;
import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ware.WareWriteAddResponse;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class WareWriteAddRequest extends AbstractRequest implements JdRequest<WareWriteAddResponse> {
   private Ware ware;
   private List<Sku> skus;

   public Ware getWare() {
      return this.ware;
   }

   public void setWare(Ware ware) {
      this.ware = ware;
   }

   public List<Sku> getSkus() {
      return this.skus;
   }

   public void setSkus(List<Sku> skus) {
      this.skus = skus;
   }

   public String getApiMethod() {
      return "jingdong.ware.write.add";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("ware", this.ware);
      pmap.put("skus", this.skus);
      return JsonUtil.toJson(pmap);
   }

   public Class<WareWriteAddResponse> getResponseClass() {
      return WareWriteAddResponse.class;
   }
}
