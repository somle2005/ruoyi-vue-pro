package com.doudian.open.api.open_materialToken.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class OpenMaterialTokenData {


	@SerializedName("auth_query")
	@OpField(desc = "获取下载地址query")
	private String authQuery;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setAuthQuery(String authQuery){
		this.authQuery = authQuery;
	}

	
	public String getAuthQuery(){
		return this.authQuery;
	}

}