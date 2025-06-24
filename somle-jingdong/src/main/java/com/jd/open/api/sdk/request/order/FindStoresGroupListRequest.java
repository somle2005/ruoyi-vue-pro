package com.jd.open.api.sdk.request.order;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.order.FindStoresGroupListResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class FindStoresGroupListRequest extends AbstractRequest implements JdRequest<FindStoresGroupListResponse> {
   private String name;
   private Long groupId;
   private Integer type;
   private Long businessId;
   private Long brandId;
   private String creator;
   private int pageIndex;
   private int pageSize;

   public void setName(String name) {
      this.name = name;
   }

   public String getName() {
      return this.name;
   }

   public void setGroupId(Long groupId) {
      this.groupId = groupId;
   }

   public Long getGroupId() {
      return this.groupId;
   }

   public void setType(Integer type) {
      this.type = type;
   }

   public Integer getType() {
      return this.type;
   }

   public void setBusinessId(Long businessId) {
      this.businessId = businessId;
   }

   public Long getBusinessId() {
      return this.businessId;
   }

   public void setBrandId(Long brandId) {
      this.brandId = brandId;
   }

   public Long getBrandId() {
      return this.brandId;
   }

   public void setCreator(String creator) {
      this.creator = creator;
   }

   public String getCreator() {
      return this.creator;
   }

   public void setPageIndex(int pageIndex) {
      this.pageIndex = pageIndex;
   }

   public int getPageIndex() {
      return this.pageIndex;
   }

   public void setPageSize(int pageSize) {
      this.pageSize = pageSize;
   }

   public int getPageSize() {
      return this.pageSize;
   }

   public String getApiMethod() {
      return "jingdong.findStoresGroupList";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("name", this.name);
      pmap.put("groupId", this.groupId);
      pmap.put("type", this.type);
      pmap.put("businessId", this.businessId);
      pmap.put("brandId", this.brandId);
      pmap.put("creator", this.creator);
      pmap.put("pageIndex", this.pageIndex);
      pmap.put("pageSize", this.pageSize);
      return JsonUtil.toJson(pmap);
   }

   public Class<FindStoresGroupListResponse> getResponseClass() {
      return FindStoresGroupListResponse.class;
   }
}
