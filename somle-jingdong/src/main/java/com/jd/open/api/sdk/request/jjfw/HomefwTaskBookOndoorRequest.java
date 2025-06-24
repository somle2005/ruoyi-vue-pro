package com.jd.open.api.sdk.request.jjfw;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.jjfw.HomefwTaskBookOndoorResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class HomefwTaskBookOndoorRequest extends AbstractRequest implements JdRequest<HomefwTaskBookOndoorResponse> {
   private String venderCode;
   private String orderNo;
   private String masterName;
   private String masterPhone;
   private String bookDate;
   private String operateTime;
   private String logisticsNoExt;
   private String city;
   private Integer siteType;
   private String siteCode;
   private String siteName;
   private String remark;

   public void setVenderCode(String venderCode) {
      this.venderCode = venderCode;
   }

   public String getVenderCode() {
      return this.venderCode;
   }

   public void setOrderNo(String orderNo) {
      this.orderNo = orderNo;
   }

   public String getOrderNo() {
      return this.orderNo;
   }

   public void setMasterName(String masterName) {
      this.masterName = masterName;
   }

   public String getMasterName() {
      return this.masterName;
   }

   public void setMasterPhone(String masterPhone) {
      this.masterPhone = masterPhone;
   }

   public String getMasterPhone() {
      return this.masterPhone;
   }

   public void setBookDate(String bookDate) {
      this.bookDate = bookDate;
   }

   public String getBookDate() {
      return this.bookDate;
   }

   public void setOperateTime(String operateTime) {
      this.operateTime = operateTime;
   }

   public String getOperateTime() {
      return this.operateTime;
   }

   public void setLogisticsNoExt(String logisticsNoExt) {
      this.logisticsNoExt = logisticsNoExt;
   }

   public String getLogisticsNoExt() {
      return this.logisticsNoExt;
   }

   public void setCity(String city) {
      this.city = city;
   }

   public String getCity() {
      return this.city;
   }

   public void setSiteType(Integer siteType) {
      this.siteType = siteType;
   }

   public Integer getSiteType() {
      return this.siteType;
   }

   public void setSiteCode(String siteCode) {
      this.siteCode = siteCode;
   }

   public String getSiteCode() {
      return this.siteCode;
   }

   public void setSiteName(String siteName) {
      this.siteName = siteName;
   }

   public String getSiteName() {
      return this.siteName;
   }

   public void setRemark(String remark) {
      this.remark = remark;
   }

   public String getRemark() {
      return this.remark;
   }

   public String getApiMethod() {
      return "jingdong.homefw.task.bookOndoor";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("venderCode", this.venderCode);
      pmap.put("orderNo", this.orderNo);
      pmap.put("masterName", this.masterName);
      pmap.put("masterPhone", this.masterPhone);
      pmap.put("bookDate", this.bookDate);
      pmap.put("operateTime", this.operateTime);
      pmap.put("logisticsNoExt", this.logisticsNoExt);
      pmap.put("city", this.city);
      pmap.put("siteType", this.siteType);
      pmap.put("siteCode", this.siteCode);
      pmap.put("siteName", this.siteName);
      pmap.put("remark", this.remark);
      return JsonUtil.toJson(pmap);
   }

   public Class<HomefwTaskBookOndoorResponse> getResponseClass() {
      return HomefwTaskBookOndoorResponse.class;
   }
}
