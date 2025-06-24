package com.doudian.open.api.order_PackageProcessSuccess.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class OrderPackageProcessSuccessData {


	@SerializedName("ret_message")
	@OpField(desc = "返回信息", example = "成功")
	private String retMessage;

	@SerializedName("ret_status")
	@OpField(desc = "返回状态,依据状态判定是否需要重试", example = "Success")
	private String retStatus;

	@SerializedName("ret_code")
	@OpField(desc = "返回码", example = "0")
	private String retCode;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setRetMessage(String retMessage){
		this.retMessage = retMessage;
	}

	
	public String getRetMessage(){
		return this.retMessage;
	}

	
	public void setRetStatus(String retStatus){
		this.retStatus = retStatus;
	}

	
	public String getRetStatus(){
		return this.retStatus;
	}

	
	public void setRetCode(String retCode){
		this.retCode = retCode;
	}

	
	public String getRetCode(){
		return this.retCode;
	}

}