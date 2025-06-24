package com.doudian.open.api.afterSale_List.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class TagsItem {


	@SerializedName("tag_detail")
	@OpField(desc = "标签中文名称", example = "超级售后")
	private String tagDetail;

	@SerializedName("tag_detail_en")
	@OpField(desc = "标签编号", example = "super_after_sale")
	private String tagDetailEn;

	@SerializedName("tag_link_url")
	@OpField(desc = "标签链接", example = "http://what_is_super_after_sale.bytedance.com/faq")
	private String tagLinkUrl;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setTagDetail(String tagDetail){
		this.tagDetail = tagDetail;
	}

	
	public String getTagDetail(){
		return this.tagDetail;
	}

	
	public void setTagDetailEn(String tagDetailEn){
		this.tagDetailEn = tagDetailEn;
	}

	
	public String getTagDetailEn(){
		return this.tagDetailEn;
	}

	
	public void setTagLinkUrl(String tagLinkUrl){
		this.tagLinkUrl = tagLinkUrl;
	}

	
	public String getTagLinkUrl(){
		return this.tagLinkUrl;
	}

}