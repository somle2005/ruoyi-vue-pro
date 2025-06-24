package com.doudian.open.api.address_updateAftersaleStrategy.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class AddressItem {


	@SerializedName("city_id")
	@OpField(required = false , desc = "非必传，消费者收货地址的市ID。如果operation=0，并且是动态退货策略，则必传；如果是operation=0，但是是静态策略，不是必传。", example= "110000")
	private Long cityId;

	@SerializedName("province_id")
	@OpField(required = false , desc = "非必传，省ID。如果operation=0，并且是动态退货策略，则必传；如果是operation=0，但是是静态策略，不是必传。通过/address/getAreasByProvince获取是ID。", example= "11")
	private Long provinceId;

	@SerializedName("id")
	@OpField(required = false , desc = "非必传，地址ID。商家通过抖店后台-订单管理-物流工具-地址库管理或者通过三方服务商平台在抖店后台创建地址生成的ID，可以通过接入/address/list获取商家地址列表。如果是operation=0，则必传。通过/address/provinceList获取。", example= "地址ID")
	private Long id;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setCityId(Long cityId){
		this.cityId = cityId;
	}

	
	public Long getCityId(){
		return this.cityId;
	}

	
	public void setProvinceId(Long provinceId){
		this.provinceId = provinceId;
	}

	
	public Long getProvinceId(){
		return this.provinceId;
	}

	
	public void setId(Long id){
		this.id = id;
	}

	
	public Long getId(){
		return this.id;
	}

}