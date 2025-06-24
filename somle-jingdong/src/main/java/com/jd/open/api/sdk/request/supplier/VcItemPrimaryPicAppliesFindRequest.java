package com.jd.open.api.sdk.request.supplier;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.supplier.VcItemPrimaryPicAppliesFindResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class VcItemPrimaryPicAppliesFindRequest extends AbstractRequest implements JdRequest<VcItemPrimaryPicAppliesFindResponse> {
   private String wareId;
   private String name;
   private Integer brandId;
   private Integer categoryId;
   private Integer state;
   private String beginApplyTime;
   private String endApplyTime;
   private int page;
   private int length;

   public void setWareId(String wareId) {
      this.wareId = wareId;
   }

   public String getWareId() {
      return this.wareId;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getName() {
      return this.name;
   }

   public void setBrandId(Integer brandId) {
      this.brandId = brandId;
   }

   public Integer getBrandId() {
      return this.brandId;
   }

   public void setCategoryId(Integer categoryId) {
      this.categoryId = categoryId;
   }

   public Integer getCategoryId() {
      return this.categoryId;
   }

   public void setState(Integer state) {
      this.state = state;
   }

   public Integer getState() {
      return this.state;
   }

   public void setBeginApplyTime(String beginApplyTime) {
      this.beginApplyTime = beginApplyTime;
   }

   public String getBeginApplyTime() {
      return this.beginApplyTime;
   }

   public void setEndApplyTime(String endApplyTime) {
      this.endApplyTime = endApplyTime;
   }

   public String getEndApplyTime() {
      return this.endApplyTime;
   }

   public void setPage(int page) {
      this.page = page;
   }

   public int getPage() {
      return this.page;
   }

   public void setLength(int length) {
      this.length = length;
   }

   public int getLength() {
      return this.length;
   }

   public String getApiMethod() {
      return "jingdong.vc.item.primaryPic.applies.find";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("ware_id", this.wareId);
      pmap.put("name", this.name);
      pmap.put("brand_id", this.brandId);
      pmap.put("category_id", this.categoryId);
      pmap.put("state", this.state);
      pmap.put("begin_apply_time", this.beginApplyTime);
      pmap.put("end_apply_time", this.endApplyTime);
      pmap.put("page", this.page);
      pmap.put("length", this.length);
      return JsonUtil.toJson(pmap);
   }

   public Class<VcItemPrimaryPicAppliesFindResponse> getResponseClass() {
      return VcItemPrimaryPicAppliesFindResponse.class;
   }
}
