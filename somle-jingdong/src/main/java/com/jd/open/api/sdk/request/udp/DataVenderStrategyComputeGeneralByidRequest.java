package com.jd.open.api.sdk.request.udp;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.udp.DataVenderStrategyComputeGeneralByidResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class DataVenderStrategyComputeGeneralByidRequest extends AbstractRequest implements JdRequest<DataVenderStrategyComputeGeneralByidResponse> {
   private String strategyId;
   private String strategyParam;
   private Byte pinType;
   private Integer strategyOperateType;

   public void setStrategyId(String strategyId) {
      this.strategyId = strategyId;
   }

   public String getStrategyId() {
      return this.strategyId;
   }

   public void setStrategyParam(String strategyParam) {
      this.strategyParam = strategyParam;
   }

   public String getStrategyParam() {
      return this.strategyParam;
   }

   public void setPinType(Byte pinType) {
      this.pinType = pinType;
   }

   public Byte getPinType() {
      return this.pinType;
   }

   public void setStrategyOperateType(Integer strategyOperateType) {
      this.strategyOperateType = strategyOperateType;
   }

   public Integer getStrategyOperateType() {
      return this.strategyOperateType;
   }

   public String getApiMethod() {
      return "jingdong.data.vender.strategy.compute.general.byid";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("strategy_id", this.strategyId);
      pmap.put("strategy_param", this.strategyParam);
      pmap.put("pin_type", this.pinType);
      pmap.put("strategy_operate_type", this.strategyOperateType);
      return JsonUtil.toJson(pmap);
   }

   public Class<DataVenderStrategyComputeGeneralByidResponse> getResponseClass() {
      return DataVenderStrategyComputeGeneralByidResponse.class;
   }
}
