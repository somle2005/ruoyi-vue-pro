package com.doudian.open.api.buyin_bindChannelProduct.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class BuyinBindChannelProductData {


	@SerializedName("success")
	@OpField(desc = "成功绑定的数量", example = "6")
	private Long success;

	@SerializedName("failed")
	@OpField(desc = "绑定失败的帐号和原因", example = "")
	private List<FailedItem> failed;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setSuccess(Long success){
		this.success = success;
	}

	
	public Long getSuccess(){
		return this.success;
	}

	
	public void setFailed(List<FailedItem> failed){
		this.failed = failed;
	}

	
	public List<FailedItem> getFailed(){
		return this.failed;
	}

}