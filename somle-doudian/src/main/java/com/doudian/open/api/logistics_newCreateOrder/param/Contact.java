package com.doudian.open.api.logistics_newCreateOrder.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class Contact {


	@SerializedName("name")
	@OpField(required = true , desc = "寄件人姓名", example= "张三")
	private String name;

	@SerializedName("phone")
	@OpField(required = false , desc = "寄件人固话（和mobile二选一）", example= "1")
	private String phone;

	@SerializedName("mobile")
	@OpField(required = false , desc = "寄件人移动电话（和phone二选一）", example= "18500000034")
	private String mobile;


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

}