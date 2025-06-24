package com.jd.open.api.sdk.request.youE;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.youE.UeOrderBookInfoBizProgressResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class UeOrderBookInfoBizProgressRequest extends AbstractRequest implements JdRequest<UeOrderBookInfoBizProgressResponse> {
   private String bookBy;
   private String appId;
   private String orderNo;
   private String remark;
   private String bookDate;
   private String type;
   private String bookOperateDate;

   public void setBookBy(String bookBy) {
      this.bookBy = bookBy;
   }

   public String getBookBy() {
      return this.bookBy;
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

   public void setRemark(String remark) {
      this.remark = remark;
   }

   public String getRemark() {
      return this.remark;
   }

   public void setBookDate(String bookDate) {
      this.bookDate = bookDate;
   }

   public String getBookDate() {
      return this.bookDate;
   }

   public void setType(String type) {
      this.type = type;
   }

   public String getType() {
      return this.type;
   }

   public void setBookOperateDate(String bookOperateDate) {
      this.bookOperateDate = bookOperateDate;
   }

   public String getBookOperateDate() {
      return this.bookOperateDate;
   }

   public String getApiMethod() {
      return "jingdong.ue.order.bookInfoBizProgress";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("bookBy", this.bookBy);
      pmap.put("appId", this.appId);
      pmap.put("orderNo", this.orderNo);
      pmap.put("remark", this.remark);
      pmap.put("bookDate", this.bookDate);
      pmap.put("type", this.type);
      pmap.put("bookOperateDate", this.bookOperateDate);
      return JsonUtil.toJson(pmap);
   }

   public Class<UeOrderBookInfoBizProgressResponse> getResponseClass() {
      return UeOrderBookInfoBizProgressResponse.class;
   }
}
