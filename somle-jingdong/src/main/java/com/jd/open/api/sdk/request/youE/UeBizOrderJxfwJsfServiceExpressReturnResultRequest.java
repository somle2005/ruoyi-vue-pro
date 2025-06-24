package com.jd.open.api.sdk.request.youE;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.youE.UeBizOrderJxfwJsfServiceExpressReturnResultResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

public class UeBizOrderJxfwJsfServiceExpressReturnResultRequest extends AbstractRequest implements JdRequest<UeBizOrderJxfwJsfServiceExpressReturnResultResponse> {
   private String orderNo;
   private String appId;
   private String remark;
   private Date operateDate;
   private String deliveredResult;

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

   public void setRemark(String remark) {
      this.remark = remark;
   }

   public String getRemark() {
      return this.remark;
   }

   public void setOperateDate(Date operateDate) {
      this.operateDate = operateDate;
   }

   public Date getOperateDate() {
      return this.operateDate;
   }

   public void setDeliveredResult(String deliveredResult) {
      this.deliveredResult = deliveredResult;
   }

   public String getDeliveredResult() {
      return this.deliveredResult;
   }

   public String getApiMethod() {
      return "jingdong.ue.bizOrderJxfwJsfService.expressReturnResult";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("orderNo", this.orderNo);
      pmap.put("appId", this.appId);
      pmap.put("remark", this.remark);

      try {
         if (this.operateDate != null) {
            pmap.put("operateDate", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.operateDate));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      pmap.put("deliveredResult", this.deliveredResult);
      return JsonUtil.toJson(pmap);
   }

   public Class<UeBizOrderJxfwJsfServiceExpressReturnResultResponse> getResponseClass() {
      return UeBizOrderJxfwJsfServiceExpressReturnResultResponse.class;
   }
}
