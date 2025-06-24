package com.doudian.open.api.product_addV2.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class CpvPathItem {


	@SerializedName("cpid")
	@OpField(required = true , desc = "属性id", example= "1234")
	private Long cpid;

	@SerializedName("cpvid")
	@OpField(required = true , desc = "属性值id", example= "234")
	private Long cpvid;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setCpid(Long cpid){
		this.cpid = cpid;
	}

	
	public Long getCpid(){
		return this.cpid;
	}

	
	public void setCpvid(Long cpvid){
		this.cpvid = cpvid;
	}

	
	public Long getCpvid(){
		return this.cpvid;
	}

}