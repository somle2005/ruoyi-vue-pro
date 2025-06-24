package com.jd.open.api.sdk.request.shangjiashouhou;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.shangjiashouhou.AscServiceAndRefundViewResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

public class AscServiceAndRefundViewRequest extends AbstractRequest implements JdRequest<AscServiceAndRefundViewResponse> {
   private Long orderId;
   private Date applyTimeBegin;
   private Date applyTimeEnd;
   private Date approveTimeBegin;
   private Date approveTimeEnd;
   private int pageNumber;
   private int pageSize;
   private String extJsonStr;
   private String buId;

   public void setOrderId(Long orderId) {
      this.orderId = orderId;
   }

   public Long getOrderId() {
      return this.orderId;
   }

   public void setApplyTimeBegin(Date applyTimeBegin) {
      this.applyTimeBegin = applyTimeBegin;
   }

   public Date getApplyTimeBegin() {
      return this.applyTimeBegin;
   }

   public void setApplyTimeEnd(Date applyTimeEnd) {
      this.applyTimeEnd = applyTimeEnd;
   }

   public Date getApplyTimeEnd() {
      return this.applyTimeEnd;
   }

   public void setApproveTimeBegin(Date approveTimeBegin) {
      this.approveTimeBegin = approveTimeBegin;
   }

   public Date getApproveTimeBegin() {
      return this.approveTimeBegin;
   }

   public void setApproveTimeEnd(Date approveTimeEnd) {
      this.approveTimeEnd = approveTimeEnd;
   }

   public Date getApproveTimeEnd() {
      return this.approveTimeEnd;
   }

   public void setPageNumber(int pageNumber) {
      this.pageNumber = pageNumber;
   }

   public int getPageNumber() {
      return this.pageNumber;
   }

   public void setPageSize(int pageSize) {
      this.pageSize = pageSize;
   }

   public int getPageSize() {
      return this.pageSize;
   }

   public void setExtJsonStr(String extJsonStr) {
      this.extJsonStr = extJsonStr;
   }

   public String getExtJsonStr() {
      return this.extJsonStr;
   }

   public void setBuId(String buId) {
      this.buId = buId;
   }

   public String getBuId() {
      return this.buId;
   }

   public String getApiMethod() {
      return "jingdong.asc.serviceAndRefund.view";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("orderId", this.orderId);

      try {
         if (this.applyTimeBegin != null) {
            pmap.put("applyTimeBegin", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.applyTimeBegin));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      try {
         if (this.applyTimeEnd != null) {
            pmap.put("applyTimeEnd", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.applyTimeEnd));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      try {
         if (this.approveTimeBegin != null) {
            pmap.put("approveTimeBegin", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.approveTimeBegin));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      try {
         if (this.approveTimeEnd != null) {
            pmap.put("approveTimeEnd", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.approveTimeEnd));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      pmap.put("pageNumber", this.pageNumber);
      pmap.put("pageSize", this.pageSize);
      pmap.put("extJsonStr", this.extJsonStr);
      pmap.put("buId", this.buId);
      return JsonUtil.toJson(pmap);
   }

   public Class<AscServiceAndRefundViewResponse> getResponseClass() {
      return AscServiceAndRefundViewResponse.class;
   }
}
