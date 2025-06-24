package com.jd.open.api.sdk.request.supplier;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.supplier.WarehouseInboundOrderQueryListResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

public class WarehouseInboundOrderQueryListRequest extends AbstractRequest implements JdRequest<WarehouseInboundOrderQueryListResponse> {
   private Integer pageIndex;
   private Integer pageSize;
   private Date createTimeBegin;
   private Date createTimeEnd;
   private Date unpackingTimeBegin;
   private Date unpackingTimeEnd;
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

   public void setUnpackingTimeBegin(Date unpackingTimeBegin) {
      this.unpackingTimeBegin = unpackingTimeBegin;
   }

   public Date getUnpackingTimeBegin() {
      return this.unpackingTimeBegin;
   }

   public void setUnpackingTimeEnd(Date unpackingTimeEnd) {
      this.unpackingTimeEnd = unpackingTimeEnd;
   }

   public Date getUnpackingTimeEnd() {
      return this.unpackingTimeEnd;
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
      return "jingdong.warehouse.inbound.order.query.list";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("pageIndex", this.pageIndex);
      pmap.put("pageSize", this.pageSize);

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
         if (this.unpackingTimeBegin != null) {
            pmap.put("unpackingTimeBegin", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.unpackingTimeBegin));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      try {
         if (this.unpackingTimeEnd != null) {
            pmap.put("unpackingTimeEnd", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.unpackingTimeEnd));
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

   public Class<WarehouseInboundOrderQueryListResponse> getResponseClass() {
      return WarehouseInboundOrderQueryListResponse.class;
   }
}
