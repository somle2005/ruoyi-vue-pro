package com.jd.open.api.sdk.request.ECLP;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ECLP.EclpPoExtQueryPoOrderResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class EclpPoExtQueryPoOrderRequest extends AbstractRequest implements JdRequest<EclpPoExtQueryPoOrderResponse> {
   private String poOrderNo;
   private Boolean queryItemFlag;
   private Boolean queryBoxFlag;
   private Boolean queryQcFlag;
   private Boolean queryPoRejectFlag;
   private Boolean queryBatAttrFlag;

   public void setPoOrderNo(String poOrderNo) {
      this.poOrderNo = poOrderNo;
   }

   public String getPoOrderNo() {
      return this.poOrderNo;
   }

   public void setQueryItemFlag(Boolean queryItemFlag) {
      this.queryItemFlag = queryItemFlag;
   }

   public Boolean getQueryItemFlag() {
      return this.queryItemFlag;
   }

   public void setQueryBoxFlag(Boolean queryBoxFlag) {
      this.queryBoxFlag = queryBoxFlag;
   }

   public Boolean getQueryBoxFlag() {
      return this.queryBoxFlag;
   }

   public void setQueryQcFlag(Boolean queryQcFlag) {
      this.queryQcFlag = queryQcFlag;
   }

   public Boolean getQueryQcFlag() {
      return this.queryQcFlag;
   }

   public void setQueryPoRejectFlag(Boolean queryPoRejectFlag) {
      this.queryPoRejectFlag = queryPoRejectFlag;
   }

   public Boolean getQueryPoRejectFlag() {
      return this.queryPoRejectFlag;
   }

   public void setQueryBatAttrFlag(Boolean queryBatAttrFlag) {
      this.queryBatAttrFlag = queryBatAttrFlag;
   }

   public Boolean getQueryBatAttrFlag() {
      return this.queryBatAttrFlag;
   }

   public String getApiMethod() {
      return "jingdong.eclp.po.ext.queryPoOrder";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("poOrderNo", this.poOrderNo);
      pmap.put("queryItemFlag", this.queryItemFlag);
      pmap.put("queryBoxFlag", this.queryBoxFlag);
      pmap.put("queryQcFlag", this.queryQcFlag);
      pmap.put("queryPoRejectFlag", this.queryPoRejectFlag);
      pmap.put("queryBatAttrFlag", this.queryBatAttrFlag);
      return JsonUtil.toJson(pmap);
   }

   public Class<EclpPoExtQueryPoOrderResponse> getResponseClass() {
      return EclpPoExtQueryPoOrderResponse.class;
   }
}
