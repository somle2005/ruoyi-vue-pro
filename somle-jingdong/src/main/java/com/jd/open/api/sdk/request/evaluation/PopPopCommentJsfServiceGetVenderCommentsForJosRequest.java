package com.jd.open.api.sdk.request.evaluation;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.evaluation.PopPopCommentJsfServiceGetVenderCommentsForJosResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class PopPopCommentJsfServiceGetVenderCommentsForJosRequest extends AbstractRequest implements JdRequest<PopPopCommentJsfServiceGetVenderCommentsForJosResponse> {
   private String skuids;
   private String wareName;
   private String beginTime;
   private String endTime;
   private int score;
   private String content;
   private String pin;
   private Boolean isVenderReply;
   private String cid;
   private String orderIds;
   private int page;
   private int pageSize;
   private String openIdBuyer;
   private String xidBuyer;

   public void setSkuids(String skuids) {
      this.skuids = skuids;
   }

   public String getSkuids() {
      return this.skuids;
   }

   public void setWareName(String wareName) {
      this.wareName = wareName;
   }

   public String getWareName() {
      return this.wareName;
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

   public void setScore(int score) {
      this.score = score;
   }

   public int getScore() {
      return this.score;
   }

   public void setContent(String content) {
      this.content = content;
   }

   public String getContent() {
      return this.content;
   }

   public void setPin(String pin) {
      this.pin = pin;
   }

   public String getPin() {
      return this.pin;
   }

   public void setIsVenderReply(Boolean isVenderReply) {
      this.isVenderReply = isVenderReply;
   }

   public Boolean getIsVenderReply() {
      return this.isVenderReply;
   }

   public void setCid(String cid) {
      this.cid = cid;
   }

   public String getCid() {
      return this.cid;
   }

   public void setOrderIds(String orderIds) {
      this.orderIds = orderIds;
   }

   public String getOrderIds() {
      return this.orderIds;
   }

   public void setPage(int page) {
      this.page = page;
   }

   public int getPage() {
      return this.page;
   }

   public void setPageSize(int pageSize) {
      this.pageSize = pageSize;
   }

   public int getPageSize() {
      return this.pageSize;
   }

   public void setOpenIdBuyer(String openIdBuyer) {
      this.openIdBuyer = openIdBuyer;
   }

   public String getOpenIdBuyer() {
      return this.openIdBuyer;
   }

   public void setXidBuyer(String xidBuyer) {
      this.xidBuyer = xidBuyer;
   }

   public String getXidBuyer() {
      return this.xidBuyer;
   }

   public String getApiMethod() {
      return "jingdong.pop.PopCommentJsfService.getVenderCommentsForJos";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("skuids", this.skuids);
      pmap.put("wareName", this.wareName);
      pmap.put("beginTime", this.beginTime);
      pmap.put("endTime", this.endTime);
      pmap.put("score", this.score);
      pmap.put("content", this.content);
      pmap.put("pin", this.pin);
      pmap.put("isVenderReply", this.isVenderReply);
      pmap.put("cid", this.cid);
      pmap.put("orderIds", this.orderIds);
      pmap.put("page", this.page);
      pmap.put("pageSize", this.pageSize);
      pmap.put("open_id_buyer", this.openIdBuyer);
      pmap.put("xid_buyer", this.xidBuyer);
      return JsonUtil.toJson(pmap);
   }

   public Class<PopPopCommentJsfServiceGetVenderCommentsForJosResponse> getResponseClass() {
      return PopPopCommentJsfServiceGetVenderCommentsForJosResponse.class;
   }
}
