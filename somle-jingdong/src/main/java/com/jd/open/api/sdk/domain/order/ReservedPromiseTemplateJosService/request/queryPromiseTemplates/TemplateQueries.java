package com.jd.open.api.sdk.domain.order.ReservedPromiseTemplateJosService.request.queryPromiseTemplates;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class TemplateQueries implements Serializable {
   private List<TemplateQueryItem> queries;

   @JsonProperty("queries")
   public void setQueries(List<TemplateQueryItem> queries) {
      this.queries = queries;
   }

   @JsonProperty("queries")
   public List<TemplateQueryItem> getQueries() {
      return this.queries;
   }
}
