package com.jd.open.api.sdk.request.mall;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.mall.SubsidyImgExportService.request.sync.ImgUploadInfoJosSyncParam;
import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.mall.PopSubsidyOrderImgUrlSyncResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class PopSubsidyOrderImgUrlSyncRequest extends AbstractRequest implements JdRequest<PopSubsidyOrderImgUrlSyncResponse> {
   private ImgUploadInfoJosSyncParam imgUploadInfoJosSyncParam;

   public String getApiMethod() {
      return "jingdong.pop.subsidy.order.img.url.sync";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("imgUploadInfoJosSyncParam", this.imgUploadInfoJosSyncParam);
      return JsonUtil.toJson(pmap);
   }

   public Class<PopSubsidyOrderImgUrlSyncResponse> getResponseClass() {
      return PopSubsidyOrderImgUrlSyncResponse.class;
   }

   @JsonProperty("imgUploadInfoJosSyncParam")
   public void setImgUploadInfoJosSyncParam(ImgUploadInfoJosSyncParam imgUploadInfoJosSyncParam) {
      this.imgUploadInfoJosSyncParam = imgUploadInfoJosSyncParam;
   }

   @JsonProperty("imgUploadInfoJosSyncParam")
   public ImgUploadInfoJosSyncParam getImgUploadInfoJosSyncParam() {
      return this.imgUploadInfoJosSyncParam;
   }
}
