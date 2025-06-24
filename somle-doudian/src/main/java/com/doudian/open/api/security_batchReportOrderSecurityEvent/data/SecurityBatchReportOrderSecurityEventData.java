package com.doudian.open.api.security_batchReportOrderSecurityEvent.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class SecurityBatchReportOrderSecurityEventData {


	@SerializedName("CustomError")
	@OpField(desc = "错误信息", example = "")
	private CustomError customError;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setCustomError(CustomError customError){
		this.customError = customError;
	}

	
	public CustomError getCustomError(){
		return this.customError;
	}

}