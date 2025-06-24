package com.jd.open.api.sdk.request.hudong;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.hudong.PopMarketingGatewayActivitySkuAppendResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class PopMarketingGatewayActivitySkuAppendRequest extends AbstractRequest implements JdRequest<PopMarketingGatewayActivitySkuAppendResponse> {
   private String refActId;
   private String skuFilePath;
   private String mktActRefereeNo;
   private String mktActBaseNo;
   private String skuIds;
   private String skuUploadType;

   public void setRefActId(String refActId) {
      this.refActId = refActId;
   }

   public String getRefActId() {
      return this.refActId;
   }

   public void setSkuFilePath(String skuFilePath) {
      this.skuFilePath = skuFilePath;
   }

   public String getSkuFilePath() {
      return this.skuFilePath;
   }

   public void setMktActRefereeNo(String mktActRefereeNo) {
      this.mktActRefereeNo = mktActRefereeNo;
   }

   public String getMktActRefereeNo() {
      return this.mktActRefereeNo;
   }

   public void setMktActBaseNo(String mktActBaseNo) {
      this.mktActBaseNo = mktActBaseNo;
   }

   public String getMktActBaseNo() {
      return this.mktActBaseNo;
   }

   public void setSkuIds(String skuIds) {
      this.skuIds = skuIds;
   }

   public String getSkuIds() {
      return this.skuIds;
   }

   public void setSkuUploadType(String skuUploadType) {
      this.skuUploadType = skuUploadType;
   }

   public String getSkuUploadType() {
      return this.skuUploadType;
   }

   public String getApiMethod() {
      return "jingdong.pop.marketing.gateway.activity.sku.append";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("refActId", this.refActId);
      pmap.put("skuFilePath", this.skuFilePath);
      pmap.put("mktActRefereeNo", this.mktActRefereeNo);
      pmap.put("mktActBaseNo", this.mktActBaseNo);
      pmap.put("skuIds", this.skuIds);
      pmap.put("skuUploadType", this.skuUploadType);
      return JsonUtil.toJson(pmap);
   }

   public Class<PopMarketingGatewayActivitySkuAppendResponse> getResponseClass() {
      return PopMarketingGatewayActivitySkuAppendResponse.class;
   }
}
