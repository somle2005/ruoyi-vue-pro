package com.jd.open.api.sdk.request.ECLP;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ECLP.EclpExceptionQueryExceptionListResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class EclpExceptionQueryExceptionListRequest extends AbstractRequest implements JdRequest<EclpExceptionQueryExceptionListResponse> {
   private String deptNo;
   private String orderNos;
   private String isvOrderNos;
   private String orderType;
   private String bizType;
   private String createTimeStart;
   private String createTimeEnd;
   private Integer pageNo;
   private Integer pageSize;
   private String errCode;

   public void setDeptNo(String deptNo) {
      this.deptNo = deptNo;
   }

   public String getDeptNo() {
      return this.deptNo;
   }

   public void setOrderNos(String orderNos) {
      this.orderNos = orderNos;
   }

   public String getOrderNos() {
      return this.orderNos;
   }

   public void setIsvOrderNos(String isvOrderNos) {
      this.isvOrderNos = isvOrderNos;
   }

   public String getIsvOrderNos() {
      return this.isvOrderNos;
   }

   public void setOrderType(String orderType) {
      this.orderType = orderType;
   }

   public String getOrderType() {
      return this.orderType;
   }

   public void setBizType(String bizType) {
      this.bizType = bizType;
   }

   public String getBizType() {
      return this.bizType;
   }

   public void setCreateTimeStart(String createTimeStart) {
      this.createTimeStart = createTimeStart;
   }

   public String getCreateTimeStart() {
      return this.createTimeStart;
   }

   public void setCreateTimeEnd(String createTimeEnd) {
      this.createTimeEnd = createTimeEnd;
   }

   public String getCreateTimeEnd() {
      return this.createTimeEnd;
   }

   public void setPageNo(Integer pageNo) {
      this.pageNo = pageNo;
   }

   public Integer getPageNo() {
      return this.pageNo;
   }

   public void setPageSize(Integer pageSize) {
      this.pageSize = pageSize;
   }

   public Integer getPageSize() {
      return this.pageSize;
   }

   public void setErrCode(String errCode) {
      this.errCode = errCode;
   }

   public String getErrCode() {
      return this.errCode;
   }

   public String getApiMethod() {
      return "jingdong.eclp.exception.queryExceptionList";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("deptNo", this.deptNo);
      pmap.put("orderNos", this.orderNos);
      pmap.put("isvOrderNos", this.isvOrderNos);
      pmap.put("orderType", this.orderType);
      pmap.put("bizType", this.bizType);
      pmap.put("createTimeStart", this.createTimeStart);
      pmap.put("createTimeEnd", this.createTimeEnd);
      pmap.put("pageNo", this.pageNo);
      pmap.put("pageSize", this.pageSize);
      pmap.put("errCode", this.errCode);
      return JsonUtil.toJson(pmap);
   }

   public Class<EclpExceptionQueryExceptionListResponse> getResponseClass() {
      return EclpExceptionQueryExceptionListResponse.class;
   }
}
