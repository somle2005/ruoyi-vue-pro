package com.doudian.open.api.warehouse_info.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class Data {


	@SerializedName("warehouse_id")
	@OpField(desc = "仓库id", example = "6152361283123")
	private Long warehouseId;

	@SerializedName("out_warehouse_id")
	@OpField(desc = "仓库外部id", example = "ABC")
	private String outWarehouseId;

	@SerializedName("name")
	@OpField(desc = "仓库名称", example = "名称测试")
	private String name;

	@SerializedName("intro")
	@OpField(desc = "仓库介绍", example = "介绍测试")
	private String intro;

	@SerializedName("addr")
	@OpField(desc = "覆盖区域列表", example = "-")
	private List<AddrItem> addr;

	@SerializedName("update_time")
	@OpField(desc = "更新时间", example = "1624245280")
	private Long updateTime;

	@SerializedName("create_time")
	@OpField(desc = "创建时间", example = "1624245280")
	private Long createTime;

	@SerializedName("shop_id")
	@OpField(desc = "店铺id", example = "95250")
	private Long shopId;

	@SerializedName("warehouse_location")
	@OpField(desc = "仓库地址", example = "")
	private WarehouseLocation warehouseLocation;

	@SerializedName("address_detail")
	@OpField(desc = "详细地址", example = "")
	private String addressDetail;

	@SerializedName("out_fence_ids")
	@OpField(desc = "外部围栏ID列表", example = "[1, 2]")
	private List<String> outFenceIds;


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

	
	public void setAddr(List<AddrItem> addr){
		this.addr = addr;
	}

	
	public List<AddrItem> getAddr(){
		return this.addr;
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

	
	public void setShopId(Long shopId){
		this.shopId = shopId;
	}

	
	public Long getShopId(){
		return this.shopId;
	}

	
	public void setWarehouseLocation(WarehouseLocation warehouseLocation){
		this.warehouseLocation = warehouseLocation;
	}

	
	public WarehouseLocation getWarehouseLocation(){
		return this.warehouseLocation;
	}

	
	public void setAddressDetail(String addressDetail){
		this.addressDetail = addressDetail;
	}

	
	public String getAddressDetail(){
		return this.addressDetail;
	}

	
	public void setOutFenceIds(List<String> outFenceIds){
		this.outFenceIds = outFenceIds;
	}

	
	public List<String> getOutFenceIds(){
		return this.outFenceIds;
	}

}