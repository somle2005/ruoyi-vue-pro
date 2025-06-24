package com.jd.open.api.sdk.request.crm;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.crm.CrmMemberScanResponse;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

public class CrmMemberScanRequest extends AbstractRequest implements JdRequest<CrmMemberScanResponse> {
   private String pin;
   private String grade;
   private Date minLastTradeTime;
   private Date maxLastTradeTime;
   private Integer minTradeCount;
   private Integer maxTradeCount;
   private BigDecimal avgPrice;
   private BigDecimal minTradeAmount;
   private int pageSize;
   private String scrollId;
   private String openIdBuyer;
   private String xidBuyer;

   public void setPin(String pin) {
      this.pin = pin;
   }

   public String getPin() {
      return this.pin;
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

   public void setPageSize(int pageSize) {
      this.pageSize = pageSize;
   }

   public int getPageSize() {
      return this.pageSize;
   }

   public void setScrollId(String scrollId) {
      this.scrollId = scrollId;
   }

   public String getScrollId() {
      return this.scrollId;
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
      return "jingdong.crm.member.scan";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("pin", this.pin);
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
      pmap.put("page_size", this.pageSize);
      pmap.put("scroll_id", this.scrollId);
      pmap.put("open_id_buyer", this.openIdBuyer);
      pmap.put("xid_buyer", this.xidBuyer);
      return JsonUtil.toJson(pmap);
   }

   public Class<CrmMemberScanResponse> getResponseClass() {
      return CrmMemberScanResponse.class;
   }
}
