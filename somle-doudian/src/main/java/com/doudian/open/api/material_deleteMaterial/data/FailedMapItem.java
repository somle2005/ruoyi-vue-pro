package com.doudian.open.api.material_deleteMaterial.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class FailedMapItem {


	@SerializedName("code")
	@OpField(desc = "失败code", example = "20001")
	private Integer code;

	@SerializedName("msg")
	@OpField(desc = "失败原因", example = "素材id不存在")
	private String msg;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setCode(Integer code){
		this.code = code;
	}

	
	public Integer getCode(){
		return this.code;
	}

	
	public void setMsg(String msg){
		this.msg = msg;
	}

	
	public String getMsg(){
		return this.msg;
	}

}