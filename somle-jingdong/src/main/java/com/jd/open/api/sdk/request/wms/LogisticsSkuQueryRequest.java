package com.jd.open.api.sdk.request.wms;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.wms.LogisticsSkuQueryResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class LogisticsSkuQueryRequest extends AbstractRequest implements JdRequest<LogisticsSkuQueryResponse> {
   private String joslGoodNo;
   private String isvGoodNo;

   public void setJoslGoodNo(String joslGoodNo) {
      this.joslGoodNo = joslGoodNo;
   }

   public String getJoslGoodNo() {
      return this.joslGoodNo;
   }

   public void setIsvGoodNo(String isvGoodNo) {
      this.isvGoodNo = isvGoodNo;
   }

   public String getIsvGoodNo() {
      return this.isvGoodNo;
   }

   public String getApiMethod() {
      return "jingdong.logistics.sku.query";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("josl_good_no", this.joslGoodNo);
      pmap.put("isv_good_no", this.isvGoodNo);
      return JsonUtil.toJson(pmap);
   }

   public Class<LogisticsSkuQueryResponse> getResponseClass() {
      return LogisticsSkuQueryResponse.class;
   }
}
