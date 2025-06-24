package com.jd.open.api.sdk.domain.order.ReservedPromiseTemplateJosService.request.queryAvailablePickDays;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class AvailablePickDaysQueries implements Serializable {
   private List<AvailablePickDaysQuery> queries;

   @JsonProperty("queries")
   public void setQueries(List<AvailablePickDaysQuery> queries) {
      this.queries = queries;
   }

   @JsonProperty("queries")
   public List<AvailablePickDaysQuery> getQueries() {
      return this.queries;
   }
}
