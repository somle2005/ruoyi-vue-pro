package com.doudian.open.api.order_searchList.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class AccountInfoItem {


	@SerializedName("account_name")
	@OpField(desc = "账号名称", example = "测试")
	private String accountName;

	@SerializedName("account_type")
	@OpField(desc = "账号类型；枚举值：Mobile ：手机号;Email ：邮箱 ; IdCard ：身份证; Passport ：护照; BankCard ：银行卡; Number ：纯数学; NumberLetter ：数字字母混合;", example = "1")
	private String accountType;

	@SerializedName("account_id")
	@OpField(desc = "账号值", example = "15678909876")
	private String accountId;

	@SerializedName("encrypt_account_id")
	@OpField(desc = "账号值", example = "15678909876")
	private String encryptAccountId;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setAccountName(String accountName){
		this.accountName = accountName;
	}

	
	public String getAccountName(){
		return this.accountName;
	}

	
	public void setAccountType(String accountType){
		this.accountType = accountType;
	}

	
	public String getAccountType(){
		return this.accountType;
	}

	
	public void setAccountId(String accountId){
		this.accountId = accountId;
	}

	
	public String getAccountId(){
		return this.accountId;
	}

	
	public void setEncryptAccountId(String encryptAccountId){
		this.encryptAccountId = encryptAccountId;
	}

	
	public String getEncryptAccountId(){
		return this.encryptAccountId;
	}

}