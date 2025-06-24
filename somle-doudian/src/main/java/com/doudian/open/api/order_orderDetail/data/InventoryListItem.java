package com.doudian.open.api.order_orderDetail.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class InventoryListItem {


	@SerializedName("warehouse_name")
	@OpField(desc = "仓名称", example = "测试仓11")
	private String warehouseName;

	@SerializedName("warehouse_id")
	@OpField(desc = "仓id", example = "32434243432")
	private String warehouseId;

	@SerializedName("out_warehouse_id")
	@OpField(desc = "外部仓id/编码", example = "2343243245")
	private String outWarehouseId;

	@SerializedName("inventory_type")
	@OpField(desc = "库存类型，普通库存/区域库存", example = "1")
	private Long inventoryType;

	@SerializedName("inventory_type_desc")
	@OpField(desc = "库存类型描述", example = "普通库存")
	private String inventoryTypeDesc;

	@SerializedName("count")
	@OpField(desc = "库存变更数量", example = "2")
	private Long count;

	@SerializedName("warehouse_type")
	@OpField(desc = "仓类型：0-商家仓，1-跨境仓，2-云仓", example = "0")
	private Long warehouseType;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setWarehouseName(String warehouseName){
		this.warehouseName = warehouseName;
	}

	
	public String getWarehouseName(){
		return this.warehouseName;
	}

	
	public void setWarehouseId(String warehouseId){
		this.warehouseId = warehouseId;
	}

	
	public String getWarehouseId(){
		return this.warehouseId;
	}

	
	public void setOutWarehouseId(String outWarehouseId){
		this.outWarehouseId = outWarehouseId;
	}

	
	public String getOutWarehouseId(){
		return this.outWarehouseId;
	}

	
	public void setInventoryType(Long inventoryType){
		this.inventoryType = inventoryType;
	}

	
	public Long getInventoryType(){
		return this.inventoryType;
	}

	
	public void setInventoryTypeDesc(String inventoryTypeDesc){
		this.inventoryTypeDesc = inventoryTypeDesc;
	}

	
	public String getInventoryTypeDesc(){
		return this.inventoryTypeDesc;
	}

	
	public void setCount(Long count){
		this.count = count;
	}

	
	public Long getCount(){
		return this.count;
	}

	
	public void setWarehouseType(Long warehouseType){
		this.warehouseType = warehouseType;
	}

	
	public Long getWarehouseType(){
		return this.warehouseType;
	}

}