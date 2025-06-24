package com.jd.open.api.sdk.request.hudong;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.hudong.PopMarketingGatewaySkuFileurlUploadResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class PopMarketingGatewaySkuFileurlUploadRequest extends AbstractRequest implements JdRequest<PopMarketingGatewaySkuFileurlUploadResponse> {
   private String finishTime;
   private String refActId;
   private String skuOperateType;
   private String mktActRefereeNo;
   private String mktActBaseNo;
   private String skuIds;

   public void setFinishTime(String finishTime) {
      this.finishTime = finishTime;
   }

   public String getFinishTime() {
      return this.finishTime;
   }

   public void setRefActId(String refActId) {
      this.refActId = refActId;
   }

   public String getRefActId() {
      return this.refActId;
   }

   public void setSkuOperateType(String skuOperateType) {
      this.skuOperateType = skuOperateType;
   }

   public String getSkuOperateType() {
      return this.skuOperateType;
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

   public String getApiMethod() {
      return "jingdong.pop.marketing.gateway.sku.fileurl.upload";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("finishTime", this.finishTime);
      pmap.put("refActId", this.refActId);
      pmap.put("skuOperateType", this.skuOperateType);
      pmap.put("mktActRefereeNo", this.mktActRefereeNo);
      pmap.put("mktActBaseNo", this.mktActBaseNo);
      pmap.put("skuIds", this.skuIds);
      return JsonUtil.toJson(pmap);
   }

   public Class<PopMarketingGatewaySkuFileurlUploadResponse> getResponseClass() {
      return PopMarketingGatewaySkuFileurlUploadResponse.class;
   }
}
