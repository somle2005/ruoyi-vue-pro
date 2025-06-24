package com.jd.open.api.sdk.request.youE;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.youE.UeOrderNewFeedBackOrderProgressResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class UeOrderNewFeedBackOrderProgressRequest extends AbstractRequest implements JdRequest<UeOrderNewFeedBackOrderProgressResponse> {
   private String orderNo;
   private String operater;
   private String venderCode;
   private String appId;
   private Integer operateType;
   private String dealRemark;
   private String settleCode;

   public void setOrderNo(String orderNo) {
      this.orderNo = orderNo;
   }

   public String getOrderNo() {
      return this.orderNo;
   }

   public void setOperater(String operater) {
      this.operater = operater;
   }

   public String getOperater() {
      return this.operater;
   }

   public void setVenderCode(String venderCode) {
      this.venderCode = venderCode;
   }

   public String getVenderCode() {
      return this.venderCode;
   }

   public void setAppId(String appId) {
      this.appId = appId;
   }

   public String getAppId() {
      return this.appId;
   }

   public void setOperateType(Integer operateType) {
      this.operateType = operateType;
   }

   public Integer getOperateType() {
      return this.operateType;
   }

   public void setDealRemark(String dealRemark) {
      this.dealRemark = dealRemark;
   }

   public String getDealRemark() {
      return this.dealRemark;
   }

   public void setSettleCode(String settleCode) {
      this.settleCode = settleCode;
   }

   public String getSettleCode() {
      return this.settleCode;
   }

   public String getApiMethod() {
      return "jingdong.ue.order.new.feedBackOrderProgress";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("orderNo", this.orderNo);
      pmap.put("operater", this.operater);
      pmap.put("venderCode", this.venderCode);
      pmap.put("appId", this.appId);
      pmap.put("operateType", this.operateType);
      pmap.put("dealRemark", this.dealRemark);
      pmap.put("settleCode", this.settleCode);
      return JsonUtil.toJson(pmap);
   }

   public Class<UeOrderNewFeedBackOrderProgressResponse> getResponseClass() {
      return UeOrderNewFeedBackOrderProgressResponse.class;
   }
}
