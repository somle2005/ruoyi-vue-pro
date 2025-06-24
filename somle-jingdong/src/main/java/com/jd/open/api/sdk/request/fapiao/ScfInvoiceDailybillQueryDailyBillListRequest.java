package com.jd.open.api.sdk.request.fapiao;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.fapiao.ScfInvoiceDailybillQueryDailyBillListResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

public class ScfInvoiceDailybillQueryDailyBillListRequest extends AbstractRequest implements JdRequest<ScfInvoiceDailybillQueryDailyBillListResponse> {
   private Long applyId;
   private String rfBillType;
   private Date endDate;
   private Date beginDate;
   private Integer pageNum;
   private String settleEntityId;

   public void setApplyId(Long applyId) {
      this.applyId = applyId;
   }

   public Long getApplyId() {
      return this.applyId;
   }

   public void setRfBillType(String rfBillType) {
      this.rfBillType = rfBillType;
   }

   public String getRfBillType() {
      return this.rfBillType;
   }

   public void setEndDate(Date endDate) {
      this.endDate = endDate;
   }

   public Date getEndDate() {
      return this.endDate;
   }

   public void setBeginDate(Date beginDate) {
      this.beginDate = beginDate;
   }

   public Date getBeginDate() {
      return this.beginDate;
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
      return "jingdong.scf.invoice.dailybill.queryDailyBillList";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("applyId", this.applyId);
      pmap.put("rfBillType", this.rfBillType);

      try {
         if (this.endDate != null) {
            pmap.put("endDate", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.endDate));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      try {
         if (this.beginDate != null) {
            pmap.put("beginDate", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.beginDate));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      pmap.put("pageNum", this.pageNum);
      pmap.put("settleEntityId", this.settleEntityId);
      return JsonUtil.toJson(pmap);
   }

   public Class<ScfInvoiceDailybillQueryDailyBillListResponse> getResponseClass() {
      return ScfInvoiceDailybillQueryDailyBillListResponse.class;
   }
}
