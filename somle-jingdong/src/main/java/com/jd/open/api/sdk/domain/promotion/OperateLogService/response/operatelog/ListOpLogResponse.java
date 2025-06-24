package com.jd.open.api.sdk.domain.promotion.OperateLogService.response.operatelog;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class ListOpLogResponse implements Serializable {
   private List<OperateLogDTO> operateLogList;
   private ResponseResult result;

   @JsonProperty("operateLogList")
   public void setOperateLogList(List<OperateLogDTO> operateLogList) {
      this.operateLogList = operateLogList;
   }

   @JsonProperty("operateLogList")
   public List<OperateLogDTO> getOperateLogList() {
      return this.operateLogList;
   }

   @JsonProperty("result")
   public void setResult(ResponseResult result) {
      this.result = result;
   }

   @JsonProperty("result")
   public ResponseResult getResult() {
      return this.result;
   }
}
