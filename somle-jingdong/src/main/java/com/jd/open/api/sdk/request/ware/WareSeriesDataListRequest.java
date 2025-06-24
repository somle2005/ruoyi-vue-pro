package com.jd.open.api.sdk.request.ware;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ware.WareSeriesDataListResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class WareSeriesDataListRequest extends AbstractRequest implements JdRequest<WareSeriesDataListResponse> {
   private Integer pageNo;
   private Long brandId;
   private Integer pageSize;
   private Long categoryId;
   private Integer status;

   public void setPageNo(Integer pageNo) {
      this.pageNo = pageNo;
   }

   public Integer getPageNo() {
      return this.pageNo;
   }

   public void setBrandId(Long brandId) {
      this.brandId = brandId;
   }

   public Long getBrandId() {
      return this.brandId;
   }

   public void setPageSize(Integer pageSize) {
      this.pageSize = pageSize;
   }

   public Integer getPageSize() {
      return this.pageSize;
   }

   public void setCategoryId(Long categoryId) {
      this.categoryId = categoryId;
   }

   public Long getCategoryId() {
      return this.categoryId;
   }

   public void setStatus(Integer status) {
      this.status = status;
   }

   public Integer getStatus() {
      return this.status;
   }

   public String getApiMethod() {
      return "jingdong.ware.series.data.list";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("pageNo", this.pageNo);
      pmap.put("brandId", this.brandId);
      pmap.put("pageSize", this.pageSize);
      pmap.put("categoryId", this.categoryId);
      pmap.put("status", this.status);
      return JsonUtil.toJson(pmap);
   }

   public Class<WareSeriesDataListResponse> getResponseClass() {
      return WareSeriesDataListResponse.class;
   }
}
