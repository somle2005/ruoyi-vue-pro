package com.doudian.open.api.buyin_bindChannelProduct.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class FailedItem {


	@SerializedName("id")
	@OpField(desc = "绑定失败的达人id，可能是uid或者buyinId，结合id_type字段使用", example = "123456789")
	private Long id;

	@SerializedName("id_type")
	@OpField(desc = "id字段的类型：0: 达人uid 1:buyinID", example = "1")
	private Long idType;

	@SerializedName("reason")
	@OpField(desc = "绑定失败的原因", example = "无效uid")
	private String reason;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setId(Long id){
		this.id = id;
	}

	
	public Long getId(){
		return this.id;
	}

	
	public void setIdType(Long idType){
		this.idType = idType;
	}

	
	public Long getIdType(){
		return this.idType;
	}

	
	public void setReason(String reason){
		this.reason = reason;
	}

	
	public String getReason(){
		return this.reason;
	}

}