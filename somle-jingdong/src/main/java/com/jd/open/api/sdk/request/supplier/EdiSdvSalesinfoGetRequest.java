package com.jd.open.api.sdk.request.supplier;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.supplier.EdiSdvSalesinfoGetResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class EdiSdvSalesinfoGetRequest extends AbstractRequest implements JdRequest<EdiSdvSalesinfoGetResponse> {
   private String recordDate;
   private Integer pageNum;
   private Integer pageSize;

   public void setRecordDate(String recordDate) {
      this.recordDate = recordDate;
   }

   public String getRecordDate() {
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
      return "jingdong.edi.sdv.salesinfo.get";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("recordDate", this.recordDate);
      pmap.put("pageNum", this.pageNum);
      pmap.put("pageSize", this.pageSize);
      return JsonUtil.toJson(pmap);
   }

   public Class<EdiSdvSalesinfoGetResponse> getResponseClass() {
      return EdiSdvSalesinfoGetResponse.class;
   }
}
