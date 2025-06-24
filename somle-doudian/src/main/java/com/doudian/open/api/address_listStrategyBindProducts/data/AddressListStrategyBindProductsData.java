package com.doudian.open.api.address_listStrategyBindProducts.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class AddressListStrategyBindProductsData {


	@SerializedName("total")
	@OpField(desc = "绑定商品总数", example = "100")
	private Long total;

	@SerializedName("page")
	@OpField(desc = "当前页码;", example = "1")
	private Long page;

	@SerializedName("page_size")
	@OpField(desc = "每页数量;", example = "20")
	private Long pageSize;

	@SerializedName("product_list")
	@OpField(desc = "绑定商品列表;", example = "")
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

	
	public void setPage(Long page){
		this.page = page;
	}

	
	public Long getPage(){
		return this.page;
	}

	
	public void setPageSize(Long pageSize){
		this.pageSize = pageSize;
	}

	
	public Long getPageSize(){
		return this.pageSize;
	}

	
	public void setProductList(List<ProductListItem> productList){
		this.productList = productList;
	}

	
	public List<ProductListItem> getProductList(){
		return this.productList;
	}

}