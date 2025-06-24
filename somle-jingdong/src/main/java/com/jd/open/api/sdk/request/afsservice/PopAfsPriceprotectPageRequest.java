package com.jd.open.api.sdk.request.afsservice;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.afsservice.PopAfsPriceprotectPageResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

public class PopAfsPriceprotectPageRequest extends AbstractRequest implements JdRequest<PopAfsPriceprotectPageResponse> {
   private Long orderId;
   private Integer pageSize;
   private Date applyEndDate;
   private Integer pricePrtctType;
   private Integer pageIndex;
   private Date applyBeginDate;
   private String customerPin;
   private Integer applyStatus;
   private Long skuId;
   private String openIdBuyer;
   private String xidBuyer;

   public void setOrderId(Long orderId) {
      this.orderId = orderId;
   }

   public Long getOrderId() {
      return this.orderId;
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

   public void setPricePrtctType(Integer pricePrtctType) {
      this.pricePrtctType = pricePrtctType;
   }

   public Integer getPricePrtctType() {
      return this.pricePrtctType;
   }

   public void setPageIndex(Integer pageIndex) {
      this.pageIndex = pageIndex;
   }

   public Integer getPageIndex() {
      return this.pageIndex;
   }

   public void setApplyBeginDate(Date applyBeginDate) {
      this.applyBeginDate = applyBeginDate;
   }

   public Date getApplyBeginDate() {
      return this.applyBeginDate;
   }

   public void setCustomerPin(String customerPin) {
      this.customerPin = customerPin;
   }

   public String getCustomerPin() {
      return this.customerPin;
   }

   public void setApplyStatus(Integer applyStatus) {
      this.applyStatus = applyStatus;
   }

   public Integer getApplyStatus() {
      return this.applyStatus;
   }

   public void setSkuId(Long skuId) {
      this.skuId = skuId;
   }

   public Long getSkuId() {
      return this.skuId;
   }

   public void setOpenIdBuyer(String openIdBuyer) {
      this.openIdBuyer = openIdBuyer;
   }

   public String getOpenIdBuyer() {
      return this.openIdBuyer;
   }

   public void setXidBuyer(String xidBuyer) {
      this.xidBuyer = xidBuyer;
   }

   public String getXidBuyer() {
      return this.xidBuyer;
   }

   public String getApiMethod() {
      return "jingdong.pop.afs.priceprotect.page";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("orderId", this.orderId);
      pmap.put("pageSize", this.pageSize);

      try {
         if (this.applyEndDate != null) {
            pmap.put("applyEndDate", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.applyEndDate));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      pmap.put("pricePrtctType", this.pricePrtctType);
      pmap.put("pageIndex", this.pageIndex);

      try {
         if (this.applyBeginDate != null) {
            pmap.put("applyBeginDate", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.applyBeginDate));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      pmap.put("customerPin", this.customerPin);
      pmap.put("applyStatus", this.applyStatus);
      pmap.put("skuId", this.skuId);
      pmap.put("open_id_buyer", this.openIdBuyer);
      pmap.put("xid_buyer", this.xidBuyer);
      return JsonUtil.toJson(pmap);
   }

   public Class<PopAfsPriceprotectPageResponse> getResponseClass() {
      return PopAfsPriceprotectPageResponse.class;
   }
}
