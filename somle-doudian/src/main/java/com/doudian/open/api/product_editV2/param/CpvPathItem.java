package com.doudian.open.api.product_editV2.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class CpvPathItem {


	@SerializedName("cpvid")
	@OpField(required = true , desc = "如具体白色系的销售属性值id", example= "1")
	private Long cpvid;

	@SerializedName("cpid")
	@OpField(required = true , desc = "如色系的销售属性id", example= "2")
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