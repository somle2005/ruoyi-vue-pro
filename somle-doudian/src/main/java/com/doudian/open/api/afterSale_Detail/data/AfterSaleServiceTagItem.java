package com.doudian.open.api.afterSale_Detail.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class AfterSaleServiceTagItem {


	@SerializedName("tag_detail")
	@OpField(desc = "服务标签名称", example = "7天")
	private String tagDetail;

	@SerializedName("tag_detail_en")
	@OpField(desc = "服务标签英文代号", example = "supply_7day_return")
	private String tagDetailEn;

	@SerializedName("tag_link_url")
	@OpField(desc = "服务跳转地址", example = "https://school.jinritemai.com/doudian/web/article/101835?from=shop_article")
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