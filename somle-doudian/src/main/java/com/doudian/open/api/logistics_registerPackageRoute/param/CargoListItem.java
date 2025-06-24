package com.doudian.open.api.logistics_registerPackageRoute.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class CargoListItem {


	@SerializedName("name")
	@OpField(required = false , desc = "名称", example= "好物")
	private String name;

	@SerializedName("quantity")
	@OpField(required = false , desc = "质量", example= "1")
	private Integer quantity;

	@SerializedName("volume")
	@OpField(required = false , desc = "体积", example= "1")
	private Integer volume;

	@SerializedName("total_weight")
	@OpField(required = true , desc = "总重", example= "1")
	private Integer totalWeight;

	@SerializedName("total_net_weight")
	@OpField(required = true , desc = "净重", example= "1")
	private Integer totalNetWeight;

	@SerializedName("unit")
	@OpField(required = false , desc = "单位", example= "1")
	private String unit;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setName(String name){
		this.name = name;
	}

	
	public String getName(){
		return this.name;
	}

	
	public void setQuantity(Integer quantity){
		this.quantity = quantity;
	}

	
	public Integer getQuantity(){
		return this.quantity;
	}

	
	public void setVolume(Integer volume){
		this.volume = volume;
	}

	
	public Integer getVolume(){
		return this.volume;
	}

	
	public void setTotalWeight(Integer totalWeight){
		this.totalWeight = totalWeight;
	}

	
	public Integer getTotalWeight(){
		return this.totalWeight;
	}

	
	public void setTotalNetWeight(Integer totalNetWeight){
		this.totalNetWeight = totalNetWeight;
	}

	
	public Integer getTotalNetWeight(){
		return this.totalNetWeight;
	}

	
	public void setUnit(String unit){
		this.unit = unit;
	}

	
	public String getUnit(){
		return this.unit;
	}

}