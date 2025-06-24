package com.jd.open.api.sdk.request.crm;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.crm.CrmMemberSearchNewResponse;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

public class CrmMemberSearchNewRequest extends AbstractRequest implements JdRequest<CrmMemberSearchNewResponse> {
   private String customerPin;
   private String grade;
   private Date minLastTradeTime;
   private Date maxLastTradeTime;
   private Integer minTradeCount;
   private Integer maxTradeCount;
   private BigDecimal avgPrice;
   private BigDecimal minTradeAmount;
   private int currentPage;
   private int pageSize;
   private String openIdBuyer;
   private String xidBuyer;

   public void setCustomerPin(String customerPin) {
      this.customerPin = customerPin;
   }

   public String getCustomerPin() {
      return this.customerPin;
   }

   public void setGrade(String grade) {
      this.grade = grade;
   }

   public String getGrade() {
      return this.grade;
   }

   public void setMinLastTradeTime(Date minLastTradeTime) {
      this.minLastTradeTime = minLastTradeTime;
   }

   public Date getMinLastTradeTime() {
      return this.minLastTradeTime;
   }

   public void setMaxLastTradeTime(Date maxLastTradeTime) {
      this.maxLastTradeTime = maxLastTradeTime;
   }

   public Date getMaxLastTradeTime() {
      return this.maxLastTradeTime;
   }

   public void setMinTradeCount(Integer minTradeCount) {
      this.minTradeCount = minTradeCount;
   }

   public Integer getMinTradeCount() {
      return this.minTradeCount;
   }

   public void setMaxTradeCount(Integer maxTradeCount) {
      this.maxTradeCount = maxTradeCount;
   }

   public Integer getMaxTradeCount() {
      return this.maxTradeCount;
   }

   public void setAvgPrice(BigDecimal avgPrice) {
      this.avgPrice = avgPrice;
   }

   public BigDecimal getAvgPrice() {
      return this.avgPrice;
   }

   public void setMinTradeAmount(BigDecimal minTradeAmount) {
      this.minTradeAmount = minTradeAmount;
   }

   public BigDecimal getMinTradeAmount() {
      return this.minTradeAmount;
   }

   public void setCurrentPage(int currentPage) {
      this.currentPage = currentPage;
   }

   public int getCurrentPage() {
      return this.currentPage;
   }

   public void setPageSize(int pageSize) {
      this.pageSize = pageSize;
   }

   public int getPageSize() {
      return this.pageSize;
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
      return "jingdong.crm.member.searchNew";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("customer_pin", this.customerPin);
      pmap.put("grade", this.grade);

      try {
         if (this.minLastTradeTime != null) {
            pmap.put("min_last_trade_time", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.minLastTradeTime));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      try {
         if (this.maxLastTradeTime != null) {
            pmap.put("max_last_trade_time", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.maxLastTradeTime));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      pmap.put("min_trade_count", this.minTradeCount);
      pmap.put("max_trade_count", this.maxTradeCount);
      pmap.put("avg_price", this.avgPrice);
      pmap.put("min_trade_amount", this.minTradeAmount);
      pmap.put("current_page", this.currentPage);
      pmap.put("page_size", this.pageSize);
      pmap.put("open_id_buyer", this.openIdBuyer);
      pmap.put("xid_buyer", this.xidBuyer);
      return JsonUtil.toJson(pmap);
   }

   public Class<CrmMemberSearchNewResponse> getResponseClass() {
      return CrmMemberSearchNewResponse.class;
   }
}
