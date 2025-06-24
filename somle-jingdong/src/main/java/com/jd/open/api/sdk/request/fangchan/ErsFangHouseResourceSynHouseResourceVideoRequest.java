package com.jd.open.api.sdk.request.fangchan;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.fangchan.ErsFangHouseResourceSynHouseResourceVideoResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class ErsFangHouseResourceSynHouseResourceVideoRequest extends AbstractRequest implements JdRequest<ErsFangHouseResourceSynHouseResourceVideoResponse> {
   private Long channelId;
   private Integer cityCode;
   private Long sourceId;
   private Long pSourceId;
   private String videoName;
   private String ip;
   private String videoTag;
   private String videoDesc;
   private Long fileSize;

   public void setChannelId(Long channelId) {
      this.channelId = channelId;
   }

   public Long getChannelId() {
      return this.channelId;
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

   public void setVideoName(String videoName) {
      this.videoName = videoName;
   }

   public String getVideoName() {
      return this.videoName;
   }

   public void setIp(String ip) {
      this.ip = ip;
   }

   public String getIp() {
      return this.ip;
   }

   public void setVideoTag(String videoTag) {
      this.videoTag = videoTag;
   }

   public String getVideoTag() {
      return this.videoTag;
   }

   public void setVideoDesc(String videoDesc) {
      this.videoDesc = videoDesc;
   }

   public String getVideoDesc() {
      return this.videoDesc;
   }

   public void setFileSize(Long fileSize) {
      this.fileSize = fileSize;
   }

   public Long getFileSize() {
      return this.fileSize;
   }

   public String getApiMethod() {
      return "jingdong.ers.fang.houseResource.synHouseResourceVideo";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("channelId", this.channelId);
      pmap.put("cityCode", this.cityCode);
      pmap.put("sourceId", this.sourceId);
      pmap.put("pSourceId", this.pSourceId);
      pmap.put("videoName", this.videoName);
      pmap.put("ip", this.ip);
      pmap.put("videoTag", this.videoTag);
      pmap.put("videoDesc", this.videoDesc);
      pmap.put("fileSize", this.fileSize);
      return JsonUtil.toJson(pmap);
   }

   public Class<ErsFangHouseResourceSynHouseResourceVideoResponse> getResponseClass() {
      return ErsFangHouseResourceSynHouseResourceVideoResponse.class;
   }
}
