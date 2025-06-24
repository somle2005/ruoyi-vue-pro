package com.doudian.open.api.order_orderDetail.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class Detail {


	@SerializedName("pic")
	@OpField(desc = "定制图片信息", example = "")
	private List<PicItem> pic;

	@SerializedName("text")
	@OpField(desc = "定制文案信息", example = "")
	private List<TextItem> text;

	@SerializedName("extra")
	@OpField(desc = "额外信息", example = "{key:value}")
	private String extra;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setPic(List<PicItem> pic){
		this.pic = pic;
	}

	
	public List<PicItem> getPic(){
		return this.pic;
	}

	
	public void setText(List<TextItem> text){
		this.text = text;
	}

	
	public List<TextItem> getText(){
		return this.text;
	}

	
	public void setExtra(String extra){
		this.extra = extra;
	}

	
	public String getExtra(){
		return this.extra;
	}

}