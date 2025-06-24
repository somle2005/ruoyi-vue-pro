package com.doudian.open.api.address_addAftersaleStrategy.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class AddressItem {


	@SerializedName("id")
	@OpField(required = false , desc = "必传。商家通过抖店后台-订单管理-物流工具-地址库管理或者通过三方服务商平台在抖店后台创建地址生成的ID，可以通过接入/address/list获取商家地址列表。", example= "101")
	private Long id;

	@SerializedName("province_id")
	@OpField(required = false , desc = "非必传。动态策略类型必传，静态策略类型不传。省ID，消费者收货地址对应的省ID，需要使用标准四级地址对应的省ID，通过/address/provinceList获取。", example= "11")
	private Long provinceId;

	@SerializedName("city_id")
	@OpField(required = false , desc = "非必传。动态策略类型必传，静态策略类型不传。城市ID，消费者收货地址对应的市ID，需要使用标准四级地址对应的市ID，通过/address/getAreasByProvince获取是ID。", example= "110000")
	private Long cityId;


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

	
	public void setProvinceId(Long provinceId){
		this.provinceId = provinceId;
	}

	
	public Long getProvinceId(){
		return this.provinceId;
	}

	
	public void setCityId(Long cityId){
		this.cityId = cityId;
	}

	
	public Long getCityId(){
		return this.cityId;
	}

}