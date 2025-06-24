package com.doudian.open.api.product_isv_saveGoodsSupplyStatus.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class StatusItem {


	@SerializedName("clue_id")
	@OpField(required = true , desc = "线索id", example= "123")
	private Long clueId;

	@SerializedName("goods_supply_exists")
	@OpField(required = true , desc = "是否存在货源", example= "true")
	private Boolean goodsSupplyExists;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setClueId(Long clueId){
		this.clueId = clueId;
	}

	
	public Long getClueId(){
		return this.clueId;
	}

	
	public void setGoodsSupplyExists(Boolean goodsSupplyExists){
		this.goodsSupplyExists = goodsSupplyExists;
	}

	
	public Boolean getGoodsSupplyExists(){
		return this.goodsSupplyExists;
	}

}