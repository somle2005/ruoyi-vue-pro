package com.doudian.open.api.order_BatchSearchIndex.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class CustomErr {


	@SerializedName("err_code")
	@OpField(desc = "被风控状态码", example = "200220")
	private Long errCode;

	@SerializedName("err_msg")
	@OpField(desc = "产生索引串被风控返回次信息", example = "索引串部分风控返回的错误信息")
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