package com.doudian.open.api.spu_addShopSpu.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class SpuAddShopSpuData {


	@SerializedName("spu_id")
	@OpField(desc = "spuId", example = "6950545601998242092")
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