package com.doudian.open.api.warehouse_createBatch.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class OutWarehouseListItem {


	@SerializedName("out_warehouse_id")
	@OpField(required = true , desc = "外部仓库ID，一个店铺下，同一个外部ID只能创建一个仓库", example= "abc")
	private String outWarehouseId;

	@SerializedName("name")
	@OpField(required = true , desc = "仓库名称", example= "华北一仓")
	private String name;

	@SerializedName("intro")
	@OpField(required = true , desc = "仓库介绍", example= "这是一家外部仓")
	private String intro;

	@SerializedName("address_detail")
	@OpField(required = false , desc = "仓地址详细地址，苹果门店店铺、超市小时达店铺建仓必传", example= "xx区xx号")
	private String addressDetail;

	@SerializedName("warehouse_location")
	@OpField(required = false , desc = "仓地址编码  苹果门店店铺、超市小时达店铺建仓必传", example= "")
	private WarehouseLocation warehouseLocation;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setOutWarehouseId(String outWarehouseId){
		this.outWarehouseId = outWarehouseId;
	}

	
	public String getOutWarehouseId(){
		return this.outWarehouseId;
	}

	
	public void setName(String name){
		this.name = name;
	}

	
	public String getName(){
		return this.name;
	}

	
	public void setIntro(String intro){
		this.intro = intro;
	}

	
	public String getIntro(){
		return this.intro;
	}

	
	public void setAddressDetail(String addressDetail){
		this.addressDetail = addressDetail;
	}

	
	public String getAddressDetail(){
		return this.addressDetail;
	}

	
	public void setWarehouseLocation(WarehouseLocation warehouseLocation){
		this.warehouseLocation = warehouseLocation;
	}

	
	public WarehouseLocation getWarehouseLocation(){
		return this.warehouseLocation;
	}

}