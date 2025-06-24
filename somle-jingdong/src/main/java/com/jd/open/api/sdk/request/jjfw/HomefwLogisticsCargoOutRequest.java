package com.jd.open.api.sdk.request.jjfw;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.jjfw.HomefwLogisticsCargoOutResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class HomefwLogisticsCargoOutRequest extends AbstractRequest implements JdRequest<HomefwLogisticsCargoOutResponse> {
   private String venderCode;
   private String orderNo;
   private String nextStation;
   private String ETA;
   private Integer logisticsModel;
   private String logisticsNoExt;
   private String operateTime;
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

   public void setNextStation(String nextStation) {
      this.nextStation = nextStation;
   }

   public String getNextStation() {
      return this.nextStation;
   }

   public void setETA(String ETA) {
      this.ETA = ETA;
   }

   public String getETA() {
      return this.ETA;
   }

   public void setLogisticsModel(Integer logisticsModel) {
      this.logisticsModel = logisticsModel;
   }

   public Integer getLogisticsModel() {
      return this.logisticsModel;
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
      return "jingdong.homefw.logistics.cargoOut";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("venderCode", this.venderCode);
      pmap.put("orderNo", this.orderNo);
      pmap.put("nextStation", this.nextStation);
      pmap.put("ETA", this.ETA);
      pmap.put("logisticsModel", this.logisticsModel);
      pmap.put("logisticsNoExt", this.logisticsNoExt);
      pmap.put("operateTime", this.operateTime);
      pmap.put("city", this.city);
      pmap.put("siteType", this.siteType);
      pmap.put("siteCode", this.siteCode);
      pmap.put("siteName", this.siteName);
      pmap.put("remark", this.remark);
      return JsonUtil.toJson(pmap);
   }

   public Class<HomefwLogisticsCargoOutResponse> getResponseClass() {
      return HomefwLogisticsCargoOutResponse.class;
   }
}
