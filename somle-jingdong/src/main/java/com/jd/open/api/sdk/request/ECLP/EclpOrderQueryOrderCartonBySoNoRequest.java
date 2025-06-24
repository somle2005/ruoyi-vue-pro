package com.jd.open.api.sdk.request.ECLP;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ECLP.EclpOrderQueryOrderCartonBySoNoResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class EclpOrderQueryOrderCartonBySoNoRequest extends AbstractRequest implements JdRequest<EclpOrderQueryOrderCartonBySoNoResponse> {
   private String soNo;

   public void setSoNo(String soNo) {
      this.soNo = soNo;
   }

   public String getSoNo() {
      return this.soNo;
   }

   public String getApiMethod() {
      return "jingdong.eclp.order.queryOrderCartonBySoNo";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("soNo", this.soNo);
      return JsonUtil.toJson(pmap);
   }

   public Class<EclpOrderQueryOrderCartonBySoNoResponse> getResponseClass() {
      return EclpOrderQueryOrderCartonBySoNoResponse.class;
   }
}
