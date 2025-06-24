package com.doudian.open.api.product_diagnoseCheck.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.Map;
import java.util.List;

//auto generated, do not edit

public class ProblemBizExtra {


	@SerializedName("conflict_props_docs_map")
	@OpField(desc = "存放填错属性项对应的文案，key为属性ID", example = "无")
	private Map<Long,String> conflictPropsDocsMap;

	@SerializedName("similar_product_list")
	@OpField(desc = "重复铺货商品", example = "无")
	private List<Long> similarProductList;

	@SerializedName("title_typo")
	@OpField(desc = "标题错别字", example = "无")
	private String titleTypo;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setConflictPropsDocsMap(Map<Long,String> conflictPropsDocsMap){
		this.conflictPropsDocsMap = conflictPropsDocsMap;
	}

	
	public Map<Long,String> getConflictPropsDocsMap(){
		return this.conflictPropsDocsMap;
	}

	
	public void setSimilarProductList(List<Long> similarProductList){
		this.similarProductList = similarProductList;
	}

	
	public List<Long> getSimilarProductList(){
		return this.similarProductList;
	}

	
	public void setTitleTypo(String titleTypo){
		this.titleTypo = titleTypo;
	}

	
	public String getTitleTypo(){
		return this.titleTypo;
	}

}