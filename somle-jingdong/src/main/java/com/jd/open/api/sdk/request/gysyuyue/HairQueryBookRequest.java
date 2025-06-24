package com.jd.open.api.sdk.request.gysyuyue;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.gysyuyue.HairQueryBookResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class HairQueryBookRequest extends AbstractRequest implements JdRequest<HairQueryBookResponse> {
   private String beginDate;
   private String supNo;
   private String poNo;
   private String endDate;
   private String whNo;
   private String ownerNo;
   private Integer pageSize;
   private Integer page;
   private Integer dcNo;
   private Integer bizType;

   public void setBeginDate(String beginDate) {
      this.beginDate = beginDate;
   }

   public String getBeginDate() {
      return this.beginDate;
   }

   public void setSupNo(String supNo) {
      this.supNo = supNo;
   }

   public String getSupNo() {
      return this.supNo;
   }

   public void setPoNo(String poNo) {
      this.poNo = poNo;
   }

   public String getPoNo() {
      return this.poNo;
   }

   public void setEndDate(String endDate) {
      this.endDate = endDate;
   }

   public String getEndDate() {
      return this.endDate;
   }

   public void setWhNo(String whNo) {
      this.whNo = whNo;
   }

   public String getWhNo() {
      return this.whNo;
   }

   public void setOwnerNo(String ownerNo) {
      this.ownerNo = ownerNo;
   }

   public String getOwnerNo() {
      return this.ownerNo;
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

   public void setDcNo(Integer dcNo) {
      this.dcNo = dcNo;
   }

   public Integer getDcNo() {
      return this.dcNo;
   }

   public void setBizType(Integer bizType) {
      this.bizType = bizType;
   }

   public Integer getBizType() {
      return this.bizType;
   }

   public String getApiMethod() {
      return "jingdong.hair.queryBook";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("beginDate", this.beginDate);
      pmap.put("supNo", this.supNo);
      pmap.put("poNo", this.poNo);
      pmap.put("endDate", this.endDate);
      pmap.put("whNo", this.whNo);
      pmap.put("ownerNo", this.ownerNo);
      pmap.put("pageSize", this.pageSize);
      pmap.put("page", this.page);
      pmap.put("dcNo", this.dcNo);
      pmap.put("bizType", this.bizType);
      return JsonUtil.toJson(pmap);
   }

   public Class<HairQueryBookResponse> getResponseClass() {
      return HairQueryBookResponse.class;
   }
}
