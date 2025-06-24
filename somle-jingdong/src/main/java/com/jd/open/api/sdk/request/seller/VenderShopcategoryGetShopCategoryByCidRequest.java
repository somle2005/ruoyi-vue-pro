package com.jd.open.api.sdk.request.seller;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.seller.VenderShopcategoryGetShopCategoryByCidResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class VenderShopcategoryGetShopCategoryByCidRequest extends AbstractRequest implements JdRequest<VenderShopcategoryGetShopCategoryByCidResponse> {
   private Long cid;

   public void setCid(Long cid) {
      this.cid = cid;
   }

   public Long getCid() {
      return this.cid;
   }

   public String getApiMethod() {
      return "jingdong.vender.shopcategory.getShopCategoryByCid";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("cid", this.cid);
      return JsonUtil.toJson(pmap);
   }

   public Class<VenderShopcategoryGetShopCategoryByCidResponse> getResponseClass() {
      return VenderShopcategoryGetShopCategoryByCidResponse.class;
   }
}
