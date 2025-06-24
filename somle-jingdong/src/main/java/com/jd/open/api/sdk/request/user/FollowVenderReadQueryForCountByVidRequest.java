package com.jd.open.api.sdk.request.user;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.user.FollowVenderReadQueryForCountByVidResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class FollowVenderReadQueryForCountByVidRequest extends AbstractRequest implements JdRequest<FollowVenderReadQueryForCountByVidResponse> {
   private long shopId;

   public void setShopId(long shopId) {
      this.shopId = shopId;
   }

   public long getShopId() {
      return this.shopId;
   }

   public String getApiMethod() {
      return "jingdong.follow.vender.read.queryForCountByVid";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("shopId", this.shopId);
      return JsonUtil.toJson(pmap);
   }

   public Class<FollowVenderReadQueryForCountByVidResponse> getResponseClass() {
      return FollowVenderReadQueryForCountByVidResponse.class;
   }
}
