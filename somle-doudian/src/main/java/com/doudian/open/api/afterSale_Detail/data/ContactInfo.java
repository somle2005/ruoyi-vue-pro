package com.doudian.open.api.afterSale_Detail.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class ContactInfo {


	@SerializedName("addr")
	@OpField(desc = "联系地址", example = "")
	private Addr addr;

	@SerializedName("name")
	@OpField(desc = "姓名", example = "-")
	private String name;

	@SerializedName("tel")
	@OpField(desc = "电话", example = "-")
	private String tel;

	@SerializedName("encrypt_tel")
	@OpField(desc = "电话", example = "-")
	private String encryptTel;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setAddr(Addr addr){
		this.addr = addr;
	}

	
	public Addr getAddr(){
		return this.addr;
	}

	
	public void setName(String name){
		this.name = name;
	}

	
	public String getName(){
		return this.name;
	}

	
	public void setTel(String tel){
		this.tel = tel;
	}

	
	public String getTel(){
		return this.tel;
	}

	
	public void setEncryptTel(String encryptTel){
		this.encryptTel = encryptTel;
	}

	
	public String getEncryptTel(){
		return this.encryptTel;
	}

}