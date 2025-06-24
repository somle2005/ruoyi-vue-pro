package com.doudian.open.api.product_qualityList.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class ProductQualityListData {


	@SerializedName("quality_list")
	@OpField(desc = "商品质量列表", example = "")
	private List<QualityListItem> qualityList;

	@SerializedName("total")
	@OpField(desc = "店铺待优化商品总量", example = "50")
	private Long total;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setQualityList(List<QualityListItem> qualityList){
		this.qualityList = qualityList;
	}

	
	public List<QualityListItem> getQualityList(){
		return this.qualityList;
	}

	
	public void setTotal(Long total){
		this.total = total;
	}

	
	public Long getTotal(){
		return this.total;
	}

}