package com.jd.open.api.sdk.request.promotion;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.promotion.PromotionSearchResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class PromotionSearchRequest extends AbstractRequest implements JdRequest<PromotionSearchResponse> {
   private String evtId;
   private String timeBegin_start;
   private String timeBegin_end;
   private String timeEnd_start;
   private String timeEnd_end;
   private String wareId;
   private String levelMember;
   private String evtType;
   private String evtStatus;
   private String checkStatus;
   private String page;
   private String pageSize;
   private String skuId;

   public PromotionSearchRequest() {
      this.levelMember = LevelMember.UNLIMIT.getKey();
      this.evtType = EvtType.ALL.getKey();
      this.evtStatus = EvtStatus.ALL.getKey();
      this.checkStatus = CheckStatus.UNLIMIT.getKey();
   }

   public String getApiMethod() {
      return "360buy.promotion.search";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, String> map = new TreeMap();
      map.put("time_begin_start", this.timeBegin_start);
      map.put("time_begin_end", this.timeBegin_end);
      map.put("time_end_start", this.timeEnd_start);
      map.put("time_end_end", this.timeEnd_end);
      map.put("ware_id", this.wareId);
      map.put("level_member", this.levelMember);
      map.put("evt_type", this.evtType);
      map.put("evt_status", this.evtStatus);
      map.put("check_status", this.checkStatus);
      map.put("page", this.page);
      map.put("page_size", this.pageSize);
      map.put("evt_id", this.evtId);
      map.put("sku_id", this.skuId);
      return JsonUtil.toJson(map);
   }

   public Class<PromotionSearchResponse> getResponseClass() {
      return PromotionSearchResponse.class;
   }

   public String getEvtId() {
      return this.evtId;
   }

   public void setEvtId(String evtId) {
      this.evtId = evtId;
   }

   public String getTimeBegin_start() {
      return this.timeBegin_start;
   }

   public void setTimeBegin_start(String timeBegin_start) {
      this.timeBegin_start = timeBegin_start;
   }

   public String getTimeBegin_end() {
      return this.timeBegin_end;
   }

   public void setTimeBegin_end(String timeBegin_end) {
      this.timeBegin_end = timeBegin_end;
   }

   public String getTimeEnd_start() {
      return this.timeEnd_start;
   }

   public void setTimeEnd_start(String timeEnd_start) {
      this.timeEnd_start = timeEnd_start;
   }

   public String getTimeEnd_end() {
      return this.timeEnd_end;
   }

   public void setTimeEnd_end(String timeEnd_end) {
      this.timeEnd_end = timeEnd_end;
   }

   public String getWareId() {
      return this.wareId;
   }

   public void setWareId(String wareId) {
      this.wareId = wareId;
   }

   public String getLevelMember() {
      return this.levelMember;
   }

   public void setLevelMember(String levelMember) {
      this.levelMember = levelMember;
   }

   public String getEvtType() {
      return this.evtType;
   }

   public void setEvtType(String evtType) {
      this.evtType = evtType;
   }

   public String getEvtStatus() {
      return this.evtStatus;
   }

   public void setEvtStatus(String evtStatus) {
      this.evtStatus = evtStatus;
   }

   public String getCheckStatus() {
      return this.checkStatus;
   }

   public void setCheckStatus(String checkStatus) {
      this.checkStatus = checkStatus;
   }

   public String getPage() {
      return this.page;
   }

   public void setPage(String page) {
      this.page = page;
   }

   public String getPageSize() {
      return this.pageSize;
   }

   public void setPageSize(String pageSize) {
      this.pageSize = pageSize;
   }

   public String getSkuId() {
      return this.skuId;
   }

   public void setSkuId(String skuId) {
      this.skuId = skuId;
   }

   public static enum LevelMember {
      UNLIMIT("UNLIMIT"),
      IRON_MEDEL_MEMBER("IRON_MEDEL_MEMBER"),
      COPPER_MEDEL_MEMBER("COPPER_MEDEL_MEMBER"),
      SILVER_MEDEL_MEMBER("SILVER_MEDEL_MEMBER"),
      GOLD_MEDEL_MEMBER("GOLD_MEDEL_MEMBER"),
      DIAMONDS_MEDEL_MEMBER("DIAMONDS_MEDEL_MEMBER"),
      DOUBLE_DIAMOND_MEMBER("DOUBLE_DIAMOND_MEMBER");

      private String key;

      private LevelMember(String key) {
         this.key = key;
      }

      public String getKey() {
         return this.key;
      }

      public void setKey(String key) {
         this.key = key;
      }
   }

   public static enum EvtType {
      ALL("ALL"),
      BUY_SEND_PROMOTION("BUY_SEND_PROMOTION"),
      SUIT_PROMOTION("SUIT_PROMOTION"),
      GIFT_PROMOTION("GIFT_PROMOTION");

      private String key;

      private EvtType(String key) {
         this.key = key;
      }

      public String getKey() {
         return this.key;
      }

      public void setKey(String key) {
         this.key = key;
      }
   }

   public static enum EvtStatus {
      ALL("ALL"),
      NOT_START("NOT_START"),
      IN_PROGREE("IN_PROGREE"),
      SUSPENSION("SUSPENSION"),
      FORCED_TERMINATION("FORCED_TERMINATION"),
      FINISH("FINISH");

      private String key;

      private EvtStatus(String key) {
         this.key = key;
      }

      public String getKey() {
         return this.key;
      }

      public void setKey(String key) {
         this.key = key;
      }
   }

   public static enum CheckStatus {
      UNLIMIT("UNLIMIT"),
      NOT_CHECK("NOT_CHECK"),
      CHECK_PASS("CHECK_PASS"),
      REJECT("REJECT");

      private String key;

      private CheckStatus(String key) {
         this.key = key;
      }

      public String getKey() {
         return this.key;
      }

      public void setKey(String key) {
         this.key = key;
      }
   }
}
