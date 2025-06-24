package com.jd.open.api.sdk.request.O2O;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.O2O.LocOrderSearchResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

public class LocOrderSearchRequest extends AbstractRequest implements JdRequest<LocOrderSearchResponse> {
   private Integer pageSize;
   private Integer page;
   private Date orderCreateTimeBegin;
   private Date orderCreateTimeEnd;
   private Integer orderState;

   public void setPageSize(Integer pageSize) {
      this.pageSize = pageSize;
   }

   public Integer getPageSize() {
      return this.pageSize;
   }

   public void setPage(Integer page) {
      this.page = page;
   }

   public Integer getPage() {
      return this.page;
   }

   public void setOrderCreateTimeBegin(Date orderCreateTimeBegin) {
      this.orderCreateTimeBegin = orderCreateTimeBegin;
   }

   public Date getOrderCreateTimeBegin() {
      return this.orderCreateTimeBegin;
   }

   public void setOrderCreateTimeEnd(Date orderCreateTimeEnd) {
      this.orderCreateTimeEnd = orderCreateTimeEnd;
   }

   public Date getOrderCreateTimeEnd() {
      return this.orderCreateTimeEnd;
   }

   public void setOrderState(Integer orderState) {
      this.orderState = orderState;
   }

   public Integer getOrderState() {
      return this.orderState;
   }

   public String getApiMethod() {
      return "jingdong.loc.order.search";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("pageSize", this.pageSize);
      pmap.put("page", this.page);

      try {
         if (this.orderCreateTimeBegin != null) {
            pmap.put("orderCreateTimeBegin", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.orderCreateTimeBegin));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      try {
         if (this.orderCreateTimeEnd != null) {
            pmap.put("orderCreateTimeEnd", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.orderCreateTimeEnd));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      pmap.put("orderState", this.orderState);
      return JsonUtil.toJson(pmap);
   }

   public Class<LocOrderSearchResponse> getResponseClass() {
      return LocOrderSearchResponse.class;
   }
}
