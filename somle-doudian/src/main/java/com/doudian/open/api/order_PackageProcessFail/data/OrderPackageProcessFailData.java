package com.doudian.open.api.order_PackageProcessFail.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class OrderPackageProcessFailData {


	@SerializedName("ret_status")
	@OpField(desc = "返回状态", example = "Success")
	private String retStatus;

	@SerializedName("ret_code")
	@OpField(desc = "返回码", example = "0")
	private String retCode;

	@SerializedName("ret_message")
	@OpField(desc = "返回信息", example = "成功")
	private String retMessage;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
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

	
	public void setRetMessage(String retMessage){
		this.retMessage = retMessage;
	}

	
	public String getRetMessage(){
		return this.retMessage;
	}

}