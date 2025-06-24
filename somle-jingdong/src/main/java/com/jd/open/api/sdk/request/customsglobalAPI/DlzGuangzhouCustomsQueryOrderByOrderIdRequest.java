package com.jd.open.api.sdk.request.customsglobalAPI;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.customsglobalAPI.DlzGuangzhouCustomsQueryOrderByOrderIdResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class DlzGuangzhouCustomsQueryOrderByOrderIdRequest extends AbstractRequest implements JdRequest<DlzGuangzhouCustomsQueryOrderByOrderIdResponse> {
   private String platformId;
   private String orderId;

   public void setPlatformId(String platformId) {
      this.platformId = platformId;
   }

   public String getPlatformId() {
      return this.platformId;
   }

   public void setOrderId(String orderId) {
      this.orderId = orderId;
   }

   public String getOrderId() {
      return this.orderId;
   }

   public String getApiMethod() {
      return "jingdong.dlz.guangzhou.customs.queryOrderByOrderId";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("platformId", this.platformId);
      pmap.put("orderId", this.orderId);
      return JsonUtil.toJson(pmap);
   }

   public Class<DlzGuangzhouCustomsQueryOrderByOrderIdResponse> getResponseClass() {
      return DlzGuangzhouCustomsQueryOrderByOrderIdResponse.class;
   }
}
