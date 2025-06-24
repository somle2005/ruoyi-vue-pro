package com.jd.open.api.sdk.request.B2B;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.B2B.GxptDirectPayQueryResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class GxptDirectPayQueryRequest extends AbstractRequest implements JdRequest<GxptDirectPayQueryResponse> {
   private String startCreated;
   private String endCreated;
   private String startModified;
   private String endModified;
   private Integer payType;
   private Integer payState;
   private Integer page;
   private Integer pageSize;

   public void setStartCreated(String startCreated) {
      this.startCreated = startCreated;
   }

   public String getStartCreated() {
      return this.startCreated;
   }

   public void setEndCreated(String endCreated) {
      this.endCreated = endCreated;
   }

   public String getEndCreated() {
      return this.endCreated;
   }

   public void setStartModified(String startModified) {
      this.startModified = startModified;
   }

   public String getStartModified() {
      return this.startModified;
   }

   public void setEndModified(String endModified) {
      this.endModified = endModified;
   }

   public String getEndModified() {
      return this.endModified;
   }

   public void setPayType(Integer payType) {
      this.payType = payType;
   }

   public Integer getPayType() {
      return this.payType;
   }

   public void setPayState(Integer payState) {
      this.payState = payState;
   }

   public Integer getPayState() {
      return this.payState;
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
      return "jingdong.gxpt.directPay.query";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("startCreated", this.startCreated);
      pmap.put("endCreated", this.endCreated);
      pmap.put("startModified", this.startModified);
      pmap.put("endModified", this.endModified);
      pmap.put("payType", this.payType);
      pmap.put("payState", this.payState);
      pmap.put("page", this.page);
      pmap.put("pageSize", this.pageSize);
      return JsonUtil.toJson(pmap);
   }

   public Class<GxptDirectPayQueryResponse> getResponseClass() {
      return GxptDirectPayQueryResponse.class;
   }
}
