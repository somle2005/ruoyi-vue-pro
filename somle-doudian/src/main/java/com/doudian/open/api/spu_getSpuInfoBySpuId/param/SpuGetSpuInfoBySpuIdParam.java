package com.doudian.open.api.spu_getSpuInfoBySpuId.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class SpuGetSpuInfoBySpuIdParam {


	@SerializedName("spu_id")
	@OpField(required = true , desc = "spuId", example= "6950545601998242092")
	private Long spuId;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setSpuId(Long spuId){
		this.spuId = spuId;
	}

	
	public Long getSpuId(){
		return this.spuId;
	}

}