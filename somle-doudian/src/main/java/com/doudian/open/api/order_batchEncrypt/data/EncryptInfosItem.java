package com.doudian.open.api.order_batchEncrypt.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class EncryptInfosItem {


	@SerializedName("auth_id")
	@OpField(desc = "鉴权id", example = "42341234171232")
	private String authId;

	@SerializedName("cipher_text")
	@OpField(desc = "密文", example = "asdfasdfsasfdasdf")
	private String cipherText;

	@SerializedName("decrypt_text")
	@OpField(desc = "明文", example = "13117428564")
	private String decryptText;

	@SerializedName("err_no")
	@OpField(desc = "错误码", example = "0")
	private Long errNo;

	@SerializedName("err_msg")
	@OpField(desc = "错误描述", example = "-")
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