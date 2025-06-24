package com.jd.open.api.sdk.domain.ware.JosDraftWriteService.request.commitDraft;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class JosSaleAttr implements Serializable {
   private String attrValueAlias;
   private String attrId;
   private String attrValue;
   private Integer attrValueSeqNo;

   @JsonProperty("attrValueAlias")
   public void setAttrValueAlias(String attrValueAlias) {
      this.attrValueAlias = attrValueAlias;
   }

   @JsonProperty("attrValueAlias")
   public String getAttrValueAlias() {
      return this.attrValueAlias;
   }

   @JsonProperty("attrId")
   public void setAttrId(String attrId) {
      this.attrId = attrId;
   }

   @JsonProperty("attrId")
   public String getAttrId() {
      return this.attrId;
   }

   @JsonProperty("attrValue")
   public void setAttrValue(String attrValue) {
      this.attrValue = attrValue;
   }

   @JsonProperty("attrValue")
   public String getAttrValue() {
      return this.attrValue;
   }

   @JsonProperty("attrValueSeqNo")
   public void setAttrValueSeqNo(Integer attrValueSeqNo) {
      this.attrValueSeqNo = attrValueSeqNo;
   }

   @JsonProperty("attrValueSeqNo")
   public Integer getAttrValueSeqNo() {
      return this.attrValueSeqNo;
   }
}
