package com.jd.open.api.sdk.request.ware;

import com.jd.open.api.sdk.domain.Prop;
import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ware.WareWriteUpdateWareSaleAttrvalueAliasResponse;
import java.io.IOException;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class WareWriteUpdateWareSaleAttrvalueAliasRequest extends AbstractRequest implements JdRequest<WareWriteUpdateWareSaleAttrvalueAliasResponse> {
   private Long wareId;
   private Set<Prop> props;

   public void setWareId(Long wareId) {
      this.wareId = wareId;
   }

   public Long getWareId() {
      return this.wareId;
   }

   public Set<Prop> getProps() {
      return this.props;
   }

   public void setProps(Set<Prop> props) {
      this.props = props;
   }

   public String getApiMethod() {
      return "jingdong.ware.write.updateWareSaleAttrvalueAlias";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("wareId", this.wareId);
      pmap.put("props", this.props);
      return JsonUtil.toJson(pmap);
   }

   public Class<WareWriteUpdateWareSaleAttrvalueAliasResponse> getResponseClass() {
      return WareWriteUpdateWareSaleAttrvalueAliasResponse.class;
   }
}
