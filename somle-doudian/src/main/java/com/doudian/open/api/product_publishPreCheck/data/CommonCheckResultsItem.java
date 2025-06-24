package com.doudian.open.api.product_publishPreCheck.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class CommonCheckResultsItem {


	@SerializedName("check_type")
	@OpField(desc = "校验类型", example = "shop_publish_product_access")
	private String checkType;

	@SerializedName("check_result_code")
	@OpField(desc = "校验结果code，0：通过，其他：拦截", example = "0")
	private Integer checkResultCode;

	@SerializedName("check_result_msg")
	@OpField(desc = "文案提示", example = "success")
	private String checkResultMsg;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setCheckType(String checkType){
		this.checkType = checkType;
	}

	
	public String getCheckType(){
		return this.checkType;
	}

	
	public void setCheckResultCode(Integer checkResultCode){
		this.checkResultCode = checkResultCode;
	}

	
	public Integer getCheckResultCode(){
		return this.checkResultCode;
	}

	
	public void setCheckResultMsg(String checkResultMsg){
		this.checkResultMsg = checkResultMsg;
	}

	
	public String getCheckResultMsg(){
		return this.checkResultMsg;
	}

}