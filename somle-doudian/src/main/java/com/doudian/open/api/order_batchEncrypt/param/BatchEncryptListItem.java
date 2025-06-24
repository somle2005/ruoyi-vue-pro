package com.doudian.open.api.order_batchEncrypt.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class BatchEncryptListItem {


	@SerializedName("plain_text")
	@OpField(required = true , desc = "明文", example= "13117428564")
	private String plainText;

	@SerializedName("auth_id")
	@OpField(required = true , desc = "业务标识，value为抖音订单号；若是三方订单，可用三方订单号作为标识或自定义标识", example= "123")
	private String authId;

	@SerializedName("is_support_index")
	@OpField(required = true , desc = "是否支持密文索引", example= "true")
	private Boolean isSupportIndex;

	@SerializedName("sensitive_type")
	@OpField(required = true , desc = "加密类型；1地址加密 2姓名加密 3电话加密", example= "3")
	private Integer sensitiveType;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setPlainText(String plainText){
		this.plainText = plainText;
	}

	
	public String getPlainText(){
		return this.plainText;
	}

	
	public void setAuthId(String authId){
		this.authId = authId;
	}

	
	public String getAuthId(){
		return this.authId;
	}

	
	public void setIsSupportIndex(Boolean isSupportIndex){
		this.isSupportIndex = isSupportIndex;
	}

	
	public Boolean getIsSupportIndex(){
		return this.isSupportIndex;
	}

	
	public void setSensitiveType(Integer sensitiveType){
		this.sensitiveType = sensitiveType;
	}

	
	public Integer getSensitiveType(){
		return this.sensitiveType;
	}

}