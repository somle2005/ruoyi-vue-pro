package com.doudian.open.api.order_BatchSearchIndex.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class PlainTextListItem {


	@SerializedName("plain_text")
	@OpField(required = true , desc = "明文", example= "13117428564")
	private String plainText;

	@SerializedName("encrypt_type")
	@OpField(required = true , desc = "加密类型；1地址加密 2姓名加密 3电话加密", example= "3")
	private Integer encryptType;


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

	
	public void setEncryptType(Integer encryptType){
		this.encryptType = encryptType;
	}

	
	public Integer getEncryptType(){
		return this.encryptType;
	}

}