package com.doudian.open.api.product_addV2.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class Cargo {


	@SerializedName("source_type")
	@OpField(required = false , desc = "货品类型，跨境的货品类型传3", example= "1")
	private Long sourceType;

	@SerializedName("cargo_id")
	@OpField(required = false , desc = "货品id", example= "1123")
	private String cargoId;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setSourceType(Long sourceType){
		this.sourceType = sourceType;
	}

	
	public Long getSourceType(){
		return this.sourceType;
	}

	
	public void setCargoId(String cargoId){
		this.cargoId = cargoId;
	}

	
	public String getCargoId(){
		return this.cargoId;
	}

}