package com.jd.open.api.sdk.request.ware;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ware.EccItemUpdateResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class EccItemUpdateRequest extends AbstractRequest implements JdRequest<EccItemUpdateResponse> {
   private Long itemId;
   private String itemName;
   private Long cid;
   private Integer itemStatus;
   private String itemLocation;
   private String brand;
   private Integer weight;
   private String packListing;
   private String aftService;
   private String specParam;
   private String itemDes;
   private String operator;
   private String skuListJson;
   private String itemPictureListJson;
   private String ip;

   public void setItemId(Long itemId) {
      this.itemId = itemId;
   }

   public Long getItemId() {
      return this.itemId;
   }

   public void setItemName(String itemName) {
      this.itemName = itemName;
   }

   public String getItemName() {
      return this.itemName;
   }

   public void setCid(Long cid) {
      this.cid = cid;
   }

   public Long getCid() {
      return this.cid;
   }

   public void setItemStatus(Integer itemStatus) {
      this.itemStatus = itemStatus;
   }

   public Integer getItemStatus() {
      return this.itemStatus;
   }

   public void setItemLocation(String itemLocation) {
      this.itemLocation = itemLocation;
   }

   public String getItemLocation() {
      return this.itemLocation;
   }

   public void setBrand(String brand) {
      this.brand = brand;
   }

   public String getBrand() {
      return this.brand;
   }

   public void setWeight(Integer weight) {
      this.weight = weight;
   }

   public Integer getWeight() {
      return this.weight;
   }

   public void setPackListing(String packListing) {
      this.packListing = packListing;
   }

   public String getPackListing() {
      return this.packListing;
   }

   public void setAftService(String aftService) {
      this.aftService = aftService;
   }

   public String getAftService() {
      return this.aftService;
   }

   public void setSpecParam(String specParam) {
      this.specParam = specParam;
   }

   public String getSpecParam() {
      return this.specParam;
   }

   public void setItemDes(String itemDes) {
      this.itemDes = itemDes;
   }

   public String getItemDes() {
      return this.itemDes;
   }

   public void setOperator(String operator) {
      this.operator = operator;
   }

   public String getOperator() {
      return this.operator;
   }

   public void setSkuListJson(String skuListJson) {
      this.skuListJson = skuListJson;
   }

   public String getSkuListJson() {
      return this.skuListJson;
   }

   public void setItemPictureListJson(String itemPictureListJson) {
      this.itemPictureListJson = itemPictureListJson;
   }

   public String getItemPictureListJson() {
      return this.itemPictureListJson;
   }

   public void setIp(String ip) {
      this.ip = ip;
   }

   public String getIp() {
      return this.ip;
   }

   public String getApiMethod() {
      return "jingdong.ecc.item.update";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("item_id", this.itemId);
      pmap.put("item_name", this.itemName);
      pmap.put("cid", this.cid);
      pmap.put("item_status", this.itemStatus);
      pmap.put("item_location", this.itemLocation);
      pmap.put("brand", this.brand);
      pmap.put("weight", this.weight);
      pmap.put("pack_listing", this.packListing);
      pmap.put("aft_service", this.aftService);
      pmap.put("spec_param", this.specParam);
      pmap.put("item_des", this.itemDes);
      pmap.put("operator", this.operator);
      pmap.put("sku_list_json", this.skuListJson);
      pmap.put("item_picture_list_json", this.itemPictureListJson);
      pmap.put("ip", this.ip);
      return JsonUtil.toJson(pmap);
   }

   public Class<EccItemUpdateResponse> getResponseClass() {
      return EccItemUpdateResponse.class;
   }
}
