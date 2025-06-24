package com.doudian.open.api.spu_getSpuRule.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class ProofRule {


	@SerializedName("name")
	@OpField(desc = "证明材料名称", example = "版权页")
	private String name;

	@SerializedName("is_required")
	@OpField(desc = "是否必填，0:非必填，1:必填", example = "1")
	private Long isRequired;

	@SerializedName("min_num")
	@OpField(desc = "最小数量", example = "1")
	private Long minNum;

	@SerializedName("max_num")
	@OpField(desc = "最大数量", example = "5")
	private Long maxNum;

	@SerializedName("max_size")
	@OpField(desc = "最大容量，单位为M", example = "5")
	private Long maxSize;

	@SerializedName("aspect_ratio")
	@OpField(desc = "素材类型为图片时的尺寸比", example = "[1,1]")
	private List<String> aspectRatio;

	@SerializedName("pixel")
	@OpField(desc = "素材类型为图片时的像素比", example = "[600,600]")
	private List<Long> pixel;

	@SerializedName("data_format")
	@OpField(desc = "数据格式类型", example = "[png,jpg,jpeg]")
	private List<String> dataFormat;


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

	
	public void setIsRequired(Long isRequired){
		this.isRequired = isRequired;
	}

	
	public Long getIsRequired(){
		return this.isRequired;
	}

	
	public void setMinNum(Long minNum){
		this.minNum = minNum;
	}

	
	public Long getMinNum(){
		return this.minNum;
	}

	
	public void setMaxNum(Long maxNum){
		this.maxNum = maxNum;
	}

	
	public Long getMaxNum(){
		return this.maxNum;
	}

	
	public void setMaxSize(Long maxSize){
		this.maxSize = maxSize;
	}

	
	public Long getMaxSize(){
		return this.maxSize;
	}

	
	public void setAspectRatio(List<String> aspectRatio){
		this.aspectRatio = aspectRatio;
	}

	
	public List<String> getAspectRatio(){
		return this.aspectRatio;
	}

	
	public void setPixel(List<Long> pixel){
		this.pixel = pixel;
	}

	
	public List<Long> getPixel(){
		return this.pixel;
	}

	
	public void setDataFormat(List<String> dataFormat){
		this.dataFormat = dataFormat;
	}

	
	public List<String> getDataFormat(){
		return this.dataFormat;
	}

}