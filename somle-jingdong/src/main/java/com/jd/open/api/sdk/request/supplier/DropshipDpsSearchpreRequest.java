package com.jd.open.api.sdk.request.supplier;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.supplier.DropshipDpsSearchpreResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

public class DropshipDpsSearchpreRequest extends AbstractRequest implements JdRequest<DropshipDpsSearchpreResponse> {
   private Integer pageSize;
   private Integer page;
   private Date beginDate;
   private Date endDate;

   public void setPageSize(Integer pageSize) {
      this.pageSize = pageSize;
   }

   public Integer getPageSize() {
      return this.pageSize;
   }

   public void setPage(Integer page) {
      this.page = page;
   }

   public Integer getPage() {
      return this.page;
   }

   public void setBeginDate(Date beginDate) {
      this.beginDate = beginDate;
   }

   public Date getBeginDate() {
      return this.beginDate;
   }

   public void setEndDate(Date endDate) {
      this.endDate = endDate;
   }

   public Date getEndDate() {
      return this.endDate;
   }

   public String getApiMethod() {
      return "jingdong.dropship.dps.searchpre";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("pageSize", this.pageSize);
      pmap.put("page", this.page);

      try {
         if (this.beginDate != null) {
            pmap.put("beginDate", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.beginDate));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      try {
         if (this.endDate != null) {
            pmap.put("endDate", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.endDate));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      return JsonUtil.toJson(pmap);
   }

   public Class<DropshipDpsSearchpreResponse> getResponseClass() {
      return DropshipDpsSearchpreResponse.class;
   }
}
