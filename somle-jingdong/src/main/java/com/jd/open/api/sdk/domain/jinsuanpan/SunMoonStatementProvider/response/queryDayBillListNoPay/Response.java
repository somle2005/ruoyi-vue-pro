package com.jd.open.api.sdk.domain.jinsuanpan.SunMoonStatementProvider.response.queryDayBillListNoPay;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class Response implements Serializable {
   private String sourceId;
   private String charset;
   private boolean success;
   private String dataType;
   private String resultCode;
   private String checksum;
   private String message;
   private String version;
   private String data;

   @JsonProperty("sourceId")
   public void setSourceId(String sourceId) {
      this.sourceId = sourceId;
   }

   @JsonProperty("sourceId")
   public String getSourceId() {
      return this.sourceId;
   }

   @JsonProperty("charset")
   public void setCharset(String charset) {
      this.charset = charset;
   }

   @JsonProperty("charset")
   public String getCharset() {
      return this.charset;
   }

   @JsonProperty("success")
   public void setSuccess(boolean success) {
      this.success = success;
   }

   @JsonProperty("success")
   public boolean getSuccess() {
      return this.success;
   }

   @JsonProperty("dataType")
   public void setDataType(String dataType) {
      this.dataType = dataType;
   }

   @JsonProperty("dataType")
   public String getDataType() {
      return this.dataType;
   }

   @JsonProperty("resultCode")
   public void setResultCode(String resultCode) {
      this.resultCode = resultCode;
   }

   @JsonProperty("resultCode")
   public String getResultCode() {
      return this.resultCode;
   }

   @JsonProperty("checksum")
   public void setChecksum(String checksum) {
      this.checksum = checksum;
   }

   @JsonProperty("checksum")
   public String getChecksum() {
      return this.checksum;
   }

   @JsonProperty("message")
   public void setMessage(String message) {
      this.message = message;
   }

   @JsonProperty("message")
   public String getMessage() {
      return this.message;
   }

   @JsonProperty("version")
   public void setVersion(String version) {
      this.version = version;
   }

   @JsonProperty("version")
   public String getVersion() {
      return this.version;
   }

   @JsonProperty("data")
   public void setData(String data) {
      this.data = data;
   }

   @JsonProperty("data")
   public String getData() {
      return this.data;
   }
}
