package com.doudian.open.api.buyin_kolStrategyEdit.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class BuyinKolStrategyEditData {


	@SerializedName("success")
	@OpField(desc = "请求结果", example = "true")
	private Boolean success;

	@SerializedName("failed")
	@OpField(desc = "失败的达人维度结果信息", example = "")
	private List<FailedItem> failed;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setSuccess(Boolean success){
		this.success = success;
	}

	
	public Boolean getSuccess(){
		return this.success;
	}

	
	public void setFailed(List<FailedItem> failed){
		this.failed = failed;
	}

	
	public List<FailedItem> getFailed(){
		return this.failed;
	}

}