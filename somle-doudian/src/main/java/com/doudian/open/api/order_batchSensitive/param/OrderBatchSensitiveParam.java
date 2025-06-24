package com.doudian.open.api.order_batchSensitive.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class OrderBatchSensitiveParam {


	@SerializedName("cipher_infos")
	@OpField(required = true , desc = "待脱敏的密文列表，每次调用不超过50条", example= "")
	private List<CipherInfosItem> cipherInfos;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setCipherInfos(List<CipherInfosItem> cipherInfos){
		this.cipherInfos = cipherInfos;
	}

	
	public List<CipherInfosItem> getCipherInfos(){
		return this.cipherInfos;
	}

}