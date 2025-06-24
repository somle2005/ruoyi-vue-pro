package com.doudian.open.api.address_listAftersaleStrategy.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class AddressListAftersaleStrategyParam {


	@SerializedName("order_by_field")
	@OpField(required = false , desc = "排序的字段;create_time-创建时间; update_time-更新时间;", example= "create_time")
	private String orderByField;

	@SerializedName("size")
	@OpField(required = false , desc = "每页的条数, 每页最大不超过20个。当前单个商家只允许创建1000条策略，page * size > 1000会被拦截。", example= "20")
	private Long size;

	@SerializedName("order_by")
	@OpField(required = false , desc = "升序还是排序；asc-升序；desc-降序;", example= "asc")
	private String orderBy;

	@SerializedName("page")
	@OpField(required = false , desc = "页码， 从1开始,表示第1页;", example= "1")
	private Long page;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setOrderByField(String orderByField){
		this.orderByField = orderByField;
	}

	
	public String getOrderByField(){
		return this.orderByField;
	}

	
	public void setSize(Long size){
		this.size = size;
	}

	
	public Long getSize(){
		return this.size;
	}

	
	public void setOrderBy(String orderBy){
		this.orderBy = orderBy;
	}

	
	public String getOrderBy(){
		return this.orderBy;
	}

	
	public void setPage(Long page){
		this.page = page;
	}

	
	public Long getPage(){
		return this.page;
	}

}