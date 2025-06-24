package com.doudian.open.api.product_isv_saveGoodsSupplyStatus.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class ProductIsvSaveGoodsSupplyStatusParam {


	@SerializedName("status")
	@OpField(required = true , desc = "列表数量不能超过200", example= "")
	private List<StatusItem> status;

	@SerializedName("platform")
	@OpField(required = true , desc = "平台", example= "2")
	private Integer platform;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setStatus(List<StatusItem> status){
		this.status = status;
	}

	
	public List<StatusItem> getStatus(){
		return this.status;
	}

	
	public void setPlatform(Integer platform){
		this.platform = platform;
	}

	
	public Integer getPlatform(){
		return this.platform;
	}

}