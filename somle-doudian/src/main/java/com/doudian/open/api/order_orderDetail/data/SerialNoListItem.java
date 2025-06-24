package com.doudian.open.api.order_orderDetail.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class SerialNoListItem {


	@SerializedName("key")
	@OpField(desc = "SN/69/IMEI码类型。", example = "SN")
	private String key;

	@SerializedName("value")
	@OpField(desc = "SN/69/IMEI码的值。", example = "[112,1233]")
	private List<String> value;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setKey(String key){
		this.key = key;
	}

	
	public String getKey(){
		return this.key;
	}

	
	public void setValue(List<String> value){
		this.value = value;
	}

	
	public List<String> getValue(){
		return this.value;
	}

}