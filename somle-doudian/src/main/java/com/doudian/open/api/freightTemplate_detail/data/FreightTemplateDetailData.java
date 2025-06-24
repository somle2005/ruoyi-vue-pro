package com.doudian.open.api.freightTemplate_detail.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class FreightTemplateDetailData {


	@SerializedName("data")
	@OpField(desc = "模板详情", example = "")
	private Data data;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setData(Data data){
		this.data = data;
	}

	
	public Data getData(){
		return this.data;
	}

}