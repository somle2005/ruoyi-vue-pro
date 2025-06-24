package com.doudian.open.api.warehouse_list.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class WarehousesItem {


	@SerializedName("warehouse_id")
	@OpField(desc = "仓库id", example = "6853386941874864391")
	private Long warehouseId;

	@SerializedName("name")
	@OpField(desc = "仓库名字", example = "名字")
	private String name;

	@SerializedName("intro")
	@OpField(desc = "仓库介绍", example = "介绍")
	private String intro;

	@SerializedName("update_time")
	@OpField(desc = "更新时间", example = "1623918481")
	private Long updateTime;

	@SerializedName("create_time")
	@OpField(desc = "创建时间", example = "1623918481")
	private Long createTime;

	@SerializedName("out_warehouse_id")
	@OpField(desc = "仓库外部id", example = "ABC")
	private String outWarehouseId;

	@SerializedName("addr")
	@OpField(desc = "仓库覆盖范围列表", example = "-")
	private List<AddrItem> addr;

	@SerializedName("shop_id")
	@OpField(desc = "店铺id", example = "123456")
	private Long shopId;

	@SerializedName("out_fence_ids")
	@OpField(desc = "外部电子围栏id列表", example = "fence01")
	private List<String> outFenceIds;

	@SerializedName("address_detail")
	@OpField(desc = "仓的详细地址", example = "xx小区xx号")
	private String addressDetail;

	@SerializedName("warehouse_location")
	@OpField(desc = "仓的地址编码", example = "")
	private WarehouseLocation warehouseLocation;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setWarehouseId(Long warehouseId){
		this.warehouseId = warehouseId;
	}

	
	public Long getWarehouseId(){
		return this.warehouseId;
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

	
	public void setUpdateTime(Long updateTime){
		this.updateTime = updateTime;
	}

	
	public Long getUpdateTime(){
		return this.updateTime;
	}

	
	public void setCreateTime(Long createTime){
		this.createTime = createTime;
	}

	
	public Long getCreateTime(){
		return this.createTime;
	}

	
	public void setOutWarehouseId(String outWarehouseId){
		this.outWarehouseId = outWarehouseId;
	}

	
	public String getOutWarehouseId(){
		return this.outWarehouseId;
	}

	
	public void setAddr(List<AddrItem> addr){
		this.addr = addr;
	}

	
	public List<AddrItem> getAddr(){
		return this.addr;
	}

	
	public void setShopId(Long shopId){
		this.shopId = shopId;
	}

	
	public Long getShopId(){
		return this.shopId;
	}

	
	public void setOutFenceIds(List<String> outFenceIds){
		this.outFenceIds = outFenceIds;
	}

	
	public List<String> getOutFenceIds(){
		return this.outFenceIds;
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