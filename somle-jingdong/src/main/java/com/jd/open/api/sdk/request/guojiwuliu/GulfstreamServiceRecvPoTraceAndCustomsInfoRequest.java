package com.jd.open.api.sdk.request.guojiwuliu;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.guojiwuliu.GulfstreamServiceRecvPoTraceAndCustomsInfoResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class GulfstreamServiceRecvPoTraceAndCustomsInfoRequest extends AbstractRequest implements JdRequest<GulfstreamServiceRecvPoTraceAndCustomsInfoResponse> {
   private String poNo;
   private String eventCode;
   private String eventDesc;
   private String eventTime;
   private String customsInfo;
   private String ladInfo;
   private String goodsInfo;

   public void setPoNo(String poNo) {
      this.poNo = poNo;
   }

   public String getPoNo() {
      return this.poNo;
   }

   public void setEventCode(String eventCode) {
      this.eventCode = eventCode;
   }

   public String getEventCode() {
      return this.eventCode;
   }

   public void setEventDesc(String eventDesc) {
      this.eventDesc = eventDesc;
   }

   public String getEventDesc() {
      return this.eventDesc;
   }

   public void setEventTime(String eventTime) {
      this.eventTime = eventTime;
   }

   public String getEventTime() {
      return this.eventTime;
   }

   public void setCustomsInfo(String customsInfo) {
      this.customsInfo = customsInfo;
   }

   public String getCustomsInfo() {
      return this.customsInfo;
   }

   public void setLadInfo(String ladInfo) {
      this.ladInfo = ladInfo;
   }

   public String getLadInfo() {
      return this.ladInfo;
   }

   public void setGoodsInfo(String goodsInfo) {
      this.goodsInfo = goodsInfo;
   }

   public String getGoodsInfo() {
      return this.goodsInfo;
   }

   public String getApiMethod() {
      return "jingdong.gulfstream.service.recvPoTraceAndCustomsInfo";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("poNo", this.poNo);
      pmap.put("eventCode", this.eventCode);
      pmap.put("eventDesc", this.eventDesc);
      pmap.put("eventTime", this.eventTime);
      pmap.put("customsInfo", this.customsInfo);
      pmap.put("ladInfo", this.ladInfo);
      pmap.put("goodsInfo", this.goodsInfo);
      return JsonUtil.toJson(pmap);
   }

   public Class<GulfstreamServiceRecvPoTraceAndCustomsInfoResponse> getResponseClass() {
      return GulfstreamServiceRecvPoTraceAndCustomsInfoResponse.class;
   }
}
