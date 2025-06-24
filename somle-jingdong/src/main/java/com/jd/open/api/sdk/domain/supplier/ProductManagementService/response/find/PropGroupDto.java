package com.jd.open.api.sdk.domain.supplier.ProductManagementService.response.find;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class PropGroupDto implements Serializable {
   private Integer id;
   private Integer orderSort;
   private String name;
   private List<PropDto> props;

   @JsonProperty("id")
   public void setId(Integer id) {
      this.id = id;
   }

   @JsonProperty("id")
   public Integer getId() {
      return this.id;
   }

   @JsonProperty("order_sort")
   public void setOrderSort(Integer orderSort) {
      this.orderSort = orderSort;
   }

   @JsonProperty("order_sort")
   public Integer getOrderSort() {
      return this.orderSort;
   }

   @JsonProperty("name")
   public void setName(String name) {
      this.name = name;
   }

   @JsonProperty("name")
   public String getName() {
      return this.name;
   }

   @JsonProperty("props")
   public void setProps(List<PropDto> props) {
      this.props = props;
   }

   @JsonProperty("props")
   public List<PropDto> getProps() {
      return this.props;
   }
}
