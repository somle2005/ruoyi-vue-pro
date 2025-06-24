package com.jd.open.api.sdk.request.B2B;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.B2B.B2bWareQuerySkuToPoolResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class B2bWareQuerySkuToPoolRequest extends AbstractRequest implements JdRequest<B2bWareQuerySkuToPoolResponse> {
   private String businessChannel;
   private String mappingId;
   private Long minJdSkuId;
   private Long jdSkuId;
   private Integer totalItem;
   private Integer pageNo;
   private Integer totalPage;
   private Integer mappingType;
   private Integer pageSize;
   private String b2bSkuToPoolQueryTypeEnum;
   private Long b2bPoolId;

   public void setBusinessChannel(String businessChannel) {
      this.businessChannel = businessChannel;
   }

   public String getBusinessChannel() {
      return this.businessChannel;
   }

   public void setMappingId(String mappingId) {
      this.mappingId = mappingId;
   }

   public String getMappingId() {
      return this.mappingId;
   }

   public void setMinJdSkuId(Long minJdSkuId) {
      this.minJdSkuId = minJdSkuId;
   }

   public Long getMinJdSkuId() {
      return this.minJdSkuId;
   }

   public void setJdSkuId(Long jdSkuId) {
      this.jdSkuId = jdSkuId;
   }

   public Long getJdSkuId() {
      return this.jdSkuId;
   }

   public void setTotalItem(Integer totalItem) {
      this.totalItem = totalItem;
   }

   public Integer getTotalItem() {
      return this.totalItem;
   }

   public void setPageNo(Integer pageNo) {
      this.pageNo = pageNo;
   }

   public Integer getPageNo() {
      return this.pageNo;
   }

   public void setTotalPage(Integer totalPage) {
      this.totalPage = totalPage;
   }

   public Integer getTotalPage() {
      return this.totalPage;
   }

   public void setMappingType(Integer mappingType) {
      this.mappingType = mappingType;
   }

   public Integer getMappingType() {
      return this.mappingType;
   }

   public void setPageSize(Integer pageSize) {
      this.pageSize = pageSize;
   }

   public Integer getPageSize() {
      return this.pageSize;
   }

   public void setB2bSkuToPoolQueryTypeEnum(String b2bSkuToPoolQueryTypeEnum) {
      this.b2bSkuToPoolQueryTypeEnum = b2bSkuToPoolQueryTypeEnum;
   }

   public String getB2bSkuToPoolQueryTypeEnum() {
      return this.b2bSkuToPoolQueryTypeEnum;
   }

   public void setB2bPoolId(Long b2bPoolId) {
      this.b2bPoolId = b2bPoolId;
   }

   public Long getB2bPoolId() {
      return this.b2bPoolId;
   }

   public String getApiMethod() {
      return "jingdong.b2b.ware.querySkuToPool";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("businessChannel", this.businessChannel);
      pmap.put("mappingId", this.mappingId);
      pmap.put("minJdSkuId", this.minJdSkuId);
      pmap.put("jdSkuId", this.jdSkuId);
      pmap.put("totalItem", this.totalItem);
      pmap.put("pageNo", this.pageNo);
      pmap.put("totalPage", this.totalPage);
      pmap.put("mappingType", this.mappingType);
      pmap.put("pageSize", this.pageSize);
      pmap.put("b2bSkuToPoolQueryTypeEnum", this.b2bSkuToPoolQueryTypeEnum);
      pmap.put("b2bPoolId", this.b2bPoolId);
      return JsonUtil.toJson(pmap);
   }

   public Class<B2bWareQuerySkuToPoolResponse> getResponseClass() {
      return B2bWareQuerySkuToPoolResponse.class;
   }
}
