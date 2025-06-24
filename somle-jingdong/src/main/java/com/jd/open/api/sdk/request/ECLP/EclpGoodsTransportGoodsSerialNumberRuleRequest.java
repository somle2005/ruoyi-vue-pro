package com.jd.open.api.sdk.request.ECLP;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ECLP.EclpGoodsTransportGoodsSerialNumberRuleResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class EclpGoodsTransportGoodsSerialNumberRuleRequest extends AbstractRequest implements JdRequest<EclpGoodsTransportGoodsSerialNumberRuleResponse> {
   private String deptNo;
   private String goodsNo;
   private Long serialNumberLength;
   private String serialNumberLeftvalue;
   private Long serialNumberLeftLength;
   private Long serialNumberSuffixLength;
   private String suffixValue;
   private int type;
   private Integer ruleIndex;
   private Integer ruleIndexEnd;
   private String ruleIndexValue;
   private Byte manageType;
   private String sellerSnRuleNo;
   private Byte serialRuleType;

   public void setDeptNo(String deptNo) {
      this.deptNo = deptNo;
   }

   public String getDeptNo() {
      return this.deptNo;
   }

   public void setGoodsNo(String goodsNo) {
      this.goodsNo = goodsNo;
   }

   public String getGoodsNo() {
      return this.goodsNo;
   }

   public void setSerialNumberLength(Long serialNumberLength) {
      this.serialNumberLength = serialNumberLength;
   }

   public Long getSerialNumberLength() {
      return this.serialNumberLength;
   }

   public void setSerialNumberLeftvalue(String serialNumberLeftvalue) {
      this.serialNumberLeftvalue = serialNumberLeftvalue;
   }

   public String getSerialNumberLeftvalue() {
      return this.serialNumberLeftvalue;
   }

   public void setSerialNumberLeftLength(Long serialNumberLeftLength) {
      this.serialNumberLeftLength = serialNumberLeftLength;
   }

   public Long getSerialNumberLeftLength() {
      return this.serialNumberLeftLength;
   }

   public void setSerialNumberSuffixLength(Long serialNumberSuffixLength) {
      this.serialNumberSuffixLength = serialNumberSuffixLength;
   }

   public Long getSerialNumberSuffixLength() {
      return this.serialNumberSuffixLength;
   }

   public void setSuffixValue(String suffixValue) {
      this.suffixValue = suffixValue;
   }

   public String getSuffixValue() {
      return this.suffixValue;
   }

   public void setType(int type) {
      this.type = type;
   }

   public int getType() {
      return this.type;
   }

   public void setRuleIndex(Integer ruleIndex) {
      this.ruleIndex = ruleIndex;
   }

   public Integer getRuleIndex() {
      return this.ruleIndex;
   }

   public void setRuleIndexEnd(Integer ruleIndexEnd) {
      this.ruleIndexEnd = ruleIndexEnd;
   }

   public Integer getRuleIndexEnd() {
      return this.ruleIndexEnd;
   }

   public void setRuleIndexValue(String ruleIndexValue) {
      this.ruleIndexValue = ruleIndexValue;
   }

   public String getRuleIndexValue() {
      return this.ruleIndexValue;
   }

   public void setManageType(Byte manageType) {
      this.manageType = manageType;
   }

   public Byte getManageType() {
      return this.manageType;
   }

   public void setSellerSnRuleNo(String sellerSnRuleNo) {
      this.sellerSnRuleNo = sellerSnRuleNo;
   }

   public String getSellerSnRuleNo() {
      return this.sellerSnRuleNo;
   }

   public void setSerialRuleType(Byte serialRuleType) {
      this.serialRuleType = serialRuleType;
   }

   public Byte getSerialRuleType() {
      return this.serialRuleType;
   }

   public String getApiMethod() {
      return "jingdong.eclp.goods.transportGoodsSerialNumberRule";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("deptNo", this.deptNo);
      pmap.put("goodsNo", this.goodsNo);
      pmap.put("serialNumberLength", this.serialNumberLength);
      pmap.put("serialNumberLeftvalue", this.serialNumberLeftvalue);
      pmap.put("serialNumberLeftLength", this.serialNumberLeftLength);
      pmap.put("serialNumberSuffixLength", this.serialNumberSuffixLength);
      pmap.put("suffixValue", this.suffixValue);
      pmap.put("type", this.type);
      pmap.put("ruleIndex", this.ruleIndex);
      pmap.put("ruleIndexEnd", this.ruleIndexEnd);
      pmap.put("ruleIndexValue", this.ruleIndexValue);
      pmap.put("manageType", this.manageType);
      pmap.put("sellerSnRuleNo", this.sellerSnRuleNo);
      pmap.put("serialRuleType", this.serialRuleType);
      return JsonUtil.toJson(pmap);
   }

   public Class<EclpGoodsTransportGoodsSerialNumberRuleResponse> getResponseClass() {
      return EclpGoodsTransportGoodsSerialNumberRuleResponse.class;
   }
}
