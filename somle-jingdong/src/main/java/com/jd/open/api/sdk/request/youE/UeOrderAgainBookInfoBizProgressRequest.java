package com.jd.open.api.sdk.request.youE;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.youE.UeOrderAgainBookInfoBizProgressResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class UeOrderAgainBookInfoBizProgressRequest extends AbstractRequest implements JdRequest<UeOrderAgainBookInfoBizProgressResponse> {
   private String operateDate;
   private String orderNo;
   private String appId;
   private String bookDate;
   private String createBy;

   public void setOperateDate(String operateDate) {
      this.operateDate = operateDate;
   }

   public String getOperateDate() {
      return this.operateDate;
   }

   public void setOrderNo(String orderNo) {
      this.orderNo = orderNo;
   }

   public String getOrderNo() {
      return this.orderNo;
   }

   public void setAppId(String appId) {
      this.appId = appId;
   }

   public String getAppId() {
      return this.appId;
   }

   public void setBookDate(String bookDate) {
      this.bookDate = bookDate;
   }

   public String getBookDate() {
      return this.bookDate;
   }

   public void setCreateBy(String createBy) {
      this.createBy = createBy;
   }

   public String getCreateBy() {
      return this.createBy;
   }

   public String getApiMethod() {
      return "jingdong.ue.order.againBookInfoBizProgress";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("operateDate", this.operateDate);
      pmap.put("orderNo", this.orderNo);
      pmap.put("appId", this.appId);
      pmap.put("bookDate", this.bookDate);
      pmap.put("createBy", this.createBy);
      return JsonUtil.toJson(pmap);
   }

   public Class<UeOrderAgainBookInfoBizProgressResponse> getResponseClass() {
      return UeOrderAgainBookInfoBizProgressResponse.class;
   }
}
