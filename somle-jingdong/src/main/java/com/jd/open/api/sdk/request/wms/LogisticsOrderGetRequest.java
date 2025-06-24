package com.jd.open.api.sdk.request.wms;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.wms.LogisticsOrderGetResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class LogisticsOrderGetRequest extends AbstractRequest implements JdRequest<LogisticsOrderGetResponse> {
   private String receiptNo;

   public void setReceiptNo(String receiptNo) {
      this.receiptNo = receiptNo;
   }

   public String getReceiptNo() {
      return this.receiptNo;
   }

   public String getApiMethod() {
      return "jingdong.logistics.order.get";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("receipt_no", this.receiptNo);
      return JsonUtil.toJson(pmap);
   }

   public Class<LogisticsOrderGetResponse> getResponseClass() {
      return LogisticsOrderGetResponse.class;
   }
}
