package com.doudian.open.api.address_getProvince.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class DataItem {


	@SerializedName("province_id")
	@OpField(desc = "省份id", example = "41")
	private Long provinceId;

	@SerializedName("province")
	@OpField(desc = "省份", example = "河南省")
	private String province;


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

	
	public void setProvince(String province){
		this.province = province;
	}

	
	public String getProvince(){
		return this.province;
	}

}