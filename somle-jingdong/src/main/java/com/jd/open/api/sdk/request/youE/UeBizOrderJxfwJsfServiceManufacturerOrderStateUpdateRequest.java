package com.jd.open.api.sdk.request.youE;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.youE.UeBizOrderJxfwJsfServiceManufacturerOrderStateUpdateResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

public class UeBizOrderJxfwJsfServiceManufacturerOrderStateUpdateRequest extends AbstractRequest implements JdRequest<UeBizOrderJxfwJsfServiceManufacturerOrderStateUpdateResponse> {
   private String orderNo;
   private String appId;
   private String takeMan;
   private String deliverNo;
   private String remark;
   private String deliverCompany;
   private String type;
   private Date takeDate;

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

   public void setTakeMan(String takeMan) {
      this.takeMan = takeMan;
   }

   public String getTakeMan() {
      return this.takeMan;
   }

   public void setDeliverNo(String deliverNo) {
      this.deliverNo = deliverNo;
   }

   public String getDeliverNo() {
      return this.deliverNo;
   }

   public void setRemark(String remark) {
      this.remark = remark;
   }

   public String getRemark() {
      return this.remark;
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

   public void setTakeDate(Date takeDate) {
      this.takeDate = takeDate;
   }

   public Date getTakeDate() {
      return this.takeDate;
   }

   public String getApiMethod() {
      return "jingdong.ue.bizOrderJxfwJsfService.manufacturerOrderStateUpdate";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("orderNo", this.orderNo);
      pmap.put("appId", this.appId);
      pmap.put("takeMan", this.takeMan);
      pmap.put("deliverNo", this.deliverNo);
      pmap.put("remark", this.remark);
      pmap.put("deliverCompany", this.deliverCompany);
      pmap.put("type", this.type);

      try {
         if (this.takeDate != null) {
            pmap.put("takeDate", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.takeDate));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      return JsonUtil.toJson(pmap);
   }

   public Class<UeBizOrderJxfwJsfServiceManufacturerOrderStateUpdateResponse> getResponseClass() {
      return UeBizOrderJxfwJsfServiceManufacturerOrderStateUpdateResponse.class;
   }
}
