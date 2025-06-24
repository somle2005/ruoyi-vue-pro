package com.doudian.open.api.product_diagnoseCheck.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;
import java.util.Map;

//auto generated, do not edit

public class DiagnoseRecommend {


	@SerializedName("name")
	@OpField(desc = "字段key", example = "无")
	private String name;

	@SerializedName("prop_map")
	@OpField(desc = "key=属性id, value=推荐属性值", example = "{}")
	private Map<Long,List<PropMapItem>> propMap;

	@SerializedName("suggest_seo_title_words")
	@OpField(desc = "无", example = "无")
	private List<String> suggestSeoTitleWords;

	@SerializedName("recommend_tag_info_list")
	@OpField(desc = "无", example = "")
	private List<RecommendTagInfoListItem> recommendTagInfoList;

	@SerializedName("ai_suggest_prop")
	@OpField(desc = "无", example = "")
	private List<AiSuggestPropItem> aiSuggestProp;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setName(String name){
		this.name = name;
	}

	
	public String getName(){
		return this.name;
	}

	
	public void setPropMap(Map<Long,List<PropMapItem>> propMap){
		this.propMap = propMap;
	}

	
	public Map<Long,List<PropMapItem>> getPropMap(){
		return this.propMap;
	}

	
	public void setSuggestSeoTitleWords(List<String> suggestSeoTitleWords){
		this.suggestSeoTitleWords = suggestSeoTitleWords;
	}

	
	public List<String> getSuggestSeoTitleWords(){
		return this.suggestSeoTitleWords;
	}

	
	public void setRecommendTagInfoList(List<RecommendTagInfoListItem> recommendTagInfoList){
		this.recommendTagInfoList = recommendTagInfoList;
	}

	
	public List<RecommendTagInfoListItem> getRecommendTagInfoList(){
		return this.recommendTagInfoList;
	}

	
	public void setAiSuggestProp(List<AiSuggestPropItem> aiSuggestProp){
		this.aiSuggestProp = aiSuggestProp;
	}

	
	public List<AiSuggestPropItem> getAiSuggestProp(){
		return this.aiSuggestProp;
	}

}