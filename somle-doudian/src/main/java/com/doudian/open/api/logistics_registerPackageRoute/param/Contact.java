package com.doudian.open.api.logistics_registerPackageRoute.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class Contact {


	@SerializedName("name")
	@OpField(required = true , desc = "姓名", example= "李四")
	private String name;

	@SerializedName("phone")
	@OpField(required = true , desc = "手机号", example= "12342242097")
	private String phone;

	@SerializedName("email")
	@OpField(required = false , desc = "邮箱", example= "12342242097@qq.com")
	private String email;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setName(String name){
		this.name = name;
	}

	
	public String getName(){
		return this.name;
	}

	
	public void setPhone(String phone){
		this.phone = phone;
	}

	
	public String getPhone(){
		return this.phone;
	}

	
	public void setEmail(String email){
		this.email = email;
	}

	
	public String getEmail(){
		return this.email;
	}

}