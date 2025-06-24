package com.doudian.open.api.product_detail.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class CargoInfo {


	@SerializedName("source_type")
	@OpField(desc = "货品类型，1-分销货品，2-云仓自流转货品，6-云仓非自流转货品", example = "1")
	private Long sourceType;

	@SerializedName("cargo_id")
	@OpField(desc = "货品id", example = "777777777777777")
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