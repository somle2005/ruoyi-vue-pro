package com.doudian.open.api.order_batchEncrypt.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class CustomErr {


	@SerializedName("err_code")
	@OpField(desc = "错误码", example = "0")
	private Long errCode;

	@SerializedName("err_msg")
	@OpField(desc = "错误描述", example = "-")
	private String errMsg;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setErrCode(Long errCode){
		this.errCode = errCode;
	}

	
	public Long getErrCode(){
		return this.errCode;
	}

	
	public void setErrMsg(String errMsg){
		this.errMsg = errMsg;
	}

	
	public String getErrMsg(){
		return this.errMsg;
	}

}