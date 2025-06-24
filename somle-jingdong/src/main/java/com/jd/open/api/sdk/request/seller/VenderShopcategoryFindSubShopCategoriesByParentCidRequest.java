package com.jd.open.api.sdk.request.seller;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.seller.VenderShopcategoryFindSubShopCategoriesByParentCidResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class VenderShopcategoryFindSubShopCategoriesByParentCidRequest extends AbstractRequest implements JdRequest<VenderShopcategoryFindSubShopCategoriesByParentCidResponse> {
   private Long parentCid;

   public void setParentCid(Long parentCid) {
      this.parentCid = parentCid;
   }

   public Long getParentCid() {
      return this.parentCid;
   }

   public String getApiMethod() {
      return "jingdong.vender.shopcategory.findSubShopCategoriesByParentCid";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("parent_cid", this.parentCid);
      return JsonUtil.toJson(pmap);
   }

   public Class<VenderShopcategoryFindSubShopCategoriesByParentCidResponse> getResponseClass() {
      return VenderShopcategoryFindSubShopCategoriesByParentCidResponse.class;
   }
}
