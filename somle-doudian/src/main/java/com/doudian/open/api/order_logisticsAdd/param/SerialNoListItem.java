package com.doudian.open.api.order_logisticsAdd.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class SerialNoListItem {


	@SerializedName("value")
	@OpField(required = false , desc = "SN/69/IMEI码的值。", example= "[12343]")
	private List<String> value;

	@SerializedName("key")
	@OpField(required = false , desc = "SN/69/IMEI码的类型", example= "SN")
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