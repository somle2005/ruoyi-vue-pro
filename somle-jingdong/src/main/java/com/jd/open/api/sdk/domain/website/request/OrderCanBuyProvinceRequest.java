package com.jd.open.api.sdk.domain.website.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.website.response.OrderCanBuyProvinceResponse;
import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class OrderCanBuyProvinceRequest extends AbstractRequest implements JdRequest<OrderCanBuyProvinceResponse> {
   private String skusInfo;
   private String buyerName;

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

   public String getApiMethod() {
      return "jingdong.order.support.province";
   }

   public String getAppJsonParams() throws IOException {
      Map map = new HashMap();
      map.put("skus_info", this.skusInfo);
      map.put("buyer_name", this.buyerName);
      return JsonUtil.toJson(map);
   }

   public Class<OrderCanBuyProvinceResponse> getResponseClass() {
      return OrderCanBuyProvinceResponse.class;
   }
}
