package com.jd.open.api.sdk.request.B2B;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.B2B.B2bWareSearchResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class B2bWareSearchRequest extends AbstractRequest implements JdRequest<B2bWareSearchResponse> {
   private String channelType;
   private Long thirdCid;
   private String skuSearchTypeEnum;
   private Integer pageSize;
   private Long laskSkuId;
   private Integer pageNo;
   private Long brandId;

   public void setChannelType(String channelType) {
      this.channelType = channelType;
   }

   public String getChannelType() {
      return this.channelType;
   }

   public void setThirdCid(Long thirdCid) {
      this.thirdCid = thirdCid;
   }

   public Long getThirdCid() {
      return this.thirdCid;
   }

   public void setSkuSearchTypeEnum(String skuSearchTypeEnum) {
      this.skuSearchTypeEnum = skuSearchTypeEnum;
   }

   public String getSkuSearchTypeEnum() {
      return this.skuSearchTypeEnum;
   }

   public void setPageSize(Integer pageSize) {
      this.pageSize = pageSize;
   }

   public Integer getPageSize() {
      return this.pageSize;
   }

   public void setLaskSkuId(Long laskSkuId) {
      this.laskSkuId = laskSkuId;
   }

   public Long getLaskSkuId() {
      return this.laskSkuId;
   }

   public void setPageNo(Integer pageNo) {
      this.pageNo = pageNo;
   }

   public Integer getPageNo() {
      return this.pageNo;
   }

   public void setBrandId(Long brandId) {
      this.brandId = brandId;
   }

   public Long getBrandId() {
      return this.brandId;
   }

   public String getApiMethod() {
      return "jingdong.b2b.ware.search";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("channelType", this.channelType);
      pmap.put("thirdCid", this.thirdCid);
      pmap.put("skuSearchTypeEnum", this.skuSearchTypeEnum);
      pmap.put("pageSize", this.pageSize);
      pmap.put("laskSkuId", this.laskSkuId);
      pmap.put("pageNo", this.pageNo);
      pmap.put("brandId", this.brandId);
      return JsonUtil.toJson(pmap);
   }

   public Class<B2bWareSearchResponse> getResponseClass() {
      return B2bWareSearchResponse.class;
   }
}
