package com.doudian.open.api.buyin_queryShopAllianceProducts.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class SampleConf {


	@SerializedName("buy_volume_limit")
	@OpField(desc = "达人带货结算订单量≥所设订单量，返还达人买样全款；如果不支持达人买样返款此字段无意义", example = "5")
	private Integer buyVolumeLimit;

	@SerializedName("buy_style")
	@OpField(desc = "达人买样返款配置；1：支持达人买样返款，2-不支持达人买样返款", example = "1")
	private Integer buyStyle;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setBuyVolumeLimit(Integer buyVolumeLimit){
		this.buyVolumeLimit = buyVolumeLimit;
	}

	
	public Integer getBuyVolumeLimit(){
		return this.buyVolumeLimit;
	}

	
	public void setBuyStyle(Integer buyStyle){
		this.buyStyle = buyStyle;
	}

	
	public Integer getBuyStyle(){
		return this.buyStyle;
	}

}