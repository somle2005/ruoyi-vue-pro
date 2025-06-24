package com.jd.open.api.sdk.request.promotion;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.promotion.SellerCouponReadGetCouponListResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class SellerCouponReadGetCouponListRequest extends AbstractRequest implements JdRequest<SellerCouponReadGetCouponListResponse> {
   private String ip;
   private String port;
   private Long couponId;
   private Integer type;
   private Integer grantType;
   private Integer bindType;
   private Integer grantWay;
   private String name;
   private String createMonth;
   private Integer creatorType;
   private Integer closed;
   private Integer page;
   private Integer pageSize;

   public void setIp(String ip) {
      this.ip = ip;
   }

   public String getIp() {
      return this.ip;
   }

   public void setPort(String port) {
      this.port = port;
   }

   public String getPort() {
      return this.port;
   }

   public void setCouponId(Long couponId) {
      this.couponId = couponId;
   }

   public Long getCouponId() {
      return this.couponId;
   }

   public void setType(Integer type) {
      this.type = type;
   }

   public Integer getType() {
      return this.type;
   }

   public void setGrantType(Integer grantType) {
      this.grantType = grantType;
   }

   public Integer getGrantType() {
      return this.grantType;
   }

   public void setBindType(Integer bindType) {
      this.bindType = bindType;
   }

   public Integer getBindType() {
      return this.bindType;
   }

   public void setGrantWay(Integer grantWay) {
      this.grantWay = grantWay;
   }

   public Integer getGrantWay() {
      return this.grantWay;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getName() {
      return this.name;
   }

   public void setCreateMonth(String createMonth) {
      this.createMonth = createMonth;
   }

   public String getCreateMonth() {
      return this.createMonth;
   }

   public void setCreatorType(Integer creatorType) {
      this.creatorType = creatorType;
   }

   public Integer getCreatorType() {
      return this.creatorType;
   }

   public void setClosed(Integer closed) {
      this.closed = closed;
   }

   public Integer getClosed() {
      return this.closed;
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
      return "jingdong.seller.coupon.read.getCouponList";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("ip", this.ip);
      pmap.put("port", this.port);
      pmap.put("couponId", this.couponId);
      pmap.put("type", this.type);
      pmap.put("grantType", this.grantType);
      pmap.put("bindType", this.bindType);
      pmap.put("grantWay", this.grantWay);
      pmap.put("name", this.name);
      pmap.put("createMonth", this.createMonth);
      pmap.put("creatorType", this.creatorType);
      pmap.put("closed", this.closed);
      pmap.put("page", this.page);
      pmap.put("pageSize", this.pageSize);
      return JsonUtil.toJson(pmap);
   }

   public Class<SellerCouponReadGetCouponListResponse> getResponseClass() {
      return SellerCouponReadGetCouponListResponse.class;
   }
}
