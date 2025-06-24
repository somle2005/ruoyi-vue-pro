package com.jd.open.api.sdk.request.promotion;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.promotion.SellerPromotionAddResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class SellerPromotionAddRequest extends AbstractRequest implements JdRequest<SellerPromotionAddResponse> {
   private String name;
   private Integer type;
   private String beginTime;
   private String endTime;
   private Integer bound;
   private Integer member;
   private String slogan;
   private String comment;
   private Integer favorMode;

   public void setName(String name) {
      this.name = name;
   }

   public String getName() {
      return this.name;
   }

   public void setType(Integer type) {
      this.type = type;
   }

   public Integer getType() {
      return this.type;
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

   public void setBound(Integer bound) {
      this.bound = bound;
   }

   public Integer getBound() {
      return this.bound;
   }

   public void setMember(Integer member) {
      this.member = member;
   }

   public Integer getMember() {
      return this.member;
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

   public void setFavorMode(Integer favorMode) {
      this.favorMode = favorMode;
   }

   public Integer getFavorMode() {
      return this.favorMode;
   }

   public String getApiMethod() {
      return "jingdong.seller.promotion.add";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("name", this.name);
      pmap.put("type", this.type);
      pmap.put("begin_time", this.beginTime);
      pmap.put("end_time", this.endTime);
      pmap.put("bound", this.bound);
      pmap.put("member", this.member);
      pmap.put("slogan", this.slogan);
      pmap.put("comment", this.comment);
      pmap.put("favor_mode", this.favorMode);
      return JsonUtil.toJson(pmap);
   }

   public Class<SellerPromotionAddResponse> getResponseClass() {
      return SellerPromotionAddResponse.class;
   }
}
