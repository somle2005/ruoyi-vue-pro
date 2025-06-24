package com.doudian.open.api.order_batchSensitive.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class DecryptInfosItem {


	@SerializedName("auth_id")
	@OpField(desc = "业务标识，value为抖音订单号", example = "123")
	private String authId;

	@SerializedName("cipher_text")
	@OpField(desc = "密文", example = "密文，具体内容参考[数据安全加密对接文档](https://op.jinritemai.com/docs/guide-docs/56/589)")
	private String cipherText;

	@SerializedName("decrypt_text")
	@OpField(desc = "13*******64", example = "明文")
	private String decryptText;

	@SerializedName("err_no")
	@OpField(desc = "0", example = "错误码")
	private Long errNo;

	@SerializedName("err_msg")
	@OpField(desc = "", example = "错误描述")
	private String errMsg;


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

	
	public void setDecryptText(String decryptText){
		this.decryptText = decryptText;
	}

	
	public String getDecryptText(){
		return this.decryptText;
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