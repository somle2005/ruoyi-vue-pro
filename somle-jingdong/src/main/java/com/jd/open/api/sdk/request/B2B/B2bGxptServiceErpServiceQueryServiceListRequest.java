package com.jd.open.api.sdk.request.B2B;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.B2B.B2bGxptServiceErpServiceQueryServiceListResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

public class B2bGxptServiceErpServiceQueryServiceListRequest extends AbstractRequest implements JdRequest<B2bGxptServiceErpServiceQueryServiceListResponse> {
   private Date applyStartDate;
   private Long purchaseId;
   private Integer orderStatus;
   private Integer pageSize;
   private Date applyEndDate;
   private Integer type;
   private Date submitEndDate;
   private Integer pageIndex;
   private Integer serviceStatus;
   private Date submitStartDate;
   private Integer serviceId;
   private Integer saleServiceType;
   private Date startModified;
   private Date endModified;

   public void setApplyStartDate(Date applyStartDate) {
      this.applyStartDate = applyStartDate;
   }

   public Date getApplyStartDate() {
      return this.applyStartDate;
   }

   public void setPurchaseId(Long purchaseId) {
      this.purchaseId = purchaseId;
   }

   public Long getPurchaseId() {
      return this.purchaseId;
   }

   public void setOrderStatus(Integer orderStatus) {
      this.orderStatus = orderStatus;
   }

   public Integer getOrderStatus() {
      return this.orderStatus;
   }

   public void setPageSize(Integer pageSize) {
      this.pageSize = pageSize;
   }

   public Integer getPageSize() {
      return this.pageSize;
   }

   public void setApplyEndDate(Date applyEndDate) {
      this.applyEndDate = applyEndDate;
   }

   public Date getApplyEndDate() {
      return this.applyEndDate;
   }

   public void setType(Integer type) {
      this.type = type;
   }

   public Integer getType() {
      return this.type;
   }

   public void setSubmitEndDate(Date submitEndDate) {
      this.submitEndDate = submitEndDate;
   }

   public Date getSubmitEndDate() {
      return this.submitEndDate;
   }

   public void setPageIndex(Integer pageIndex) {
      this.pageIndex = pageIndex;
   }

   public Integer getPageIndex() {
      return this.pageIndex;
   }

   public void setServiceStatus(Integer serviceStatus) {
      this.serviceStatus = serviceStatus;
   }

   public Integer getServiceStatus() {
      return this.serviceStatus;
   }

   public void setSubmitStartDate(Date submitStartDate) {
      this.submitStartDate = submitStartDate;
   }

   public Date getSubmitStartDate() {
      return this.submitStartDate;
   }

   public void setServiceId(Integer serviceId) {
      this.serviceId = serviceId;
   }

   public Integer getServiceId() {
      return this.serviceId;
   }

   public void setSaleServiceType(Integer saleServiceType) {
      this.saleServiceType = saleServiceType;
   }

   public Integer getSaleServiceType() {
      return this.saleServiceType;
   }

   public void setStartModified(Date startModified) {
      this.startModified = startModified;
   }

   public Date getStartModified() {
      return this.startModified;
   }

   public void setEndModified(Date endModified) {
      this.endModified = endModified;
   }

   public Date getEndModified() {
      return this.endModified;
   }

   public String getApiMethod() {
      return "jingdong.b2b.gxpt.serviceErpService.queryServiceList";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();

      try {
         if (this.applyStartDate != null) {
            pmap.put("applyStartDate", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.applyStartDate));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      pmap.put("purchaseId", this.purchaseId);
      pmap.put("orderStatus", this.orderStatus);
      pmap.put("pageSize", this.pageSize);

      try {
         if (this.applyEndDate != null) {
            pmap.put("applyEndDate", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.applyEndDate));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      pmap.put("type", this.type);

      try {
         if (this.submitEndDate != null) {
            pmap.put("submitEndDate", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.submitEndDate));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      pmap.put("pageIndex", this.pageIndex);
      pmap.put("serviceStatus", this.serviceStatus);

      try {
         if (this.submitStartDate != null) {
            pmap.put("submitStartDate", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.submitStartDate));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      pmap.put("serviceId", this.serviceId);
      pmap.put("saleServiceType", this.saleServiceType);

      try {
         if (this.startModified != null) {
            pmap.put("startModified", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.startModified));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      try {
         if (this.endModified != null) {
            pmap.put("endModified", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.endModified));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      return JsonUtil.toJson(pmap);
   }

   public Class<B2bGxptServiceErpServiceQueryServiceListResponse> getResponseClass() {
      return B2bGxptServiceErpServiceQueryServiceListResponse.class;
   }
}
