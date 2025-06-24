package com.jd.open.api.sdk.domain.website.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.website.response.OrderCanBuyAreaResponse;
import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class OrderCanBuyAreaRequest extends AbstractRequest implements JdRequest<OrderCanBuyAreaResponse> {
   private String skusInfo;
   private String buyerName;
   private String cityId;

   @JsonProperty("skus_info")
   public String getSkusInfo() {
      return this.skusInfo;
   }

   @JsonProperty("skus_info")
   public void setSkusInfo(String skusInfo) {
      this.skusInfo = skusInfo;
   }

   @JsonProperty("buyer_name")
   public String getBuyerName() {
      return this.buyerName;
   }

   @JsonProperty("buyer_name")
   public void setBuyerName(String buyerName) {
      this.buyerName = buyerName;
   }

   @JsonProperty("city_id")
   public String getCityId() {
      return this.cityId;
   }

   @JsonProperty("city_id")
   public void setCityId(String cityId) {
      this.cityId = cityId;
   }

   public String getApiMethod() {
      return "jingdong.order.support.area";
   }

   public String getAppJsonParams() throws IOException {
      Map map = new HashMap();
      map.put("skus_info", this.skusInfo);
      map.put("buyer_name", this.buyerName);
      map.put("city_id", this.cityId);
      return JsonUtil.toJson(map);
   }

   public Class<OrderCanBuyAreaResponse> getResponseClass() {
      return OrderCanBuyAreaResponse.class;
   }
}
