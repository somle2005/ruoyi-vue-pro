package com.doudian.open.api.address_getProvince.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class AddressGetProvinceData {


	@SerializedName("data")
	@OpField(desc = "data", example = "")
	private List<DataItem> data;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setData(List<DataItem> data){
		this.data = data;
	}

	
	public List<DataItem> getData(){
		return this.data;
	}

}