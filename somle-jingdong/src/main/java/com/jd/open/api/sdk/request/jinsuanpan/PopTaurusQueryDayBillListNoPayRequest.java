package com.jd.open.api.sdk.request.jinsuanpan;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.jinsuanpan.PopTaurusQueryDayBillListNoPayResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class PopTaurusQueryDayBillListNoPayRequest extends AbstractRequest implements JdRequest<PopTaurusQueryDayBillListNoPayResponse> {
   private String sourceId;
   private String charset;
   private String dataType;
   private String businessId;
   private String checksum;
   private String version;
   private Integer payState;
   private String secAccountNo;

   public void setSourceId(String sourceId) {
      this.sourceId = sourceId;
   }

   public String getSourceId() {
      return this.sourceId;
   }

   public void setCharset(String charset) {
      this.charset = charset;
   }

   public String getCharset() {
      return this.charset;
   }

   public void setDataType(String dataType) {
      this.dataType = dataType;
   }

   public String getDataType() {
      return this.dataType;
   }

   public void setBusinessId(String businessId) {
      this.businessId = businessId;
   }

   public String getBusinessId() {
      return this.businessId;
   }

   public void setChecksum(String checksum) {
      this.checksum = checksum;
   }

   public String getChecksum() {
      return this.checksum;
   }

   public void setVersion(String version) {
      this.version = version;
   }

   public String getVersion() {
      return this.version;
   }

   public void setPayState(Integer payState) {
      this.payState = payState;
   }

   public Integer getPayState() {
      return this.payState;
   }

   public void setSecAccountNo(String secAccountNo) {
      this.secAccountNo = secAccountNo;
   }

   public String getSecAccountNo() {
      return this.secAccountNo;
   }

   public String getApiMethod() {
      return "jingdong.pop.taurus.queryDayBillListNoPay";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("sourceId", this.sourceId);
      pmap.put("charset", this.charset);
      pmap.put("dataType", this.dataType);
      pmap.put("businessId", this.businessId);
      pmap.put("checksum", this.checksum);
      pmap.put("version", this.version);
      pmap.put("payState", this.payState);
      pmap.put("secAccountNo", this.secAccountNo);
      return JsonUtil.toJson(pmap);
   }

   public Class<PopTaurusQueryDayBillListNoPayResponse> getResponseClass() {
      return PopTaurusQueryDayBillListNoPayResponse.class;
   }
}
