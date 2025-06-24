package com.jd.open.api.sdk.request.ECLP;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ECLP.EclpMasterInsertCategoryResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

public class EclpMasterInsertCategoryRequest extends AbstractRequest implements JdRequest<EclpMasterInsertCategoryResponse> {
   private String categoryNo;
   private String categoryName;
   private String superior;
   private String sortNo;
   private String memo;
   private String operateUser;
   private Date operateTime;

   public void setCategoryNo(String categoryNo) {
      this.categoryNo = categoryNo;
   }

   public String getCategoryNo() {
      return this.categoryNo;
   }

   public void setCategoryName(String categoryName) {
      this.categoryName = categoryName;
   }

   public String getCategoryName() {
      return this.categoryName;
   }

   public void setSuperior(String superior) {
      this.superior = superior;
   }

   public String getSuperior() {
      return this.superior;
   }

   public void setSortNo(String sortNo) {
      this.sortNo = sortNo;
   }

   public String getSortNo() {
      return this.sortNo;
   }

   public void setMemo(String memo) {
      this.memo = memo;
   }

   public String getMemo() {
      return this.memo;
   }

   public void setOperateUser(String operateUser) {
      this.operateUser = operateUser;
   }

   public String getOperateUser() {
      return this.operateUser;
   }

   public void setOperateTime(Date operateTime) {
      this.operateTime = operateTime;
   }

   public Date getOperateTime() {
      return this.operateTime;
   }

   public String getApiMethod() {
      return "jingdong.eclp.master.insertCategory";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("categoryNo", this.categoryNo);
      pmap.put("categoryName", this.categoryName);
      pmap.put("superior", this.superior);
      pmap.put("sortNo", this.sortNo);
      pmap.put("memo", this.memo);
      pmap.put("operateUser", this.operateUser);

      try {
         if (this.operateTime != null) {
            pmap.put("operateTime", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.operateTime));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      return JsonUtil.toJson(pmap);
   }

   public Class<EclpMasterInsertCategoryResponse> getResponseClass() {
      return EclpMasterInsertCategoryResponse.class;
   }
}
