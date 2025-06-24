package com.doudian.open.api.product_editV2.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class Cargo {


	@SerializedName("cargo_id")
	@OpField(required = false , desc = "货品id", example= "1")
	private String cargoId;

	@SerializedName("source_type")
	@OpField(required = false , desc = "货品类型", example= "1")
	private Long sourceType;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setCargoId(String cargoId){
		this.cargoId = cargoId;
	}

	
	public String getCargoId(){
		return this.cargoId;
	}

	
	public void setSourceType(Long sourceType){
		this.sourceType = sourceType;
	}

	
	public Long getSourceType(){
		return this.sourceType;
	}

}