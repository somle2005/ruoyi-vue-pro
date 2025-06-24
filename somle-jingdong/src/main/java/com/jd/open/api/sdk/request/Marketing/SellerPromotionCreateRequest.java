package com.jd.open.api.sdk.request.Marketing;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.Marketing.SellerPromotionCreateResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class SellerPromotionCreateRequest extends AbstractRequest implements JdRequest<SellerPromotionCreateResponse> {
   private String ip;
   private String port;
   private String requestId;
   private String name;
   private String beginTime;
   private String endTime;
   private Integer bound;
   private Integer member;
   private String slogan;
   private String comment;
   private Integer platform;
   private Integer favorMode;
   private Integer shopMember;
   private Integer qqMember;
   private Integer plusMember;
   private Integer samMember;
   private Long tokenId;
   private String promoChannel;
   private Boolean memberLevelOnly;
   private Integer tokenUseNum;
   private boolean allowOthersOperate;
   private boolean allowOthersCheck;
   private boolean allowOtherUserOperate;
   private boolean allowOtherUserCheck;
   private boolean needManualCheck;
   private Long previewsId;
   private String previewsContent;
   private String previewsTime;
   private Long skuIconId;
   private String skuIconShowTime;
   private Integer promoAreaType;
   private String promoArea;
   private boolean showTokenPrice;
   private String skuId;
   private String bindType;
   private String promoPrice;
   private String num;
   private String wareId;
   private String skuName;
   private String jdPrice;
   private String itemNum;
   private String type;
   private String propsNum;
   private String usedWay;
   private String couponValidDays;
   private Integer freqBound;
   private Integer perMaxNum;
   private Integer perMinNum;
   private String pin;
   private String useBeginTime;
   private String useEndTime;
   private String openIdBuyer;
   private String xidBuyer;

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

   public void setName(String name) {
      this.name = name;
   }

   public String getName() {
      return this.name;
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

   public void setPlatform(Integer platform) {
      this.platform = platform;
   }

   public Integer getPlatform() {
      return this.platform;
   }

   public void setFavorMode(Integer favorMode) {
      this.favorMode = favorMode;
   }

   public Integer getFavorMode() {
      return this.favorMode;
   }

   public void setShopMember(Integer shopMember) {
      this.shopMember = shopMember;
   }

   public Integer getShopMember() {
      return this.shopMember;
   }

   public void setQqMember(Integer qqMember) {
      this.qqMember = qqMember;
   }

   public Integer getQqMember() {
      return this.qqMember;
   }

   public void setPlusMember(Integer plusMember) {
      this.plusMember = plusMember;
   }

   public Integer getPlusMember() {
      return this.plusMember;
   }

   public void setSamMember(Integer samMember) {
      this.samMember = samMember;
   }

   public Integer getSamMember() {
      return this.samMember;
   }

   public void setTokenId(Long tokenId) {
      this.tokenId = tokenId;
   }

   public Long getTokenId() {
      return this.tokenId;
   }

   public void setPromoChannel(String promoChannel) {
      this.promoChannel = promoChannel;
   }

   public String getPromoChannel() {
      return this.promoChannel;
   }

   public void setMemberLevelOnly(Boolean memberLevelOnly) {
      this.memberLevelOnly = memberLevelOnly;
   }

   public Boolean getMemberLevelOnly() {
      return this.memberLevelOnly;
   }

   public void setTokenUseNum(Integer tokenUseNum) {
      this.tokenUseNum = tokenUseNum;
   }

   public Integer getTokenUseNum() {
      return this.tokenUseNum;
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

   public void setPreviewsId(Long previewsId) {
      this.previewsId = previewsId;
   }

   public Long getPreviewsId() {
      return this.previewsId;
   }

   public void setPreviewsContent(String previewsContent) {
      this.previewsContent = previewsContent;
   }

   public String getPreviewsContent() {
      return this.previewsContent;
   }

   public void setPreviewsTime(String previewsTime) {
      this.previewsTime = previewsTime;
   }

   public String getPreviewsTime() {
      return this.previewsTime;
   }

   public void setSkuIconId(Long skuIconId) {
      this.skuIconId = skuIconId;
   }

   public Long getSkuIconId() {
      return this.skuIconId;
   }

   public void setSkuIconShowTime(String skuIconShowTime) {
      this.skuIconShowTime = skuIconShowTime;
   }

   public String getSkuIconShowTime() {
      return this.skuIconShowTime;
   }

   public void setPromoAreaType(Integer promoAreaType) {
      this.promoAreaType = promoAreaType;
   }

   public Integer getPromoAreaType() {
      return this.promoAreaType;
   }

   public void setPromoArea(String promoArea) {
      this.promoArea = promoArea;
   }

   public String getPromoArea() {
      return this.promoArea;
   }

   public void setShowTokenPrice(boolean showTokenPrice) {
      this.showTokenPrice = showTokenPrice;
   }

   public boolean getShowTokenPrice() {
      return this.showTokenPrice;
   }

   public void setSkuId(String skuId) {
      this.skuId = skuId;
   }

   public String getSkuId() {
      return this.skuId;
   }

   public void setBindType(String bindType) {
      this.bindType = bindType;
   }

   public String getBindType() {
      return this.bindType;
   }

   public void setPromoPrice(String promoPrice) {
      this.promoPrice = promoPrice;
   }

   public String getPromoPrice() {
      return this.promoPrice;
   }

   public void setNum(String num) {
      this.num = num;
   }

   public String getNum() {
      return this.num;
   }

   public void setWareId(String wareId) {
      this.wareId = wareId;
   }

   public String getWareId() {
      return this.wareId;
   }

   public void setSkuName(String skuName) {
      this.skuName = skuName;
   }

   public String getSkuName() {
      return this.skuName;
   }

   public void setJdPrice(String jdPrice) {
      this.jdPrice = jdPrice;
   }

   public String getJdPrice() {
      return this.jdPrice;
   }

   public void setItemNum(String itemNum) {
      this.itemNum = itemNum;
   }

   public String getItemNum() {
      return this.itemNum;
   }

   public void setType(String type) {
      this.type = type;
   }

   public String getType() {
      return this.type;
   }

   public void setPropsNum(String propsNum) {
      this.propsNum = propsNum;
   }

   public String getPropsNum() {
      return this.propsNum;
   }

   public void setUsedWay(String usedWay) {
      this.usedWay = usedWay;
   }

   public String getUsedWay() {
      return this.usedWay;
   }

   public void setCouponValidDays(String couponValidDays) {
      this.couponValidDays = couponValidDays;
   }

   public String getCouponValidDays() {
      return this.couponValidDays;
   }

   public void setFreqBound(Integer freqBound) {
      this.freqBound = freqBound;
   }

   public Integer getFreqBound() {
      return this.freqBound;
   }

   public void setPerMaxNum(Integer perMaxNum) {
      this.perMaxNum = perMaxNum;
   }

   public Integer getPerMaxNum() {
      return this.perMaxNum;
   }

   public void setPerMinNum(Integer perMinNum) {
      this.perMinNum = perMinNum;
   }

   public Integer getPerMinNum() {
      return this.perMinNum;
   }

   public void setPin(String pin) {
      this.pin = pin;
   }

   public String getPin() {
      return this.pin;
   }

   public void setUseBeginTime(String useBeginTime) {
      this.useBeginTime = useBeginTime;
   }

   public String getUseBeginTime() {
      return this.useBeginTime;
   }

   public void setUseEndTime(String useEndTime) {
      this.useEndTime = useEndTime;
   }

   public String getUseEndTime() {
      return this.useEndTime;
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
      return "jingdong.seller.promotion.create";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("ip", this.ip);
      pmap.put("port", this.port);
      pmap.put("request_id", this.requestId);
      pmap.put("name", this.name);
      pmap.put("beginTime", this.beginTime);
      pmap.put("endTime", this.endTime);
      pmap.put("bound", this.bound);
      pmap.put("member", this.member);
      pmap.put("slogan", this.slogan);
      pmap.put("comment", this.comment);
      pmap.put("platform", this.platform);
      pmap.put("favorMode", this.favorMode);
      pmap.put("shopMember", this.shopMember);
      pmap.put("qqMember", this.qqMember);
      pmap.put("plusMember", this.plusMember);
      pmap.put("samMember", this.samMember);
      pmap.put("tokenId", this.tokenId);
      pmap.put("promoChannel", this.promoChannel);
      pmap.put("memberLevelOnly", this.memberLevelOnly);
      pmap.put("tokenUseNum", this.tokenUseNum);
      pmap.put("allowOthersOperate", this.allowOthersOperate);
      pmap.put("allowOthersCheck", this.allowOthersCheck);
      pmap.put("allowOtherUserOperate", this.allowOtherUserOperate);
      pmap.put("allowOtherUserCheck", this.allowOtherUserCheck);
      pmap.put("needManualCheck", this.needManualCheck);
      pmap.put("previewsId", this.previewsId);
      pmap.put("previewsContent", this.previewsContent);
      pmap.put("previewsTime", this.previewsTime);
      pmap.put("skuIconId", this.skuIconId);
      pmap.put("skuIconShowTime", this.skuIconShowTime);
      pmap.put("promoAreaType", this.promoAreaType);
      pmap.put("promoArea", this.promoArea);
      pmap.put("showTokenPrice", this.showTokenPrice);
      pmap.put("skuId", this.skuId);
      pmap.put("bindType", this.bindType);
      pmap.put("promoPrice", this.promoPrice);
      pmap.put("num", this.num);
      pmap.put("wareId", this.wareId);
      pmap.put("skuName", this.skuName);
      pmap.put("jdPrice", this.jdPrice);
      pmap.put("itemNum", this.itemNum);
      pmap.put("type", this.type);
      pmap.put("propsNum", this.propsNum);
      pmap.put("usedWay", this.usedWay);
      pmap.put("couponValidDays", this.couponValidDays);
      pmap.put("freqBound", this.freqBound);
      pmap.put("perMaxNum", this.perMaxNum);
      pmap.put("perMinNum", this.perMinNum);
      pmap.put("pin", this.pin);
      pmap.put("useBeginTime", this.useBeginTime);
      pmap.put("useEndTime", this.useEndTime);
      pmap.put("open_id_buyer", this.openIdBuyer);
      pmap.put("xid_buyer", this.xidBuyer);
      return JsonUtil.toJson(pmap);
   }

   public Class<SellerPromotionCreateResponse> getResponseClass() {
      return SellerPromotionCreateResponse.class;
   }
}
