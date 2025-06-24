package com.doudian.open.api.warehouse_info.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class WarehouseLocation {


	@SerializedName("address_id1")
	@OpField(desc = "省地址编码", example = "11")
	private Long addressId1;

	@SerializedName("address_id2")
	@OpField(desc = "市地址编码", example = "110000")
	private Long addressId2;

	@SerializedName("address_id3")
	@OpField(desc = "区地址编码", example = "110101")
	private Long addressId3;

	@SerializedName("address_id4")
	@OpField(desc = "街道地址编码", example = "0")
	private Long addressId4;

	@SerializedName("address_name1")
	@OpField(desc = "省地址中文", example = "北京市")
	private String addressName1;

	@SerializedName("address_name2")
	@OpField(desc = "市地址中文", example = "北京市")
	private String addressName2;

	@SerializedName("address_name3")
	@OpField(desc = "街道地址中文", example = "东城区")
	private String addressName3;

	@SerializedName("address_name4")
	@OpField(desc = "街道地址中文", example = "")
	private String addressName4;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
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

	
	public void setAddressName1(String addressName1){
		this.addressName1 = addressName1;
	}

	
	public String getAddressName1(){
		return this.addressName1;
	}

	
	public void setAddressName2(String addressName2){
		this.addressName2 = addressName2;
	}

	
	public String getAddressName2(){
		return this.addressName2;
	}

	
	public void setAddressName3(String addressName3){
		this.addressName3 = addressName3;
	}

	
	public String getAddressName3(){
		return this.addressName3;
	}

	
	public void setAddressName4(String addressName4){
		this.addressName4 = addressName4;
	}

	
	public String getAddressName4(){
		return this.addressName4;
	}

}