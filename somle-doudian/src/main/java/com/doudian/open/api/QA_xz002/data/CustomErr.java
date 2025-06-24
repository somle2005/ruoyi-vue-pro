package com.doudian.open.api.QA_xz002.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class CustomErr {


	@SerializedName("err_code")
	@OpField(desc = "6", example = "6")
	private Long errCode;

	@SerializedName("encrypt_err_code")
	@OpField(desc = "6", example = "6")
	private Long encryptErrCode;

	@SerializedName("err_msg")
	@OpField(desc = "6", example = "6")
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

	
	public void setEncryptErrCode(Long encryptErrCode){
		this.encryptErrCode = encryptErrCode;
	}

	
	public Long getEncryptErrCode(){
		return this.encryptErrCode;
	}

	
	public void setErrMsg(String errMsg){
		this.errMsg = errMsg;
	}

	
	public String getErrMsg(){
		return this.errMsg;
	}

}