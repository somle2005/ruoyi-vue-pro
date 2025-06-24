package com.doudian.open.api.order_orderDetail.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.Map;

//auto generated, do not edit

public class StoreInfo {


	@SerializedName("store_tag_map")
	@OpField(desc = "门店标签; delivery_service_pkg枚举值1=平配服务包 2=自配服务包", example = "{delivery_service_pkg: 1}")
	private Map<String,String> storeTagMap;

	@SerializedName("store_id")
	@OpField(desc = "门店id", example = "1")
	private String storeId;

	@SerializedName("store_name")
	@OpField(desc = "门店名称", example = "门店名称")
	private String storeName;

	@SerializedName("store_tel")
	@OpField(desc = "门店电话", example = "13888888888")
	private String storeTel;

	@SerializedName("store_address")
	@OpField(desc = "门店地址", example = "")
	private StoreAddress storeAddress;

	@SerializedName("extra")
	@OpField(desc = "扩展字段", example = "扩展字段")
	private String extra;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setStoreTagMap(Map<String,String> storeTagMap){
		this.storeTagMap = storeTagMap;
	}

	
	public Map<String,String> getStoreTagMap(){
		return this.storeTagMap;
	}

	
	public void setStoreId(String storeId){
		this.storeId = storeId;
	}

	
	public String getStoreId(){
		return this.storeId;
	}

	
	public void setStoreName(String storeName){
		this.storeName = storeName;
	}

	
	public String getStoreName(){
		return this.storeName;
	}

	
	public void setStoreTel(String storeTel){
		this.storeTel = storeTel;
	}

	
	public String getStoreTel(){
		return this.storeTel;
	}

	
	public void setStoreAddress(StoreAddress storeAddress){
		this.storeAddress = storeAddress;
	}

	
	public StoreAddress getStoreAddress(){
		return this.storeAddress;
	}

	
	public void setExtra(String extra){
		this.extra = extra;
	}

	
	public String getExtra(){
		return this.extra;
	}

}