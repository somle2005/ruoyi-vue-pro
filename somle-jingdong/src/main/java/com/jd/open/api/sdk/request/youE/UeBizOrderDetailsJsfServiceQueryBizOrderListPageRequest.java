package com.jd.open.api.sdk.request.youE;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.youE.UeBizOrderDetailsJsfServiceQueryBizOrderListPageResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

public class UeBizOrderDetailsJsfServiceQueryBizOrderListPageRequest extends AbstractRequest implements JdRequest<UeBizOrderDetailsJsfServiceQueryBizOrderListPageResponse> {
   private String venderCode;
   private Date endDate;
   private Integer pageNo;
   private String appId;
   private Integer pageSize;
   private Date startDate;
   private Integer dateType;

   public void setVenderCode(String venderCode) {
      this.venderCode = venderCode;
   }

   public String getVenderCode() {
      return this.venderCode;
   }

   public void setEndDate(Date endDate) {
      this.endDate = endDate;
   }

   public Date getEndDate() {
      return this.endDate;
   }

   public void setPageNo(Integer pageNo) {
      this.pageNo = pageNo;
   }

   public Integer getPageNo() {
      return this.pageNo;
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

   public void setStartDate(Date startDate) {
      this.startDate = startDate;
   }

   public Date getStartDate() {
      return this.startDate;
   }

   public void setDateType(Integer dateType) {
      this.dateType = dateType;
   }

   public Integer getDateType() {
      return this.dateType;
   }

   public String getApiMethod() {
      return "jingdong.ue.bizOrderDetailsJsfService.queryBizOrderListPage";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("venderCode", this.venderCode);

      try {
         if (this.endDate != null) {
            pmap.put("endDate", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.endDate));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      pmap.put("pageNo", this.pageNo);
      pmap.put("appId", this.appId);
      pmap.put("pageSize", this.pageSize);

      try {
         if (this.startDate != null) {
            pmap.put("startDate", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.startDate));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      pmap.put("dateType", this.dateType);
      return JsonUtil.toJson(pmap);
   }

   public Class<UeBizOrderDetailsJsfServiceQueryBizOrderListPageResponse> getResponseClass() {
      return UeBizOrderDetailsJsfServiceQueryBizOrderListPageResponse.class;
   }
}
