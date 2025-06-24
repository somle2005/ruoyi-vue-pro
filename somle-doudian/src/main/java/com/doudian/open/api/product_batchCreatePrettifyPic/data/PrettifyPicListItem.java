package com.doudian.open.api.product_batchCreatePrettifyPic.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class PrettifyPicListItem {


	@SerializedName("img_url")
	@OpField(desc = "图片url", example = "https://p3-aio.ecombdimg.com/obj/ecom-shop-material/bMLccs_m_c8e09a091ad0bbd4652618f3f106f64e_sx_6643_www1125-186")
	private String imgUrl;

	@SerializedName("width")
	@OpField(desc = "图片宽度", example = "1125")
	private Long width;

	@SerializedName("height")
	@OpField(desc = "图片高度", example = "186")
	private Long height;

	@SerializedName("error_msg")
	@OpField(desc = "错误内容", example = "系统错误")
	private String errorMsg;

	@SerializedName("is_success")
	@OpField(desc = "是否正确生成", example = "true")
	private Boolean isSuccess;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setImgUrl(String imgUrl){
		this.imgUrl = imgUrl;
	}

	
	public String getImgUrl(){
		return this.imgUrl;
	}

	
	public void setWidth(Long width){
		this.width = width;
	}

	
	public Long getWidth(){
		return this.width;
	}

	
	public void setHeight(Long height){
		this.height = height;
	}

	
	public Long getHeight(){
		return this.height;
	}

	
	public void setErrorMsg(String errorMsg){
		this.errorMsg = errorMsg;
	}

	
	public String getErrorMsg(){
		return this.errorMsg;
	}

	
	public void setIsSuccess(Boolean isSuccess){
		this.isSuccess = isSuccess;
	}

	
	public Boolean getIsSuccess(){
		return this.isSuccess;
	}

}