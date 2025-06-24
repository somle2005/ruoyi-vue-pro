package com.doudian.open.api.order_batchSensitive.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class CipherInfosItem {


	@SerializedName("auth_id")
	@OpField(required = true , desc = "业务标识，value为抖音订单号", example= "123")
	private String authId;

	@SerializedName("cipher_text")
	@OpField(required = true , desc = "密文", example= "待脱敏密文，具体内容参考[数据安全加密对接文档](https://op.jinritemai.com/docs/guide-docs/56/589)")
	private String cipherText;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setAuthId(String authId){
		this.authId = authId;
	}

	
	public String getAuthId(){
		return this.authId;
	}

	
	public void setCipherText(String cipherText){
		this.cipherText = cipherText;
	}

	
	public String getCipherText(){
		return this.cipherText;
	}

}