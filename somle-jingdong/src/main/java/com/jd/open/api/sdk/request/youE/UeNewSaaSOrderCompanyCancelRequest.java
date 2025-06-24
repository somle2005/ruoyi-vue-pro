package com.jd.open.api.sdk.request.youE;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.youE.UeNewSaaSOrderCompanyCancelResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class UeNewSaaSOrderCompanyCancelRequest extends AbstractRequest implements JdRequest<UeNewSaaSOrderCompanyCancelResponse> {
   private String createBy;
   private String orderNo;
   private int cancelType;
   private String appId;
   private String cancelReason;

   public void setCreateBy(String createBy) {
      this.createBy = createBy;
   }

   public String getCreateBy() {
      return this.createBy;
   }

   public void setOrderNo(String orderNo) {
      this.orderNo = orderNo;
   }

   public String getOrderNo() {
      return this.orderNo;
   }

   public void setCancelType(int cancelType) {
      this.cancelType = cancelType;
   }

   public int getCancelType() {
      return this.cancelType;
   }

   public void setAppId(String appId) {
      this.appId = appId;
   }

   public String getAppId() {
      return this.appId;
   }

   public void setCancelReason(String cancelReason) {
      this.cancelReason = cancelReason;
   }

   public String getCancelReason() {
      return this.cancelReason;
   }

   public String getApiMethod() {
      return "jingdong.ue.newSaaSOrder.companyCancel";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("createBy", this.createBy);
      pmap.put("orderNo", this.orderNo);
      pmap.put("cancelType", this.cancelType);
      pmap.put("appId", this.appId);
      pmap.put("cancelReason", this.cancelReason);
      return JsonUtil.toJson(pmap);
   }

   public Class<UeNewSaaSOrderCompanyCancelResponse> getResponseClass() {
      return UeNewSaaSOrderCompanyCancelResponse.class;
   }
}
