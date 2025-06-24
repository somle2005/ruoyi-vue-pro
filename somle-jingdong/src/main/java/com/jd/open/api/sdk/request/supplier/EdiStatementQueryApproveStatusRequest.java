package com.jd.open.api.sdk.request.supplier;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.supplier.EdiStatementQueryApproveStatusResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class EdiStatementQueryApproveStatusRequest extends AbstractRequest implements JdRequest<EdiStatementQueryApproveStatusResponse> {
   private String billNo;

   public void setBillNo(String billNo) {
      this.billNo = billNo;
   }

   public String getBillNo() {
      return this.billNo;
   }

   public String getApiMethod() {
      return "jingdong.edi.statement.queryApproveStatus";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("billNo", this.billNo);
      return JsonUtil.toJson(pmap);
   }

   public Class<EdiStatementQueryApproveStatusResponse> getResponseClass() {
      return EdiStatementQueryApproveStatusResponse.class;
   }
}
