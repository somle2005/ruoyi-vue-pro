package com.jd.open.api.sdk.request.supplier;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.supplier.VcItemPrimaryPicCreateResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

public class VcItemPrimaryPicCreateRequest extends AbstractRequest implements JdRequest<VcItemPrimaryPicCreateResponse> {
   private String skuId;
   private String imageList;
   private String imageGgtIndex;
   private String skuIdLong;
   private String imageListLong;
   private String imageGgtLongIndex;
   private String skuIdLucency;
   private String imageListLucency;
   private Integer isPublishSchedule;
   private Date publishTime;
   private String skuIdGuide;
   private String imageListGuide;

   public void setSkuId(String skuId) {
      this.skuId = skuId;
   }

   public String getSkuId() {
      return this.skuId;
   }

   public void setImageList(String imageList) {
      this.imageList = imageList;
   }

   public String getImageList() {
      return this.imageList;
   }

   public void setImageGgtIndex(String imageGgtIndex) {
      this.imageGgtIndex = imageGgtIndex;
   }

   public String getImageGgtIndex() {
      return this.imageGgtIndex;
   }

   public void setSkuIdLong(String skuIdLong) {
      this.skuIdLong = skuIdLong;
   }

   public String getSkuIdLong() {
      return this.skuIdLong;
   }

   public void setImageListLong(String imageListLong) {
      this.imageListLong = imageListLong;
   }

   public String getImageListLong() {
      return this.imageListLong;
   }

   public void setImageGgtLongIndex(String imageGgtLongIndex) {
      this.imageGgtLongIndex = imageGgtLongIndex;
   }

   public String getImageGgtLongIndex() {
      return this.imageGgtLongIndex;
   }

   public void setSkuIdLucency(String skuIdLucency) {
      this.skuIdLucency = skuIdLucency;
   }

   public String getSkuIdLucency() {
      return this.skuIdLucency;
   }

   public void setImageListLucency(String imageListLucency) {
      this.imageListLucency = imageListLucency;
   }

   public String getImageListLucency() {
      return this.imageListLucency;
   }

   public void setIsPublishSchedule(Integer isPublishSchedule) {
      this.isPublishSchedule = isPublishSchedule;
   }

   public Integer getIsPublishSchedule() {
      return this.isPublishSchedule;
   }

   public void setPublishTime(Date publishTime) {
      this.publishTime = publishTime;
   }

   public Date getPublishTime() {
      return this.publishTime;
   }

   public void setSkuIdGuide(String skuIdGuide) {
      this.skuIdGuide = skuIdGuide;
   }

   public String getSkuIdGuide() {
      return this.skuIdGuide;
   }

   public void setImageListGuide(String imageListGuide) {
      this.imageListGuide = imageListGuide;
   }

   public String getImageListGuide() {
      return this.imageListGuide;
   }

   public String getApiMethod() {
      return "jingdong.vc.item.primaryPic.create";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("sku_id", this.skuId);
      pmap.put("image_list", this.imageList);
      pmap.put("image_ggt_index", this.imageGgtIndex);
      pmap.put("sku_id_long", this.skuIdLong);
      pmap.put("image_list_long", this.imageListLong);
      pmap.put("image_ggt_long_index", this.imageGgtLongIndex);
      pmap.put("sku_id_lucency", this.skuIdLucency);
      pmap.put("image_list_lucency", this.imageListLucency);
      pmap.put("is_publishSchedule", this.isPublishSchedule);

      try {
         if (this.publishTime != null) {
            pmap.put("publish_time", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.publishTime));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      pmap.put("sku_id_guide", this.skuIdGuide);
      pmap.put("image_list_guide", this.imageListGuide);
      return JsonUtil.toJson(pmap);
   }

   public Class<VcItemPrimaryPicCreateResponse> getResponseClass() {
      return VcItemPrimaryPicCreateResponse.class;
   }
}
