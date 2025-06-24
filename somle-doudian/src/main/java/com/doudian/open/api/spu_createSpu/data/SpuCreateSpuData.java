package com.doudian.open.api.spu_createSpu.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class SpuCreateSpuData {


	@SerializedName("spu_id")
	@OpField(desc = "SPU的ID", example = "7120712486076088620")
	private String spuId;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setSpuId(String spuId){
		this.spuId = spuId;
	}

	
	public String getSpuId(){
		return this.spuId;
	}

}