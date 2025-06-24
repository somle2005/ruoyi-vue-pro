package com.jd.open.api.sdk.request.promotion;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.promotion.SellerPromotionV2UnitBeanrequiredCreateResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class SellerPromotionV2UnitBeanrequiredCreateRequest extends AbstractRequest implements JdRequest<SellerPromotionV2UnitBeanrequiredCreateResponse> {
   private String ip;
   private String port;
   private String requestId;
   private String promoName;
   private String beginTime;
   private String endTime;
   private String slogan;
   private String comment;
   private String link;
   private boolean allowOthersOperate;
   private boolean allowOthersCheck;
   private boolean allowOtherUserOperate;
   private boolean allowOtherUserCheck;
   private boolean needManualCheck;
   private Integer propNum;
   private Integer promoAreaType;
   private String promoAreas;
   private String skuId;
   private String promoPrice;

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

   public void setRequestId(String requestId) {
      this.requestId = requestId;
   }

   public String getRequestId() {
      return this.requestId;
   }

   public void setPromoName(String promoName) {
      this.promoName = promoName;
   }

   public String getPromoName() {
      return this.promoName;
   }

   public void setBeginTime(String beginTime) {
      this.beginTime = beginTime;
   }

   public String getBeginTime() {
      return this.beginTime;
   }

   public void setEndTime(String endTime) {
      this.endTime = endTime;
   }

   public String getEndTime() {
      return this.endTime;
   }

   public void setSlogan(String slogan) {
      this.slogan = slogan;
   }

   public String getSlogan() {
      return this.slogan;
   }

   public void setComment(String comment) {
      this.comment = comment;
   }

   public String getComment() {
      return this.comment;
   }

   public void setLink(String link) {
      this.link = link;
   }

   public String getLink() {
      return this.link;
   }

   public void setAllowOthersOperate(boolean allowOthersOperate) {
      this.allowOthersOperate = allowOthersOperate;
   }

   public boolean getAllowOthersOperate() {
      return this.allowOthersOperate;
   }

   public void setAllowOthersCheck(boolean allowOthersCheck) {
      this.allowOthersCheck = allowOthersCheck;
   }

   public boolean getAllowOthersCheck() {
      return this.allowOthersCheck;
   }

   public void setAllowOtherUserOperate(boolean allowOtherUserOperate) {
      this.allowOtherUserOperate = allowOtherUserOperate;
   }

   public boolean getAllowOtherUserOperate() {
      return this.allowOtherUserOperate;
   }

   public void setAllowOtherUserCheck(boolean allowOtherUserCheck) {
      this.allowOtherUserCheck = allowOtherUserCheck;
   }

   public boolean getAllowOtherUserCheck() {
      return this.allowOtherUserCheck;
   }

   public void setNeedManualCheck(boolean needManualCheck) {
      this.needManualCheck = needManualCheck;
   }

   public boolean getNeedManualCheck() {
      return this.needManualCheck;
   }

   public void setPropNum(Integer propNum) {
      this.propNum = propNum;
   }

   public Integer getPropNum() {
      return this.propNum;
   }

   public void setPromoAreaType(Integer promoAreaType) {
      this.promoAreaType = promoAreaType;
   }

   public Integer getPromoAreaType() {
      return this.promoAreaType;
   }

   public void setPromoAreas(String promoAreas) {
      this.promoAreas = promoAreas;
   }

   public String getPromoAreas() {
      return this.promoAreas;
   }

   public void setSkuId(String skuId) {
      this.skuId = skuId;
   }

   public String getSkuId() {
      return this.skuId;
   }

   public void setPromoPrice(String promoPrice) {
      this.promoPrice = promoPrice;
   }

   public String getPromoPrice() {
      return this.promoPrice;
   }

   public String getApiMethod() {
      return "jingdong.seller.promotion.v2.unit.beanrequired.create";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("ip", this.ip);
      pmap.put("port", this.port);
      pmap.put("request_id", this.requestId);
      pmap.put("promo_name", this.promoName);
      pmap.put("begin_time", this.beginTime);
      pmap.put("end_time", this.endTime);
      pmap.put("slogan", this.slogan);
      pmap.put("comment", this.comment);
      pmap.put("link", this.link);
      pmap.put("allow_others_operate", this.allowOthersOperate);
      pmap.put("allow_others_check", this.allowOthersCheck);
      pmap.put("allow_other_user_operate", this.allowOtherUserOperate);
      pmap.put("allow_other_user_check", this.allowOtherUserCheck);
      pmap.put("need_manual_check", this.needManualCheck);
      pmap.put("prop_num", this.propNum);
      pmap.put("promo_area_type", this.promoAreaType);
      pmap.put("promo_areas", this.promoAreas);
      pmap.put("sku_id", this.skuId);
      pmap.put("promo_price", this.promoPrice);
      return JsonUtil.toJson(pmap);
   }

   public Class<SellerPromotionV2UnitBeanrequiredCreateResponse> getResponseClass() {
      return SellerPromotionV2UnitBeanrequiredCreateResponse.class;
   }
}
