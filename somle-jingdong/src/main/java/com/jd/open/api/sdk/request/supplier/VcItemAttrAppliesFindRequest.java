package com.jd.open.api.sdk.request.supplier;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.supplier.VcItemAttrAppliesFindResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

public class VcItemAttrAppliesFindRequest extends AbstractRequest implements JdRequest<VcItemAttrAppliesFindResponse> {
   private String wareGroupId;
   private Integer category;
   private Date beginApplyTime;
   private Date endApplyTime;
   private Integer state;
   private String publicName;
   private int offset;
   private int pageSize;

   public void setWareGroupId(String wareGroupId) {
      this.wareGroupId = wareGroupId;
   }

   public String getWareGroupId() {
      return this.wareGroupId;
   }

   public void setCategory(Integer category) {
      this.category = category;
   }

   public Integer getCategory() {
      return this.category;
   }

   public void setBeginApplyTime(Date beginApplyTime) {
      this.beginApplyTime = beginApplyTime;
   }

   public Date getBeginApplyTime() {
      return this.beginApplyTime;
   }

   public void setEndApplyTime(Date endApplyTime) {
      this.endApplyTime = endApplyTime;
   }

   public Date getEndApplyTime() {
      return this.endApplyTime;
   }

   public void setState(Integer state) {
      this.state = state;
   }

   public Integer getState() {
      return this.state;
   }

   public void setPublicName(String publicName) {
      this.publicName = publicName;
   }

   public String getPublicName() {
      return this.publicName;
   }

   public void setOffset(int offset) {
      this.offset = offset;
   }

   public int getOffset() {
      return this.offset;
   }

   public void setPageSize(int pageSize) {
      this.pageSize = pageSize;
   }

   public int getPageSize() {
      return this.pageSize;
   }

   public String getApiMethod() {
      return "jingdong.vc.item.attr.applies.find";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("ware_group_id", this.wareGroupId);
      pmap.put("category", this.category);

      try {
         if (this.beginApplyTime != null) {
            pmap.put("begin_apply_time", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.beginApplyTime));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      try {
         if (this.endApplyTime != null) {
            pmap.put("end_apply_time", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.endApplyTime));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      pmap.put("state", this.state);
      pmap.put("public_name", this.publicName);
      pmap.put("offset", this.offset);
      pmap.put("page_size", this.pageSize);
      return JsonUtil.toJson(pmap);
   }

   public Class<VcItemAttrAppliesFindResponse> getResponseClass() {
      return VcItemAttrAppliesFindResponse.class;
   }
}
