package com.doudian.open.api.brand_list.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;
import java.util.Map;

//auto generated, do not edit

public class BrandListData {


	@SerializedName("brand_ids")
	@OpField(desc = "（已停止使用）品牌id列表", example = "[]")
	private List<Long> brandIds;

	@SerializedName("brand_infos")
	@OpField(desc = "（已停止使用）品牌信息", example = "")
	private Map<Long,BrandInfosItem> brandInfos;

	@SerializedName("total")
	@OpField(desc = "（已停止使用）总数", example = "0")
	private Long total;

	@SerializedName("has_more")
	@OpField(desc = "（已停止使用）还有更多", example = "True")
	private Boolean hasMore;

	@SerializedName("auth_required")
	@OpField(desc = "类目是否要求品牌有授权", example = "true")
	private Boolean authRequired;

	@SerializedName("auth_brand_list")
	@OpField(desc = "授权的品牌列表", example = "")
	private List<AuthBrandListItem> authBrandList;

	@SerializedName("brand_list")
	@OpField(desc = "未授权的品牌列表", example = "")
	private List<BrandListItem> brandList;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setBrandIds(List<Long> brandIds){
		this.brandIds = brandIds;
	}

	
	public List<Long> getBrandIds(){
		return this.brandIds;
	}

	
	public void setBrandInfos(Map<Long,BrandInfosItem> brandInfos){
		this.brandInfos = brandInfos;
	}

	
	public Map<Long,BrandInfosItem> getBrandInfos(){
		return this.brandInfos;
	}

	
	public void setTotal(Long total){
		this.total = total;
	}

	
	public Long getTotal(){
		return this.total;
	}

	
	public void setHasMore(Boolean hasMore){
		this.hasMore = hasMore;
	}

	
	public Boolean getHasMore(){
		return this.hasMore;
	}

	
	public void setAuthRequired(Boolean authRequired){
		this.authRequired = authRequired;
	}

	
	public Boolean getAuthRequired(){
		return this.authRequired;
	}

	
	public void setAuthBrandList(List<AuthBrandListItem> authBrandList){
		this.authBrandList = authBrandList;
	}

	
	public List<AuthBrandListItem> getAuthBrandList(){
		return this.authBrandList;
	}

	
	public void setBrandList(List<BrandListItem> brandList){
		this.brandList = brandList;
	}

	
	public List<BrandListItem> getBrandList(){
		return this.brandList;
	}

}