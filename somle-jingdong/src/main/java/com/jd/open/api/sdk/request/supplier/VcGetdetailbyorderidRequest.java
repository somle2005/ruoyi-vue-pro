package com.jd.open.api.sdk.request.supplier;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.supplier.VcGetdetailbyorderidResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class VcGetdetailbyorderidRequest extends AbstractRequest implements JdRequest<VcGetdetailbyorderidResponse> {
   private Long orderId;
   private String sortFiled;
   private String sortMode;
   private Integer pageIndex;
   private Integer pageSize;
   private Boolean isPage;

   public void setOrderId(Long orderId) {
      this.orderId = orderId;
   }

   public Long getOrderId() {
      return this.orderId;
   }

   public void setSortFiled(String sortFiled) {
      this.sortFiled = sortFiled;
   }

   public String getSortFiled() {
      return this.sortFiled;
   }

   public void setSortMode(String sortMode) {
      this.sortMode = sortMode;
   }

   public String getSortMode() {
      return this.sortMode;
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

   public void setIsPage(Boolean isPage) {
      this.isPage = isPage;
   }

   public Boolean getIsPage() {
      return this.isPage;
   }

   public String getApiMethod() {
      return "jingdong.vc.getdetailbyorderid";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("order_id", this.orderId);
      pmap.put("sort_filed", this.sortFiled);
      pmap.put("sort_mode", this.sortMode);
      pmap.put("page_index", this.pageIndex);
      pmap.put("page_size", this.pageSize);
      pmap.put("is_page", this.isPage);
      return JsonUtil.toJson(pmap);
   }

   public Class<VcGetdetailbyorderidResponse> getResponseClass() {
      return VcGetdetailbyorderidResponse.class;
   }
}
