package com.jd.open.api.sdk.request.supplier;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.supplier.WarehouseOutboundOrderQueryListResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

public class WarehouseOutboundOrderQueryListRequest extends AbstractRequest implements JdRequest<WarehouseOutboundOrderQueryListResponse> {
   private Integer pageIndex;
   private Integer pageSize;
   private String stockOutNo;
   private Date createTimeBegin;
   private Date createTimeEnd;
   private Date checkTimeBegin;
   private Date checkTimeEnd;
   private String remark1;
   private String remark2;
   private String remark3;
   private String remark4;
   private String remark5;

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

   public void setCheckTimeBegin(Date checkTimeBegin) {
      this.checkTimeBegin = checkTimeBegin;
   }

   public Date getCheckTimeBegin() {
      return this.checkTimeBegin;
   }

   public void setCheckTimeEnd(Date checkTimeEnd) {
      this.checkTimeEnd = checkTimeEnd;
   }

   public Date getCheckTimeEnd() {
      return this.checkTimeEnd;
   }

   public void setRemark1(String remark1) {
      this.remark1 = remark1;
   }

   public String getRemark1() {
      return this.remark1;
   }

   public void setRemark2(String remark2) {
      this.remark2 = remark2;
   }

   public String getRemark2() {
      return this.remark2;
   }

   public void setRemark3(String remark3) {
      this.remark3 = remark3;
   }

   public String getRemark3() {
      return this.remark3;
   }

   public void setRemark4(String remark4) {
      this.remark4 = remark4;
   }

   public String getRemark4() {
      return this.remark4;
   }

   public void setRemark5(String remark5) {
      this.remark5 = remark5;
   }

   public String getRemark5() {
      return this.remark5;
   }

   public String getApiMethod() {
      return "jingdong.warehouse.outbound.order.query.list";
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

      try {
         if (this.checkTimeBegin != null) {
            pmap.put("checkTimeBegin", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.checkTimeBegin));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      try {
         if (this.checkTimeEnd != null) {
            pmap.put("checkTimeEnd", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.checkTimeEnd));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      pmap.put("remark1", this.remark1);
      pmap.put("remark2", this.remark2);
      pmap.put("remark3", this.remark3);
      pmap.put("remark4", this.remark4);
      pmap.put("remark5", this.remark5);
      return JsonUtil.toJson(pmap);
   }

   public Class<WarehouseOutboundOrderQueryListResponse> getResponseClass() {
      return WarehouseOutboundOrderQueryListResponse.class;
   }
}
