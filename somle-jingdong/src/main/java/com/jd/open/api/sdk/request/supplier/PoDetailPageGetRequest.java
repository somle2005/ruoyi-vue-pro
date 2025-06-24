package com.jd.open.api.sdk.request.supplier;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.supplier.PoDetailPageGetResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class PoDetailPageGetRequest extends AbstractRequest implements JdRequest<PoDetailPageGetResponse> {
   private Long orderId;
   private String sortFiled;
   private String sortMode;
   private Integer pageIndex;
   private Integer pageSize;

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

   public String getApiMethod() {
      return "jingdong.po.detail.page.get";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("orderId", this.orderId);
      pmap.put("sortFiled", this.sortFiled);
      pmap.put("sortMode", this.sortMode);
      pmap.put("pageIndex", this.pageIndex);
      pmap.put("pageSize", this.pageSize);
      return JsonUtil.toJson(pmap);
   }

   public Class<PoDetailPageGetResponse> getResponseClass() {
      return PoDetailPageGetResponse.class;
   }
}
