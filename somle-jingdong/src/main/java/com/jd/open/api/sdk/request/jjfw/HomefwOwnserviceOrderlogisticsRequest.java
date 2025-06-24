package com.jd.open.api.sdk.request.jjfw;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.jjfw.HomefwOwnserviceOrderlogisticsResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class HomefwOwnserviceOrderlogisticsRequest extends AbstractRequest implements JdRequest<HomefwOwnserviceOrderlogisticsResponse> {
   private String saleOrderNo;

   public void setSaleOrderNo(String saleOrderNo) {
      this.saleOrderNo = saleOrderNo;
   }

   public String getSaleOrderNo() {
      return this.saleOrderNo;
   }

   public String getApiMethod() {
      return "jingdong.homefw.ownservice.orderlogistics";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("saleOrderNo", this.saleOrderNo);
      return JsonUtil.toJson(pmap);
   }

   public Class<HomefwOwnserviceOrderlogisticsResponse> getResponseClass() {
      return HomefwOwnserviceOrderlogisticsResponse.class;
   }
}
