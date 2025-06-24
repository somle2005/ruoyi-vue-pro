package com.doudian.open.api.buyin_simplePlan.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class ResultItem {


	@SerializedName("product_id")
	@OpField(desc = "商品ID", example = "3276187891830787600")
	private Long productId;

	@SerializedName("is_success")
	@OpField(desc = "操作结果是否成功，佣金率下调次日生效", example = "true")
	private Boolean isSuccess;

	@SerializedName("error_code")
	@OpField(desc = "当前商品操作错误码，成功为0", example = "0")
	private Long errorCode;

	@SerializedName("error_msg")
	@OpField(desc = "当前商品操作错误原因，成功为success", example = "success")
	private String errorMsg;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setProductId(Long productId){
		this.productId = productId;
	}

	
	public Long getProductId(){
		return this.productId;
	}

	
	public void setIsSuccess(Boolean isSuccess){
		this.isSuccess = isSuccess;
	}

	
	public Boolean getIsSuccess(){
		return this.isSuccess;
	}

	
	public void setErrorCode(Long errorCode){
		this.errorCode = errorCode;
	}

	
	public Long getErrorCode(){
		return this.errorCode;
	}

	
	public void setErrorMsg(String errorMsg){
		this.errorMsg = errorMsg;
	}

	
	public String getErrorMsg(){
		return this.errorMsg;
	}

}