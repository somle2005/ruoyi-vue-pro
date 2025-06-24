package com.doudian.open.api.product_auditList.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class ProductAuditListData {


	@SerializedName("records")
	@OpField(desc = "审核记录列表", example = "")
	private List<RecordsItem> records;

	@SerializedName("total")
	@OpField(desc = "总数量", example = "11")
	private Long total;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setRecords(List<RecordsItem> records){
		this.records = records;
	}

	
	public List<RecordsItem> getRecords(){
		return this.records;
	}

	
	public void setTotal(Long total){
		this.total = total;
	}

	
	public Long getTotal(){
		return this.total;
	}

}