package com.doudian.open.spi.topup_notify.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class AccountListItem {


	@SerializedName("account_val")
	@OpField(required = false , desc = "充值账号", example= "12345678900")
	private String accountVal;

	@SerializedName("encrypt_account_val")
	@OpField(required = false , desc = "充值账号", example= "12345678900")
	private String encryptAccountVal;

	@SerializedName("account_type")
	@OpField(required = false , desc = "账号类型", example= "MOBILE")
	private String accountType;

	@SerializedName("account_name")
	@OpField(required = false , desc = "账号名称", example= "绑定手机号")
	private String accountName;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setAccountVal(String accountVal){
		this.accountVal = accountVal;
	}

	
	public String getAccountVal(){
		return this.accountVal;
	}

	
	public void setEncryptAccountVal(String encryptAccountVal){
		this.encryptAccountVal = encryptAccountVal;
	}

	
	public String getEncryptAccountVal(){
		return this.encryptAccountVal;
	}

	
	public void setAccountType(String accountType){
		this.accountType = accountType;
	}

	
	public String getAccountType(){
		return this.accountType;
	}

	
	public void setAccountName(String accountName){
		this.accountName = accountName;
	}

	
	public String getAccountName(){
		return this.accountName;
	}

}