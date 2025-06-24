package com.jd.open.api.sdk.request.youE;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.youE.UeBizOrderJxfwJsfServiceManufacturerOrderDispatchInformationResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

public class UeBizOrderJxfwJsfServiceManufacturerOrderDispatchInformationRequest extends AbstractRequest implements JdRequest<UeBizOrderJxfwJsfServiceManufacturerOrderDispatchInformationResponse> {
   private String orderNo;
   private String appId;
   private String deliverNo;
   private String deliverCompany;
   private String type;
   private Date operateDate;

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

   public void setDeliverNo(String deliverNo) {
      this.deliverNo = deliverNo;
   }

   public String getDeliverNo() {
      return this.deliverNo;
   }

   public void setDeliverCompany(String deliverCompany) {
      this.deliverCompany = deliverCompany;
   }

   public String getDeliverCompany() {
      return this.deliverCompany;
   }

   public void setType(String type) {
      this.type = type;
   }

   public String getType() {
      return this.type;
   }

   public void setOperateDate(Date operateDate) {
      this.operateDate = operateDate;
   }

   public Date getOperateDate() {
      return this.operateDate;
   }

   public String getApiMethod() {
      return "jingdong.ue.bizOrderJxfwJsfService.manufacturerOrderDispatchInformation";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("orderNo", this.orderNo);
      pmap.put("appId", this.appId);
      pmap.put("deliverNo", this.deliverNo);
      pmap.put("deliverCompany", this.deliverCompany);
      pmap.put("type", this.type);

      try {
         if (this.operateDate != null) {
            pmap.put("operateDate", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.operateDate));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      return JsonUtil.toJson(pmap);
   }

   public Class<UeBizOrderJxfwJsfServiceManufacturerOrderDispatchInformationResponse> getResponseClass() {
      return UeBizOrderJxfwJsfServiceManufacturerOrderDispatchInformationResponse.class;
   }
}
