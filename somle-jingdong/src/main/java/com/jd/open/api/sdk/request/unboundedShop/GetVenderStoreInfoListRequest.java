package com.jd.open.api.sdk.request.unboundedShop;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.unboundedShop.GetVenderStoreInfoListResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class GetVenderStoreInfoListRequest extends AbstractRequest implements JdRequest<GetVenderStoreInfoListResponse> {
   private String exStoreId;
   private Integer pageIndex;
   private Integer pageSize;
   private String storeId;
   private String storeName;
   private Integer storeStatus;
   private Integer firstAddress;
   private Integer secondAddress;
   private Integer thirdAddress;

   public void setExStoreId(String exStoreId) {
      this.exStoreId = exStoreId;
   }

   public String getExStoreId() {
      return this.exStoreId;
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

   public void setStoreId(String storeId) {
      this.storeId = storeId;
   }

   public String getStoreId() {
      return this.storeId;
   }

   public void setStoreName(String storeName) {
      this.storeName = storeName;
   }

   public String getStoreName() {
      return this.storeName;
   }

   public void setStoreStatus(Integer storeStatus) {
      this.storeStatus = storeStatus;
   }

   public Integer getStoreStatus() {
      return this.storeStatus;
   }

   public void setFirstAddress(Integer firstAddress) {
      this.firstAddress = firstAddress;
   }

   public Integer getFirstAddress() {
      return this.firstAddress;
   }

   public void setSecondAddress(Integer secondAddress) {
      this.secondAddress = secondAddress;
   }

   public Integer getSecondAddress() {
      return this.secondAddress;
   }

   public void setThirdAddress(Integer thirdAddress) {
      this.thirdAddress = thirdAddress;
   }

   public Integer getThirdAddress() {
      return this.thirdAddress;
   }

   public String getApiMethod() {
      return "jingdong.getVenderStoreInfoList";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("exStoreId", this.exStoreId);
      pmap.put("pageIndex", this.pageIndex);
      pmap.put("pageSize", this.pageSize);
      pmap.put("storeId", this.storeId);
      pmap.put("storeName", this.storeName);
      pmap.put("storeStatus", this.storeStatus);
      pmap.put("firstAddress", this.firstAddress);
      pmap.put("secondAddress", this.secondAddress);
      pmap.put("thirdAddress", this.thirdAddress);
      return JsonUtil.toJson(pmap);
   }

   public Class<GetVenderStoreInfoListResponse> getResponseClass() {
      return GetVenderStoreInfoListResponse.class;
   }
}
