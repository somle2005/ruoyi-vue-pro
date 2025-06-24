package com.doudian.open.api.order_getSearchIndex.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class OrderGetSearchIndexData {


	@SerializedName("encrypt_index_text")
	@OpField(desc = "索引串", example = "ZFasdasgdsh")
	private String encryptIndexText;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setEncryptIndexText(String encryptIndexText){
		this.encryptIndexText = encryptIndexText;
	}

	
	public String getEncryptIndexText(){
		return this.encryptIndexText;
	}

}