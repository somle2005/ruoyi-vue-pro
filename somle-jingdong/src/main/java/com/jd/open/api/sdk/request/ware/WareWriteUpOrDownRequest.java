package com.jd.open.api.sdk.request.ware;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ware.WareWriteUpOrDownResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class WareWriteUpOrDownRequest extends AbstractRequest implements JdRequest<WareWriteUpOrDownResponse> {
   private String note;
   private Long wareId;
   private Integer opType;

   public void setNote(String note) {
      this.note = note;
   }

   public String getNote() {
      return this.note;
   }

   public void setWareId(Long wareId) {
      this.wareId = wareId;
   }

   public Long getWareId() {
      return this.wareId;
   }

   public void setOpType(Integer opType) {
      this.opType = opType;
   }

   public Integer getOpType() {
      return this.opType;
   }

   public String getApiMethod() {
      return "jingdong.ware.write.upOrDown";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("note", this.note);
      pmap.put("wareId", this.wareId);
      pmap.put("opType", this.opType);
      return JsonUtil.toJson(pmap);
   }

   public Class<WareWriteUpOrDownResponse> getResponseClass() {
      return WareWriteUpOrDownResponse.class;
   }
}
