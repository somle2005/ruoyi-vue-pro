package com.doudian.open.api.warehouse_edit.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class WarehouseEditParam {


	@SerializedName("out_warehouse_id")
	@OpField(required = true , desc = "外部仓库id", example= "abc")
	private String outWarehouseId;

	@SerializedName("name")
	@OpField(required = false , desc = "仓库名称", example= "仓名称示例")
	private String name;

	@SerializedName("intro")
	@OpField(required = false , desc = "仓库介绍", example= "仓介绍示例")
	private String intro;

	@SerializedName("address_id1")
	@OpField(required = false , desc = "省地址编码", example= "11")
	private Long addressId1;

	@SerializedName("address_id2")
	@OpField(required = false , desc = "市地址编码", example= "110000")
	private Long addressId2;

	@SerializedName("address_id3")
	@OpField(required = false , desc = "区地址编码", example= "110101")
	private Long addressId3;

	@SerializedName("address_id4")
	@OpField(required = false , desc = "街道地址编码", example= "0")
	private Long addressId4;

	@SerializedName("address_detail")
	@OpField(required = false , desc = "详细地址", example= "xx消息xx号")
	private String addressDetail;


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

	
	public void setAddressId1(Long addressId1){
		this.addressId1 = addressId1;
	}

	
	public Long getAddressId1(){
		return this.addressId1;
	}

	
	public void setAddressId2(Long addressId2){
		this.addressId2 = addressId2;
	}

	
	public Long getAddressId2(){
		return this.addressId2;
	}

	
	public void setAddressId3(Long addressId3){
		this.addressId3 = addressId3;
	}

	
	public Long getAddressId3(){
		return this.addressId3;
	}

	
	public void setAddressId4(Long addressId4){
		this.addressId4 = addressId4;
	}

	
	public Long getAddressId4(){
		return this.addressId4;
	}

	
	public void setAddressDetail(String addressDetail){
		this.addressDetail = addressDetail;
	}

	
	public String getAddressDetail(){
		return this.addressDetail;
	}

}