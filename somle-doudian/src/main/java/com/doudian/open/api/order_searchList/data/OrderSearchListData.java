package com.doudian.open.api.order_searchList.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class OrderSearchListData {


	@SerializedName("page")
	@OpField(desc = "页数，从0开始", example = "1")
	private Long page;

	@SerializedName("total")
	@OpField(desc = "总订单数", example = "1000")
	private Long total;

	@SerializedName("size")
	@OpField(desc = "单页大小", example = "20")
	private Long size;

	@SerializedName("shop_order_list")
	@OpField(desc = "订单信息", example = "")
	private List<ShopOrderListItem> shopOrderList;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setPage(Long page){
		this.page = page;
	}

	
	public Long getPage(){
		return this.page;
	}

	
	public void setTotal(Long total){
		this.total = total;
	}

	
	public Long getTotal(){
		return this.total;
	}

	
	public void setSize(Long size){
		this.size = size;
	}

	
	public Long getSize(){
		return this.size;
	}

	
	public void setShopOrderList(List<ShopOrderListItem> shopOrderList){
		this.shopOrderList = shopOrderList;
	}

	
	public List<ShopOrderListItem> getShopOrderList(){
		return this.shopOrderList;
	}

}