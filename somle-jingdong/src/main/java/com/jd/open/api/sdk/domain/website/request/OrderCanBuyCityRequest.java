package com.jd.open.api.sdk.domain.website.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.website.response.OrderCanBuyCityResponse;
import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class OrderCanBuyCityRequest extends AbstractRequest implements JdRequest<OrderCanBuyCityResponse> {
   private String skusInfo;
   private String buyerName;
   private String provinceId;

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

   @JsonProperty("province_id")
   public String getProvinceId() {
      return this.provinceId;
   }

   @JsonProperty("province_id")
   public void setProvinceId(String provinceId) {
      this.provinceId = provinceId;
   }

   public String getApiMethod() {
      return "jingdong.order.support.city";
   }

   public String getAppJsonParams() throws IOException {
      Map map = new HashMap();
      map.put("skus_info", this.skusInfo);
      map.put("buyer_name", this.buyerName);
      map.put("province_id", this.provinceId);
      return JsonUtil.toJson(map);
   }

   public Class<OrderCanBuyCityResponse> getResponseClass() {
      return OrderCanBuyCityResponse.class;
   }
}
