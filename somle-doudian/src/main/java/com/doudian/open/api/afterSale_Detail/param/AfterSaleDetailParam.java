package com.doudian.open.api.afterSale_Detail.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class AfterSaleDetailParam {


	@SerializedName("after_sale_id")
	@OpField(required = true , desc = "售后单ID", example= "7031818726886375724")
	private String afterSaleId;

	@SerializedName("need_operation_record")
	@OpField(required = false , desc = "是否需要协商记录", example= "true")
	private Boolean needOperationRecord;

	@SerializedName("is_searchable")
	private Boolean isSearchable;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setAfterSaleId(String afterSaleId){
		this.afterSaleId = afterSaleId;
	}

	
	public String getAfterSaleId(){
		return this.afterSaleId;
	}

	
	public void setNeedOperationRecord(Boolean needOperationRecord){
		this.needOperationRecord = needOperationRecord;
	}

	
	public Boolean getNeedOperationRecord(){
		return this.needOperationRecord;
	}

	
	public void setIsSearchable(Boolean isSearchable){
		this.isSearchable = isSearchable;
	}

	
	public Boolean getIsSearchable(){
		return this.isSearchable;
	}

}