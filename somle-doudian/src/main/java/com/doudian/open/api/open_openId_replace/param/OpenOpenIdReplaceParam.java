package com.doudian.open.api.open_openId_replace.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class OpenOpenIdReplaceParam {


	@SerializedName("open_ids")
	@OpField(required = true , desc = "传入一个老openId列表, 最多传入100个openId, openId格式如示例", example= "18@#15Hj8o9btShRa7Ow9yCHbRWQHYCk0JKsQT6svrcGvP+hgBCsCn9csq6dALY=")
	private List<String> openIds;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setOpenIds(List<String> openIds){
		this.openIds = openIds;
	}

	
	public List<String> getOpenIds(){
		return this.openIds;
	}

}