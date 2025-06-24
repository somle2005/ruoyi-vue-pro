package com.jd.open.api.sdk.request.supplier;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.supplier.EdiSdvSalesreturnGetResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

public class EdiSdvSalesreturnGetRequest extends AbstractRequest implements JdRequest<EdiSdvSalesreturnGetResponse> {
   private Date recordDate;
   private Integer pageNum;
   private Integer pageSize;

   public void setRecordDate(Date recordDate) {
      this.recordDate = recordDate;
   }

   public Date getRecordDate() {
      return this.recordDate;
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
      return "jingdong.edi.sdv.salesreturn.get";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();

      try {
         if (this.recordDate != null) {
            pmap.put("recordDate", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.recordDate));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      pmap.put("pageNum", this.pageNum);
      pmap.put("pageSize", this.pageSize);
      return JsonUtil.toJson(pmap);
   }

   public Class<EdiSdvSalesreturnGetResponse> getResponseClass() {
      return EdiSdvSalesreturnGetResponse.class;
   }
}
