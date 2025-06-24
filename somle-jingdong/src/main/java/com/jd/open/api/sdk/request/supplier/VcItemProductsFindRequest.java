package com.jd.open.api.sdk.request.supplier;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.supplier.VcItemProductsFindResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

public class VcItemProductsFindRequest extends AbstractRequest implements JdRequest<VcItemProductsFindResponse> {
   private String wareId;
   private String name;
   private Integer brandId;
   private Integer categoryId;
   private Integer saleState;
   private Date beginModifyTime;
   private Date endModifyTime;
   private Integer offset;
   private Integer pageSize;

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

   public void setSaleState(Integer saleState) {
      this.saleState = saleState;
   }

   public Integer getSaleState() {
      return this.saleState;
   }

   public void setBeginModifyTime(Date beginModifyTime) {
      this.beginModifyTime = beginModifyTime;
   }

   public Date getBeginModifyTime() {
      return this.beginModifyTime;
   }

   public void setEndModifyTime(Date endModifyTime) {
      this.endModifyTime = endModifyTime;
   }

   public Date getEndModifyTime() {
      return this.endModifyTime;
   }

   public void setOffset(Integer offset) {
      this.offset = offset;
   }

   public Integer getOffset() {
      return this.offset;
   }

   public void setPageSize(Integer pageSize) {
      this.pageSize = pageSize;
   }

   public Integer getPageSize() {
      return this.pageSize;
   }

   public String getApiMethod() {
      return "jingdong.vc.item.products.find";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("ware_id", this.wareId);
      pmap.put("name", this.name);
      pmap.put("brand_id", this.brandId);
      pmap.put("category_id", this.categoryId);
      pmap.put("sale_state", this.saleState);

      try {
         if (this.beginModifyTime != null) {
            pmap.put("begin_modify_time", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.beginModifyTime));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      try {
         if (this.endModifyTime != null) {
            pmap.put("end_modify_time", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.endModifyTime));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      pmap.put("offset", this.offset);
      pmap.put("page_size", this.pageSize);
      return JsonUtil.toJson(pmap);
   }

   public Class<VcItemProductsFindResponse> getResponseClass() {
      return VcItemProductsFindResponse.class;
   }
}
