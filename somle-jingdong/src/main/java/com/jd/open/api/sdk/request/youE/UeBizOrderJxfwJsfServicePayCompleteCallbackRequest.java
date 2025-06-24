package com.jd.open.api.sdk.request.youE;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.youE.UeBizOrderJxfwJsfServicePayCompleteCallbackResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

public class UeBizOrderJxfwJsfServicePayCompleteCallbackRequest extends AbstractRequest implements JdRequest<UeBizOrderJxfwJsfServicePayCompleteCallbackResponse> {
   private String receivedAmt;
   private String orderNo;
   private String appId;
   private Date operateDate;

   public void setReceivedAmt(String receivedAmt) {
      this.receivedAmt = receivedAmt;
   }

   public String getReceivedAmt() {
      return this.receivedAmt;
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

   public void setOperateDate(Date operateDate) {
      this.operateDate = operateDate;
   }

   public Date getOperateDate() {
      return this.operateDate;
   }

   public String getApiMethod() {
      return "jingdong.ue.bizOrderJxfwJsfService.payCompleteCallback";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("receivedAmt", this.receivedAmt);
      pmap.put("orderNo", this.orderNo);
      pmap.put("appId", this.appId);

      try {
         if (this.operateDate != null) {
            pmap.put("operateDate", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.operateDate));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      return JsonUtil.toJson(pmap);
   }

   public Class<UeBizOrderJxfwJsfServicePayCompleteCallbackResponse> getResponseClass() {
      return UeBizOrderJxfwJsfServicePayCompleteCallbackResponse.class;
   }
}
