package com.jd.open.api.sdk.request.ware;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ware.ShopcategoriesWriteSaveWareShopCategoriesResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class ShopcategoriesWriteSaveWareShopCategoriesRequest extends AbstractRequest implements JdRequest<ShopcategoriesWriteSaveWareShopCategoriesResponse> {
   private Long wareId;
   private String shopCategory;

   public void setWareId(Long wareId) {
      this.wareId = wareId;
   }

   public Long getWareId() {
      return this.wareId;
   }

   public void setShopCategory(String shopCategory) {
      this.shopCategory = shopCategory;
   }

   public String getShopCategory() {
      return this.shopCategory;
   }

   public String getApiMethod() {
      return "jingdong.shopcategories.write.saveWareShopCategories";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("wareId", this.wareId);
      pmap.put("shopCategory", this.shopCategory);
      return JsonUtil.toJson(pmap);
   }

   public Class<ShopcategoriesWriteSaveWareShopCategoriesResponse> getResponseClass() {
      return ShopcategoriesWriteSaveWareShopCategoriesResponse.class;
   }
}
