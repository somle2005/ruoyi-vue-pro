package com.doudian.open.api.address_provinceList.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class DataItem {


	@SerializedName("province_id")
	@OpField(desc = "", example = "")
	private Long provinceId;

	@SerializedName("province")
	@OpField(desc = "", example = "")
	private String province;

	@SerializedName("father_id")
	@OpField(desc = "", example = "")
	private Long fatherId;


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

	
	public void setFatherId(Long fatherId){
		this.fatherId = fatherId;
	}

	
	public Long getFatherId(){
		return this.fatherId;
	}

}