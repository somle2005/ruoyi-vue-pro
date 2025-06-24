package com.doudian.open.api.security_batchReportOrderSecurityEvent.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class CustomError {


	@SerializedName("ErrNo")
	@OpField(desc = "错误码", example = "错误码")
	private Long errNo;

	@SerializedName("ErrMsg")
	@OpField(desc = "错误原因", example = "错误原因")
	private String errMsg;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setErrNo(Long errNo){
		this.errNo = errNo;
	}

	
	public Long getErrNo(){
		return this.errNo;
	}

	
	public void setErrMsg(String errMsg){
		this.errMsg = errMsg;
	}

	
	public String getErrMsg(){
		return this.errMsg;
	}

}