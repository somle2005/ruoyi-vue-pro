package com.doudian.open.api.order_searchList.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class SkuOrderTagUiItem {


	@SerializedName("key")
	@OpField(desc = "标签key", example = "pre_sale_label")
	private String key;

	@SerializedName("text")
	@OpField(desc = "标签文案", example = "全款预售")
	private String text;

	@SerializedName("hover_text")
	@OpField(desc = "标签备注文案", example = "该商品需要送到质检中心，质检完成后发给用户该商品需要送到质检中心，质检完成后发给用户")
	private String hoverText;

	@SerializedName("tag_type")
	@OpField(desc = "标签类型，如颜色", example = "orange")
	private String tagType;

	@SerializedName("help_doc")
	@OpField(desc = "帮助文档", example = "https://school.jinritemai.com/doudian/web/article/101835?from=shop_article")
	private String helpDoc;

	@SerializedName("sort")
	@OpField(desc = "排序", example = "1")
	private Long sort;

	@SerializedName("extra")
	@OpField(desc = "标签其他信息", example = "{key:value}")
	private String extra;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setKey(String key){
		this.key = key;
	}

	
	public String getKey(){
		return this.key;
	}

	
	public void setText(String text){
		this.text = text;
	}

	
	public String getText(){
		return this.text;
	}

	
	public void setHoverText(String hoverText){
		this.hoverText = hoverText;
	}

	
	public String getHoverText(){
		return this.hoverText;
	}

	
	public void setTagType(String tagType){
		this.tagType = tagType;
	}

	
	public String getTagType(){
		return this.tagType;
	}

	
	public void setHelpDoc(String helpDoc){
		this.helpDoc = helpDoc;
	}

	
	public String getHelpDoc(){
		return this.helpDoc;
	}

	
	public void setSort(Long sort){
		this.sort = sort;
	}

	
	public Long getSort(){
		return this.sort;
	}

	
	public void setExtra(String extra){
		this.extra = extra;
	}

	
	public String getExtra(){
		return this.extra;
	}

}