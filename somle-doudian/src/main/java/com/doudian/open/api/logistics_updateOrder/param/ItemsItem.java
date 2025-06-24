package com.doudian.open.api.logistics_updateOrder.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class ItemsItem {


	@SerializedName("item_name")
	@OpField(required = true , desc = "商品名称", example= "1")
	private String itemName;

	@SerializedName("item_specs")
	@OpField(required = false , desc = "商品规格", example= "1")
	private String itemSpecs;

	@SerializedName("item_count")
	@OpField(required = true , desc = "商品数量", example= "1")
	private Integer itemCount;

	@SerializedName("item_volume")
	@OpField(required = false , desc = "单件商品体积（cm3）", example= "1")
	private Integer itemVolume;

	@SerializedName("item_weight")
	@OpField(required = false , desc = "单件商品重量（g)", example= "1")
	private Integer itemWeight;

	@SerializedName("item_net_weight")
	@OpField(required = false , desc = "单件总净重量（g）", example= "1")
	private Integer itemNetWeight;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setItemName(String itemName){
		this.itemName = itemName;
	}

	
	public String getItemName(){
		return this.itemName;
	}

	
	public void setItemSpecs(String itemSpecs){
		this.itemSpecs = itemSpecs;
	}

	
	public String getItemSpecs(){
		return this.itemSpecs;
	}

	
	public void setItemCount(Integer itemCount){
		this.itemCount = itemCount;
	}

	
	public Integer getItemCount(){
		return this.itemCount;
	}

	
	public void setItemVolume(Integer itemVolume){
		this.itemVolume = itemVolume;
	}

	
	public Integer getItemVolume(){
		return this.itemVolume;
	}

	
	public void setItemWeight(Integer itemWeight){
		this.itemWeight = itemWeight;
	}

	
	public Integer getItemWeight(){
		return this.itemWeight;
	}

	
	public void setItemNetWeight(Integer itemNetWeight){
		this.itemNetWeight = itemNetWeight;
	}

	
	public Integer getItemNetWeight(){
		return this.itemNetWeight;
	}

}