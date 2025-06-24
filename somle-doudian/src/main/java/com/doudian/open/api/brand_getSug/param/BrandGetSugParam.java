package com.doudian.open.api.brand_getSug.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class BrandGetSugParam {


	@SerializedName("query")
	@OpField(required = true , desc = "前缀匹配的品牌名", example= "apple")
	private String query;

	@SerializedName("user_id")
	@OpField(required = true , desc = "用户ID，可用默认值0", example= "0")
	private Long userId;

	@SerializedName("filter_info")
	@OpField(required = false , desc = "过滤用参数，不填则是全量召回", example= "")
	private FilterInfo filterInfo;

	@SerializedName("read_old")
	@OpField(required = true , desc = "是否读取老数据 默认为false", example= "false")
	private Boolean readOld;

	@SerializedName("biz_types")
	@OpField(required = true , desc = "业务线类型: 0. 国内品牌 1. 跨境品牌 3. 广告", example= "[0]")
	private List<Integer> bizTypes;

	@SerializedName("enable_deduplicate")
	@OpField(required = true , desc = "是否去重，一般选择true", example= "true")
	private Boolean enableDeduplicate;

	@SerializedName("extra_config")
	@OpField(required = false , desc = "额外配置，无特殊需求请按描述填写", example= "")
	private ExtraConfig extraConfig;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setQuery(String query){
		this.query = query;
	}

	
	public String getQuery(){
		return this.query;
	}

	
	public void setUserId(Long userId){
		this.userId = userId;
	}

	
	public Long getUserId(){
		return this.userId;
	}

	
	public void setFilterInfo(FilterInfo filterInfo){
		this.filterInfo = filterInfo;
	}

	
	public FilterInfo getFilterInfo(){
		return this.filterInfo;
	}

	
	public void setReadOld(Boolean readOld){
		this.readOld = readOld;
	}

	
	public Boolean getReadOld(){
		return this.readOld;
	}

	
	public void setBizTypes(List<Integer> bizTypes){
		this.bizTypes = bizTypes;
	}

	
	public List<Integer> getBizTypes(){
		return this.bizTypes;
	}

	
	public void setEnableDeduplicate(Boolean enableDeduplicate){
		this.enableDeduplicate = enableDeduplicate;
	}

	
	public Boolean getEnableDeduplicate(){
		return this.enableDeduplicate;
	}

	
	public void setExtraConfig(ExtraConfig extraConfig){
		this.extraConfig = extraConfig;
	}

	
	public ExtraConfig getExtraConfig(){
		return this.extraConfig;
	}

}