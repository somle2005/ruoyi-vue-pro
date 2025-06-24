package com.jd.open.api.sdk.request.wms;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.wms.LogisticsOrderSearchResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class LogisticsOrderSearchRequest extends AbstractRequest implements JdRequest<LogisticsOrderSearchResponse> {
   private String receiptNos;
   private String status;

   public void setReceiptNos(String receiptNos) {
      this.receiptNos = receiptNos;
   }

   public String getReceiptNos() {
      return this.receiptNos;
   }

   public void setStatus(String status) {
      this.status = status;
   }

   public String getStatus() {
      return this.status;
   }

   public String getApiMethod() {
      return "jingdong.logistics.order.search";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("receipt_nos", this.receiptNos);
      pmap.put("status", this.status);
      return JsonUtil.toJson(pmap);
   }

   public Class<LogisticsOrderSearchResponse> getResponseClass() {
      return LogisticsOrderSearchResponse.class;
   }
}
