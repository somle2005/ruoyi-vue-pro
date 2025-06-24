package com.doudian.open.api.product_salesInherit_submit.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class ProductSalesInheritSubmitParam {


	@SerializedName("submit_records")
	@OpField(required = true , desc = "提报记录列表（不超过20条）", example= "")
	private List<SubmitRecordsItem> submitRecords;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setSubmitRecords(List<SubmitRecordsItem> submitRecords){
		this.submitRecords = submitRecords;
	}

	
	public List<SubmitRecordsItem> getSubmitRecords(){
		return this.submitRecords;
	}

}