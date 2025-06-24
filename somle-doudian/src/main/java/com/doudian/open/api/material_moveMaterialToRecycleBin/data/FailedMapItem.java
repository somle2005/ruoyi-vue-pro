package com.doudian.open.api.material_moveMaterialToRecycleBin.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class FailedMapItem {


	@SerializedName("code")
	@OpField(desc = "错误码", example = "20001")
	private Integer code;

	@SerializedName("msg")
	@OpField(desc = "错误原因", example = "无效素材id")
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