package com.jd.open.api.sdk.request.jjfw;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.jjfw.HomefwLogisticsTraceResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class HomefwLogisticsTraceRequest extends AbstractRequest implements JdRequest<HomefwLogisticsTraceResponse> {
   private String venderCode;
   private String orderNo;
   private String siteCode;
   private String city;
   private String operateTime;
   private String logisticsNoExt;
   private String siteName;
   private String scanType;
   private String desc;
   private Integer siteType;

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

   public void setSiteCode(String siteCode) {
      this.siteCode = siteCode;
   }

   public String getSiteCode() {
      return this.siteCode;
   }

   public void setCity(String city) {
      this.city = city;
   }

   public String getCity() {
      return this.city;
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

   public void setSiteName(String siteName) {
      this.siteName = siteName;
   }

   public String getSiteName() {
      return this.siteName;
   }

   public void setScanType(String scanType) {
      this.scanType = scanType;
   }

   public String getScanType() {
      return this.scanType;
   }

   public void setDesc(String desc) {
      this.desc = desc;
   }

   public String getDesc() {
      return this.desc;
   }

   public void setSiteType(Integer siteType) {
      this.siteType = siteType;
   }

   public Integer getSiteType() {
      return this.siteType;
   }

   public String getApiMethod() {
      return "jingdong.homefw.logistics.trace";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("venderCode", this.venderCode);
      pmap.put("orderNo", this.orderNo);
      pmap.put("siteCode", this.siteCode);
      pmap.put("city", this.city);
      pmap.put("operateTime", this.operateTime);
      pmap.put("logisticsNoExt", this.logisticsNoExt);
      pmap.put("siteName", this.siteName);
      pmap.put("scanType", this.scanType);
      pmap.put("desc", this.desc);
      pmap.put("siteType", this.siteType);
      return JsonUtil.toJson(pmap);
   }

   public Class<HomefwLogisticsTraceResponse> getResponseClass() {
      return HomefwLogisticsTraceResponse.class;
   }
}
