package com.jd.open.api.sdk.request.supplier;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.supplier.WarehouseOutboundOrderQueryConditionResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

public class WarehouseOutboundOrderQueryConditionRequest extends AbstractRequest implements JdRequest<WarehouseOutboundOrderQueryConditionResponse> {
   private Integer pageIndex;
   private Integer pageSize;
   private String stockOutNo;
   private Date createTimeBegin;
   private Date createTimeEnd;

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

   public void setStockOutNo(String stockOutNo) {
      this.stockOutNo = stockOutNo;
   }

   public String getStockOutNo() {
      return this.stockOutNo;
   }

   public void setCreateTimeBegin(Date createTimeBegin) {
      this.createTimeBegin = createTimeBegin;
   }

   public Date getCreateTimeBegin() {
      return this.createTimeBegin;
   }

   public void setCreateTimeEnd(Date createTimeEnd) {
      this.createTimeEnd = createTimeEnd;
   }

   public Date getCreateTimeEnd() {
      return this.createTimeEnd;
   }

   public String getApiMethod() {
      return "jingdong.warehouse.outbound.order.query.condition";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("pageIndex", this.pageIndex);
      pmap.put("pageSize", this.pageSize);
      pmap.put("stockOutNo", this.stockOutNo);

      try {
         if (this.createTimeBegin != null) {
            pmap.put("createTimeBegin", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.createTimeBegin));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      try {
         if (this.createTimeEnd != null) {
            pmap.put("createTimeEnd", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.createTimeEnd));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      return JsonUtil.toJson(pmap);
   }

   public Class<WarehouseOutboundOrderQueryConditionResponse> getResponseClass() {
      return WarehouseOutboundOrderQueryConditionResponse.class;
   }
}
