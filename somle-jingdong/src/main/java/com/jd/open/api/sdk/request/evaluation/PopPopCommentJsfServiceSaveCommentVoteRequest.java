package com.jd.open.api.sdk.request.evaluation;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.evaluation.PopPopCommentJsfServiceSaveCommentVoteResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class PopPopCommentJsfServiceSaveCommentVoteRequest extends AbstractRequest implements JdRequest<PopPopCommentJsfServiceSaveCommentVoteResponse> {
   private String ware2Type;
   private Long orderId;
   private int beginRowNumber;
   private String nickName;
   private String ip;
   private Long nid;
   private Boolean isVenderReply;
   private String ware3Type;
   private int pageSize;
   private String sort;
   private String skuids;
   private String wareName;
   private String content;
   private int score;
   private String pin;
   private int endRowNumber;
   private String ware1Type;
   private String guid;
   private String beginTime;
   private String endTime;
   private String orderIds;
   private int page;
   private int replyPageSize;
   private String openIdBuyer;
   private String xidBuyer;

   public void setWare2Type(String ware2Type) {
      this.ware2Type = ware2Type;
   }

   public String getWare2Type() {
      return this.ware2Type;
   }

   public void setOrderId(Long orderId) {
      this.orderId = orderId;
   }

   public Long getOrderId() {
      return this.orderId;
   }

   public void setBeginRowNumber(int beginRowNumber) {
      this.beginRowNumber = beginRowNumber;
   }

   public int getBeginRowNumber() {
      return this.beginRowNumber;
   }

   public void setNickName(String nickName) {
      this.nickName = nickName;
   }

   public String getNickName() {
      return this.nickName;
   }

   public void setIp(String ip) {
      this.ip = ip;
   }

   public String getIp() {
      return this.ip;
   }

   public void setNid(Long nid) {
      this.nid = nid;
   }

   public Long getNid() {
      return this.nid;
   }

   public void setIsVenderReply(Boolean isVenderReply) {
      this.isVenderReply = isVenderReply;
   }

   public Boolean getIsVenderReply() {
      return this.isVenderReply;
   }

   public void setWare3Type(String ware3Type) {
      this.ware3Type = ware3Type;
   }

   public String getWare3Type() {
      return this.ware3Type;
   }

   public void setPageSize(int pageSize) {
      this.pageSize = pageSize;
   }

   public int getPageSize() {
      return this.pageSize;
   }

   public void setSort(String sort) {
      this.sort = sort;
   }

   public String getSort() {
      return this.sort;
   }

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

   public void setContent(String content) {
      this.content = content;
   }

   public String getContent() {
      return this.content;
   }

   public void setScore(int score) {
      this.score = score;
   }

   public int getScore() {
      return this.score;
   }

   public void setPin(String pin) {
      this.pin = pin;
   }

   public String getPin() {
      return this.pin;
   }

   public void setEndRowNumber(int endRowNumber) {
      this.endRowNumber = endRowNumber;
   }

   public int getEndRowNumber() {
      return this.endRowNumber;
   }

   public void setWare1Type(String ware1Type) {
      this.ware1Type = ware1Type;
   }

   public String getWare1Type() {
      return this.ware1Type;
   }

   public void setGuid(String guid) {
      this.guid = guid;
   }

   public String getGuid() {
      return this.guid;
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

   public void setReplyPageSize(int replyPageSize) {
      this.replyPageSize = replyPageSize;
   }

   public int getReplyPageSize() {
      return this.replyPageSize;
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
      return "jingdong.pop.PopCommentJsfService.saveCommentVote";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("ware2Type", this.ware2Type);
      pmap.put("orderId", this.orderId);
      pmap.put("beginRowNumber", this.beginRowNumber);
      pmap.put("nickName", this.nickName);
      pmap.put("ip", this.ip);
      pmap.put("nid", this.nid);
      pmap.put("isVenderReply", this.isVenderReply);
      pmap.put("ware3Type", this.ware3Type);
      pmap.put("pageSize", this.pageSize);
      pmap.put("sort", this.sort);
      pmap.put("skuids", this.skuids);
      pmap.put("wareName", this.wareName);
      pmap.put("content", this.content);
      pmap.put("score", this.score);
      pmap.put("pin", this.pin);
      pmap.put("endRowNumber", this.endRowNumber);
      pmap.put("ware1Type", this.ware1Type);
      pmap.put("guid", this.guid);
      pmap.put("beginTime", this.beginTime);
      pmap.put("endTime", this.endTime);
      pmap.put("orderIds", this.orderIds);
      pmap.put("page", this.page);
      pmap.put("replyPageSize", this.replyPageSize);
      pmap.put("open_id_buyer", this.openIdBuyer);
      pmap.put("xid_buyer", this.xidBuyer);
      return JsonUtil.toJson(pmap);
   }

   public Class<PopPopCommentJsfServiceSaveCommentVoteResponse> getResponseClass() {
      return PopPopCommentJsfServiceSaveCommentVoteResponse.class;
   }
}
