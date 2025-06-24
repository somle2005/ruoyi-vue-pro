package com.jd.open.api.sdk.request.ware;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ware.ShopcategoriesReadFindShopCategoriesByWareIdResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class ShopcategoriesReadFindShopCategoriesByWareIdRequest extends AbstractRequest implements JdRequest<ShopcategoriesReadFindShopCategoriesByWareIdResponse> {
   private Long wareId;

   public void setWareId(Long wareId) {
      this.wareId = wareId;
   }

   public Long getWareId() {
      return this.wareId;
   }

   public String getApiMethod() {
      return "jingdong.shopcategories.read.findShopCategoriesByWareId";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("wareId", this.wareId);
      return JsonUtil.toJson(pmap);
   }

   public Class<ShopcategoriesReadFindShopCategoriesByWareIdResponse> getResponseClass() {
      return ShopcategoriesReadFindShopCategoriesByWareIdResponse.class;
   }
}
