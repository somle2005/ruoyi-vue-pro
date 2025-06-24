package com.jd.open.api.sdk.request.hudong;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.hudong.PopMarketingGatewayActivityListQueryResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

public class PopMarketingGatewayActivityListQueryRequest extends AbstractRequest implements JdRequest<PopMarketingGatewayActivityListQueryResponse> {
   private String orderType;
   private String actBaseName;
   private Date finishTime;
   private String bound;
   private Integer pageSize;
   private String refActId;
   private String virtualState;
   private Date startTime;
   private String mktActBaseNo;
   private Integer page;
   private String orderField;

   public void setOrderType(String orderType) {
      this.orderType = orderType;
   }

   public String getOrderType() {
      return this.orderType;
   }

   public void setActBaseName(String actBaseName) {
      this.actBaseName = actBaseName;
   }

   public String getActBaseName() {
      return this.actBaseName;
   }

   public void setFinishTime(Date finishTime) {
      this.finishTime = finishTime;
   }

   public Date getFinishTime() {
      return this.finishTime;
   }

   public void setBound(String bound) {
      this.bound = bound;
   }

   public String getBound() {
      return this.bound;
   }

   public void setPageSize(Integer pageSize) {
      this.pageSize = pageSize;
   }

   public Integer getPageSize() {
      return this.pageSize;
   }

   public void setRefActId(String refActId) {
      this.refActId = refActId;
   }

   public String getRefActId() {
      return this.refActId;
   }

   public void setVirtualState(String virtualState) {
      this.virtualState = virtualState;
   }

   public String getVirtualState() {
      return this.virtualState;
   }

   public void setStartTime(Date startTime) {
      this.startTime = startTime;
   }

   public Date getStartTime() {
      return this.startTime;
   }

   public void setMktActBaseNo(String mktActBaseNo) {
      this.mktActBaseNo = mktActBaseNo;
   }

   public String getMktActBaseNo() {
      return this.mktActBaseNo;
   }

   public void setPage(Integer page) {
      this.page = page;
   }

   public Integer getPage() {
      return this.page;
   }

   public void setOrderField(String orderField) {
      this.orderField = orderField;
   }

   public String getOrderField() {
      return this.orderField;
   }

   public String getApiMethod() {
      return "jingdong.pop.marketing.gateway.activity.list.query";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("orderType", this.orderType);
      pmap.put("actBaseName", this.actBaseName);

      try {
         if (this.finishTime != null) {
            pmap.put("finishTime", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.finishTime));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      pmap.put("bound", this.bound);
      pmap.put("pageSize", this.pageSize);
      pmap.put("refActId", this.refActId);
      pmap.put("virtualState", this.virtualState);

      try {
         if (this.startTime != null) {
            pmap.put("startTime", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.startTime));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      pmap.put("mktActBaseNo", this.mktActBaseNo);
      pmap.put("page", this.page);
      pmap.put("orderField", this.orderField);
      return JsonUtil.toJson(pmap);
   }

   public Class<PopMarketingGatewayActivityListQueryResponse> getResponseClass() {
      return PopMarketingGatewayActivityListQueryResponse.class;
   }
}
