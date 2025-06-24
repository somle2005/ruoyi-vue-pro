package com.jd.open.api.sdk.request.fangchan;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.fangchan.ErsFangSynHouseResourceImgResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class ErsFangSynHouseResourceImgRequest extends AbstractRequest implements JdRequest<ErsFangSynHouseResourceImgResponse> {
   private Long channelId;
   private String imgUrl;
   private Short imgType;
   private Integer cityCode;
   private Long sourceId;
   private Long pSourceId;

   public void setChannelId(Long channelId) {
      this.channelId = channelId;
   }

   public Long getChannelId() {
      return this.channelId;
   }

   public void setImgUrl(String imgUrl) {
      this.imgUrl = imgUrl;
   }

   public String getImgUrl() {
      return this.imgUrl;
   }

   public void setImgType(Short imgType) {
      this.imgType = imgType;
   }

   public Short getImgType() {
      return this.imgType;
   }

   public void setCityCode(Integer cityCode) {
      this.cityCode = cityCode;
   }

   public Integer getCityCode() {
      return this.cityCode;
   }

   public void setSourceId(Long sourceId) {
      this.sourceId = sourceId;
   }

   public Long getSourceId() {
      return this.sourceId;
   }

   public void setPSourceId(Long pSourceId) {
      this.pSourceId = pSourceId;
   }

   public Long getPSourceId() {
      return this.pSourceId;
   }

   public String getApiMethod() {
      return "jingdong.ers.fang.synHouseResourceImg";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("channelId", this.channelId);
      pmap.put("imgUrl", this.imgUrl);
      pmap.put("imgType", this.imgType);
      pmap.put("cityCode", this.cityCode);
      pmap.put("sourceId", this.sourceId);
      pmap.put("pSourceId", this.pSourceId);
      return JsonUtil.toJson(pmap);
   }

   public Class<ErsFangSynHouseResourceImgResponse> getResponseClass() {
      return ErsFangSynHouseResourceImgResponse.class;
   }
}
