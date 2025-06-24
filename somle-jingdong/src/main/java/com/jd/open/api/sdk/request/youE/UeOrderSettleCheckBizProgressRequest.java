package com.jd.open.api.sdk.request.youE;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.youE.UeOrderSettleCheckBizProgressResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class UeOrderSettleCheckBizProgressRequest extends AbstractRequest implements JdRequest<UeOrderSettleCheckBizProgressResponse> {
   private String operateDate;
   private String appId;
   private String orderNo;
   private String createBy;
   private String settleCode;

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

   public void setCreateBy(String createBy) {
      this.createBy = createBy;
   }

   public String getCreateBy() {
      return this.createBy;
   }

   public void setSettleCode(String settleCode) {
      this.settleCode = settleCode;
   }

   public String getSettleCode() {
      return this.settleCode;
   }

   public String getApiMethod() {
      return "jingdong.ue.order.settleCheckBizProgress";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("operateDate", this.operateDate);
      pmap.put("appId", this.appId);
      pmap.put("orderNo", this.orderNo);
      pmap.put("createBy", this.createBy);
      pmap.put("settleCode", this.settleCode);
      return JsonUtil.toJson(pmap);
   }

   public Class<UeOrderSettleCheckBizProgressResponse> getResponseClass() {
      return UeOrderSettleCheckBizProgressResponse.class;
   }
}
