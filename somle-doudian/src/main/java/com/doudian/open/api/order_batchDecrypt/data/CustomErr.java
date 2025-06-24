package com.doudian.open.api.order_batchDecrypt.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class CustomErr {


	@SerializedName("err_code")
	@OpField(desc = "错误码", example = "8000")
	private Long errCode;

	@SerializedName("err_msg")
	@OpField(desc = "错误内容描述", example = "解密失败：批量解密存在部分失败")
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