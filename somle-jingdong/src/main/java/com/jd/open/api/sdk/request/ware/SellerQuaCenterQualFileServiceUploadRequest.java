package com.jd.open.api.sdk.request.ware;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.ware.QualFileService.request.upload.CallerParam;
import com.jd.open.api.sdk.domain.ware.QualFileService.request.upload.FileParam;
import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ware.SellerQuaCenterQualFileServiceUploadResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class SellerQuaCenterQualFileServiceUploadRequest extends AbstractRequest implements JdRequest<SellerQuaCenterQualFileServiceUploadResponse> {
   private FileParam fileParam;
   private CallerParam callerParam;

   public String getApiMethod() {
      return "jingdong.seller.qua.center.QualFileService.upload";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("fileParam", this.fileParam);
      pmap.put("callerParam", this.callerParam);
      return JsonUtil.toJson(pmap);
   }

   public Class<SellerQuaCenterQualFileServiceUploadResponse> getResponseClass() {
      return SellerQuaCenterQualFileServiceUploadResponse.class;
   }

   @JsonProperty("fileParam")
   public void setFileParam(FileParam fileParam) {
      this.fileParam = fileParam;
   }

   @JsonProperty("fileParam")
   public FileParam getFileParam() {
      return this.fileParam;
   }

   @JsonProperty("callerParam")
   public void setCallerParam(CallerParam callerParam) {
      this.callerParam = callerParam;
   }

   @JsonProperty("callerParam")
   public CallerParam getCallerParam() {
      return this.callerParam;
   }
}
