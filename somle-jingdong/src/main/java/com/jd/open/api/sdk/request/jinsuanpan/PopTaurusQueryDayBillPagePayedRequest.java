package com.jd.open.api.sdk.request.jinsuanpan;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.jinsuanpan.PopTaurusQueryDayBillPagePayedResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class PopTaurusQueryDayBillPagePayedRequest extends AbstractRequest implements JdRequest<PopTaurusQueryDayBillPagePayedResponse> {
   private String sourceId;
   private String charset;
   private String dataType;
   private String secAccountNo;
   private String businessId;
   private Integer pageSize;
   private Integer payState;
   private String version;
   private Integer pageNum;
   private String setDateEnd;
   private String accDateEnd;
   private String setDateBegin;
   private String checksum;
   private String accDateBegin;

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

   public void setSecAccountNo(String secAccountNo) {
      this.secAccountNo = secAccountNo;
   }

   public String getSecAccountNo() {
      return this.secAccountNo;
   }

   public void setBusinessId(String businessId) {
      this.businessId = businessId;
   }

   public String getBusinessId() {
      return this.businessId;
   }

   public void setPageSize(Integer pageSize) {
      this.pageSize = pageSize;
   }

   public Integer getPageSize() {
      return this.pageSize;
   }

   public void setPayState(Integer payState) {
      this.payState = payState;
   }

   public Integer getPayState() {
      return this.payState;
   }

   public void setVersion(String version) {
      this.version = version;
   }

   public String getVersion() {
      return this.version;
   }

   public void setPageNum(Integer pageNum) {
      this.pageNum = pageNum;
   }

   public Integer getPageNum() {
      return this.pageNum;
   }

   public void setSetDateEnd(String setDateEnd) {
      this.setDateEnd = setDateEnd;
   }

   public String getSetDateEnd() {
      return this.setDateEnd;
   }

   public void setAccDateEnd(String accDateEnd) {
      this.accDateEnd = accDateEnd;
   }

   public String getAccDateEnd() {
      return this.accDateEnd;
   }

   public void setSetDateBegin(String setDateBegin) {
      this.setDateBegin = setDateBegin;
   }

   public String getSetDateBegin() {
      return this.setDateBegin;
   }

   public void setChecksum(String checksum) {
      this.checksum = checksum;
   }

   public String getChecksum() {
      return this.checksum;
   }

   public void setAccDateBegin(String accDateBegin) {
      this.accDateBegin = accDateBegin;
   }

   public String getAccDateBegin() {
      return this.accDateBegin;
   }

   public String getApiMethod() {
      return "jingdong.pop.taurus.queryDayBillPagePayed";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("sourceId", this.sourceId);
      pmap.put("charset", this.charset);
      pmap.put("dataType", this.dataType);
      pmap.put("secAccountNo", this.secAccountNo);
      pmap.put("businessId", this.businessId);
      pmap.put("pageSize", this.pageSize);
      pmap.put("payState", this.payState);
      pmap.put("version", this.version);
      pmap.put("pageNum", this.pageNum);
      pmap.put("setDateEnd", this.setDateEnd);
      pmap.put("accDateEnd", this.accDateEnd);
      pmap.put("setDateBegin", this.setDateBegin);
      pmap.put("checksum", this.checksum);
      pmap.put("accDateBegin", this.accDateBegin);
      return JsonUtil.toJson(pmap);
   }

   public Class<PopTaurusQueryDayBillPagePayedResponse> getResponseClass() {
      return PopTaurusQueryDayBillPagePayedResponse.class;
   }
}
