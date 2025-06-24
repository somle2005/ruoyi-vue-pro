package com.doudian.open.api.product_GetRecommendCategory.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class CategoryDetailsItem {


	@SerializedName("category_detail")
	@OpField(desc = "类目详情", example = "")
	private CategoryDetail categoryDetail;

	@SerializedName("qualification_status")
	@OpField(desc = "类目资质状态，0有资质；1资质过期；2无资质", example = "1")
	private Long qualificationStatus;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setCategoryDetail(CategoryDetail categoryDetail){
		this.categoryDetail = categoryDetail;
	}

	
	public CategoryDetail getCategoryDetail(){
		return this.categoryDetail;
	}

	
	public void setQualificationStatus(Long qualificationStatus){
		this.qualificationStatus = qualificationStatus;
	}

	
	public Long getQualificationStatus(){
		return this.qualificationStatus;
	}

}