package com.doudian.open.api.logistics_newCreateOrder.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class NetInfo {


	@SerializedName("category")
	@OpField(required = false , desc = "物流服务商类型，直营/加盟", example= "加盟")
	private String category;

	@SerializedName("net_code")
	@OpField(required = false , desc = "网点编码,当category为加盟类型时，该字段必填；为直营类型时可不传；对总模式该字段均为非必填", example= "XS222")
	private String netCode;

	@SerializedName("monthly_account")
	@OpField(required = false , desc = "总对总账号 月结账号", example= "324322432")
	private String monthlyAccount;

	@SerializedName("secret_key")
	@OpField(required = false , desc = "总对总密码", example= "ddfdfdf")
	private String secretKey;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setCategory(String category){
		this.category = category;
	}

	
	public String getCategory(){
		return this.category;
	}

	
	public void setNetCode(String netCode){
		this.netCode = netCode;
	}

	
	public String getNetCode(){
		return this.netCode;
	}

	
	public void setMonthlyAccount(String monthlyAccount){
		this.monthlyAccount = monthlyAccount;
	}

	
	public String getMonthlyAccount(){
		return this.monthlyAccount;
	}

	
	public void setSecretKey(String secretKey){
		this.secretKey = secretKey;
	}

	
	public String getSecretKey(){
		return this.secretKey;
	}

}