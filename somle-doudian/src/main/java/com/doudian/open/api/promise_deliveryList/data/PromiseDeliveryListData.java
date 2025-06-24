package com.doudian.open.api.promise_deliveryList.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class PromiseDeliveryListData {


	@SerializedName("products")
	@OpField(desc = "商品返回结构", example = "")
	private List<ProductsItem> products;

	@SerializedName("total")
	@OpField(desc = "总数", example = "100")
	private Long total;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setProducts(List<ProductsItem> products){
		this.products = products;
	}

	
	public List<ProductsItem> getProducts(){
		return this.products;
	}

	
	public void setTotal(Long total){
		this.total = total;
	}

	
	public Long getTotal(){
		return this.total;
	}

}