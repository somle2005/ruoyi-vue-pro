package com.jd.open.api.sdk.request.seller;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.seller.VenderShopcategoryGetShopCategorysByVenderIdResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class VenderShopcategoryGetShopCategorysByVenderIdRequest extends AbstractRequest implements JdRequest<VenderShopcategoryGetShopCategorysByVenderIdResponse> {
   public String getApiMethod() {
      return "jingdong.vender.shopcategory.getShopCategorysByVenderId";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      return JsonUtil.toJson(pmap);
   }

   public Class<VenderShopcategoryGetShopCategorysByVenderIdResponse> getResponseClass() {
      return VenderShopcategoryGetShopCategorysByVenderIdResponse.class;
   }
}
