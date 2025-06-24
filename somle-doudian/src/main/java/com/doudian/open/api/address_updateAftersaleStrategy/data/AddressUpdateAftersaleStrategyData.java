package com.doudian.open.api.address_updateAftersaleStrategy.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class AddressUpdateAftersaleStrategyData {


	@SerializedName("success_add_product_list")
	@OpField(desc = "成功添加的商品ID列表;", example = "[3709080842971250761]")
	private List<String> successAddProductList;

	@SerializedName("success_del_product_list")
	@OpField(desc = "成功删除的商品ID列表;", example = "[3709069364713095169]")
	private List<String> successDelProductList;

	@SerializedName("fail_add_product_list")
	@OpField(desc = "添加失败的商品ID列表;", example = "")
	private List<FailAddProductListItem> failAddProductList;

	@SerializedName("fail_del_product_list")
	@OpField(desc = "添加失败的商品ID列表;", example = "")
	private List<FailDelProductListItem> failDelProductList;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setSuccessAddProductList(List<String> successAddProductList){
		this.successAddProductList = successAddProductList;
	}

	
	public List<String> getSuccessAddProductList(){
		return this.successAddProductList;
	}

	
	public void setSuccessDelProductList(List<String> successDelProductList){
		this.successDelProductList = successDelProductList;
	}

	
	public List<String> getSuccessDelProductList(){
		return this.successDelProductList;
	}

	
	public void setFailAddProductList(List<FailAddProductListItem> failAddProductList){
		this.failAddProductList = failAddProductList;
	}

	
	public List<FailAddProductListItem> getFailAddProductList(){
		return this.failAddProductList;
	}

	
	public void setFailDelProductList(List<FailDelProductListItem> failDelProductList){
		this.failDelProductList = failDelProductList;
	}

	
	public List<FailDelProductListItem> getFailDelProductList(){
		return this.failDelProductList;
	}

}