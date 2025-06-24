package com.doudian.open.api.product_detail.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class CpvPathItem {


	@SerializedName("cpvid")
	@OpField(desc = "导航属性值id", example = "123")
	private Long cpvid;

	@SerializedName("cpid")
	@OpField(desc = "导航属性id", example = "1234")
	private Long cpid;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setCpvid(Long cpvid){
		this.cpvid = cpvid;
	}

	
	public Long getCpvid(){
		return this.cpvid;
	}

	
	public void setCpid(Long cpid){
		this.cpid = cpid;
	}

	
	public Long getCpid(){
		return this.cpid;
	}

}