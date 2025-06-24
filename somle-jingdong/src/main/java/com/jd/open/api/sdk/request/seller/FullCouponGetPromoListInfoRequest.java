package com.jd.open.api.sdk.request.seller;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.seller.FullCouponGetPromoListInfoResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

public class FullCouponGetPromoListInfoRequest extends AbstractRequest implements JdRequest<FullCouponGetPromoListInfoResponse> {
   private Long wareId;
   private Integer pageIndex;
   private Integer evtStatus;
   private String evtName;
   private Integer pageSize;
   private Date startTime;
   private Long promoId;
   private Date endTime;
   private Long skuId;
   private String appKey;

   public void setWareId(Long wareId) {
      this.wareId = wareId;
   }

   public Long getWareId() {
      return this.wareId;
   }

   public void setPageIndex(Integer pageIndex) {
      this.pageIndex = pageIndex;
   }

   public Integer getPageIndex() {
      return this.pageIndex;
   }

   public void setEvtStatus(Integer evtStatus) {
      this.evtStatus = evtStatus;
   }

   public Integer getEvtStatus() {
      return this.evtStatus;
   }

   public void setEvtName(String evtName) {
      this.evtName = evtName;
   }

   public String getEvtName() {
      return this.evtName;
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

   public void setPromoId(Long promoId) {
      this.promoId = promoId;
   }

   public Long getPromoId() {
      return this.promoId;
   }

   public void setEndTime(Date endTime) {
      this.endTime = endTime;
   }

   public Date getEndTime() {
      return this.endTime;
   }

   public void setSkuId(Long skuId) {
      this.skuId = skuId;
   }

   public Long getSkuId() {
      return this.skuId;
   }

   public void setAppKey(String appKey) {
      this.appKey = appKey;
   }

   public String getAppKey() {
      return this.appKey;
   }

   public String getApiMethod() {
      return "jingdong.fullCoupon.getPromoListInfo";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("wareId", this.wareId);
      pmap.put("pageIndex", this.pageIndex);
      pmap.put("evtStatus", this.evtStatus);
      pmap.put("evtName", this.evtName);
      pmap.put("pageSize", this.pageSize);

      try {
         if (this.startTime != null) {
            pmap.put("startTime", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.startTime));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      pmap.put("promoId", this.promoId);

      try {
         if (this.endTime != null) {
            pmap.put("endTime", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.endTime));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      pmap.put("skuId", this.skuId);
      pmap.put("appKey", this.appKey);
      return JsonUtil.toJson(pmap);
   }

   public Class<FullCouponGetPromoListInfoResponse> getResponseClass() {
      return FullCouponGetPromoListInfoResponse.class;
   }
}
