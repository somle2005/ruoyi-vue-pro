package com.jd.open.api.sdk.request.youE;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.youE.UeOrderNoFinishBizProgressResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class UeOrderNoFinishBizProgressRequest extends AbstractRequest implements JdRequest<UeOrderNoFinishBizProgressResponse> {
   private String operateDate;
   private String appId;
   private String orderNo;
   private String bookDate;
   private String reason;
   private String createBy;

   public void setOperateDate(String operateDate) {
      this.operateDate = operateDate;
   }

   public String getOperateDate() {
      return this.operateDate;
   }

   public void setAppId(String appId) {
      this.appId = appId;
   }

   public String getAppId() {
      return this.appId;
   }

   public void setOrderNo(String orderNo) {
      this.orderNo = orderNo;
   }

   public String getOrderNo() {
      return this.orderNo;
   }

   public void setBookDate(String bookDate) {
      this.bookDate = bookDate;
   }

   public String getBookDate() {
      return this.bookDate;
   }

   public void setReason(String reason) {
      this.reason = reason;
   }

   public String getReason() {
      return this.reason;
   }

   public void setCreateBy(String createBy) {
      this.createBy = createBy;
   }

   public String getCreateBy() {
      return this.createBy;
   }

   public String getApiMethod() {
      return "jingdong.ue.order.noFinishBizProgress";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("operateDate", this.operateDate);
      pmap.put("appId", this.appId);
      pmap.put("orderNo", this.orderNo);
      pmap.put("bookDate", this.bookDate);
      pmap.put("reason", this.reason);
      pmap.put("createBy", this.createBy);
      return JsonUtil.toJson(pmap);
   }

   public Class<UeOrderNoFinishBizProgressResponse> getResponseClass() {
      return UeOrderNoFinishBizProgressResponse.class;
   }
}
