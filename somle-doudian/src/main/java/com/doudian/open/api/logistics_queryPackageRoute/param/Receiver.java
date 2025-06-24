package com.doudian.open.api.logistics_queryPackageRoute.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class Receiver {


	@SerializedName("name")
	@OpField(required = true , desc = "收件人姓名", example= "李四")
	private String name;

	@SerializedName("phone")
	@OpField(required = false , desc = "手机号", example= "12342242097")
	private String phone;

	@SerializedName("mobile")
	@OpField(required = false , desc = "手机号", example= "12342242097")
	private String mobile;

	@SerializedName("email")
	@OpField(required = false , desc = "邮箱", example= "12342242097@qq.com")
	private String email;

	@SerializedName("virtual_mobile")
	@OpField(required = false , desc = "虚拟手机号", example= "12342242097")
	private String virtualMobile;


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

	
	public void setMobile(String mobile){
		this.mobile = mobile;
	}

	
	public String getMobile(){
		return this.mobile;
	}

	
	public void setEmail(String email){
		this.email = email;
	}

	
	public String getEmail(){
		return this.email;
	}

	
	public void setVirtualMobile(String virtualMobile){
		this.virtualMobile = virtualMobile;
	}

	
	public String getVirtualMobile(){
		return this.virtualMobile;
	}

}