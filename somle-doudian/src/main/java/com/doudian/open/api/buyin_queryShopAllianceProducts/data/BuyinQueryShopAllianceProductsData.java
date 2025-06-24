package com.doudian.open.api.buyin_queryShopAllianceProducts.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class BuyinQueryShopAllianceProductsData {


	@SerializedName("total")
	@OpField(desc = "总数，最大10000", example = "200")
	private Long total;

	@SerializedName("product_list")
	@OpField(desc = "商品列表", example = "")
	private List<ProductListItem> productList;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setTotal(Long total){
		this.total = total;
	}

	
	public Long getTotal(){
		return this.total;
	}

	
	public void setProductList(List<ProductListItem> productList){
		this.productList = productList;
	}

	
	public List<ProductListItem> getProductList(){
		return this.productList;
	}

}