package com.doudian.open.api.open_openId_replace.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.Map;

//auto generated, do not edit

public class OpenOpenIdReplaceData {


	@SerializedName("open_id_old_to_new_map")
	@OpField(desc = "一个map, key为老openId, val为新openId", example = "")
	private Map<String,String> openIdOldToNewMap;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setOpenIdOldToNewMap(Map<String,String> openIdOldToNewMap){
		this.openIdOldToNewMap = openIdOldToNewMap;
	}

	
	public Map<String,String> getOpenIdOldToNewMap(){
		return this.openIdOldToNewMap;
	}

}