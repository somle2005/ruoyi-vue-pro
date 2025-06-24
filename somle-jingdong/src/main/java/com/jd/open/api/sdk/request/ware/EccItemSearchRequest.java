package com.jd.open.api.sdk.request.ware;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ware.EccItemSearchResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class EccItemSearchRequest extends AbstractRequest implements JdRequest<EccItemSearchResponse> {
   private Long itemId;
   private Integer itemStatus;
   private String itemName;
   private Long categoryId;
   private String ip;
   private Integer pageSize;
   private Integer pageIndex;
   private String orderCloumn;
   private String orderType;

   public void setItemId(Long itemId) {
      this.itemId = itemId;
   }

   public Long getItemId() {
      return this.itemId;
   }

   public void setItemStatus(Integer itemStatus) {
      this.itemStatus = itemStatus;
   }

   public Integer getItemStatus() {
      return this.itemStatus;
   }

   public void setItemName(String itemName) {
      this.itemName = itemName;
   }

   public String getItemName() {
      return this.itemName;
   }

   public void setCategoryId(Long categoryId) {
      this.categoryId = categoryId;
   }

   public Long getCategoryId() {
      return this.categoryId;
   }

   public void setIp(String ip) {
      this.ip = ip;
   }

   public String getIp() {
      return this.ip;
   }

   public void setPageSize(Integer pageSize) {
      this.pageSize = pageSize;
   }

   public Integer getPageSize() {
      return this.pageSize;
   }

   public void setPageIndex(Integer pageIndex) {
      this.pageIndex = pageIndex;
   }

   public Integer getPageIndex() {
      return this.pageIndex;
   }

   public void setOrderCloumn(String orderCloumn) {
      this.orderCloumn = orderCloumn;
   }

   public String getOrderCloumn() {
      return this.orderCloumn;
   }

   public void setOrderType(String orderType) {
      this.orderType = orderType;
   }

   public String getOrderType() {
      return this.orderType;
   }

   public String getApiMethod() {
      return "jingdong.ecc.item.search";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("item_id", this.itemId);
      pmap.put("item_status", this.itemStatus);
      pmap.put("item_name", this.itemName);
      pmap.put("category_id", this.categoryId);
      pmap.put("ip", this.ip);
      pmap.put("page_size", this.pageSize);
      pmap.put("page_index", this.pageIndex);
      pmap.put("order_cloumn", this.orderCloumn);
      pmap.put("order_type", this.orderType);
      return JsonUtil.toJson(pmap);
   }

   public Class<EccItemSearchResponse> getResponseClass() {
      return EccItemSearchResponse.class;
   }
}
