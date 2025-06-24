package com.jd.open.api.sdk.request.ware;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ware.WareListSearchResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class WareListSearchRequest extends AbstractRequest implements JdRequest<WareListSearchResponse> {
   private String cid;
   private String startPrice;
   private String endPrice;
   private String page;
   private String pageSize;
   private String title;
   private String startTime;
   private String endTime;
   private String startModified;
   private String endModified;
   private String wareStatus;
   private String fields;
   private String itemNum;
   private String shopCateGoryId;

   public String getItemNum() {
      return this.itemNum;
   }

   public void setItemNum(String itemNum) {
      this.itemNum = itemNum;
   }

   public String getShopCateGoryId() {
      return this.shopCateGoryId;
   }

   public void setShopCateGoryId(String shopCateGoryId) {
      this.shopCateGoryId = shopCateGoryId;
   }

   public String getApiMethod() {
      return "jingdong.wares.list.search";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("title", this.title);
      pmap.put("page", this.page);
      pmap.put("cid", this.cid);
      pmap.put("page_size", this.pageSize);
      pmap.put("start_price", this.startPrice);
      pmap.put("end_price", this.endPrice);
      pmap.put("fields", this.fields);
      pmap.put("start_time", this.startTime);
      pmap.put("end_time", this.endTime);
      pmap.put("ware_status", this.wareStatus);
      pmap.put("ware_status", this.wareStatus);
      pmap.put("start_modified", this.startModified);
      pmap.put("end_modified", this.endModified);
      pmap.put("item_num", this.itemNum);
      pmap.put("shop_cateGoryId", this.shopCateGoryId);
      return JsonUtil.toJson(pmap);
   }

   public Class<WareListSearchResponse> getResponseClass() {
      return WareListSearchResponse.class;
   }

   public String getStartModified() {
      return this.startModified;
   }

   public void setStartModified(String startModified) {
      this.startModified = startModified;
   }

   public String getEndModified() {
      return this.endModified;
   }

   public void setEndModified(String endModified) {
      this.endModified = endModified;
   }

   public String getStartTime() {
      return this.startTime;
   }

   public void setStartTime(String startTime) {
      this.startTime = startTime;
   }

   public String getEndTime() {
      return this.endTime;
   }

   public void setEndTime(String endTime) {
      this.endTime = endTime;
   }

   public String getWareStatus() {
      return this.wareStatus;
   }

   public void setWareStatus(String wareStatus) {
      this.wareStatus = wareStatus;
   }

   public String getCid() {
      return this.cid;
   }

   public void setCid(String cid) {
      this.cid = cid;
   }

   public String getFields() {
      return this.fields;
   }

   public void setFields(String fields) {
      this.fields = fields;
   }

   public String getStartPrice() {
      return this.startPrice;
   }

   public void setStartPrice(String startPrice) {
      this.startPrice = startPrice;
   }

   public String getEndPrice() {
      return this.endPrice;
   }

   public void setEndPrice(String endPrice) {
      this.endPrice = endPrice;
   }

   public String getPage() {
      return this.page;
   }

   public void setPage(String page) {
      this.page = page;
   }

   public String getPageSize() {
      return this.pageSize;
   }

   public void setPageSize(String pageSize) {
      this.pageSize = pageSize;
   }

   public String getTitle() {
      return this.title;
   }

   public void setTitle(String title) {
      this.title = title;
   }
}
