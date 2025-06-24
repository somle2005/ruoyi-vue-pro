package com.jd.open.api.sdk.request.supplier;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.supplier.VcItemQualificationListFindResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

public class VcItemQualificationListFindRequest extends AbstractRequest implements JdRequest<VcItemQualificationListFindResponse> {
   private String wareId;
   private Integer categoryId;
   private String name;
   private Integer brandId;
   private Date beginAuditTime;
   private Date endAuditTime;
   private Integer state;
   private Integer offset;
   private Integer pageSize;

   public void setWareId(String wareId) {
      this.wareId = wareId;
   }

   public String getWareId() {
      return this.wareId;
   }

   public void setCategoryId(Integer categoryId) {
      this.categoryId = categoryId;
   }

   public Integer getCategoryId() {
      return this.categoryId;
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

   public void setBeginAuditTime(Date beginAuditTime) {
      this.beginAuditTime = beginAuditTime;
   }

   public Date getBeginAuditTime() {
      return this.beginAuditTime;
   }

   public void setEndAuditTime(Date endAuditTime) {
      this.endAuditTime = endAuditTime;
   }

   public Date getEndAuditTime() {
      return this.endAuditTime;
   }

   public void setState(Integer state) {
      this.state = state;
   }

   public Integer getState() {
      return this.state;
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
      return "jingdong.vc.item.qualification.list.find";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("ware_id", this.wareId);
      pmap.put("category_id", this.categoryId);
      pmap.put("name", this.name);
      pmap.put("brand_id", this.brandId);

      try {
         if (this.beginAuditTime != null) {
            pmap.put("begin_audit_time", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.beginAuditTime));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      try {
         if (this.endAuditTime != null) {
            pmap.put("end_audit_time", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.endAuditTime));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      pmap.put("state", this.state);
      pmap.put("offset", this.offset);
      pmap.put("page_size", this.pageSize);
      return JsonUtil.toJson(pmap);
   }

   public Class<VcItemQualificationListFindResponse> getResponseClass() {
      return VcItemQualificationListFindResponse.class;
   }
}
