package com.doudian.open.api.address_listAftersaleStrategy.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class CompanyPhone {


	@SerializedName("phone_num")
	@OpField(desc = "联系方式号码;", example = "40088881111234")
	private String phoneNum;

	@SerializedName("num")
	@OpField(desc = "拼接之后的联系方式;", example = "40088881111234")
	private String num;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setPhoneNum(String phoneNum){
		this.phoneNum = phoneNum;
	}

	
	public String getPhoneNum(){
		return this.phoneNum;
	}

	
	public void setNum(String num){
		this.num = num;
	}

	
	public String getNum(){
		return this.num;
	}

}