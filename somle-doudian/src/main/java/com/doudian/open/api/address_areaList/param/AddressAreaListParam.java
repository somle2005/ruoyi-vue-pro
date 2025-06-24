package com.doudian.open.api.address_areaList.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class AddressAreaListParam {


	@SerializedName("city_id")
	@OpField(required = true , desc = "", example= "")
	private Long cityId;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setCityId(Long cityId){
		this.cityId = cityId;
	}

	
	public Long getCityId(){
		return this.cityId;
	}

}