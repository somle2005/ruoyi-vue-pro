package com.jd.open.api.sdk.request.gysyuyue;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.gysyuyue.SvcBookingListResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

public class SvcBookingListRequest extends AbstractRequest implements JdRequest<SvcBookingListResponse> {
   private Integer appId;
   private Integer verificationStatus;
   private String storeName;
   private String lcnNo;
   private String mobile;
   private Date submitTimeStart;
   private Date submitTimeEnd;
   private Integer pageSize;
   private Integer pageIndex;

   public void setAppId(Integer appId) {
      this.appId = appId;
   }

   public Integer getAppId() {
      return this.appId;
   }

   public void setVerificationStatus(Integer verificationStatus) {
      this.verificationStatus = verificationStatus;
   }

   public Integer getVerificationStatus() {
      return this.verificationStatus;
   }

   public void setStoreName(String storeName) {
      this.storeName = storeName;
   }

   public String getStoreName() {
      return this.storeName;
   }

   public void setLcnNo(String lcnNo) {
      this.lcnNo = lcnNo;
   }

   public String getLcnNo() {
      return this.lcnNo;
   }

   public void setMobile(String mobile) {
      this.mobile = mobile;
   }

   public String getMobile() {
      return this.mobile;
   }

   public void setSubmitTimeStart(Date submitTimeStart) {
      this.submitTimeStart = submitTimeStart;
   }

   public Date getSubmitTimeStart() {
      return this.submitTimeStart;
   }

   public void setSubmitTimeEnd(Date submitTimeEnd) {
      this.submitTimeEnd = submitTimeEnd;
   }

   public Date getSubmitTimeEnd() {
      return this.submitTimeEnd;
   }

   public void setPageSize(Integer pageSize) {
      this.pageSize = pageSize;
   }

   public Integer getPageSize() {
      return this.pageSize;
   }

   public void setPageIndex(Integer pageIndex) {
      this.pageIndex = pageIndex;
   }

   public Integer getPageIndex() {
      return this.pageIndex;
   }

   public String getApiMethod() {
      return "jingdong.svc.booking.list";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("appId", this.appId);
      pmap.put("verificationStatus", this.verificationStatus);
      pmap.put("storeName", this.storeName);
      pmap.put("lcnNo", this.lcnNo);
      pmap.put("mobile", this.mobile);

      try {
         if (this.submitTimeStart != null) {
            pmap.put("submitTimeStart", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.submitTimeStart));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      try {
         if (this.submitTimeEnd != null) {
            pmap.put("submitTimeEnd", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.submitTimeEnd));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      pmap.put("pageSize", this.pageSize);
      pmap.put("pageIndex", this.pageIndex);
      return JsonUtil.toJson(pmap);
   }

   public Class<SvcBookingListResponse> getResponseClass() {
      return SvcBookingListResponse.class;
   }
}
