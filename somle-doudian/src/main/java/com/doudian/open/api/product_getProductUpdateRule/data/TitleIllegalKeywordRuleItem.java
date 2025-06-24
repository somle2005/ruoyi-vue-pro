package com.doudian.open.api.product_getProductUpdateRule.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class TitleIllegalKeywordRuleItem {


	@SerializedName("tip")
	@OpField(desc = "规则提示", example = "商品标题不允许出现2个及以上连续空格")
	private String tip;

	@SerializedName("keywords_in_suffix")
	@OpField(desc = "不允许出现的后缀关键词", example = "[ ,n]")
	private List<String> keywordsInSuffix;

	@SerializedName("keywords_in_prefix")
	@OpField(desc = "不允许出现的前缀关键词", example = "[ ,n]")
	private List<String> keywordsInPrefix;

	@SerializedName("keywords")
	@OpField(desc = "不允许出现的全局关键词", example = "[  ,n]")
	private List<String> keywords;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setTip(String tip){
		this.tip = tip;
	}

	
	public String getTip(){
		return this.tip;
	}

	
	public void setKeywordsInSuffix(List<String> keywordsInSuffix){
		this.keywordsInSuffix = keywordsInSuffix;
	}

	
	public List<String> getKeywordsInSuffix(){
		return this.keywordsInSuffix;
	}

	
	public void setKeywordsInPrefix(List<String> keywordsInPrefix){
		this.keywordsInPrefix = keywordsInPrefix;
	}

	
	public List<String> getKeywordsInPrefix(){
		return this.keywordsInPrefix;
	}

	
	public void setKeywords(List<String> keywords){
		this.keywords = keywords;
	}

	
	public List<String> getKeywords(){
		return this.keywords;
	}

}