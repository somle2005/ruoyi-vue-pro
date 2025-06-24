package com.doudian.open.api.spu_batchUploadImg.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class SpuBatchUploadImgData {


	@SerializedName("success_list")
	@OpField(desc = "成功列表", example = "")
	private List<SuccessListItem> successList;

	@SerializedName("failed_list")
	@OpField(desc = "失败列表", example = "")
	private List<FailedListItem> failedList;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setSuccessList(List<SuccessListItem> successList){
		this.successList = successList;
	}

	
	public List<SuccessListItem> getSuccessList(){
		return this.successList;
	}

	
	public void setFailedList(List<FailedListItem> failedList){
		this.failedList = failedList;
	}

	
	public List<FailedListItem> getFailedList(){
		return this.failedList;
	}

}