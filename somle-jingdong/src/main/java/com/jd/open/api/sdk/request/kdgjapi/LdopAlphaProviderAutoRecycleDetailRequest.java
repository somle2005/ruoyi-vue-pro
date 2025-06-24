package com.jd.open.api.sdk.request.kdgjapi;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.kdgjapi.LdopAlphaProviderAutoRecycleDetailResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

public class LdopAlphaProviderAutoRecycleDetailRequest extends AbstractRequest implements JdRequest<LdopAlphaProviderAutoRecycleDetailResponse> {
   private String providerCode;
   private Date startTime;
   private Date endTime;
   private Integer page;
   private Integer pageSize;

   public void setProviderCode(String providerCode) {
      this.providerCode = providerCode;
   }

   public String getProviderCode() {
      return this.providerCode;
   }

   public void setStartTime(Date startTime) {
      this.startTime = startTime;
   }

   public Date getStartTime() {
      return this.startTime;
   }

   public void setEndTime(Date endTime) {
      this.endTime = endTime;
   }

   public Date getEndTime() {
      return this.endTime;
   }

   public void setPage(Integer page) {
      this.page = page;
   }

   public Integer getPage() {
      return this.page;
   }

   public void setPageSize(Integer pageSize) {
      this.pageSize = pageSize;
   }

   public Integer getPageSize() {
      return this.pageSize;
   }

   public String getApiMethod() {
      return "jingdong.ldop.alpha.provider.autoRecycleDetail";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("providerCode", this.providerCode);

      try {
         if (this.startTime != null) {
            pmap.put("startTime", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.startTime));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      try {
         if (this.endTime != null) {
            pmap.put("endTime", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.endTime));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      pmap.put("page", this.page);
      pmap.put("pageSize", this.pageSize);
      return JsonUtil.toJson(pmap);
   }

   public Class<LdopAlphaProviderAutoRecycleDetailResponse> getResponseClass() {
      return LdopAlphaProviderAutoRecycleDetailResponse.class;
   }
}
