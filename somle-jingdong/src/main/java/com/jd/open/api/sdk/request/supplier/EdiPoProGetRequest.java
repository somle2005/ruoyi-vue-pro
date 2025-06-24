package com.jd.open.api.sdk.request.supplier;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.supplier.EdiPoProGetResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

public class EdiPoProGetRequest extends AbstractRequest implements JdRequest<EdiPoProGetResponse> {
   private Integer orderStatus;
   private Date createTimeStart;
   private Date createTimeEnd;
   private Integer pageNum;
   private Integer pageSize;

   public void setOrderStatus(Integer orderStatus) {
      this.orderStatus = orderStatus;
   }

   public Integer getOrderStatus() {
      return this.orderStatus;
   }

   public void setCreateTimeStart(Date createTimeStart) {
      this.createTimeStart = createTimeStart;
   }

   public Date getCreateTimeStart() {
      return this.createTimeStart;
   }

   public void setCreateTimeEnd(Date createTimeEnd) {
      this.createTimeEnd = createTimeEnd;
   }

   public Date getCreateTimeEnd() {
      return this.createTimeEnd;
   }

   public void setPageNum(Integer pageNum) {
      this.pageNum = pageNum;
   }

   public Integer getPageNum() {
      return this.pageNum;
   }

   public void setPageSize(Integer pageSize) {
      this.pageSize = pageSize;
   }

   public Integer getPageSize() {
      return this.pageSize;
   }

   public String getApiMethod() {
      return "jingdong.edi.po.pro.get";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("orderStatus", this.orderStatus);

      try {
         if (this.createTimeStart != null) {
            pmap.put("createTimeStart", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.createTimeStart));
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

      pmap.put("pageNum", this.pageNum);
      pmap.put("pageSize", this.pageSize);
      return JsonUtil.toJson(pmap);
   }

   public Class<EdiPoProGetResponse> getResponseClass() {
      return EdiPoProGetResponse.class;
   }
}
