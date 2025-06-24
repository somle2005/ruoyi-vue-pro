package com.jd.open.api.sdk.request.youE;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.youE.UeBizOrderJxfwJsfServiceManufacturerOrderTestingUpdateResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

public class UeBizOrderJxfwJsfServiceManufacturerOrderTestingUpdateRequest extends AbstractRequest implements JdRequest<UeBizOrderJxfwJsfServiceManufacturerOrderTestingUpdateResponse> {
   private String createBy;
   private String orderNo;
   private String expectPrice;
   private String appId;
   private String checkReportUrl;
   private String checkMan;
   private Date checkDate;
   private Date operateDate;
   private String checkResult;

   public void setCreateBy(String createBy) {
      this.createBy = createBy;
   }

   public String getCreateBy() {
      return this.createBy;
   }

   public void setOrderNo(String orderNo) {
      this.orderNo = orderNo;
   }

   public String getOrderNo() {
      return this.orderNo;
   }

   public void setExpectPrice(String expectPrice) {
      this.expectPrice = expectPrice;
   }

   public String getExpectPrice() {
      return this.expectPrice;
   }

   public void setAppId(String appId) {
      this.appId = appId;
   }

   public String getAppId() {
      return this.appId;
   }

   public void setCheckReportUrl(String checkReportUrl) {
      this.checkReportUrl = checkReportUrl;
   }

   public String getCheckReportUrl() {
      return this.checkReportUrl;
   }

   public void setCheckMan(String checkMan) {
      this.checkMan = checkMan;
   }

   public String getCheckMan() {
      return this.checkMan;
   }

   public void setCheckDate(Date checkDate) {
      this.checkDate = checkDate;
   }

   public Date getCheckDate() {
      return this.checkDate;
   }

   public void setOperateDate(Date operateDate) {
      this.operateDate = operateDate;
   }

   public Date getOperateDate() {
      return this.operateDate;
   }

   public void setCheckResult(String checkResult) {
      this.checkResult = checkResult;
   }

   public String getCheckResult() {
      return this.checkResult;
   }

   public String getApiMethod() {
      return "jingdong.ue.bizOrderJxfwJsfService.manufacturerOrderTestingUpdate";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("createBy", this.createBy);
      pmap.put("orderNo", this.orderNo);
      pmap.put("expectPrice", this.expectPrice);
      pmap.put("appId", this.appId);
      pmap.put("checkReportUrl", this.checkReportUrl);
      pmap.put("checkMan", this.checkMan);

      try {
         if (this.checkDate != null) {
            pmap.put("checkDate", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.checkDate));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      try {
         if (this.operateDate != null) {
            pmap.put("operateDate", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.operateDate));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      pmap.put("checkResult", this.checkResult);
      return JsonUtil.toJson(pmap);
   }

   public Class<UeBizOrderJxfwJsfServiceManufacturerOrderTestingUpdateResponse> getResponseClass() {
      return UeBizOrderJxfwJsfServiceManufacturerOrderTestingUpdateResponse.class;
   }
}
