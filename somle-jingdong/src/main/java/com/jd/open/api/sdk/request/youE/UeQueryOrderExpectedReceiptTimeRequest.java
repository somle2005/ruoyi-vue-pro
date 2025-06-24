package com.jd.open.api.sdk.request.youE;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.youE.UeQueryOrderExpectedReceiptTimeResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

public class UeQueryOrderExpectedReceiptTimeRequest extends AbstractRequest implements JdRequest<UeQueryOrderExpectedReceiptTimeResponse> {
   private Date queryDateStart;
   private String venderCode;
   private String appId;
   private Integer pageSize;
   private Integer page;
   private Date createDateEnd;

   public void setQueryDateStart(Date queryDateStart) {
      this.queryDateStart = queryDateStart;
   }

   public Date getQueryDateStart() {
      return this.queryDateStart;
   }

   public void setVenderCode(String venderCode) {
      this.venderCode = venderCode;
   }

   public String getVenderCode() {
      return this.venderCode;
   }

   public void setAppId(String appId) {
      this.appId = appId;
   }

   public String getAppId() {
      return this.appId;
   }

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

   public void setCreateDateEnd(Date createDateEnd) {
      this.createDateEnd = createDateEnd;
   }

   public Date getCreateDateEnd() {
      return this.createDateEnd;
   }

   public String getApiMethod() {
      return "jingdong.ue.queryOrderExpectedReceiptTime";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();

      try {
         if (this.queryDateStart != null) {
            pmap.put("queryDateStart", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.queryDateStart));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      pmap.put("venderCode", this.venderCode);
      pmap.put("appId", this.appId);
      pmap.put("pageSize", this.pageSize);
      pmap.put("page", this.page);

      try {
         if (this.createDateEnd != null) {
            pmap.put("createDateEnd", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.createDateEnd));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      return JsonUtil.toJson(pmap);
   }

   public Class<UeQueryOrderExpectedReceiptTimeResponse> getResponseClass() {
      return UeQueryOrderExpectedReceiptTimeResponse.class;
   }
}
