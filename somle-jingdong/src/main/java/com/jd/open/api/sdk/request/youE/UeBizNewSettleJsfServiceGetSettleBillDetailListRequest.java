package com.jd.open.api.sdk.request.youE;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.youE.UeBizNewSettleJsfServiceGetSettleBillDetailListResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

public class UeBizNewSettleJsfServiceGetSettleBillDetailListRequest extends AbstractRequest implements JdRequest<UeBizNewSettleJsfServiceGetSettleBillDetailListResponse> {
   private Date beginDate;
   private String itemCatId;
   private String venderCode;
   private Date endDate;
   private String appId;
   private Integer pageSize;
   private Integer serviceTypeId;
   private Integer page;
   private String settleRule;
   private Integer staging;

   public void setBeginDate(Date beginDate) {
      this.beginDate = beginDate;
   }

   public Date getBeginDate() {
      return this.beginDate;
   }

   public void setItemCatId(String itemCatId) {
      this.itemCatId = itemCatId;
   }

   public String getItemCatId() {
      return this.itemCatId;
   }

   public void setVenderCode(String venderCode) {
      this.venderCode = venderCode;
   }

   public String getVenderCode() {
      return this.venderCode;
   }

   public void setEndDate(Date endDate) {
      this.endDate = endDate;
   }

   public Date getEndDate() {
      return this.endDate;
   }

   public void setAppId(String appId) {
      this.appId = appId;
   }

   public String getAppId() {
      return this.appId;
   }

   public void setPageSize(Integer pageSize) {
      this.pageSize = pageSize;
   }

   public Integer getPageSize() {
      return this.pageSize;
   }

   public void setServiceTypeId(Integer serviceTypeId) {
      this.serviceTypeId = serviceTypeId;
   }

   public Integer getServiceTypeId() {
      return this.serviceTypeId;
   }

   public void setPage(Integer page) {
      this.page = page;
   }

   public Integer getPage() {
      return this.page;
   }

   public void setSettleRule(String settleRule) {
      this.settleRule = settleRule;
   }

   public String getSettleRule() {
      return this.settleRule;
   }

   public void setStaging(Integer staging) {
      this.staging = staging;
   }

   public Integer getStaging() {
      return this.staging;
   }

   public String getApiMethod() {
      return "jingdong.ue.bizNewSettleJsfService.getSettleBillDetailList";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();

      try {
         if (this.beginDate != null) {
            pmap.put("beginDate", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.beginDate));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      pmap.put("itemCatId", this.itemCatId);
      pmap.put("venderCode", this.venderCode);

      try {
         if (this.endDate != null) {
            pmap.put("endDate", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.endDate));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      pmap.put("appId", this.appId);
      pmap.put("pageSize", this.pageSize);
      pmap.put("serviceTypeId", this.serviceTypeId);
      pmap.put("page", this.page);
      pmap.put("settleRule", this.settleRule);
      pmap.put("staging", this.staging);
      return JsonUtil.toJson(pmap);
   }

   public Class<UeBizNewSettleJsfServiceGetSettleBillDetailListResponse> getResponseClass() {
      return UeBizNewSettleJsfServiceGetSettleBillDetailListResponse.class;
   }
}
