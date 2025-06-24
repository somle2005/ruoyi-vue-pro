package com.jd.open.api.sdk.request.jjfw;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.jjfw.HomefwLogisticsCargoArriveResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class HomefwLogisticsCargoArriveRequest extends AbstractRequest implements JdRequest<HomefwLogisticsCargoArriveResponse> {
   private String venderCode;
   private String orderNo;
   private String logisticsNoExt;
   private String operateTime;
   private String City;
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

   public void setLogisticsNoExt(String logisticsNoExt) {
      this.logisticsNoExt = logisticsNoExt;
   }

   public String getLogisticsNoExt() {
      return this.logisticsNoExt;
   }

   public void setOperateTime(String operateTime) {
      this.operateTime = operateTime;
   }

   public String getOperateTime() {
      return this.operateTime;
   }

   public void setCity(String City) {
      this.City = City;
   }

   public String getCity() {
      return this.City;
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
      return "jingdong.homefw.logistics.cargoArrive";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("venderCode", this.venderCode);
      pmap.put("orderNo", this.orderNo);
      pmap.put("logisticsNoExt", this.logisticsNoExt);
      pmap.put("operateTime", this.operateTime);
      pmap.put("City", this.City);
      pmap.put("siteType", this.siteType);
      pmap.put("siteCode", this.siteCode);
      pmap.put("siteName", this.siteName);
      pmap.put("remark", this.remark);
      return JsonUtil.toJson(pmap);
   }

   public Class<HomefwLogisticsCargoArriveResponse> getResponseClass() {
      return HomefwLogisticsCargoArriveResponse.class;
   }
}
