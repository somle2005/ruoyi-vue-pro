package com.jd.open.api.sdk.request.youE;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.youE.UeOrderFeedBackBizProgressResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class UeOrderFeedBackBizProgressRequest extends AbstractRequest implements JdRequest<UeOrderFeedBackBizProgressResponse> {
   private String operateDate;
   private String appId;
   private String orderNo;
   private String dealRemark;
   private String type;
   private String createBy;
   private Integer arriveException;

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

   public void setDealRemark(String dealRemark) {
      this.dealRemark = dealRemark;
   }

   public String getDealRemark() {
      return this.dealRemark;
   }

   public void setType(String type) {
      this.type = type;
   }

   public String getType() {
      return this.type;
   }

   public void setCreateBy(String createBy) {
      this.createBy = createBy;
   }

   public String getCreateBy() {
      return this.createBy;
   }

   public void setArriveException(Integer arriveException) {
      this.arriveException = arriveException;
   }

   public Integer getArriveException() {
      return this.arriveException;
   }

   public String getApiMethod() {
      return "jingdong.ue.order.feedBackBizProgress";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("operateDate", this.operateDate);
      pmap.put("appId", this.appId);
      pmap.put("orderNo", this.orderNo);
      pmap.put("dealRemark", this.dealRemark);
      pmap.put("type", this.type);
      pmap.put("createBy", this.createBy);
      pmap.put("arriveException", this.arriveException);
      return JsonUtil.toJson(pmap);
   }

   public Class<UeOrderFeedBackBizProgressResponse> getResponseClass() {
      return UeOrderFeedBackBizProgressResponse.class;
   }
}
