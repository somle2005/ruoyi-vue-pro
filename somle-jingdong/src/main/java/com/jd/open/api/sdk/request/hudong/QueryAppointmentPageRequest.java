package com.jd.open.api.sdk.request.hudong;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.hudong.QueryAppointmentPageResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class QueryAppointmentPageRequest extends AbstractRequest implements JdRequest<QueryAppointmentPageResponse> {
   private String appName;
   private String appId;
   private Long preSellId;
   private Long preSellEndTime;
   private Long wareId;
   private Integer pageIndex;
   private String groupId;
   private Integer pageSize;
   private Integer type;
   private Long preSellStartTime;
   private Long skuId;
   private Integer status;

   public void setAppName(String appName) {
      this.appName = appName;
   }

   public String getAppName() {
      return this.appName;
   }

   public void setAppId(String appId) {
      this.appId = appId;
   }

   public String getAppId() {
      return this.appId;
   }

   public void setPreSellId(Long preSellId) {
      this.preSellId = preSellId;
   }

   public Long getPreSellId() {
      return this.preSellId;
   }

   public void setPreSellEndTime(Long preSellEndTime) {
      this.preSellEndTime = preSellEndTime;
   }

   public Long getPreSellEndTime() {
      return this.preSellEndTime;
   }

   public void setWareId(Long wareId) {
      this.wareId = wareId;
   }

   public Long getWareId() {
      return this.wareId;
   }

   public void setPageIndex(Integer pageIndex) {
      this.pageIndex = pageIndex;
   }

   public Integer getPageIndex() {
      return this.pageIndex;
   }

   public void setGroupId(String groupId) {
      this.groupId = groupId;
   }

   public String getGroupId() {
      return this.groupId;
   }

   public void setPageSize(Integer pageSize) {
      this.pageSize = pageSize;
   }

   public Integer getPageSize() {
      return this.pageSize;
   }

   public void setType(Integer type) {
      this.type = type;
   }

   public Integer getType() {
      return this.type;
   }

   public void setPreSellStartTime(Long preSellStartTime) {
      this.preSellStartTime = preSellStartTime;
   }

   public Long getPreSellStartTime() {
      return this.preSellStartTime;
   }

   public void setSkuId(Long skuId) {
      this.skuId = skuId;
   }

   public Long getSkuId() {
      return this.skuId;
   }

   public void setStatus(Integer status) {
      this.status = status;
   }

   public Integer getStatus() {
      return this.status;
   }

   public String getApiMethod() {
      return "jingdong.queryAppointmentPage";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("appName", this.appName);
      pmap.put("appId", this.appId);
      pmap.put("preSellId", this.preSellId);
      pmap.put("preSellEndTime", this.preSellEndTime);
      pmap.put("wareId", this.wareId);
      pmap.put("pageIndex", this.pageIndex);
      pmap.put("groupId", this.groupId);
      pmap.put("pageSize", this.pageSize);
      pmap.put("type", this.type);
      pmap.put("preSellStartTime", this.preSellStartTime);
      pmap.put("skuId", this.skuId);
      pmap.put("status", this.status);
      return JsonUtil.toJson(pmap);
   }

   public Class<QueryAppointmentPageResponse> getResponseClass() {
      return QueryAppointmentPageResponse.class;
   }
}
