package com.jd.open.api.sdk.request.fapiao;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.fapiao.ScfInvoiceDetailGetInvoiceDetailListByDailyIdOrApplyIdResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class ScfInvoiceDetailGetInvoiceDetailListByDailyIdOrApplyIdRequest extends AbstractRequest implements JdRequest<ScfInvoiceDetailGetInvoiceDetailListByDailyIdOrApplyIdResponse> {
   private Long applyId;
   private Long dailyId;
   private Integer pageNum;
   private String settleEntityId;

   public void setApplyId(Long applyId) {
      this.applyId = applyId;
   }

   public Long getApplyId() {
      return this.applyId;
   }

   public void setDailyId(Long dailyId) {
      this.dailyId = dailyId;
   }

   public Long getDailyId() {
      return this.dailyId;
   }

   public void setPageNum(Integer pageNum) {
      this.pageNum = pageNum;
   }

   public Integer getPageNum() {
      return this.pageNum;
   }

   public void setSettleEntityId(String settleEntityId) {
      this.settleEntityId = settleEntityId;
   }

   public String getSettleEntityId() {
      return this.settleEntityId;
   }

   public String getApiMethod() {
      return "jingdong.scf.invoice.detail.getInvoiceDetailListByDailyIdOrApplyId";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("applyId", this.applyId);
      pmap.put("dailyId", this.dailyId);
      pmap.put("pageNum", this.pageNum);
      pmap.put("settleEntityId", this.settleEntityId);
      return JsonUtil.toJson(pmap);
   }

   public Class<ScfInvoiceDetailGetInvoiceDetailListByDailyIdOrApplyIdResponse> getResponseClass() {
      return ScfInvoiceDetailGetInvoiceDetailListByDailyIdOrApplyIdResponse.class;
   }
}
