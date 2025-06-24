package com.jd.open.api.sdk.request.unboundedShop;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.unboundedShop.BrandCouponQueryActivityPageInfoResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

public class BrandCouponQueryActivityPageInfoRequest extends AbstractRequest implements JdRequest<BrandCouponQueryActivityPageInfoResponse> {
   private Date endDate;
   private String activityName;
   private Integer pageSize;
   private Integer currentPage;
   private Date startDate;

   public void setEndDate(Date endDate) {
      this.endDate = endDate;
   }

   public Date getEndDate() {
      return this.endDate;
   }

   public void setActivityName(String activityName) {
      this.activityName = activityName;
   }

   public String getActivityName() {
      return this.activityName;
   }

   public void setPageSize(Integer pageSize) {
      this.pageSize = pageSize;
   }

   public Integer getPageSize() {
      return this.pageSize;
   }

   public void setCurrentPage(Integer currentPage) {
      this.currentPage = currentPage;
   }

   public Integer getCurrentPage() {
      return this.currentPage;
   }

   public void setStartDate(Date startDate) {
      this.startDate = startDate;
   }

   public Date getStartDate() {
      return this.startDate;
   }

   public String getApiMethod() {
      return "jingdong.brand.coupon.queryActivityPageInfo";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();

      try {
         if (this.endDate != null) {
            pmap.put("endDate", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.endDate));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      pmap.put("activityName", this.activityName);
      pmap.put("pageSize", this.pageSize);
      pmap.put("currentPage", this.currentPage);

      try {
         if (this.startDate != null) {
            pmap.put("startDate", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.startDate));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      return JsonUtil.toJson(pmap);
   }

   public Class<BrandCouponQueryActivityPageInfoResponse> getResponseClass() {
      return BrandCouponQueryActivityPageInfoResponse.class;
   }
}
