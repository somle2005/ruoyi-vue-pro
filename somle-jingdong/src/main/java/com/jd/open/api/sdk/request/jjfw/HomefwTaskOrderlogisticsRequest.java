package com.jd.open.api.sdk.request.jjfw;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.jjfw.HomefwTaskOrderlogisticsResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class HomefwTaskOrderlogisticsRequest extends AbstractRequest implements JdRequest<HomefwTaskOrderlogisticsResponse> {
   private String saleOrderNo;

   public void setSaleOrderNo(String saleOrderNo) {
      this.saleOrderNo = saleOrderNo;
   }

   public String getSaleOrderNo() {
      return this.saleOrderNo;
   }

   public String getApiMethod() {
      return "jingdong.homefw.task.orderlogistics";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("saleOrderNo", this.saleOrderNo);
      return JsonUtil.toJson(pmap);
   }

   public Class<HomefwTaskOrderlogisticsResponse> getResponseClass() {
      return HomefwTaskOrderlogisticsResponse.class;
   }
}
