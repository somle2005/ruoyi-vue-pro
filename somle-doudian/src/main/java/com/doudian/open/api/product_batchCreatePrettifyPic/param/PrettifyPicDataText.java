package com.doudian.open.api.product_batchCreatePrettifyPic.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class PrettifyPicDataText {


	@SerializedName("text")
	@OpField(required = true , desc = "文案内容 不可以超过5000字", example= "示例文本")
	private String text;

	@SerializedName("background_color")
	@OpField(required = false , desc = "非必填。背景色", example= "#ffffff")
	private String backgroundColor;

	@SerializedName("font_color")
	@OpField(required = false , desc = "非必填。字颜色", example= "#000000")
	private String fontColor;

	@SerializedName("font_size")
	@OpField(required = false , desc = "非必填。字号大小，在13~20之间", example= "14")
	private Long fontSize;

	@SerializedName("text_align")
	@OpField(required = false , desc = "非必填。可选left、right、center；默认left", example= "left")
	private String textAlign;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setText(String text){
		this.text = text;
	}

	
	public String getText(){
		return this.text;
	}

	
	public void setBackgroundColor(String backgroundColor){
		this.backgroundColor = backgroundColor;
	}

	
	public String getBackgroundColor(){
		return this.backgroundColor;
	}

	
	public void setFontColor(String fontColor){
		this.fontColor = fontColor;
	}

	
	public String getFontColor(){
		return this.fontColor;
	}

	
	public void setFontSize(Long fontSize){
		this.fontSize = fontSize;
	}

	
	public Long getFontSize(){
		return this.fontSize;
	}

	
	public void setTextAlign(String textAlign){
		this.textAlign = textAlign;
	}

	
	public String getTextAlign(){
		return this.textAlign;
	}

}