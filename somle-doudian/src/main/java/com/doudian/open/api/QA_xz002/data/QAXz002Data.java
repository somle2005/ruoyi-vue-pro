package com.doudian.open.api.QA_xz002.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class QAXz002Data {


	@SerializedName("custom_err")
	@OpField(desc = "6", example = "")
	private CustomErr customErr;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setCustomErr(CustomErr customErr){
		this.customErr = customErr;
	}

	
	public CustomErr getCustomErr(){
		return this.customErr;
	}

}