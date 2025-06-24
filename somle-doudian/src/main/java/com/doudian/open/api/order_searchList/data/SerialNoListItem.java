package com.doudian.open.api.order_searchList.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class SerialNoListItem {


	@SerializedName("value")
	@OpField(desc = "SN/69/IMEI码的值。", example = "[112,1233]")
	private List<String> value;

	@SerializedName("key")
	@OpField(desc = "SN/69/IMEI码类型。", example = "SN")
	private String key;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setValue(List<String> value){
		this.value = value;
	}

	
	public List<String> getValue(){
		return this.value;
	}

	
	public void setKey(String key){
		this.key = key;
	}

	
	public String getKey(){
		return this.key;
	}

}