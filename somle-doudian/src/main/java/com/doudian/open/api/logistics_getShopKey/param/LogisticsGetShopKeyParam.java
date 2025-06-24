package com.doudian.open.api.logistics_getShopKey.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class LogisticsGetShopKeyParam {


	@SerializedName("cipher_text")
	@OpField(required = false , desc = "打印密文", example= "1")
	private String cipherText;

	@SerializedName("deviceInfo")
	@OpField(required = false , desc = "设备信息", example= "1")
	private String deviceInfo;

	@SerializedName("store_id")
	@OpField(required = false , desc = "门店id", example= "1")
	private Long storeId;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setCipherText(String cipherText){
		this.cipherText = cipherText;
	}

	
	public String getCipherText(){
		return this.cipherText;
	}

	
	public void setDeviceInfo(String deviceInfo){
		this.deviceInfo = deviceInfo;
	}

	
	public String getDeviceInfo(){
		return this.deviceInfo;
	}

	
	public void setStoreId(Long storeId){
		this.storeId = storeId;
	}

	
	public Long getStoreId(){
		return this.storeId;
	}

}