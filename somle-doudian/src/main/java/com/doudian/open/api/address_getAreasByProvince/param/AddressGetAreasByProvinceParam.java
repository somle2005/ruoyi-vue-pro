package com.doudian.open.api.address_getAreasByProvince.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class AddressGetAreasByProvinceParam {


	@SerializedName("province_id")
	@OpField(required = true , desc = "省ID", example= "41")
	private Long provinceId;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setProvinceId(Long provinceId){
		this.provinceId = provinceId;
	}

	
	public Long getProvinceId(){
		return this.provinceId;
	}

}