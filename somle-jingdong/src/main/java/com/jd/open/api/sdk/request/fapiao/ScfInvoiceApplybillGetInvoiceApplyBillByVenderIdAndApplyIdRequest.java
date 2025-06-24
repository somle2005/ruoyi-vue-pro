package com.jd.open.api.sdk.request.fapiao;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.fapiao.ScfInvoiceApplybillGetInvoiceApplyBillByVenderIdAndApplyIdResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class ScfInvoiceApplybillGetInvoiceApplyBillByVenderIdAndApplyIdRequest extends AbstractRequest implements JdRequest<ScfInvoiceApplybillGetInvoiceApplyBillByVenderIdAndApplyIdResponse> {
   private String settleEntityId;
   private Long applyId;

   public void setSettleEntityId(String settleEntityId) {
      this.settleEntityId = settleEntityId;
   }

   public String getSettleEntityId() {
      return this.settleEntityId;
   }

   public void setApplyId(Long applyId) {
      this.applyId = applyId;
   }

   public Long getApplyId() {
      return this.applyId;
   }

   public String getApiMethod() {
      return "jingdong.scf.invoice.applybill.getInvoiceApplyBillByVenderIdAndApplyId";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("settleEntityId", this.settleEntityId);
      pmap.put("applyId", this.applyId);
      return JsonUtil.toJson(pmap);
   }

   public Class<ScfInvoiceApplybillGetInvoiceApplyBillByVenderIdAndApplyIdResponse> getResponseClass() {
      return ScfInvoiceApplybillGetInvoiceApplyBillByVenderIdAndApplyIdResponse.class;
   }
}
