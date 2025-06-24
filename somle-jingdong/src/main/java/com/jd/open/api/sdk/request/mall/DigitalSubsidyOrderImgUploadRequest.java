package com.jd.open.api.sdk.request.mall;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.mall.SubsidyImgExportService.request.upload.ImgUploadInfoSyncParam;
import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.mall.DigitalSubsidyOrderImgUploadResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class DigitalSubsidyOrderImgUploadRequest extends AbstractRequest implements JdRequest<DigitalSubsidyOrderImgUploadResponse> {
   private ImgUploadInfoSyncParam ImgUploadInfoSyncParam;

   public String getApiMethod() {
      return "jingdong.digital.subsidy.order.img.upload";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("ImgUploadInfoSyncParam", this.ImgUploadInfoSyncParam);
      return JsonUtil.toJson(pmap);
   }

   public Class<DigitalSubsidyOrderImgUploadResponse> getResponseClass() {
      return DigitalSubsidyOrderImgUploadResponse.class;
   }

   @JsonProperty("ImgUploadInfoSyncParam")
   public void setImgUploadInfoSyncParam(ImgUploadInfoSyncParam ImgUploadInfoSyncParam) {
      this.ImgUploadInfoSyncParam = ImgUploadInfoSyncParam;
   }

   @JsonProperty("ImgUploadInfoSyncParam")
   public ImgUploadInfoSyncParam getImgUploadInfoSyncParam() {
      return this.ImgUploadInfoSyncParam;
   }
}
