package com.doudian.open.api.warehouse_setAddrBatch.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class AddrListItem {


	@SerializedName("addr_id1")
	@OpField(required = true , desc = "一级地址id", example= "1")
	private Long addrId1;

	@SerializedName("addr_id2")
	@OpField(required = false , desc = "二级地址id", example= "2")
	private Long addrId2;

	@SerializedName("addr_id3")
	@OpField(required = false , desc = "三级地址id", example= "3")
	private Long addrId3;

	@SerializedName("addr_id4")
	@OpField(required = false , desc = "四级地址id", example= "4")
	private Long addrId4;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setAddrId1(Long addrId1){
		this.addrId1 = addrId1;
	}

	
	public Long getAddrId1(){
		return this.addrId1;
	}

	
	public void setAddrId2(Long addrId2){
		this.addrId2 = addrId2;
	}

	
	public Long getAddrId2(){
		return this.addrId2;
	}

	
	public void setAddrId3(Long addrId3){
		this.addrId3 = addrId3;
	}

	
	public Long getAddrId3(){
		return this.addrId3;
	}

	
	public void setAddrId4(Long addrId4){
		this.addrId4 = addrId4;
	}

	
	public Long getAddrId4(){
		return this.addrId4;
	}

}