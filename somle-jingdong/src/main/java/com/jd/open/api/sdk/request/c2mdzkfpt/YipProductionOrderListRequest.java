package com.jd.open.api.sdk.request.c2mdzkfpt;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.c2mdzkfpt.YipProductionOrderListResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

public class YipProductionOrderListRequest extends AbstractRequest implements JdRequest<YipProductionOrderListResponse> {
   private String localeStr;
   private String loginName;
   private Long coId;
   private Integer pageSize;
   private Date startTime;
   private Date endTime;
   private String source;
   private Integer page;
   private Integer status;
   private String vendorCode;
   private Date modifyStartTime;
   private Date modifyEndTime;

   public void setLocaleStr(String localeStr) {
      this.localeStr = localeStr;
   }

   public String getLocaleStr() {
      return this.localeStr;
   }

   public void setLoginName(String loginName) {
      this.loginName = loginName;
   }

   public String getLoginName() {
      return this.loginName;
   }

   public void setCoId(Long coId) {
      this.coId = coId;
   }

   public Long getCoId() {
      return this.coId;
   }

   public void setPageSize(Integer pageSize) {
      this.pageSize = pageSize;
   }

   public Integer getPageSize() {
      return this.pageSize;
   }

   public void setStartTime(Date startTime) {
      this.startTime = startTime;
   }

   public Date getStartTime() {
      return this.startTime;
   }

   public void setEndTime(Date endTime) {
      this.endTime = endTime;
   }

   public Date getEndTime() {
      return this.endTime;
   }

   public void setSource(String source) {
      this.source = source;
   }

   public String getSource() {
      return this.source;
   }

   public void setPage(Integer page) {
      this.page = page;
   }

   public Integer getPage() {
      return this.page;
   }

   public void setStatus(Integer status) {
      this.status = status;
   }

   public Integer getStatus() {
      return this.status;
   }

   public void setVendorCode(String vendorCode) {
      this.vendorCode = vendorCode;
   }

   public String getVendorCode() {
      return this.vendorCode;
   }

   public void setModifyStartTime(Date modifyStartTime) {
      this.modifyStartTime = modifyStartTime;
   }

   public Date getModifyStartTime() {
      return this.modifyStartTime;
   }

   public void setModifyEndTime(Date modifyEndTime) {
      this.modifyEndTime = modifyEndTime;
   }

   public Date getModifyEndTime() {
      return this.modifyEndTime;
   }

   public String getApiMethod() {
      return "jingdong.yip.production.orderList";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("localeStr", this.localeStr);
      pmap.put("loginName", this.loginName);
      pmap.put("coId", this.coId);
      pmap.put("pageSize", this.pageSize);

      try {
         if (this.startTime != null) {
            pmap.put("startTime", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.startTime));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      try {
         if (this.endTime != null) {
            pmap.put("endTime", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.endTime));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      pmap.put("source", this.source);
      pmap.put("page", this.page);
      pmap.put("status", this.status);
      pmap.put("vendorCode", this.vendorCode);

      try {
         if (this.modifyStartTime != null) {
            pmap.put("modifyStartTime", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.modifyStartTime));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      try {
         if (this.modifyEndTime != null) {
            pmap.put("modifyEndTime", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.modifyEndTime));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      return JsonUtil.toJson(pmap);
   }

   public Class<YipProductionOrderListResponse> getResponseClass() {
      return YipProductionOrderListResponse.class;
   }
}
