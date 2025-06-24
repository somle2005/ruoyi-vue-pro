package com.doudian.open.api.order_searchList.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class SkuYunWarehouseInfoItem {


	@SerializedName("pre_allocated_yun_warehouse_info")
	@OpField(desc = "预分配云仓信息", example = "")
	private PreAllocatedYunWarehouseInfo preAllocatedYunWarehouseInfo;

	@SerializedName("real_yun_warehouse_info")
	@OpField(desc = "云仓实仓信息", example = "")
	private RealYunWarehouseInfo realYunWarehouseInfo;

	@SerializedName("current_business_stage")
	@OpField(desc = "当前业务阶段 1-未分配 2-已分配未发货 2-已发货", example = "2")
	private Long currentBusinessStage;

	@SerializedName("sku_id")
	@OpField(desc = "该仓对应的skuId", example = "123")
	private String skuId;

	@SerializedName("sku_count")
	@OpField(desc = "sku数量", example = "1")
	private Long skuCount;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setPreAllocatedYunWarehouseInfo(PreAllocatedYunWarehouseInfo preAllocatedYunWarehouseInfo){
		this.preAllocatedYunWarehouseInfo = preAllocatedYunWarehouseInfo;
	}

	
	public PreAllocatedYunWarehouseInfo getPreAllocatedYunWarehouseInfo(){
		return this.preAllocatedYunWarehouseInfo;
	}

	
	public void setRealYunWarehouseInfo(RealYunWarehouseInfo realYunWarehouseInfo){
		this.realYunWarehouseInfo = realYunWarehouseInfo;
	}

	
	public RealYunWarehouseInfo getRealYunWarehouseInfo(){
		return this.realYunWarehouseInfo;
	}

	
	public void setCurrentBusinessStage(Long currentBusinessStage){
		this.currentBusinessStage = currentBusinessStage;
	}

	
	public Long getCurrentBusinessStage(){
		return this.currentBusinessStage;
	}

	
	public void setSkuId(String skuId){
		this.skuId = skuId;
	}

	
	public String getSkuId(){
		return this.skuId;
	}

	
	public void setSkuCount(Long skuCount){
		this.skuCount = skuCount;
	}

	
	public Long getSkuCount(){
		return this.skuCount;
	}

}