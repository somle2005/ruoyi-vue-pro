package com.jd.open.api.sdk.request.youE;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.youE.UeBizOrderJxfwJsfServiceManufacturerOrderServiceTimeUpdateResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

public class UeBizOrderJxfwJsfServiceManufacturerOrderServiceTimeUpdateRequest extends AbstractRequest implements JdRequest<UeBizOrderJxfwJsfServiceManufacturerOrderServiceTimeUpdateResponse> {
   private String orderNo;
   private Date bookStartTime;
   private Date bookEndTime;
   private String appId;
   private Date bookOperateDate;
   private String remark;
   private String bookBy;
   private String type;

   public void setOrderNo(String orderNo) {
      this.orderNo = orderNo;
   }

   public String getOrderNo() {
      return this.orderNo;
   }

   public void setBookStartTime(Date bookStartTime) {
      this.bookStartTime = bookStartTime;
   }

   public Date getBookStartTime() {
      return this.bookStartTime;
   }

   public void setBookEndTime(Date bookEndTime) {
      this.bookEndTime = bookEndTime;
   }

   public Date getBookEndTime() {
      return this.bookEndTime;
   }

   public void setAppId(String appId) {
      this.appId = appId;
   }

   public String getAppId() {
      return this.appId;
   }

   public void setBookOperateDate(Date bookOperateDate) {
      this.bookOperateDate = bookOperateDate;
   }

   public Date getBookOperateDate() {
      return this.bookOperateDate;
   }

   public void setRemark(String remark) {
      this.remark = remark;
   }

   public String getRemark() {
      return this.remark;
   }

   public void setBookBy(String bookBy) {
      this.bookBy = bookBy;
   }

   public String getBookBy() {
      return this.bookBy;
   }

   public void setType(String type) {
      this.type = type;
   }

   public String getType() {
      return this.type;
   }

   public String getApiMethod() {
      return "jingdong.ue.bizOrderJxfwJsfService.manufacturerOrderServiceTimeUpdate";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("orderNo", this.orderNo);

      try {
         if (this.bookStartTime != null) {
            pmap.put("bookStartTime", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.bookStartTime));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      try {
         if (this.bookEndTime != null) {
            pmap.put("bookEndTime", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.bookEndTime));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      pmap.put("appId", this.appId);

      try {
         if (this.bookOperateDate != null) {
            pmap.put("bookOperateDate", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.bookOperateDate));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      pmap.put("remark", this.remark);
      pmap.put("bookBy", this.bookBy);
      pmap.put("type", this.type);
      return JsonUtil.toJson(pmap);
   }

   public Class<UeBizOrderJxfwJsfServiceManufacturerOrderServiceTimeUpdateResponse> getResponseClass() {
      return UeBizOrderJxfwJsfServiceManufacturerOrderServiceTimeUpdateResponse.class;
   }
}
