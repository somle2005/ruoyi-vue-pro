package com.doudian.open.api.afterSale_operate.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class AfterSaleOperateParam {


	@SerializedName("type")
	@OpField(required = true , desc = "操作类型；枚举值说明文档：https://op.jinritemai.com/docs/question-docs/93/2752", example= "111")
	private Integer type;

	@SerializedName("items")
	@OpField(required = true , desc = "操作售后详情", example= "")
	private List<ItemsItem> items;

	@SerializedName("store_id")
	@OpField(required = false , desc = "门店ID；抖超小时达业务使用；", example= "门店ID")
	private Long storeId;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setType(Integer type){
		this.type = type;
	}

	
	public Integer getType(){
		return this.type;
	}

	
	public void setItems(List<ItemsItem> items){
		this.items = items;
	}

	
	public List<ItemsItem> getItems(){
		return this.items;
	}

	
	public void setStoreId(Long storeId){
		this.storeId = storeId;
	}

	
	public Long getStoreId(){
		return this.storeId;
	}

}