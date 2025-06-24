package com.doudian.open.api.brand_list.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class BrandListParam {


	@SerializedName("categories")
	@OpField(required = false , desc = "（已停止使用）类目列表", example= "[123]")
	private List<Long> categories;

	@SerializedName("offset")
	@OpField(required = false , desc = "（已停止使用）起始位", example= "0")
	private Long offset;

	@SerializedName("size")
	@OpField(required = false , desc = "（已停止使用）单次最大条数", example= "10")
	private Long size;

	@SerializedName("sort")
	@OpField(required = false , desc = "（已停止使用）排序顺序，默认为倒排 0:降序, 1:升序", example= "0")
	private Integer sort;

	@SerializedName("status")
	@OpField(required = false , desc = "（已停止使用）品牌状态 1:审核中, 2:审核通过, 3:审核拒绝", example= "2")
	private Integer status;

	@SerializedName("full_brand_info")
	@OpField(required = false , desc = "（已停止使用）是否返回完全的品牌信息", example= "true")
	private Boolean fullBrandInfo;

	@SerializedName("category_id")
	@OpField(required = false , desc = "（推荐使用，必填）类目id", example= "123")
	private Long categoryId;

	@SerializedName("query")
	@OpField(required = false , desc = "品牌前缀（中文或者英文），适用于不需要品牌资质的场景，根据前缀搜索品牌", example= "wu")
	private String query;

	@SerializedName("brand_ids")
	@OpField(required = false , desc = "（选填）品牌ids，传了品牌ids默认直接拿品牌id搜索并返回结果(放在brand_list里)，不会使用其他入参", example= "[123]")
	private List<Long> brandIds;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setCategories(List<Long> categories){
		this.categories = categories;
	}

	
	public List<Long> getCategories(){
		return this.categories;
	}

	
	public void setOffset(Long offset){
		this.offset = offset;
	}

	
	public Long getOffset(){
		return this.offset;
	}

	
	public void setSize(Long size){
		this.size = size;
	}

	
	public Long getSize(){
		return this.size;
	}

	
	public void setSort(Integer sort){
		this.sort = sort;
	}

	
	public Integer getSort(){
		return this.sort;
	}

	
	public void setStatus(Integer status){
		this.status = status;
	}

	
	public Integer getStatus(){
		return this.status;
	}

	
	public void setFullBrandInfo(Boolean fullBrandInfo){
		this.fullBrandInfo = fullBrandInfo;
	}

	
	public Boolean getFullBrandInfo(){
		return this.fullBrandInfo;
	}

	
	public void setCategoryId(Long categoryId){
		this.categoryId = categoryId;
	}

	
	public Long getCategoryId(){
		return this.categoryId;
	}

	
	public void setQuery(String query){
		this.query = query;
	}

	
	public String getQuery(){
		return this.query;
	}

	
	public void setBrandIds(List<Long> brandIds){
		this.brandIds = brandIds;
	}

	
	public List<Long> getBrandIds(){
		return this.brandIds;
	}

}