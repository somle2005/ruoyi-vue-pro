package com.jd.open.api.sdk.request.youE;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.youE.XiaochengxuSubMsgAndInfoResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class XiaochengxuSubMsgAndInfoRequest extends AbstractRequest implements JdRequest<XiaochengxuSubMsgAndInfoResponse> {
   private String userPin;
   private String modelId;
   private Integer pushType;
   private Integer onOff;

   public void setUserPin(String userPin) {
      this.userPin = userPin;
   }

   public String getUserPin() {
      return this.userPin;
   }

   public void setModelId(String modelId) {
      this.modelId = modelId;
   }

   public String getModelId() {
      return this.modelId;
   }

   public void setPushType(Integer pushType) {
      this.pushType = pushType;
   }

   public Integer getPushType() {
      return this.pushType;
   }

   public void setOnOff(Integer onOff) {
      this.onOff = onOff;
   }

   public Integer getOnOff() {
      return this.onOff;
   }

   public String getApiMethod() {
      return "jingdong.xiaochengxu.subMsgAndInfo";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("userPin", this.userPin);
      pmap.put("modelId", this.modelId);
      pmap.put("pushType", this.pushType);
      pmap.put("onOff", this.onOff);
      return JsonUtil.toJson(pmap);
   }

   public Class<XiaochengxuSubMsgAndInfoResponse> getResponseClass() {
      return XiaochengxuSubMsgAndInfoResponse.class;
   }
}
