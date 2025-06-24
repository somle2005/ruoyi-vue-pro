package com.jd.open.api.sdk.request.fangchan;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.fangchan.ErsFangAddHousesResourceRateResponse;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

public class ErsFangAddHousesResourceRateRequest extends AbstractRequest implements JdRequest<ErsFangAddHousesResourceRateResponse> {
   private Long channelId;
   private BigDecimal totalPrice;
   private Integer cityCode;
   private Long pSourceId;
   private Long sourceId;
   private Date rateDate;

   public void setChannelId(Long channelId) {
      this.channelId = channelId;
   }

   public Long getChannelId() {
      return this.channelId;
   }

   public void setTotalPrice(BigDecimal totalPrice) {
      this.totalPrice = totalPrice;
   }

   public BigDecimal getTotalPrice() {
      return this.totalPrice;
   }

   public void setCityCode(Integer cityCode) {
      this.cityCode = cityCode;
   }

   public Integer getCityCode() {
      return this.cityCode;
   }

   public void setPSourceId(Long pSourceId) {
      this.pSourceId = pSourceId;
   }

   public Long getPSourceId() {
      return this.pSourceId;
   }

   public void setSourceId(Long sourceId) {
      this.sourceId = sourceId;
   }

   public Long getSourceId() {
      return this.sourceId;
   }

   public void setRateDate(Date rateDate) {
      this.rateDate = rateDate;
   }

   public Date getRateDate() {
      return this.rateDate;
   }

   public String getApiMethod() {
      return "jingdong.ers.fang.addHousesResourceRate";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("channelId", this.channelId);
      pmap.put("totalPrice", this.totalPrice);
      pmap.put("cityCode", this.cityCode);
      pmap.put("pSourceId", this.pSourceId);
      pmap.put("sourceId", this.sourceId);

      try {
         if (this.rateDate != null) {
            pmap.put("rateDate", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.rateDate));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      return JsonUtil.toJson(pmap);
   }

   public Class<ErsFangAddHousesResourceRateResponse> getResponseClass() {
      return ErsFangAddHousesResourceRateResponse.class;
   }
}
