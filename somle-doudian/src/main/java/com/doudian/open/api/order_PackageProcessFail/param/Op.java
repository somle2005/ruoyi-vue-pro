package com.doudian.open.api.order_PackageProcessFail.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class Op {


	@SerializedName("platform")
	@OpField(required = false , desc = "操作平台", example= "system")
	private Integer platform;

	@SerializedName("op_uid")
	@OpField(required = false , desc = "操作人uid", example= "123456")
	private Long opUid;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setPlatform(Integer platform){
		this.platform = platform;
	}

	
	public Integer getPlatform(){
		return this.platform;
	}

	
	public void setOpUid(Long opUid){
		this.opUid = opUid;
	}

	
	public Long getOpUid(){
		return this.opUid;
	}

}