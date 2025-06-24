package com.jd.open.api.sdk.request.B2B;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.B2B.B2bMidOrderMiddleProviderQueryOrderListResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

public class B2bMidOrderMiddleProviderQueryOrderListRequest extends AbstractRequest implements JdRequest<B2bMidOrderMiddleProviderQueryOrderListResponse> {
   private Integer orderTier;
   private Integer pageIndex;
   private Integer pageSize;
   private Integer sortType;
   private Date submitOrderTimeFrom;
   private Date submitOrderTimeTo;
   private String jdOrderState;
   private Integer deliverState;

   public void setOrderTier(Integer orderTier) {
      this.orderTier = orderTier;
   }

   public Integer getOrderTier() {
      return this.orderTier;
   }

   public void setPageIndex(Integer pageIndex) {
      this.pageIndex = pageIndex;
   }

   public Integer getPageIndex() {
      return this.pageIndex;
   }

   public void setPageSize(Integer pageSize) {
      this.pageSize = pageSize;
   }

   public Integer getPageSize() {
      return this.pageSize;
   }

   public void setSortType(Integer sortType) {
      this.sortType = sortType;
   }

   public Integer getSortType() {
      return this.sortType;
   }

   public void setSubmitOrderTimeFrom(Date submitOrderTimeFrom) {
      this.submitOrderTimeFrom = submitOrderTimeFrom;
   }

   public Date getSubmitOrderTimeFrom() {
      return this.submitOrderTimeFrom;
   }

   public void setSubmitOrderTimeTo(Date submitOrderTimeTo) {
      this.submitOrderTimeTo = submitOrderTimeTo;
   }

   public Date getSubmitOrderTimeTo() {
      return this.submitOrderTimeTo;
   }

   public void setJdOrderState(String jdOrderState) {
      this.jdOrderState = jdOrderState;
   }

   public String getJdOrderState() {
      return this.jdOrderState;
   }

   public void setDeliverState(Integer deliverState) {
      this.deliverState = deliverState;
   }

   public Integer getDeliverState() {
      return this.deliverState;
   }

   public String getApiMethod() {
      return "jingdong.b2b.mid.OrderMiddleProvider.queryOrderList";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("orderTier", this.orderTier);
      pmap.put("pageIndex", this.pageIndex);
      pmap.put("pageSize", this.pageSize);
      pmap.put("sortType", this.sortType);

      try {
         if (this.submitOrderTimeFrom != null) {
            pmap.put("submitOrderTimeFrom", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.submitOrderTimeFrom));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      try {
         if (this.submitOrderTimeTo != null) {
            pmap.put("submitOrderTimeTo", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.submitOrderTimeTo));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      pmap.put("jdOrderState", this.jdOrderState);
      pmap.put("deliverState", this.deliverState);
      return JsonUtil.toJson(pmap);
   }

   public Class<B2bMidOrderMiddleProviderQueryOrderListResponse> getResponseClass() {
      return B2bMidOrderMiddleProviderQueryOrderListResponse.class;
   }
}
