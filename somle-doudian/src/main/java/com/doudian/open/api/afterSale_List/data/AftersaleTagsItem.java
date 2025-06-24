package com.doudian.open.api.afterSale_List.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.Map;

//auto generated, do not edit

public class AftersaleTagsItem {


	@SerializedName("tag_detail")
	@OpField(desc = "标签名称", example = "风险预警")
	private String tagDetail;

	@SerializedName("tag_detail_en")
	@OpField(desc = "标签关键字", example = "risk_warning")
	private String tagDetailEn;

	@SerializedName("tag_detail_text")
	@OpField(desc = "标签悬浮文案（其中${key}占位符对应placeholder中的key对应内容）", example = "该售后单【xxx预警原因】请根据物流/商品状态进行核实。若确认有风险，请及时保存举证${relate_doc}，可在${asset_prevent}操作批量拒绝售后；若无风险，可同意售后。")
	private String tagDetailText;

	@SerializedName("tag_link_url")
	@OpField(desc = "标签跳转链接", example = "略")
	private String tagLinkUrl;

	@SerializedName("placeholder")
	@OpField(desc = "标签悬浮文案的占位符定义", example = "")
	private Map<String,PlaceholderItem> placeholder;


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

	
	public void setTagDetailText(String tagDetailText){
		this.tagDetailText = tagDetailText;
	}

	
	public String getTagDetailText(){
		return this.tagDetailText;
	}

	
	public void setTagLinkUrl(String tagLinkUrl){
		this.tagLinkUrl = tagLinkUrl;
	}

	
	public String getTagLinkUrl(){
		return this.tagLinkUrl;
	}

	
	public void setPlaceholder(Map<String,PlaceholderItem> placeholder){
		this.placeholder = placeholder;
	}

	
	public Map<String,PlaceholderItem> getPlaceholder(){
		return this.placeholder;
	}

}